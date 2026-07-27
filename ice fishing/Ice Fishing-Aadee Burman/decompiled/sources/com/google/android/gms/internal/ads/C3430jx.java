package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.jx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3430jx implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3231gB f31352n;

    /* renamed from: u, reason: collision with root package name */
    public C3933tE f31353u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f31354v;

    public final HttpURLConnection a(C3933tE c3933tE) {
        this.f31352n = new C3586mr((byte) 0, 15);
        this.f31353u = c3933tE;
        ((Integer) this.f31352n.mo15c()).getClass();
        C3933tE c3933tE2 = this.f31353u;
        c3933tE2.getClass();
        Set set = C2855Xg.f28546y;
        C2866Yb c2866Yb = C4835j.f39730C.f39748q;
        int intValue = ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32278j0)).intValue();
        URL url = new URL(c3933tE2.f34252b);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(intValue);
            openConnection.setReadTimeout(intValue);
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            v2.f fVar = new v2.f();
            fVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            fVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f31354v = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            String concat = "Redirecting to ".concat(headerField);
            int i6 = u2.z.f41319b;
            v2.i.a(concat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f31354v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
