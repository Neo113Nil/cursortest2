package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3978u5 extends ZM {
    static {
        C2921aN.l(C3978u5.class);
    }

    public C3978u5(C2656Lg c2656Lg, C2673Mg c2673Mg) {
        ByteBuffer byteBuffer = c2656Lg.f26126n;
        long limit = byteBuffer.limit();
        this.f28876u = c2656Lg;
        this.f28878w = c2656Lg.b();
        byteBuffer.position((int) (c2656Lg.b() + limit));
        this.f28879x = c2656Lg.b();
        this.f28875n = c2673Mg;
    }

    @Override // com.google.android.gms.internal.ads.ZM, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.ZM
    public final String toString() {
        String obj = this.f28876u.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
