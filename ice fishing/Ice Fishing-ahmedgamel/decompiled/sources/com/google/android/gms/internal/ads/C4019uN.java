package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.uN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4019uN extends AbstractC3399ix {

    /* renamed from: c, reason: collision with root package name */
    public DP f35300c;

    /* renamed from: d, reason: collision with root package name */
    public final C3857rN f35301d = new C3857rN();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f35302e;

    /* renamed from: f, reason: collision with root package name */
    public long f35303f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f35304g;

    /* renamed from: h, reason: collision with root package name */
    public final int f35305h;

    static {
        AbstractC4106w2.a("media3.decoder");
    }

    public C4019uN(int i) {
        this.f35305h = i;
    }

    public void i() {
        this.f31925b = 0;
        ByteBuffer byteBuffer = this.f35302e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f35304g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.f35302e;
        if (byteBuffer == null) {
            this.f35302e = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i + position;
        if (capacity >= i4) {
            this.f35302e = byteBuffer;
            return;
        }
        ByteBuffer m9 = m(i4);
        m9.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m9.put(byteBuffer);
        }
        this.f35302e = m9;
    }

    public final boolean k() {
        return h(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f35302e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f35304g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer m(int i) {
        int i4 = this.f35305h;
        if (i4 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f35302e;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(capacity).length() + 21 + String.valueOf(i).length() + 1);
        AbstractC5128c.g(sb, "Buffer too small (", capacity, " < ", i);
        sb.append(")");
        throw new C3965tN(sb.toString());
    }
}
