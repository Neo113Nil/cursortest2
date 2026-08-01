package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3763q5 extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33196n;

    /* renamed from: u, reason: collision with root package name */
    public final HttpURLConnection f33197u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3763q5(HttpURLConnection httpURLConnection, int i) {
        super(r2);
        InputStream errorStream;
        InputStream errorStream2;
        this.f33196n = i;
        switch (i) {
            case 1:
                try {
                    errorStream2 = httpURLConnection.getInputStream();
                } catch (IOException unused) {
                    errorStream2 = httpURLConnection.getErrorStream();
                }
                this.f33197u = httpURLConnection;
                break;
            default:
                try {
                    errorStream = httpURLConnection.getInputStream();
                } catch (IOException unused2) {
                    errorStream = httpURLConnection.getErrorStream();
                }
                super(errorStream);
                this.f33197u = httpURLConnection;
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f33196n) {
            case 0:
                super.close();
                this.f33197u.disconnect();
                break;
            default:
                super.close();
                this.f33197u.disconnect();
                break;
        }
    }
}
