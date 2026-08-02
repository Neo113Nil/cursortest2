package com.anythink.expressad.foundation.g.f.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.c.c;
import com.anythink.expressad.foundation.g.f.d.f;
import com.anythink.expressad.foundation.g.f.j;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.foundation.g.f.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20091a = 100;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c.a f20092b;

    /* renamed from: c, reason: collision with root package name */
    private SSLSocketFactory f20093c;

    public static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f20094a;

        public a(HttpURLConnection httpURLConnection) {
            super(b.b(httpURLConnection));
            this.f20094a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            this.f20094a.disconnect();
        }
    }

    public b(SSLSocketFactory sSLSocketFactory, com.anythink.expressad.foundation.g.f.c.a aVar) {
        this.f20093c = sSLSocketFactory;
        this.f20092b = aVar;
    }

    private static boolean a(int i, int i4) {
        if (i != 4) {
            return ((100 <= i4 && i4 < 200) || i4 == 204 || i4 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void b(HttpURLConnection httpURLConnection, j<?> jVar) {
        byte[] h3 = jVar.h();
        if (h3 != null) {
            boolean z6 = jVar instanceof f;
            if (z6) {
                httpURLConnection.setChunkedStreamingMode(2048);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(h3);
            if (z6) {
                jVar.a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.e.a
    public final com.anythink.expressad.foundation.g.f.f.b a(j<?> jVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        URL url = new URL(jVar.d());
        com.anythink.expressad.foundation.g.f.c.a aVar = this.f20092b;
        if (aVar != null && !TextUtils.isEmpty(aVar.f20029b) && !TextUtils.isEmpty(this.f20092b.f20030c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.f20092b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f20029b, Integer.valueOf(aVar2.f20030c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        boolean z6 = false;
        httpURLConnection.setInstanceFollowRedirects(false);
        int k9 = jVar.k();
        httpURLConnection.setConnectTimeout(k9);
        httpURLConnection.setReadTimeout(k9);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f20093c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (Map.Entry<String, String> entry : jVar.g().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            switch (jVar.a()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    b(httpURLConnection, jVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    b(httpURLConnection, jVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    b(httpURLConnection, jVar);
                    httpURLConnection.setRequestMethod("PATCH");
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (jVar.a() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()), new a(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z6 = true;
                        if (!z6) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                com.anythink.expressad.foundation.g.f.f.b bVar = new com.anythink.expressad.foundation.g.f.f.b(responseCode, a(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return bVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<c> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.f20092b;
        if (aVar != null && !TextUtils.isEmpty(aVar.f20029b) && !TextUtils.isEmpty(this.f20092b.f20030c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.f20092b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f20029b, Integer.valueOf(aVar2.f20030c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, j<?> jVar) {
        switch (jVar.a()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, jVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                b(httpURLConnection, jVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                b(httpURLConnection, jVar);
                httpURLConnection.setRequestMethod("PATCH");
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private HttpURLConnection a(URL url, j<?> jVar) {
        HttpURLConnection httpURLConnection;
        SSLSocketFactory sSLSocketFactory;
        com.anythink.expressad.foundation.g.f.c.a aVar = this.f20092b;
        if (aVar != null && !TextUtils.isEmpty(aVar.f20029b) && !TextUtils.isEmpty(this.f20092b.f20030c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.anythink.expressad.foundation.g.f.c.a aVar2 = this.f20092b;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f20029b, Integer.valueOf(aVar2.f20030c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        int k9 = jVar.k();
        httpURLConnection.setConnectTimeout(k9);
        httpURLConnection.setReadTimeout(k9);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f20093c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
