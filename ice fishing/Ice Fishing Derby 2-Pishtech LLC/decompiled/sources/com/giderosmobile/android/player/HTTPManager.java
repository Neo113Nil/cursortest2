package com.giderosmobile.android.player;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class HTTPManager {
    private static HTTPManager httpManager = null;
    static boolean ignoreSslErrors = false;
    static String proxyName;
    static String proxyPass;
    static int proxyPort;
    static String proxyUser;
    ConcurrentHashMap<Long, HTTPThread> ids_ = new ConcurrentHashMap<>();
    TrustManager trustAll = new X509TrustManager() { // from class: com.giderosmobile.android.player.HTTPManager.1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    };
    HostnameVerifier yesHotnameVerifier = new HostnameVerifier() { // from class: com.giderosmobile.android.player.HTTPManager.2
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };

    public static native void nativeghttpErrorCallback(long j, long j2, String str);

    public static native void nativeghttpProgressCallback(long j, int i, int i2, byte[] bArr, int i3, long j2);

    public static native void nativeghttpResponseCallback(long j, byte[] bArr, int i, int i2, int i3, int i4, boolean z, long j2);

    void Get(String str, String[] strArr, boolean z, long j, long j2) {
        HTTPThread hTTPThread = new HTTPThread(str, strArr, null, 0, z, j, j2, this);
        this.ids_.put(Long.valueOf(j2), hTTPThread);
        hTTPThread.start();
    }

    void Post(String str, String[] strArr, byte[] bArr, boolean z, long j, long j2) {
        HTTPThread hTTPThread = new HTTPThread(str, strArr, bArr, 1, z, j, j2, this);
        this.ids_.put(Long.valueOf(j2), hTTPThread);
        hTTPThread.start();
    }

    void Put(String str, String[] strArr, byte[] bArr, boolean z, long j, long j2) {
        HTTPThread hTTPThread = new HTTPThread(str, strArr, bArr, 2, z, j, j2, this);
        this.ids_.put(Long.valueOf(j2), hTTPThread);
        hTTPThread.start();
    }

    void Delete(String str, String[] strArr, boolean z, long j, long j2) {
        HTTPThread hTTPThread = new HTTPThread(str, strArr, null, 3, z, j, j2, this);
        this.ids_.put(Long.valueOf(j2), hTTPThread);
        hTTPThread.start();
    }

    void Close(long j) {
        HTTPThread hTTPThread = this.ids_.get(Long.valueOf(j));
        if (hTTPThread == null) {
            return;
        }
        this.ids_.remove(Long.valueOf(j));
        hTTPThread.close = true;
    }

    void CloseAll() {
        HTTPThread[] hTTPThreadArr = (HTTPThread[]) this.ids_.values().toArray(new HTTPThread[0]);
        this.ids_.clear();
        for (HTTPThread hTTPThread : hTTPThreadArr) {
            hTTPThread.close = true;
        }
    }

    public void responseCallback(long j, long j2, byte[] bArr, int i, int i2, int i3, boolean z) {
        if (this.ids_.containsKey(Long.valueOf(j))) {
            nativeghttpResponseCallback(j, bArr, i3, i, i2, bArr.length - i3, z, j2);
            if (z) {
                return;
            }
            this.ids_.remove(Long.valueOf(j));
        }
    }

    public void errorCallback(long j, long j2, String str) {
        if (this.ids_.containsKey(Long.valueOf(j))) {
            nativeghttpErrorCallback(j, j2, str);
            this.ids_.remove(Long.valueOf(j));
        }
    }

    public void progressCallback(long j, long j2, int i, int i2, byte[] bArr, int i3) {
        if (this.ids_.containsKey(Long.valueOf(j))) {
            nativeghttpProgressCallback(j, i, i2, bArr, i3, j2);
        }
    }

    public static void ghttp_Init() {
        httpManager = new HTTPManager();
    }

    public static void ghttp_Cleanup() {
        httpManager.CloseAll();
        httpManager = null;
    }

    public static void ghttp_IgnoreSslErrors() {
        ignoreSslErrors = true;
    }

    public static void ghttp_SetProxy(String str, int i, String str2, String str3) {
        proxyName = str;
        proxyPort = i;
        proxyUser = str2;
        proxyPass = str3;
    }

    public static void ghttp_Get(String str, String[] strArr, boolean z, long j, long j2) {
        httpManager.Get(str, strArr, z, j, j2);
    }

    public static void ghttp_Post(String str, String[] strArr, byte[] bArr, boolean z, long j, long j2) {
        httpManager.Post(str, strArr, bArr, z, j, j2);
    }

    public static void ghttp_Put(String str, String[] strArr, byte[] bArr, boolean z, long j, long j2) {
        httpManager.Put(str, strArr, bArr, z, j, j2);
    }

    public static void ghttp_Delete(String str, String[] strArr, boolean z, long j, long j2) {
        httpManager.Delete(str, strArr, z, j, j2);
    }

    public static void ghttp_Close(long j) {
        httpManager.Close(j);
    }

    public static void ghttp_CloseAll() {
        httpManager.CloseAll();
    }

    class HTTPThread extends Thread {
        volatile boolean close = false;
        byte[] data_;
        String[] headers_;
        long id_;
        HTTPManager manager_;
        int method_;
        boolean streaming_;
        long udata_;
        String url_;

        public HTTPThread(String str, String[] strArr, byte[] bArr, int i, boolean z, long j, long j2, HTTPManager hTTPManager) {
            this.url_ = str;
            this.headers_ = strArr;
            this.data_ = bArr;
            this.method_ = i;
            this.udata_ = j;
            this.id_ = j2;
            this.manager_ = hTTPManager;
            this.streaming_ = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            try {
                URL url = new URL(this.url_);
                if (HTTPManager.proxyName != null) {
                    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(HTTPManager.proxyName, HTTPManager.proxyPort));
                    Authenticator.setDefault(new Authenticator() { // from class: com.giderosmobile.android.player.HTTPManager.HTTPThread.1
                        @Override // java.net.Authenticator
                        public PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(HTTPManager.proxyUser, HTTPManager.proxyPass.toCharArray());
                        }
                    });
                    httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
                } else {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                }
                if (this.streaming_) {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
                boolean z = true;
                if (HTTPManager.ignoreSslErrors) {
                    SSLContext sSLContext = SSLContext.getInstance("SSL");
                    sSLContext.init(null, new TrustManager[]{HTTPManager.this.trustAll}, new SecureRandom());
                    SSLContext.setDefault(sSLContext);
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(HTTPManager.this.yesHotnameVerifier);
                }
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(300000);
                if (this.headers_ != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = this.headers_;
                        if (i >= strArr.length) {
                            break;
                        }
                        httpURLConnection.setRequestProperty(strArr[i], strArr[i + 1]);
                        i += 2;
                    }
                }
                httpURLConnection.setRequestProperty("User-Agent", "Gideros");
                if (this.data_ != null) {
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(this.data_);
                    outputStream.flush();
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                int responseCode = httpURLConnection.getResponseCode();
                int contentLength = httpURLConnection.getContentLength();
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (this.streaming_) {
                    int i2 = 0;
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        for (String str : entry.getValue()) {
                            if (entry.getKey() != null && str != null) {
                                byteArrayOutputStream3.write(entry.getKey().getBytes());
                                byteArrayOutputStream3.write(0);
                                byteArrayOutputStream3.write(str.getBytes());
                                byteArrayOutputStream3.write(0);
                                i2++;
                            }
                        }
                    }
                    byteArrayOutputStream = byteArrayOutputStream3;
                    this.manager_.responseCallback(this.id_, this.udata_, byteArrayOutputStream3.toByteArray(), responseCode, i2, 0, true);
                    byteArrayOutputStream.reset();
                } else {
                    byteArrayOutputStream = byteArrayOutputStream3;
                }
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        if (this.close == z) {
                            inputStream.close();
                            httpURLConnection.disconnect();
                            return;
                        }
                        if (this.streaming_) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                        } else {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        this.manager_.progressCallback(this.id_, this.udata_, byteArrayOutputStream2.size(), contentLength, this.streaming_ ? bArr : null, read);
                        byteArrayOutputStream = byteArrayOutputStream2;
                        z = true;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                        inputStream.close();
                        int size = byteArrayOutputStream4.size();
                        int i3 = 0;
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            for (String str2 : entry2.getValue()) {
                                if (entry2.getKey() != null && str2 != null) {
                                    byteArrayOutputStream4.write(entry2.getKey().getBytes());
                                    byteArrayOutputStream4.write(0);
                                    byteArrayOutputStream4.write(str2.getBytes());
                                    byteArrayOutputStream4.write(0);
                                    i3++;
                                }
                            }
                        }
                        httpURLConnection.disconnect();
                        this.manager_.responseCallback(this.id_, this.udata_, byteArrayOutputStream4.toByteArray(), responseCode, i3, size, false);
                        return;
                    }
                }
            } catch (Exception e) {
                Log.e("Gideros", "HTTP exception", e);
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                this.manager_.errorCallback(this.id_, this.udata_, stringWriter.toString());
            }
        }
    }
}
