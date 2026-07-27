package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3996uN extends AbstractC3376ix {

    /* renamed from: c, reason: collision with root package name */
    public DP f34526c;

    /* renamed from: d, reason: collision with root package name */
    public final C3834rN f34527d = new C3834rN();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f34528e;

    /* renamed from: f, reason: collision with root package name */
    public long f34529f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f34530g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34531h;

    static {
        AbstractC4083w2.a("media3.decoder");
    }

    public C3996uN(int i) {
        this.f34531h = i;
    }

    public void i() {
        this.f31138b = 0;
        ByteBuffer byteBuffer = this.f34528e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f34530g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.f34528e;
        if (byteBuffer == null) {
            this.f34528e = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i6 = i + position;
        if (capacity >= i6) {
            this.f34528e = byteBuffer;
            return;
        }
        ByteBuffer m4 = m(i6);
        m4.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m4.put(byteBuffer);
        }
        this.f34528e = m4;
    }

    public final boolean k() {
        return h(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f34528e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f34530g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer m(int i) {
        int i6 = this.f34531h;
        if (i6 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i6 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f34528e;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(capacity).length() + 21 + String.valueOf(i).length() + 1);
        u1.h.h(sb, "Buffer too small (", capacity, " < ", i);
        sb.append(")");
        throw new C3942tN(sb.toString());
    }
}
