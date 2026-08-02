package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4001u5 extends ZM {
    static {
        C2944aN.l(C4001u5.class);
    }

    public C4001u5(C2676Lg c2676Lg, C2693Mg c2693Mg) {
        ByteBuffer byteBuffer = c2676Lg.f26923n;
        long limit = byteBuffer.limit();
        this.f29656u = c2676Lg;
        this.f29658w = c2676Lg.b();
        byteBuffer.position((int) (c2676Lg.b() + limit));
        this.f29659x = c2676Lg.b();
        this.f29655n = c2693Mg;
    }

    @Override // com.google.android.gms.internal.ads.ZM, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.ZM
    public final String toString() {
        String obj = this.f29656u.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
