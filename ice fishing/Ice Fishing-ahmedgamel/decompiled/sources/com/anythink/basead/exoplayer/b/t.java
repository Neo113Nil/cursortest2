package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f7475b = 8.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f7476c = 0.1f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f7477d = 8.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f7478e = 0.1f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7479f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f7480g = 0.01f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7481h = 1024;

    /* renamed from: n, reason: collision with root package name */
    private int f7486n;

    /* renamed from: o, reason: collision with root package name */
    private s f7487o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f7488p;

    /* renamed from: q, reason: collision with root package name */
    private ShortBuffer f7489q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f7490r;

    /* renamed from: s, reason: collision with root package name */
    private long f7491s;

    /* renamed from: t, reason: collision with root package name */
    private long f7492t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7493u;

    /* renamed from: k, reason: collision with root package name */
    private float f7483k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f7484l = 1.0f;
    private int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f7482j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f7485m = -1;

    public t() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7488p = byteBuffer;
        this.f7489q = byteBuffer.asShortBuffer();
        this.f7490r = byteBuffer;
        this.f7486n = -1;
    }

    public final float a(float f2) {
        float a9 = af.a(f2);
        if (this.f7483k != a9) {
            this.f7483k = a9;
            this.f7487o = null;
        }
        h();
        return a9;
    }

    public final float b(float f2) {
        float a9 = af.a(f2);
        if (this.f7484l != a9) {
            this.f7484l = a9;
            this.f7487o = null;
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
        return this.f7485m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        com.anythink.basead.exoplayer.k.a.b(this.f7487o != null);
        this.f7487o.a();
        this.f7493u = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7490r;
        this.f7490r = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        if (!this.f7493u) {
            return false;
        }
        s sVar = this.f7487o;
        return sVar == null || sVar.c() == 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            s sVar = this.f7487o;
            if (sVar == null) {
                this.f7487o = new s(this.f7482j, this.i, this.f7483k, this.f7484l, this.f7485m);
            } else {
                sVar.b();
            }
        }
        this.f7490r = f.f7226a;
        this.f7491s = 0L;
        this.f7492t = 0L;
        this.f7493u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f7483k = 1.0f;
        this.f7484l = 1.0f;
        this.i = -1;
        this.f7482j = -1;
        this.f7485m = -1;
        ByteBuffer byteBuffer = f.f7226a;
        this.f7488p = byteBuffer;
        this.f7489q = byteBuffer.asShortBuffer();
        this.f7490r = byteBuffer;
        this.f7486n = -1;
        this.f7487o = null;
        this.f7491s = 0L;
        this.f7492t = 0L;
        this.f7493u = false;
    }

    private void a(int i) {
        this.f7486n = i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    public final long a(long j6) {
        long j9 = this.f7492t;
        if (j9 >= 1024) {
            int i = this.f7485m;
            int i4 = this.f7482j;
            if (i == i4) {
                return af.a(j6, this.f7491s, j9);
            }
            return af.a(j6, this.f7491s * i, j9 * i4);
        }
        return (long) (this.f7483k * j6);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        if (i6 == 2) {
            int i9 = this.f7486n;
            if (i9 == -1) {
                i9 = i;
            }
            if (this.f7482j == i && this.i == i4 && this.f7485m == i9) {
                return false;
            }
            this.f7482j = i;
            this.i = i4;
            this.f7485m = i9;
            this.f7487o = null;
            return true;
        }
        throw new f.a(i, i4, i6);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        if (this.f7482j != -1) {
            return Math.abs(this.f7483k - 1.0f) >= f7480g || Math.abs(this.f7484l - 1.0f) >= f7480g || this.f7485m != this.f7482j;
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.basead.exoplayer.k.a.b(this.f7487o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7491s += remaining;
            this.f7487o.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int c9 = this.f7487o.c() * this.i * 2;
        if (c9 > 0) {
            if (this.f7488p.capacity() < c9) {
                ByteBuffer order = ByteBuffer.allocateDirect(c9).order(ByteOrder.nativeOrder());
                this.f7488p = order;
                this.f7489q = order.asShortBuffer();
            } else {
                this.f7488p.clear();
                this.f7489q.clear();
            }
            this.f7487o.b(this.f7489q);
            this.f7492t += c9;
            this.f7488p.limit(c9);
            this.f7490r = this.f7488p;
        }
    }
}
