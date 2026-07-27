package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f6846b = 8.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6847c = 0.1f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6848d = 8.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f6849e = 0.1f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6850f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f6851g = 0.01f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6852h = 1024;

    /* renamed from: n, reason: collision with root package name */
    private int f6857n;

    /* renamed from: o, reason: collision with root package name */
    private s f6858o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f6859p;

    /* renamed from: q, reason: collision with root package name */
    private ShortBuffer f6860q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f6861r;

    /* renamed from: s, reason: collision with root package name */
    private long f6862s;

    /* renamed from: t, reason: collision with root package name */
    private long f6863t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6864u;

    /* renamed from: k, reason: collision with root package name */
    private float f6854k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f6855l = 1.0f;
    private int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f6853j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f6856m = -1;

    public t() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6859p = byteBuffer;
        this.f6860q = byteBuffer.asShortBuffer();
        this.f6861r = byteBuffer;
        this.f6857n = -1;
    }

    public final float a(float f6) {
        float a9 = af.a(f6);
        if (this.f6854k != a9) {
            this.f6854k = a9;
            this.f6858o = null;
        }
        h();
        return a9;
    }

    public final float b(float f6) {
        float a9 = af.a(f6);
        if (this.f6855l != a9) {
            this.f6855l = a9;
            this.f6858o = null;
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
        return this.f6856m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        C0544a.b(this.f6858o != null);
        this.f6858o.a();
        this.f6864u = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6861r;
        this.f6861r = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        if (!this.f6864u) {
            return false;
        }
        s sVar = this.f6858o;
        return sVar == null || sVar.c() == 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            s sVar = this.f6858o;
            if (sVar == null) {
                this.f6858o = new s(this.f6853j, this.i, this.f6854k, this.f6855l, this.f6856m);
            } else {
                sVar.b();
            }
        }
        this.f6861r = f.f6597a;
        this.f6862s = 0L;
        this.f6863t = 0L;
        this.f6864u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f6854k = 1.0f;
        this.f6855l = 1.0f;
        this.i = -1;
        this.f6853j = -1;
        this.f6856m = -1;
        ByteBuffer byteBuffer = f.f6597a;
        this.f6859p = byteBuffer;
        this.f6860q = byteBuffer.asShortBuffer();
        this.f6861r = byteBuffer;
        this.f6857n = -1;
        this.f6858o = null;
        this.f6862s = 0L;
        this.f6863t = 0L;
        this.f6864u = false;
    }

    private void a(int i) {
        this.f6857n = i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    public final long a(long j9) {
        long j10 = this.f6863t;
        if (j10 >= 1024) {
            int i = this.f6856m;
            int i4 = this.f6853j;
            if (i == i4) {
                return af.a(j9, this.f6862s, j10);
            }
            return af.a(j9, this.f6862s * i, j10 * i4);
        }
        return (long) (this.f6854k * j9);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        if (i9 == 2) {
            int i10 = this.f6857n;
            if (i10 == -1) {
                i10 = i;
            }
            if (this.f6853j == i && this.i == i4 && this.f6856m == i10) {
                return false;
            }
            this.f6853j = i;
            this.i = i4;
            this.f6856m = i10;
            this.f6858o = null;
            return true;
        }
        throw new f.a(i, i4, i9);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        if (this.f6853j != -1) {
            return Math.abs(this.f6854k - 1.0f) >= f6851g || Math.abs(this.f6855l - 1.0f) >= f6851g || this.f6856m != this.f6853j;
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        C0544a.b(this.f6858o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f6862s += remaining;
            this.f6858o.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int c4 = this.f6858o.c() * this.i * 2;
        if (c4 > 0) {
            if (this.f6859p.capacity() < c4) {
                ByteBuffer order = ByteBuffer.allocateDirect(c4).order(ByteOrder.nativeOrder());
                this.f6859p = order;
                this.f6860q = order.asShortBuffer();
            } else {
                this.f6859p.clear();
                this.f6860q.clear();
            }
            this.f6858o.b(this.f6860q);
            this.f6863t += c4;
            this.f6859p.limit(c4);
            this.f6861r = this.f6859p;
        }
    }
}
