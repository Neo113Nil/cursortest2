package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f6689b = 8.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6690c = 0.1f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6691d = 8.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f6692e = 0.1f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6693f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f6694g = 0.01f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6695h = 1024;

    /* renamed from: n, reason: collision with root package name */
    private int f6700n;

    /* renamed from: o, reason: collision with root package name */
    private s f6701o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f6702p;

    /* renamed from: q, reason: collision with root package name */
    private ShortBuffer f6703q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f6704r;

    /* renamed from: s, reason: collision with root package name */
    private long f6705s;

    /* renamed from: t, reason: collision with root package name */
    private long f6706t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6707u;

    /* renamed from: k, reason: collision with root package name */
    private float f6697k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f6698l = 1.0f;
    private int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f6696j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f6699m = -1;

    public t() {
        ByteBuffer byteBuffer = f.f6440a;
        this.f6702p = byteBuffer;
        this.f6703q = byteBuffer.asShortBuffer();
        this.f6704r = byteBuffer;
        this.f6700n = -1;
    }

    public final float a(float f3) {
        float a9 = af.a(f3);
        if (this.f6697k != a9) {
            this.f6697k = a9;
            this.f6701o = null;
        }
        h();
        return a9;
    }

    public final float b(float f3) {
        float a9 = af.a(f3);
        if (this.f6698l != a9) {
            this.f6698l = a9;
            this.f6701o = null;
        }
        h();
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6699m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        com.anythink.basead.exoplayer.k.a.b(this.f6701o != null);
        this.f6701o.a();
        this.f6707u = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6704r;
        this.f6704r = f.f6440a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        if (!this.f6707u) {
            return false;
        }
        s sVar = this.f6701o;
        return sVar == null || sVar.c() == 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            s sVar = this.f6701o;
            if (sVar == null) {
                this.f6701o = new s(this.f6696j, this.i, this.f6697k, this.f6698l, this.f6699m);
            } else {
                sVar.b();
            }
        }
        this.f6704r = f.f6440a;
        this.f6705s = 0L;
        this.f6706t = 0L;
        this.f6707u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f6697k = 1.0f;
        this.f6698l = 1.0f;
        this.i = -1;
        this.f6696j = -1;
        this.f6699m = -1;
        ByteBuffer byteBuffer = f.f6440a;
        this.f6702p = byteBuffer;
        this.f6703q = byteBuffer.asShortBuffer();
        this.f6704r = byteBuffer;
        this.f6700n = -1;
        this.f6701o = null;
        this.f6705s = 0L;
        this.f6706t = 0L;
        this.f6707u = false;
    }

    private void a(int i) {
        this.f6700n = i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    public final long a(long j6) {
        long j9 = this.f6706t;
        if (j9 >= 1024) {
            int i = this.f6699m;
            int i6 = this.f6696j;
            if (i == i6) {
                return af.a(j6, this.f6705s, j9);
            }
            return af.a(j6, this.f6705s * i, j9 * i6);
        }
        return (long) (this.f6697k * j6);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i6, int i9) {
        if (i9 == 2) {
            int i10 = this.f6700n;
            if (i10 == -1) {
                i10 = i;
            }
            if (this.f6696j == i && this.i == i6 && this.f6699m == i10) {
                return false;
            }
            this.f6696j = i;
            this.i = i6;
            this.f6699m = i10;
            this.f6701o = null;
            return true;
        }
        throw new f.a(i, i6, i9);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        if (this.f6696j != -1) {
            return Math.abs(this.f6697k - 1.0f) >= f6694g || Math.abs(this.f6698l - 1.0f) >= f6694g || this.f6699m != this.f6696j;
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.basead.exoplayer.k.a.b(this.f6701o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f6705s += remaining;
            this.f6701o.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int c9 = this.f6701o.c() * this.i * 2;
        if (c9 > 0) {
            if (this.f6702p.capacity() < c9) {
                ByteBuffer order = ByteBuffer.allocateDirect(c9).order(ByteOrder.nativeOrder());
                this.f6702p = order;
                this.f6703q = order.asShortBuffer();
            } else {
                this.f6702p.clear();
                this.f6703q.clear();
            }
            this.f6701o.b(this.f6703q);
            this.f6706t += c9;
            this.f6702p.limit(c9);
            this.f6704r = this.f6702p;
        }
    }
}
