package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class pr4 extends qr4 {
    public final ByteBuffer e;
    public final long f;
    public long g;
    public long h;
    public final long i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public pr4(ByteBuffer byteBuffer, boolean z) {
        this.e = byteBuffer.duplicate();
        long j = dmt.c.j(dmt.g, byteBuffer);
        this.f = j;
        this.g = byteBuffer.limit() + j;
        long position = j + byteBuffer.position();
        this.h = position;
        this.i = position;
    }

    @Override // defpackage.qr4
    public final int A() {
        return G();
    }

    @Override // defpackage.qr4
    public final long B() {
        return H();
    }

    @Override // defpackage.qr4
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.g - this.h)) >= 10) {
                while (i3 < 10) {
                    long j = this.h;
                    this.h = j + 1;
                    if (dmt.c.e(j) < 0) {
                        i3++;
                    }
                }
                throw bye.e();
            }
            while (i3 < 10) {
                long j2 = this.h;
                if (j2 == this.g) {
                    throw bye.h();
                }
                this.h = j2 + 1;
                if (dmt.c.e(j2) < 0) {
                    i3++;
                }
            }
            throw bye.e();
            return true;
        }
        if (i2 == 1) {
            K(8);
            return true;
        }
        if (i2 == 2) {
            K(G());
            return true;
        }
        if (i2 == 3) {
            D();
            a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (this.b == 0) {
                a(0);
            }
            return false;
        }
        if (i2 != 5) {
            throw bye.d();
        }
        K(4);
        return true;
    }

    public final int E() {
        long j = this.h;
        if (this.g - j < 4) {
            throw bye.h();
        }
        this.h = 4 + j;
        amt amtVar = dmt.c;
        return ((amtVar.e(j + 3) & 255) << 24) | (amtVar.e(j) & 255) | ((amtVar.e(1 + j) & 255) << 8) | ((amtVar.e(2 + j) & 255) << 16);
    }

    public final long F() {
        long j = this.h;
        if (this.g - j < 8) {
            throw bye.h();
        }
        this.h = 8 + j;
        amt amtVar = dmt.c;
        return ((amtVar.e(j + 7) & 255) << 56) | (amtVar.e(j) & 255) | ((amtVar.e(1 + j) & 255) << 8) | ((amtVar.e(2 + j) & 255) << 16) | ((amtVar.e(3 + j) & 255) << 24) | ((amtVar.e(4 + j) & 255) << 32) | ((amtVar.e(5 + j) & 255) << 40) | ((amtVar.e(6 + j) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G() {
        int i;
        long j = this.h;
        if (this.g != j) {
            long j2 = 1 + j;
            amt amtVar = dmt.c;
            byte e = amtVar.e(j);
            if (e >= 0) {
                this.h = j2;
                return e;
            }
            if (this.g - j2 >= 9) {
                long j3 = 2 + j;
                int e2 = (amtVar.e(j2) << 7) ^ e;
                if (e2 < 0) {
                    i = e2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int e3 = e2 ^ (amtVar.e(j3) << 14);
                    if (e3 >= 0) {
                        i = e3 ^ 16256;
                    } else {
                        j3 = j + 4;
                        int e4 = e3 ^ (amtVar.e(j4) << 21);
                        if (e4 < 0) {
                            i = (-2080896) ^ e4;
                        } else {
                            j4 = 5 + j;
                            byte e5 = amtVar.e(j3);
                            int i2 = (e4 ^ (e5 << 28)) ^ 266354560;
                            if (e5 < 0) {
                                j3 = j + 6;
                                if (amtVar.e(j4) < 0) {
                                    j4 = 7 + j;
                                    if (amtVar.e(j3) < 0) {
                                        j3 = j + 8;
                                        if (amtVar.e(j4) < 0) {
                                            long j5 = 9 + j;
                                            if (amtVar.e(j3) < 0) {
                                                j3 = j + 10;
                                            } else {
                                                i = i2;
                                                j3 = j5;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.h = j3;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.h;
        if (this.g != j4) {
            long j5 = 1 + j4;
            amt amtVar = dmt.c;
            byte e = amtVar.e(j4);
            if (e >= 0) {
                this.h = j5;
                return e;
            }
            if (this.g - j5 >= 9) {
                long j6 = 2 + j4;
                int e2 = (amtVar.e(j5) << 7) ^ e;
                if (e2 >= 0) {
                    long j7 = 3 + j4;
                    int e3 = e2 ^ (amtVar.e(j6) << 14);
                    if (e3 >= 0) {
                        j = e3 ^ 16256;
                    } else {
                        j6 = j4 + 4;
                        int e4 = e3 ^ (amtVar.e(j7) << 21);
                        if (e4 < 0) {
                            i = (-2080896) ^ e4;
                        } else {
                            j7 = 5 + j4;
                            long e5 = e4 ^ (amtVar.e(j6) << 28);
                            if (e5 < 0) {
                                long j8 = 6 + j4;
                                long e6 = e5 ^ (amtVar.e(j7) << 35);
                                if (e6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    e5 = e6 ^ (amtVar.e(j8) << 42);
                                    if (e5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        e6 = e5 ^ (amtVar.e(j7) << 49);
                                        if (e6 >= 0) {
                                            long j9 = j4 + 9;
                                            long e7 = (e6 ^ (amtVar.e(j8) << 56)) ^ 71499008037633920L;
                                            if (e7 < 0) {
                                                long j10 = j4 + 10;
                                                if (amtVar.e(j9) >= 0) {
                                                    j6 = j10;
                                                    j = e7;
                                                }
                                            } else {
                                                j = e7;
                                                j6 = j9;
                                            }
                                            this.h = j6;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ e6;
                                j6 = j8;
                                this.h = j6;
                                return j;
                            }
                            j3 = 266354560;
                            j = j3 ^ e5;
                        }
                    }
                    j6 = j7;
                    this.h = j6;
                    return j;
                }
                i = e2 ^ (-128);
                j = i;
                this.h = j6;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.h;
            if (j2 == this.g) {
                throw bye.h();
            }
            this.h = 1 + j2;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((dmt.c.e(j2) & 128) == 0) {
                return j;
            }
        }
        throw bye.e();
    }

    public final void J() {
        long j = this.g + this.j;
        this.g = j;
        int i = (int) (j - this.i);
        int i2 = this.l;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.g = j - i3;
    }

    public final void K(int i) {
        if (i >= 0) {
            long j = this.g;
            long j2 = this.h;
            if (i <= ((int) (j - j2))) {
                this.h = j2 + i;
                return;
            }
        }
        if (i >= 0) {
            throw bye.h();
        }
        throw bye.f();
    }

    @Override // defpackage.qr4
    public final void a(int i) {
        if (this.k != i) {
            throw bye.a();
        }
    }

    @Override // defpackage.qr4
    public final int d() {
        return (int) (this.h - this.i);
    }

    @Override // defpackage.qr4
    public final boolean e() {
        return this.h == this.g;
    }

    @Override // defpackage.qr4
    public final void h(int i) {
        this.l = i;
        J();
    }

    @Override // defpackage.qr4
    public final int i(int i) {
        if (i < 0) {
            throw bye.f();
        }
        int d = d() + i;
        int i2 = this.l;
        if (d > i2) {
            throw bye.h();
        }
        this.l = d;
        J();
        return i2;
    }

    @Override // defpackage.qr4
    public final boolean j() {
        return H() != 0;
    }

    @Override // defpackage.qr4
    public final kn3 k() {
        int G = G();
        if (G > 0) {
            long j = this.g;
            long j2 = this.h;
            if (G <= ((int) (j - j2))) {
                byte[] bArr = new byte[G];
                long j3 = G;
                dmt.c.c(j2, bArr, j3);
                this.h += j3;
                kn3 kn3Var = nn3.b;
                return new kn3(bArr);
            }
        }
        if (G == 0) {
            return nn3.b;
        }
        if (G < 0) {
            throw bye.f();
        }
        throw bye.h();
    }

    @Override // defpackage.qr4
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.qr4
    public final int m() {
        return G();
    }

    @Override // defpackage.qr4
    public final int n() {
        return E();
    }

    @Override // defpackage.qr4
    public final long o() {
        return F();
    }

    @Override // defpackage.qr4
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.qr4
    public final int q() {
        return G();
    }

    @Override // defpackage.qr4
    public final long r() {
        return H();
    }

    @Override // defpackage.qr4
    public final int t() {
        return E();
    }

    @Override // defpackage.qr4
    public final long u() {
        return F();
    }

    @Override // defpackage.qr4
    public final int v() {
        return qr4.b(G());
    }

    @Override // defpackage.qr4
    public final long w() {
        return qr4.c(H());
    }

    @Override // defpackage.qr4
    public final String x() {
        int G = G();
        if (G > 0) {
            long j = this.g;
            long j2 = this.h;
            if (G <= ((int) (j - j2))) {
                byte[] bArr = new byte[G];
                long j3 = G;
                dmt.c.c(j2, bArr, j3);
                String str = new String(bArr, use.a);
                this.h += j3;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw bye.f();
        }
        throw bye.h();
    }

    @Override // defpackage.qr4
    public final String y() {
        int G = G();
        if (G > 0) {
            long j = this.g;
            long j2 = this.h;
            if (G <= ((int) (j - j2))) {
                int i = (int) (j2 - this.f);
                q7g q7gVar = nut.a;
                q7gVar.getClass();
                ByteBuffer byteBuffer = this.e;
                String y = byteBuffer.hasArray() ? q7gVar.y(byteBuffer.array(), byteBuffer.arrayOffset() + i, G) : byteBuffer.isDirect() ? q7gVar.A(byteBuffer, i, G) : q7g.z(byteBuffer, i, G);
                this.h += G;
                return y;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw bye.f();
        }
        throw bye.h();
    }

    @Override // defpackage.qr4
    public final int z() {
        if (e()) {
            this.k = 0;
            return 0;
        }
        int G = G();
        this.k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw bye.b();
    }
}
