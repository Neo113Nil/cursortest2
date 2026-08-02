package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.jx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3453jx implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3254gB f32131n;

    /* renamed from: u, reason: collision with root package name */
    public C3956tE f32132u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f32133v;

    public final HttpURLConnection a(C3956tE c3956tE) {
        this.f32131n = new C3609mr((byte) 0, 15);
        this.f32132u = c3956tE;
        ((Integer) this.f32131n.mo14c()).getClass();
        C3956tE c3956tE2 = this.f32132u;
        c3956tE2.getClass();
        Set set = C2878Xg.f29318y;
        C2889Yb c2889Yb = C4906k.f40186C.f40204q;
        int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33057j0)).intValue();
        URL url = new URL(c3956tE2.f35038b);
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
            x2.f fVar = new x2.f();
            fVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            fVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f32133v = httpURLConnection;
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
            int i4 = w2.z.f41712b;
            x2.i.a(concat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f32133v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
