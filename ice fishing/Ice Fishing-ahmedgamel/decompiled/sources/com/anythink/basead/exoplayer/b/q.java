package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final long f6618b = 150000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f6619c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final short f6620d = 1024;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f6621e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6622f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6623g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6624h = 2;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f6625j;

    /* renamed from: k, reason: collision with root package name */
    private int f6626k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6627l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f6628m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f6629n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6630o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f6631p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f6632q;

    /* renamed from: r, reason: collision with root package name */
    private int f6633r;

    /* renamed from: s, reason: collision with root package name */
    private int f6634s;

    /* renamed from: t, reason: collision with root package name */
    private int f6635t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6636u;

    /* renamed from: v, reason: collision with root package name */
    private long f6637v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q() {
        ByteBuffer byteBuffer = f.f6440a;
        this.f6628m = byteBuffer;
        this.f6629n = byteBuffer;
        this.i = -1;
        this.f6625j = -1;
        this.f6631p = new byte[0];
        this.f6632q = new byte[0];
    }

    public final void a(boolean z3) {
        this.f6627l = z3;
        h();
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6625j;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f6630o = true;
        int i = this.f6634s;
        if (i > 0) {
            a(this.f6631p, i);
        }
        if (this.f6636u) {
            return;
        }
        this.f6637v += this.f6635t / this.f6626k;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6629n;
        this.f6629n = f.f6440a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f6630o && this.f6629n == f.f6440a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            int a9 = a(f6618b) * this.f6626k;
            if (this.f6631p.length != a9) {
                this.f6631p = new byte[a9];
            }
            int a10 = a(f6619c) * this.f6626k;
            this.f6635t = a10;
            if (this.f6632q.length != a10) {
                this.f6632q = new byte[a10];
            }
        }
        this.f6633r = 0;
        this.f6629n = f.f6440a;
        this.f6630o = false;
        this.f6637v = 0L;
        this.f6634s = 0;
        this.f6636u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f6627l = false;
        h();
        this.f6628m = f.f6440a;
        this.i = -1;
        this.f6625j = -1;
        this.f6635t = 0;
        this.f6631p = new byte[0];
        this.f6632q = new byte[0];
    }

    public final long j() {
        return this.f6637v;
    }

    private void b(ByteBuffer byteBuffer) {
        int position;
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6631p.length));
        int limit2 = byteBuffer.limit() - 1;
        while (true) {
            if (limit2 < byteBuffer.position()) {
                position = byteBuffer.position();
                break;
            } else {
                if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                    int i = this.f6626k;
                    position = ((limit2 / i) * i) + i;
                    break;
                }
                limit2 -= 2;
            }
        }
        if (position == byteBuffer.position()) {
            this.f6633r = 1;
        } else {
            byteBuffer.limit(position);
            a(byteBuffer.remaining());
            this.f6628m.put(byteBuffer);
            this.f6628m.flip();
            this.f6629n = this.f6628m;
        }
        byteBuffer.limit(limit);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f3 = f(byteBuffer);
        int position = f3 - byteBuffer.position();
        byte[] bArr = this.f6631p;
        int length = bArr.length;
        int i = this.f6634s;
        int i6 = length - i;
        if (f3 < limit && position < i6) {
            a(bArr, i);
            this.f6634s = 0;
            this.f6633r = 0;
            return;
        }
        int min = Math.min(position, i6);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f6631p, this.f6634s, min);
        int i9 = this.f6634s + min;
        this.f6634s = i9;
        byte[] bArr2 = this.f6631p;
        if (i9 == bArr2.length) {
            if (this.f6636u) {
                a(bArr2, this.f6635t);
                this.f6637v += (this.f6634s - (this.f6635t * 2)) / this.f6626k;
            } else {
                this.f6637v += (i9 - this.f6635t) / this.f6626k;
            }
            a(byteBuffer, this.f6631p, this.f6634s);
            this.f6634s = 0;
            this.f6633r = 2;
        }
        byteBuffer.limit(limit);
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f3 = f(byteBuffer);
        byteBuffer.limit(f3);
        this.f6637v += byteBuffer.remaining() / this.f6626k;
        a(byteBuffer, this.f6632q, this.f6635t);
        if (f3 < limit) {
            a(this.f6632q, this.f6635t);
            this.f6633r = 0;
            byteBuffer.limit(limit);
        }
    }

    private int g(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.f6626k;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.f6626k;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i6, int i9) {
        if (i9 == 2) {
            if (this.f6625j == i && this.i == i6) {
                return false;
            }
            this.f6625j = i;
            this.i = i6;
            this.f6626k = i6 * 2;
            return true;
        }
        throw new f.a(i, i6, i9);
    }

    private void e(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f6628m.put(byteBuffer);
        this.f6628m.flip();
        this.f6629n = this.f6628m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6625j != -1 && this.f6627l;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f6629n.hasRemaining()) {
            int i = this.f6633r;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6631p.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i6 = this.f6626k;
                            position = ((limit2 / i6) * i6) + i6;
                            break;
                        }
                        limit2 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6633r = 1;
                } else {
                    byteBuffer.limit(position);
                    a(byteBuffer.remaining());
                    this.f6628m.put(byteBuffer);
                    this.f6628m.flip();
                    this.f6629n = this.f6628m;
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int f3 = f(byteBuffer);
                int position2 = f3 - byteBuffer.position();
                byte[] bArr = this.f6631p;
                int length = bArr.length;
                int i9 = this.f6634s;
                int i10 = length - i9;
                if (f3 < limit3 && position2 < i10) {
                    a(bArr, i9);
                    this.f6634s = 0;
                    this.f6633r = 0;
                } else {
                    int min = Math.min(position2, i10);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f6631p, this.f6634s, min);
                    int i11 = this.f6634s + min;
                    this.f6634s = i11;
                    byte[] bArr2 = this.f6631p;
                    if (i11 == bArr2.length) {
                        if (this.f6636u) {
                            a(bArr2, this.f6635t);
                            this.f6637v += (this.f6634s - (this.f6635t * 2)) / this.f6626k;
                        } else {
                            this.f6637v += (i11 - this.f6635t) / this.f6626k;
                        }
                        a(byteBuffer, this.f6631p, this.f6634s);
                        this.f6634s = 0;
                        this.f6633r = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int f9 = f(byteBuffer);
                byteBuffer.limit(f9);
                this.f6637v += byteBuffer.remaining() / this.f6626k;
                a(byteBuffer, this.f6632q, this.f6635t);
                if (f9 < limit4) {
                    a(this.f6632q, this.f6635t);
                    this.f6633r = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void a(byte[] bArr, int i) {
        a(i);
        this.f6628m.put(bArr, 0, i);
        this.f6628m.flip();
        this.f6629n = this.f6628m;
    }

    private void a(int i) {
        if (this.f6628m.capacity() < i) {
            this.f6628m = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6628m.clear();
        }
        if (i > 0) {
            this.f6636u = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f6635t);
        int i6 = this.f6635t - min;
        System.arraycopy(bArr, i - i6, this.f6632q, 0, i6);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6632q, i6, min);
    }

    private int a(long j6) {
        return (int) ((j6 * this.f6625j) / 1000000);
    }
}
