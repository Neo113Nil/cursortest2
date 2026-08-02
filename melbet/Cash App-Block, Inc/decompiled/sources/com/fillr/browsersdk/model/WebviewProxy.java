package com.fillr.browsersdk.model;

import android.content.Context;
import android.content.Intent;
import android.net.ProxyInfo;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.webkit.WebView;
import androidx.camera.view.PreviewView;
import androidx.media3.decoder.SimpleDecoder;
import androidx.webkit.ProxyConfig$ProxyRule;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature$M;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.tls.CertificateRegistry;
import com.fillr.browsersdk.tls.asn1.complextypes.SSLCertificate;
import com.fillr.browsersdk.tls.utils.HttpParser;
import com.fillr.browsersdk.tls.utils.SSLState;
import com.fillr.browsersdk.tls.utils.TLSPayload;
import com.fillr.browsersdk.tls.utils.TLSRecord;
import com.fillr.browsersdk.tls.utils.TLSUtils;
import com.google.mlkit.vision.text.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class WebviewProxy {
    public static final KeyPair KEY_PAIR;
    public static final AnonymousClass1 PROXY_CHANGE_EXECUTOR;
    public static final Fillr.AnonymousClass3 PROXY_CHANGE_LISTENER;
    public static WebviewProxy proxy;
    public static boolean proxySettingApplied;
    public static int sequenceNumber;
    public boolean concurrent;
    public boolean keepAlive;
    public int port;
    public final ServerSocket socket;
    public boolean terminateAllConnections;
    public boolean terminateSSL;
    public ThreadPoolExecutor threadPool;
    public final Set webviews;
    public static final ArrayBlockingQueue REQUEST_QUEUE = new ArrayBlockingQueue(2048);
    public static final zzd FEATURE_MANAGER = zzd.getInstance();
    public static final String[] SECURE_PROTOCOLS = {"TLSv1.2"};
    public static final String[] SECURE_CIPHERS = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"};
    public static final Pattern[] SECURE_HOSTNAMES = {Pattern.compile(".*\\.hostedpci.com")};

    /* renamed from: com.fillr.browsersdk.model.WebviewProxy$4, reason: invalid class name */
    public final class AnonymousClass4 extends ProxySelector {
        @Override // java.net.ProxySelector
        public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder("ProxySelector connection failed for host=");
            sb.append(host);
            sb.append(", path=");
            sb.append(path);
            iOException.getClass();
            SVG svg = Fillr.getInstance().fillrConfig;
        }

        @Override // java.net.ProxySelector
        public final List select(URI uri) {
            uri.getHost();
            uri.getPath();
            SVG svg = Fillr.getInstance().fillrConfig;
            return Collections.singletonList(Proxy.NO_PROXY);
        }
    }

    static {
        KeyPair keyPair;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, new SecureRandom());
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
            keyPair = null;
        }
        KEY_PAIR = keyPair;
        PROXY_CHANGE_EXECUTOR = new AnonymousClass1();
        PROXY_CHANGE_LISTENER = new Fillr.AnonymousClass3(3);
        proxySettingApplied = false;
        proxy = null;
        sequenceNumber = 0;
    }

    public WebviewProxy(Object obj) {
        Set synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.webviews = synchronizedSet;
        this.terminateSSL = false;
        this.concurrent = false;
        this.keepAlive = false;
        this.terminateAllConnections = false;
        FEATURE_MANAGER.getClass();
        if (zzd.isFeatureEnabledForUrl("DisableTlsProxy", null)) {
            SVG svg = Fillr.getInstance().fillrConfig;
            this.port = -1;
            return;
        }
        if (obj == null) {
            SVG svg2 = Fillr.getInstance().fillrConfig;
            this.port = -1;
            return;
        }
        try {
            this.threadPool = new ThreadPoolExecutor(40, 40, 300000L, TimeUnit.MILLISECONDS, REQUEST_QUEUE);
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            ServerSocket serverSocket = new ServerSocket(0);
            this.socket = serverSocket;
            this.port = serverSocket.getLocalPort();
            synchronizedSet.add(obj);
            synchronizedSet.size();
            SVG svg3 = Fillr.getInstance().fillrConfig;
            new SimpleDecoder.AnonymousClass1(this, 4).start();
        } catch (Exception unused) {
            SVG svg4 = Fillr.getInstance().fillrConfig;
            this.port = -1;
        }
    }

    public static void closeSockets(Socket... socketArr) {
        for (Socket socket : socketArr) {
            try {
                socket.close();
                SVG svg = Fillr.getInstance().fillrConfig;
            } catch (Exception e) {
                e.getMessage();
                SVG svg2 = Fillr.getInstance().fillrConfig;
            }
        }
    }

    public static void doTransparentHttpsProxy(Socket socket, String str, int i) {
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        Socket socket2 = new Socket(Proxy.NO_PROXY);
        socket2.connect(new InetSocketAddress(str, i), 10000);
        SVG svg = Fillr.getInstance().fillrConfig;
        socket.setSoTimeout(10000);
        socket2.setSoTimeout(10000);
        FillrClientServerPipe fillrClientServerPipe = new FillrClientServerPipe();
        fillrClientServerPipe.client = socket;
        fillrClientServerPipe.clientIn = socket.getInputStream();
        fillrClientServerPipe.clientOut = socket.getOutputStream();
        fillrClientServerPipe.server = socket2;
        fillrClientServerPipe.serverIn = socket2.getInputStream();
        fillrClientServerPipe.serverOut = socket2.getOutputStream();
        fillrClientServerPipe.start();
        Thread.sleep(100L);
    }

    public static Context getApplicationContextFromWebview(Object obj) {
        try {
            return ((Context) obj.getClass().getMethod("getContext", null).invoke(obj, null)).getApplicationContext();
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
            return Fillr.getInstance().parentActivity.getApplicationContext();
        }
    }

    public static ArrayMap getProxyChangeListeners(Context context, String str) {
        Field field = Class.forName(str).getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
        declaredField.setAccessible(true);
        return (ArrayMap) declaredField.get(obj);
    }

    public static void linkStreams(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        try {
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                outputStream.flush();
            }
            try {
                break;
            } catch (IOException e2) {
                e2.getMessage();
                SVG svg2 = Fillr.getInstance().fillrConfig;
            }
        }
        inputStream.close();
        try {
            outputStream.close();
        } catch (IOException e3) {
            e3.getMessage();
            SVG svg3 = Fillr.getInstance().fillrConfig;
        }
    }

    public static void sendTlsData(SSLState sSLState, byte[] bArr, OutputStream outputStream) {
        int i;
        Iterator it = TLSRecord.packetize(sSLState.versionHigh, sSLState.versionLow, bArr).iterator();
        while (it.hasNext()) {
            TLSRecord tLSRecord = (TLSRecord) it.next();
            synchronized (sSLState) {
                i = sSLState.serverSequenceNumber;
            }
            long j = i;
            byte[] bArr2 = sSLState.serverMacKey;
            byte[] bArr3 = sSLState.serverWriteKey;
            SecureRandom secureRandom = sSLState.random;
            byte[] bArr4 = sSLState.iv;
            secureRandom.nextBytes(bArr4);
            outputStream.write(tLSRecord.toAesEncryptedBytes(j, bArr2, bArr3, bArr4));
            sSLState.addServerPackets();
        }
        outputStream.flush();
    }

    public final boolean doProxy(Socket socket) {
        final Socket socket2;
        boolean z;
        boolean z2;
        OutputStream outputStream = socket.getOutputStream();
        HttpParser httpParser = new HttpParser(socket);
        if (!TextUtils.isEmpty(httpParser.getRequest())) {
            SVG svg = Fillr.getInstance().fillrConfig;
            if (httpParser.isMethod("connect")) {
                String headerValue = httpParser.getHeaderValue("Host");
                if (!headerValue.contains(":")) {
                    headerValue = headerValue.concat(":443");
                }
                String[] split = headerValue.split(":");
                outputStream.write("HTTP/1.1 200 Connection Established".getBytes());
                outputStream.write("\n\n".getBytes());
                outputStream.flush();
                httpParser.waitForParse();
                try {
                    synchronized (this) {
                        try {
                            String str = split[0];
                            synchronized (this) {
                                try {
                                    if (this.terminateAllConnections && CertificateRegistry.getWhitelistedCertificate(str) == null) {
                                        CertificateRegistry.generateSelfSignedCertificate(str, KEY_PAIR);
                                    }
                                    z = CertificateRegistry.getWhitelistedCertificate(str) == null;
                                } finally {
                                }
                            }
                            if (this.terminateSSL || z2) {
                                doTransparentHttpsProxy(socket, split[0], Integer.parseInt(split[1]));
                                return false;
                            }
                            doTerminatingHttpsProxy(socket, split[0], Integer.parseInt(split[1]));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    doTransparentHttpsProxy(socket, split[0], Integer.parseInt(split[1]));
                    return false;
                } catch (Exception e) {
                    e.getLocalizedMessage();
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                }
                if (z) {
                    "Disabling TLS termination for request to host=%s".concat(headerValue);
                    SVG svg3 = Fillr.getInstance().fillrConfig;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.terminateSSL) {
                }
            }
            if (httpParser.isMethod("get") || httpParser.isMethod("post") || httpParser.isMethod("put") || httpParser.isMethod("delete") || httpParser.isMethod("head") || httpParser.isMethod("options")) {
                if (httpParser.isMethod("post")) {
                    httpParser.waitForParse();
                }
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                String headerValue2 = httpParser.getHeaderValue("Host");
                if (!headerValue2.contains(":")) {
                    headerValue2 = headerValue2.concat(":80");
                }
                String[] split2 = headerValue2.split(":");
                final Socket socket3 = new Socket(split2[0], Integer.parseInt(split2[1]));
                final InputStream inputStream = socket3.getInputStream();
                OutputStream outputStream2 = socket3.getOutputStream();
                final OutputStream outputStream3 = socket.getOutputStream();
                outputStream2.write(httpParser.toBytes());
                outputStream2.flush();
                final HttpParser httpParser2 = new HttpParser(socket3);
                if (httpParser.isWebsocket() && httpParser2.isWebsocket() && "101".equals(httpParser2.getStatusCode())) {
                    socket.setSoTimeout(2000);
                    socket3.setSoTimeout(2000);
                    SVG svg4 = Fillr.getInstance().fillrConfig;
                    socket2 = socket;
                    this.threadPool.execute(new Thread(this) { // from class: com.fillr.browsersdk.model.WebviewProxy.7
                        @Override // java.lang.Thread, java.lang.Runnable
                        public final void run() {
                            OutputStream outputStream4 = outputStream3;
                            try {
                                outputStream4.write(httpParser2.toBytes());
                                outputStream4.flush();
                                WebviewProxy.linkStreams(inputStream, outputStream4);
                            } catch (Exception e2) {
                                e2.getMessage();
                                SVG svg5 = Fillr.getInstance().fillrConfig;
                            }
                            WebviewProxy.closeSockets(socket2, socket3);
                        }
                    });
                    linkStreams(socket2.getInputStream(), outputStream2);
                } else {
                    socket2 = socket;
                    httpParser.getRequest();
                    SVG svg5 = Fillr.getInstance().fillrConfig;
                    outputStream3.write(httpParser2.toBytes(httpParser));
                    outputStream3.flush();
                }
                closeSockets(socket2, socket3);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0492, code lost:
    
        r12 = new java.lang.StringBuilder();
        r12.append("req.");
        r12.append(r8);
        r12.append(":  Decrypted HTTP request from WebView:  ");
        r12.append(r0);
        r12.append(", numRequests=");
        r15 = r14 + 1;
        r12.append(r15);
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d(r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04be, code lost:
    
        if (r13.isMethod("get") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04c6, code lost:
    
        if (r0.matches(".*fillr\\.local/widget\\.js$") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04c8, code lost:
    
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d("req." + r8 + ":  Responding with widget data for url=" + r0);
        r0 = com.fillr.browsersdk.Fillr.getInstance().getWidgetManager().buildPayloadForUrl(r0);
        r14 = new java.lang.StringBuilder();
        r14.append("Content-Length: ");
        r14.append(r0.getBytes("utf-8").length);
        sendTlsData(r5, android.text.TextUtils.join("\n", new java.lang.String[]{"HTTP/1.1 200 OK", "Content-Type: application/javascript; charset=utf-8", r14.toString(), "", r0}).getBytes("utf-8"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0525, code lost:
    
        if (r31.keepAlive != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x052b, code lost:
    
        r4 = r34;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0527, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0539, code lost:
    
        if (r13.isMethod("get") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0541, code lost:
    
        if (r0.matches(".*([\\._]js|[\\._]css|[\\._]jpeg|[\\._]jpg|[\\._]png|[\\._]gif|[\\._]svg|[\\._]xml|[\\._]json|[\\._]swf|[\\._]rss|[\\._]mp[1-4eg]+|[\\._]zip|[\\._]rar|[\\._]pdf|[\\._]txt|[\\._]log|[\\._]avi|[\\._]web[apm]|[\\._]aac|[\\._]wav|[\\._]sass|[\\._]xlsx?|[\\._]7z|[\\._]ttf|[\\._]tiff?|[\\._]tar|[\\._]gz|[\\._]ppt|[\\._]og[agvx]|[\\._]mid|[\\._]jar|[\\._]ico|[\\._]ics|[\\._]docx?|[\\._]csv|[\\._]bmp|[\\._]bz2?|[\\._]less)$") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0543, code lost:
    
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d("req." + r8 + ":  Static resource request detected, using reduced read timeout:  " + r0 + ", method=" + r13.getMethod() + ", timeout=20000");
        r7.setSoTimeout(20000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x057b, code lost:
    
        r10.write(r13.toBytes());
        r10.flush();
        r12 = new java.lang.StringBuilder();
        r18 = r2;
        r12.append("res.");
        r12.append(r8);
        r12.append("[");
        r12.append(r14);
        r12.append("]");
        r4 = new com.fillr.browsersdk.tls.utils.HttpParser(r7, r7.getInputStream(), r12.toString(), null);
        r4.waitForParse();
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d("req." + r8 + ":  Got HTTP response from remote server:  " + r0 + ", statusLine=" + r4.getRequest() + ", numRequests=" + r15);
        r2 = r13.isWebsocket();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05e6, code lost:
    
        if (r2 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x05e8, code lost:
    
        r2 = r4.isWebsocket();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05ec, code lost:
    
        if (r2 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x05ee, code lost:
    
        r2 = "101".equals(r4.getStatusCode());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05f8, code lost:
    
        if (r2 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05fe, code lost:
    
        if (r11.isEmpty() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0600, code lost:
    
        r10.write(com.fillr.browsersdk.utilities.FillrUtils.streamToBytes((java.io.InputStream) r11.get(0)));
        r10.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0611, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0613, code lost:
    
        doWebsocketPassthrough(r2, r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x061b, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0621, code lost:
    
        if (r13.hasRequestLine() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0623, code lost:
    
        r4 = r4.toBytes(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x062c, code lost:
    
        sendTlsData(r5, r4, r9);
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d("req." + r8 + ":  Successfully intercepted TLS request to " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x064d, code lost:
    
        if (r31.keepAlive != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x066d, code lost:
    
        r4 = r34;
        r14 = r15;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x064f, code lost:
    
        com.fillr.browsersdk.BrowserSDKLogger$Companion.d("req." + r8 + ":  Keep-Alive is disabled; disconnecting TLS connection for " + r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0628, code lost:
    
        r4 = r4.toBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0487, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0490, code lost:
    
        r0 = "(unknown/see previous)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03b1, code lost:
    
        if (r13.getType() != 21) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03b3, code lost:
    
        com.fillr.browsersdk.tls.utils.TLSUtils.arrayDump(r13.toBytes());
        r0 = com.fillr.browsersdk.Fillr.getInstance().fillrConfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0618, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0619, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0767, code lost:
    
        r1 = com.fillr.browsersdk.Fillr.getInstance().fillrConfig;
        closeSockets(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x077b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0427, code lost:
    
        r11.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x042e, code lost:
    
        if (r12.available() <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0430, code lost:
    
        r11.add(new java.io.ByteArrayInputStream(com.fillr.browsersdk.utilities.FillrUtils.streamToBytes(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0440, code lost:
    
        if (r13.hasRequestLine() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0442, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(r13.getMethod());
        r0.append("; https://");
        r0.append(r33);
        r0.append(":");
        r0.append(r4);
        r13.getRequest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0467, code lost:
    
        if (android.text.TextUtils.isEmpty(r13.request) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0475, code lost:
    
        if (r13.request.toLowerCase().startsWith("http/") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0478, code lost:
    
        r12 = r13.getRequest().split(" ")[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0488, code lost:
    
        r0.append(r12);
        r0 = r0.toString();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doTerminatingHttpsProxy(Socket socket, String str, int i) {
        int i2;
        TLSRecord tLSRecord;
        byte[] bArr;
        int i3;
        int i4;
        boolean z;
        Socket socket2;
        byte[] bArr2;
        Cipher cipher;
        int i5 = i;
        synchronized (WebviewProxy.class) {
            i2 = sequenceNumber + 1;
            sequenceNumber = i2;
        }
        SSLState sSLState = new SSLState(str, i2);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TLSRecord read = TLSRecord.read(inputStream, str, null, byteArrayOutputStream);
        if (read.f988type != 22) {
            closeSockets(socket);
            return;
        }
        TLSUtils.version(read.versionHigh, read.versionLow);
        BrowserSDKLogger$Companion.logsEnabled();
        TLSPayload tLSPayload = new TLSPayload(new ByteArrayInputStream(read.data), read.f988type, 0);
        if (tLSPayload.payloadType != 1) {
            closeSockets(socket);
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tLSPayload.content);
        int read2 = byteArrayInputStream.read();
        int read3 = byteArrayInputStream.read();
        sSLState.versionHigh = read2;
        sSLState.versionLow = read3;
        TLSUtils.version(read2, read3);
        BrowserSDKLogger$Companion.logsEnabled();
        byte[] readBytes = TLSUtils.readBytes(byteArrayInputStream, 32);
        byte[] bArr3 = new byte[32];
        sSLState.random.nextBytes(bArr3);
        byte[] bArr4 = TLSUtils.TLS_RSA_WITH_AES_128_CBC_SHA;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(read2);
        byteArrayOutputStream2.write(read3);
        byteArrayOutputStream2.write(bArr3);
        TLSUtils.writeRLEByteArray(byteArrayOutputStream2, new byte[0], 255);
        byteArrayOutputStream2.write(bArr4);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(TLSPayload.CANNED_EXTENSION_INFO);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        byteArrayOutputStream3.write(2);
        TLSUtils.writeRLEByteArray(byteArrayOutputStream3, byteArray, 16777215);
        outputStream.write(new TLSRecord(22, read2, read3, byteArrayOutputStream3.toByteArray(), byteArrayOutputStream).toBytes());
        SSLCertificate whitelistedCertificate = CertificateRegistry.getWhitelistedCertificate(str);
        synchronized (str.intern()) {
            byte[] bytes = whitelistedCertificate.toBytes();
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            TLSUtils.writeUint24(byteArrayOutputStream4, bytes.length + 3);
            TLSUtils.writeUint24(byteArrayOutputStream4, bytes.length);
            byteArrayOutputStream4.write(bytes);
            byte[] byteArray2 = byteArrayOutputStream4.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            byteArrayOutputStream5.write(11);
            TLSUtils.writeRLEByteArray(byteArrayOutputStream5, byteArray2, 16777215);
            outputStream.write(new TLSRecord(22, read2, read3, byteArrayOutputStream5.toByteArray(), byteArrayOutputStream).toBytes());
            outputStream.flush();
            outputStream.write(new TLSRecord(22, read2, read3, new TLSPayload(new byte[0], (byte) 14).toBytes(), byteArrayOutputStream).toBytes());
            outputStream.flush();
        }
        TLSRecord read4 = TLSRecord.read(inputStream, str, null, byteArrayOutputStream);
        byte[] bArr5 = new TLSPayload(new ByteArrayInputStream(read4.data), read4.f988type).content;
        if (bArr5.length > 256) {
            Arrays.copyOfRange(bArr5, 0, bArr5.length - 256);
            bArr5 = Arrays.copyOfRange(bArr5, bArr5.length - 256, bArr5.length);
        }
        if (read4.getType() == 22) {
            PrivateKey privateKey = KEY_PAIR.getPrivate();
            try {
                cipher = (Cipher) TLSUtils.CIPHER_RSA.get();
                tLSRecord = read4;
            } catch (Exception e) {
                e = e;
                tLSRecord = read4;
            }
            try {
                cipher.init(2, privateKey);
                bArr = cipher.doFinal(bArr5);
            } catch (Exception e2) {
                e = e2;
                e.getMessage();
                SVG svg = Fillr.getInstance().fillrConfig;
                bArr = null;
                if (bArr != null) {
                }
                byte[] bytes2 = tLSRecord.toBytes();
                if (bArr != null) {
                }
                throw new IOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bArr == null ? 0 : bArr.length, ", expectedLength=48", re$$ExternalSyntheticOutline0.m("req.", i2, ":  Invalid ClientKeyExchange (", str, "):  decryptedLength=")));
            }
            if (bArr != null || bArr.length != 48) {
                byte[] bytes22 = tLSRecord.toBytes();
                if (bArr != null && tLSRecord.getType() == 21 && bytes22[bytes22.length - 1] == 46) {
                    closeSockets(socket);
                    return;
                } else {
                    throw new IOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bArr == null ? 0 : bArr.length, ", expectedLength=48", re$$ExternalSyntheticOutline0.m("req.", i2, ":  Invalid ClientKeyExchange (", str, "):  decryptedLength=")));
                }
            }
            byte[] prf = TLSUtils.prf(TLSKeyMaterialSpec.MASTER_SECRET, bArr, TLSUtils.arrayConcat(readBytes, bArr3), 48);
            byte[] prf2 = TLSUtils.prf(TLSKeyMaterialSpec.KEY_EXPANSION, prf, TLSUtils.arrayConcat(bArr3, readBytes), 72);
            if (prf2 == null || prf2.length < 72) {
                a$$ExternalSyntheticBUOutline0.m$3("Missing keyblock or keyblock too short; the minimum number of keyBlock bytes is 72");
            } else {
                byte[] bArr6 = new byte[20];
                sSLState.clientMacKey = bArr6;
                sSLState.serverMacKey = new byte[20];
                sSLState.clientWriteKey = new byte[16];
                sSLState.serverWriteKey = new byte[16];
                System.arraycopy(prf2, 0, bArr6, 0, bArr6.length);
                int length = sSLState.clientMacKey.length;
                byte[] bArr7 = sSLState.serverMacKey;
                System.arraycopy(prf2, length, bArr7, 0, bArr7.length);
                int length2 = sSLState.clientMacKey.length + sSLState.serverMacKey.length;
                byte[] bArr8 = sSLState.clientWriteKey;
                System.arraycopy(prf2, length2, bArr8, 0, bArr8.length);
                int length3 = sSLState.clientMacKey.length + sSLState.serverMacKey.length + sSLState.clientWriteKey.length;
                byte[] bArr9 = sSLState.serverWriteKey;
                System.arraycopy(prf2, length3, bArr9, 0, bArr9.length);
            }
            byte[] bArr10 = sSLState.clientWriteKey;
            byte[] bArr11 = sSLState.clientMacKey;
            byte[] bArr12 = sSLState.serverWriteKey;
            byte[] bArr13 = sSLState.serverMacKey;
            byte[] byteArray3 = byteArrayOutputStream.toByteArray();
            TLSRecord read5 = TLSRecord.read(inputStream, str, bArr10, null);
            TLSRecord read6 = read5.getType() == 20 ? TLSRecord.read(inputStream, str, bArr10, byteArrayOutputStream) : read5;
            if (read5.getType() == 20) {
                BrowserSDKLogger$Companion.d("req." + i2 + ":  TLS ClientCipherChange packet received (" + str + "); switching to encrypted comms");
            }
            boolean endsWith = TLSUtils.denseHexDump(read6.data).endsWith(TLSUtils.denseHexDump(TLSUtils.prf("client finished", prf, TLSUtils.sha256Hash(byteArray3), 12)));
            synchronized (sSLState) {
                i3 = sSLState.clientSequenceNumber;
            }
            long j = i3;
            byte[] bArr14 = read6.mac;
            boolean z2 = bArr14 != null && TLSUtils.denseHexDump(bArr14).equals(TLSUtils.denseHexDump(read6.calculateMac(j, bArr11)));
            sSLState.addClientPackets(read6.numDecrypted);
            if (endsWith && z2) {
                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "req.", ":  TLS v");
                m2m.append(TLSUtils.version(read6.versionHigh, read6.versionLow));
                m2m.append(" handshake and key generation completed successfully with WebView (");
                m2m.append(str);
                m2m.append(")");
                BrowserSDKLogger$Companion.d(m2m.toString());
            } else {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("req.", i2, ":  The ClientHandshakeDone packet failed validation, we're unlikely to succeed (", str, "); sigMatch=");
                m.append(endsWith);
                m.append(", macMatch=");
                m.append(z2);
                m.toString();
                BrowserSDKLogger$Companion.logsEnabled();
            }
            outputStream.write(new TLSRecord(20, read2, read3, new byte[]{1}, byteArrayOutputStream).toBytes());
            TLSRecord tLSRecord2 = new TLSRecord(22, read2, read3, new TLSPayload(TLSUtils.prf("server finished", prf, TLSUtils.sha256Hash(byteArrayOutputStream.toByteArray()), 12), (byte) 20).toBytes(), null);
            synchronized (sSLState) {
                i4 = sSLState.serverSequenceNumber;
            }
            long j2 = i4;
            SecureRandom secureRandom = sSLState.random;
            byte[] bArr15 = sSLState.iv;
            secureRandom.nextBytes(bArr15);
            outputStream.write(tLSRecord2.toAesEncryptedBytes(j2, bArr13, bArr12, bArr15));
            outputStream.flush();
            sSLState.addServerPackets();
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            try {
                sSLSocket.setSoTimeout(20000);
                Pattern[] patternArr = SECURE_HOSTNAMES;
                int length4 = patternArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length4) {
                        z = false;
                        break;
                    } else {
                        if (patternArr[i6].matcher(str).matches()) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (z) {
                    sSLSocket.setUseClientMode(true);
                    sSLSocket.setEnableSessionCreation(true);
                    sSLSocket.setEnabledCipherSuites(SECURE_CIPHERS);
                    sSLSocket.setEnabledProtocols(SECURE_PROTOCOLS);
                }
                sSLSocket.connect(new InetSocketAddress(str, i5), 10000);
                OutputStream outputStream2 = sSLSocket.getOutputStream();
                ArrayList arrayList = new ArrayList();
                ByteArrayOutputStream byteArrayOutputStream6 = null;
                int i7 = 0;
                byte[] bArr16 = bArr10;
                while (true) {
                    try {
                        TLSRecord read7 = TLSRecord.read(inputStream, str, bArr16, byteArrayOutputStream6);
                        sSLState.addClientPackets(read7.numDecrypted);
                        if (read7.getType() != 23) {
                            break;
                        }
                        arrayList.add(new ByteArrayInputStream(read7.data));
                        SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
                        StringBuilder sb = new StringBuilder();
                        sb.append("req.");
                        sb.append(i2);
                        sb.append("[");
                        sb.append(i7);
                        sb.append("][");
                        sb.append(arrayList.size() - 1);
                        sb.append("]");
                        HttpParser httpParser = new HttpParser(null, sequenceInputStream, sb.toString(), str);
                        httpParser.waitForParse();
                        bArr2 = bArr16;
                        while (true) {
                            if (!httpParser.worker.isAlive()) {
                                httpParser.waitForParse();
                                if (!httpParser.incomplete) {
                                    break;
                                }
                            }
                            byte[] bArr17 = bArr2;
                            SimpleDecoder.AnonymousClass1 anonymousClass1 = httpParser.worker;
                            if (anonymousClass1.isAlive()) {
                                anonymousClass1.interrupt();
                                try {
                                    httpParser.source.close();
                                } catch (IOException unused) {
                                }
                            }
                            arrayList.size();
                            SVG svg2 = Fillr.getInstance().fillrConfig;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ByteArrayInputStream) it.next()).reset();
                            }
                            TLSRecord read8 = TLSRecord.read(inputStream, str, bArr17, null);
                            sSLState.addClientPackets(read8.numDecrypted);
                            if (read8.getType() != 23) {
                                SVG svg3 = Fillr.getInstance().fillrConfig;
                                closeSockets(socket, sSLSocket);
                                SVG svg4 = Fillr.getInstance().fillrConfig;
                                closeSockets(socket, sSLSocket);
                                return;
                            }
                            arrayList.add(new ByteArrayInputStream(read8.data));
                            sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("req.");
                            sb2.append(i2);
                            sb2.append("[");
                            sb2.append(i7);
                            sb2.append("][");
                            sb2.append(arrayList.size() - 1);
                            sb2.append("]");
                            HttpParser httpParser2 = new HttpParser(null, sequenceInputStream, sb2.toString(), str);
                            httpParser2.waitForParse();
                            bArr2 = bArr17;
                            httpParser = httpParser2;
                            i5 = i;
                        }
                        byteArrayOutputStream6 = null;
                        bArr16 = bArr2;
                    } catch (IOException e3) {
                        socket2 = socket;
                        if (e3.getMessage() != null && !"Read timed out".equalsIgnoreCase(e3.getMessage()) && !e3.getMessage().endsWith("-1")) {
                            e3.getMessage();
                            SVG svg5 = Fillr.getInstance().fillrConfig;
                            throw e3;
                        }
                    }
                }
                SVG svg6 = Fillr.getInstance().fillrConfig;
                closeSockets(socket2, sSLSocket);
                return;
            } catch (Throwable th) {
                th = th;
                Socket socket3 = socket;
            }
        } else {
            tLSRecord = read4;
        }
        bArr = null;
        if (bArr != null) {
        }
        byte[] bytes222 = tLSRecord.toBytes();
        if (bArr != null) {
        }
        throw new IOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bArr == null ? 0 : bArr.length, ", expectedLength=48", re$$ExternalSyntheticOutline0.m("req.", i2, ":  Invalid ClientKeyExchange (", str, "):  decryptedLength=")));
    }

    public final void doWebsocketPassthrough(final Socket socket, final SSLSocket sSLSocket, final HttpParser httpParser, final SSLState sSLState) {
        socket.setSoTimeout(20000);
        sSLSocket.setSoTimeout(20000);
        InputStream inputStream = socket.getInputStream();
        final InputStream inputStream2 = sSLSocket.getInputStream();
        final OutputStream outputStream = socket.getOutputStream();
        OutputStream outputStream2 = sSLSocket.getOutputStream();
        SVG svg = Fillr.getInstance().fillrConfig;
        this.threadPool.execute(new Thread(this) { // from class: com.fillr.browsersdk.model.WebviewProxy.6
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                SSLState sSLState2 = sSLState;
                OutputStream outputStream3 = outputStream;
                try {
                    sendEncryptedData(outputStream3, httpParser.toBytes());
                    byte[] bArr = new byte[TLSRecord.MAX_PLAINTEXT_RECORD_LENGTH / 2];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            sendEncryptedData(outputStream3, Arrays.copyOfRange(bArr, 0, read));
                        }
                    }
                } catch (Exception unused) {
                }
                synchronized (sSLState2) {
                }
                SVG svg2 = Fillr.getInstance().fillrConfig;
                WebviewProxy.closeSockets(socket, sSLSocket);
            }

            public final void sendEncryptedData(OutputStream outputStream3, byte[] bArr) {
                int i;
                SSLState sSLState2 = sSLState;
                Iterator it = TLSRecord.packetize(sSLState2.versionHigh, sSLState2.versionLow, bArr).iterator();
                while (it.hasNext()) {
                    TLSRecord tLSRecord = (TLSRecord) it.next();
                    synchronized (sSLState2) {
                        i = sSLState2.serverSequenceNumber;
                    }
                    long j = i;
                    byte[] bArr2 = sSLState2.serverMacKey;
                    byte[] bArr3 = sSLState2.serverWriteKey;
                    SecureRandom secureRandom = sSLState2.random;
                    byte[] bArr4 = sSLState2.iv;
                    secureRandom.nextBytes(bArr4);
                    outputStream3.write(tLSRecord.toAesEncryptedBytes(j, bArr2, bArr3, bArr4));
                    sSLState2.addServerPackets();
                }
                outputStream3.flush();
            }
        });
        while (true) {
            try {
                TLSRecord read = TLSRecord.read(inputStream, sSLState.hostname, sSLState.clientWriteKey, null);
                int i = read.f988type;
                sSLState.addClientPackets(read.numDecrypted);
                if (i != 23) {
                    break;
                }
                outputStream2.write(read.data);
                outputStream2.flush();
            } catch (Exception unused) {
                SVG svg2 = Fillr.getInstance().fillrConfig;
            }
        }
        SVG svg3 = Fillr.getInstance().fillrConfig;
        synchronized (sSLState) {
        }
        SVG svg4 = Fillr.getInstance().fillrConfig;
    }

    public final boolean enableForWebview(Object obj) {
        Set set;
        boolean z = false;
        if (!isAvailable() || (set = this.webviews) == null || set.isEmpty() || !set.contains(obj)) {
            return false;
        }
        int i = this.port;
        if (proxySettingApplied) {
            return true;
        }
        String name = TextUtils.isEmpty(null) ? getApplicationContextFromWebview(obj).getClass().getName() : null;
        boolean z2 = obj instanceof WebView;
        SVG svg = Fillr.getInstance().fillrConfig;
        if (z2 && WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
            if (WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
                SVG svg2 = Fillr.getInstance().fillrConfig;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(new ProxyConfig$ProxyRule(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "localhost:")));
                arrayList2.add("file://*");
                if (!WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
                    a$$ExternalSyntheticBUOutline0.m("Proxy override not supported");
                    return false;
                }
                ApiFeature$M apiFeature$M = WebViewFeatureInternal.PROXY_OVERRIDE;
                ApiFeature$M apiFeature$M2 = WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, unmodifiableList.size(), 2);
                for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                    String[] strArr2 = strArr[i2];
                    ((ProxyConfig$ProxyRule) unmodifiableList.get(i2)).getClass();
                    strArr2[0] = Marker.ANY_MARKER;
                    strArr[i2][1] = ((ProxyConfig$ProxyRule) unmodifiableList.get(i2)).mUrl;
                }
                String[] strArr3 = (String[]) Collections.unmodifiableList(arrayList2).toArray(new String[0]);
                boolean isSupportedByWebView = apiFeature$M.isSupportedByWebView();
                PreviewView.AnonymousClass1 anonymousClass1 = WebViewFeature.INSTANCE;
                AnonymousClass1 anonymousClass12 = PROXY_CHANGE_EXECUTOR;
                Fillr.AnonymousClass3 anonymousClass3 = PROXY_CHANGE_LISTENER;
                if (isSupportedByWebView) {
                    if (((ProxyControllerBoundaryInterface) anonymousClass1.this$0) == null) {
                        anonymousClass1.this$0 = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getProxyController();
                    }
                    ((ProxyControllerBoundaryInterface) anonymousClass1.this$0).setProxyOverride(strArr, strArr3, anonymousClass3, anonymousClass12);
                } else {
                    if (!apiFeature$M.isSupportedByWebView() || !apiFeature$M2.isSupportedByWebView()) {
                        throw WebViewFeatureInternal.getUnsupportedOperationException();
                    }
                    if (((ProxyControllerBoundaryInterface) anonymousClass1.this$0) == null) {
                        anonymousClass1.this$0 = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getProxyController();
                    }
                    ((ProxyControllerBoundaryInterface) anonymousClass1.this$0).setProxyOverride(strArr, strArr3, anonymousClass3, anonymousClass12, false);
                }
                z = true;
            }
            proxySettingApplied = z;
        } else {
            SVG svg3 = Fillr.getInstance().fillrConfig;
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("https.proxyHost");
            if (!TextUtils.isEmpty(property) && !"localhost".equals(property)) {
                SVG svg4 = Fillr.getInstance().fillrConfig;
            } else if (TextUtils.isEmpty(property2) || "localhost".equals(property)) {
                Context applicationContextFromWebview = getApplicationContextFromWebview(obj);
                System.setProperty("http.proxyHost", "localhost");
                System.setProperty("http.proxyPort", i + "");
                System.setProperty("https.proxyHost", "localhost");
                System.setProperty("https.proxyPort", i + "");
                try {
                    Iterator it = getProxyChangeListeners(applicationContextFromWebview, name).values().iterator();
                    while (it.hasNext()) {
                        for (Object obj2 : ((ArrayMap) it.next()).keySet()) {
                            Class<?> cls = obj2.getClass();
                            if (cls.getName().contains("ProxyChangeListener")) {
                                Method declaredMethod = cls.getDeclaredMethod("onReceive", Context.class, Intent.class);
                                Intent intent = new Intent("android.intent.action.PROXY_CHANGE");
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("android.intent.extra.PROXY_INFO", ProxyInfo.buildDirectProxy("localhost", i));
                                intent.putExtras(bundle);
                                declaredMethod.invoke(obj2, applicationContextFromWebview, intent);
                            }
                        }
                    }
                    SVG svg5 = Fillr.getInstance().fillrConfig;
                    SVG svg6 = Fillr.getInstance().fillrConfig;
                    ProxySelector.setDefault(new AnonymousClass4());
                    z = true;
                } catch (Exception e) {
                    e.getLocalizedMessage();
                    SVG svg7 = Fillr.getInstance().fillrConfig;
                }
            } else {
                SVG svg8 = Fillr.getInstance().fillrConfig;
            }
            proxySettingApplied = z;
        }
        return proxySettingApplied;
    }

    public final void handleAndClose(Socket socket) {
        try {
            try {
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                socket.setSoLinger(false, 0);
                socket.setPerformancePreferences(0, 2, 1);
                if (doProxy(socket)) {
                    closeSockets(socket);
                }
            } catch (Exception e) {
                if (e.getMessage() != null && !e.getMessage().toLowerCase().contains("broken pipe")) {
                    SVG svg = Fillr.getInstance().fillrConfig;
                }
                closeSockets(socket);
            }
        } catch (Throwable th) {
            closeSockets(socket);
            throw th;
        }
    }

    public final boolean isAvailable() {
        return this.port > 0;
    }

    /* renamed from: com.fillr.browsersdk.model.WebviewProxy$1, reason: invalid class name */
    public final class AnonymousClass1 implements Executor {
        public final /* synthetic */ int $r8$classId;
        public final Handler handler;

        public AnonymousClass1() {
            this.$r8$classId = 0;
            this.handler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            int i = this.$r8$classId;
            Handler handler = this.handler;
            switch (i) {
                case 0:
                    handler.post(runnable);
                    return;
                default:
                    runnable.getClass();
                    if (handler.post(runnable)) {
                        return;
                    }
                    throw new RejectedExecutionException(handler + " is shutting down");
            }
        }

        public AnonymousClass1(Handler handler) {
            this.$r8$classId = 1;
            handler.getClass();
            this.handler = handler;
        }
    }
}
