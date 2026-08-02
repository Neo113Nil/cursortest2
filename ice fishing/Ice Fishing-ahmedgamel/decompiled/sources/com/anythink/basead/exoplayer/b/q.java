package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final long f7404b = 150000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f7405c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final short f7406d = 1024;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f7407e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7408f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7409g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7410h = 2;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f7411j;

    /* renamed from: k, reason: collision with root package name */
    private int f7412k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7413l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f7414m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f7415n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7416o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f7417p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f7418q;

    /* renamed from: r, reason: collision with root package name */
    private int f7419r;

    /* renamed from: s, reason: collision with root package name */
    private int f7420s;

    /* renamed from: t, reason: collision with root package name */
    private int f7421t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7422u;

    /* renamed from: v, reason: collision with root package name */
    private long f7423v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7414m = byteBuffer;
        this.f7415n = byteBuffer;
        this.i = -1;
        this.f7411j = -1;
        this.f7417p = new byte[0];
        this.f7418q = new byte[0];
    }

    public final void a(boolean z6) {
        this.f7413l = z6;
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
        return this.f7411j;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f7416o = true;
        int i = this.f7420s;
        if (i > 0) {
            a(this.f7417p, i);
        }
        if (this.f7422u) {
            return;
        }
        this.f7423v += this.f7421t / this.f7412k;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7415n;
        this.f7415n = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f7416o && this.f7415n == f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            int a9 = a(f7404b) * this.f7412k;
            if (this.f7417p.length != a9) {
                this.f7417p = new byte[a9];
            }
            int a10 = a(f7405c) * this.f7412k;
            this.f7421t = a10;
            if (this.f7418q.length != a10) {
                this.f7418q = new byte[a10];
            }
        }
        this.f7419r = 0;
        this.f7415n = f.f7226a;
        this.f7416o = false;
        this.f7423v = 0L;
        this.f7420s = 0;
        this.f7422u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f7413l = false;
        h();
        this.f7414m = f.f7226a;
        this.i = -1;
        this.f7411j = -1;
        this.f7421t = 0;
        this.f7417p = new byte[0];
        this.f7418q = new byte[0];
    }

    public final long j() {
        return this.f7423v;
    }

    private void b(ByteBuffer byteBuffer) {
        int position;
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7417p.length));
        int limit2 = byteBuffer.limit() - 1;
        while (true) {
            if (limit2 < byteBuffer.position()) {
                position = byteBuffer.position();
                break;
            } else {
                if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                    int i = this.f7412k;
                    position = ((limit2 / i) * i) + i;
                    break;
                }
                limit2 -= 2;
            }
        }
        if (position == byteBuffer.position()) {
            this.f7419r = 1;
        } else {
            byteBuffer.limit(position);
            a(byteBuffer.remaining());
            this.f7414m.put(byteBuffer);
            this.f7414m.flip();
            this.f7415n = this.f7414m;
        }
        byteBuffer.limit(limit);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f2 = f(byteBuffer);
        int position = f2 - byteBuffer.position();
        byte[] bArr = this.f7417p;
        int length = bArr.length;
        int i = this.f7420s;
        int i4 = length - i;
        if (f2 < limit && position < i4) {
            a(bArr, i);
            this.f7420s = 0;
            this.f7419r = 0;
            return;
        }
        int min = Math.min(position, i4);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f7417p, this.f7420s, min);
        int i6 = this.f7420s + min;
        this.f7420s = i6;
        byte[] bArr2 = this.f7417p;
        if (i6 == bArr2.length) {
            if (this.f7422u) {
                a(bArr2, this.f7421t);
                this.f7423v += (this.f7420s - (this.f7421t * 2)) / this.f7412k;
            } else {
                this.f7423v += (i6 - this.f7421t) / this.f7412k;
            }
            a(byteBuffer, this.f7417p, this.f7420s);
            this.f7420s = 0;
            this.f7419r = 2;
        }
        byteBuffer.limit(limit);
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f2 = f(byteBuffer);
        byteBuffer.limit(f2);
        this.f7423v += byteBuffer.remaining() / this.f7412k;
        a(byteBuffer, this.f7418q, this.f7421t);
        if (f2 < limit) {
            a(this.f7418q, this.f7421t);
            this.f7419r = 0;
            byteBuffer.limit(limit);
        }
    }

    private int g(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.f7412k;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.f7412k;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        if (i6 == 2) {
            if (this.f7411j == i && this.i == i4) {
                return false;
            }
            this.f7411j = i;
            this.i = i4;
            this.f7412k = i4 * 2;
            return true;
        }
        throw new f.a(i, i4, i6);
    }

    private void e(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f7414m.put(byteBuffer);
        this.f7414m.flip();
        this.f7415n = this.f7414m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f7411j != -1 && this.f7413l;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f7415n.hasRemaining()) {
            int i = this.f7419r;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7417p.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i4 = this.f7412k;
                            position = ((limit2 / i4) * i4) + i4;
                            break;
                        }
                        limit2 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f7419r = 1;
                } else {
                    byteBuffer.limit(position);
                    a(byteBuffer.remaining());
                    this.f7414m.put(byteBuffer);
                    this.f7414m.flip();
                    this.f7415n = this.f7414m;
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int f2 = f(byteBuffer);
                int position2 = f2 - byteBuffer.position();
                byte[] bArr = this.f7417p;
                int length = bArr.length;
                int i6 = this.f7420s;
                int i9 = length - i6;
                if (f2 < limit3 && position2 < i9) {
                    a(bArr, i6);
                    this.f7420s = 0;
                    this.f7419r = 0;
                } else {
                    int min = Math.min(position2, i9);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f7417p, this.f7420s, min);
                    int i10 = this.f7420s + min;
                    this.f7420s = i10;
                    byte[] bArr2 = this.f7417p;
                    if (i10 == bArr2.length) {
                        if (this.f7422u) {
                            a(bArr2, this.f7421t);
                            this.f7423v += (this.f7420s - (this.f7421t * 2)) / this.f7412k;
                        } else {
                            this.f7423v += (i10 - this.f7421t) / this.f7412k;
                        }
                        a(byteBuffer, this.f7417p, this.f7420s);
                        this.f7420s = 0;
                        this.f7419r = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int f9 = f(byteBuffer);
                byteBuffer.limit(f9);
                this.f7423v += byteBuffer.remaining() / this.f7412k;
                a(byteBuffer, this.f7418q, this.f7421t);
                if (f9 < limit4) {
                    a(this.f7418q, this.f7421t);
                    this.f7419r = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void a(byte[] bArr, int i) {
        a(i);
        this.f7414m.put(bArr, 0, i);
        this.f7414m.flip();
        this.f7415n = this.f7414m;
    }

    private void a(int i) {
        if (this.f7414m.capacity() < i) {
            this.f7414m = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7414m.clear();
        }
        if (i > 0) {
            this.f7422u = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f7421t);
        int i4 = this.f7421t - min;
        System.arraycopy(bArr, i - i4, this.f7418q, 0, i4);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f7418q, i4, min);
    }

    private int a(long j6) {
        return (int) ((j6 * this.f7411j) / 1000000);
    }
}
