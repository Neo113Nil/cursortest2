package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3497kx implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3404jB f32488n;

    /* renamed from: u, reason: collision with root package name */
    public HE f32489u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f32490v;

    public final HttpURLConnection a(HE he) {
        this.f32488n = new Dr((byte) 0, 14);
        this.f32489u = he;
        ((Integer) this.f32488n.a()).getClass();
        HE he2 = this.f32489u;
        he2.getClass();
        Set set = C2808Ug.f28055y;
        C2837Wb c2837Wb = p2.j.f39798C.f39816q;
        int intValue = ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31697j0)).intValue();
        URL url = new URL(he2.f25338b);
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
            u2.f fVar = new u2.f();
            fVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            fVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f32490v = httpURLConnection;
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
            int i4 = t2.C.f40822b;
            u2.i.a(concat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f32490v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
