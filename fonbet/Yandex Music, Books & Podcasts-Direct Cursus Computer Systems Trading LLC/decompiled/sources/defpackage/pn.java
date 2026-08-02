package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class pn implements q2b {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public azs h;
    public azs i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public azs v;
    public long w;
    public final v94 b = new v94(new byte[7], 7);
    public final d7k c = new d7k(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public pn(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // defpackage.q2b
    public final void b(d7k d7kVar) {
        int i;
        int i2;
        byte b;
        char c;
        ?? r4;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        this.h.getClass();
        int i6 = dvt.a;
        while (d7kVar.a() > 0) {
            int i7 = this.j;
            char c4 = 65535;
            d7k d7kVar2 = this.c;
            int i8 = 3;
            v94 v94Var = this.b;
            int i9 = 4;
            int i10 = 0;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = d7kVar.a;
                int i12 = d7kVar.b;
                int i13 = d7kVar.c;
                while (true) {
                    if (i12 >= i13) {
                        d7kVar.H(i12);
                        break;
                    }
                    i = i12 + 1;
                    i2 = i8;
                    b = bArr[i12];
                    int i14 = b & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i14) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i11;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i15 = i12 - 1;
                        d7kVar.H(i12);
                        byte[] bArr2 = v94Var.b;
                        if (d7kVar.a() >= i11) {
                            d7kVar.f(bArr2, i10, i11);
                            v94Var.q(i9);
                            int i16 = v94Var.i(i11);
                            int i17 = this.o;
                            if (i17 == -1 || i16 == i17) {
                                if (this.p != -1) {
                                    byte[] bArr3 = v94Var.b;
                                    if (d7kVar.a() < i11) {
                                        break;
                                    }
                                    d7kVar.f(bArr3, i10, i11);
                                    v94Var.q(2);
                                    i5 = 4;
                                    if (v94Var.i(4) == this.p) {
                                        d7kVar.H(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = v94Var.b;
                                if (d7kVar.a() >= i5) {
                                    d7kVar.f(bArr4, i10, i5);
                                    v94Var.q(14);
                                    int i18 = v94Var.i(13);
                                    if (i18 >= 7) {
                                        byte[] bArr5 = d7kVar.a;
                                        int i19 = d7kVar.c;
                                        int i20 = i15 + i18;
                                        if (i20 < i19) {
                                            byte b2 = bArr5[i20];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i21 = i20 + 1;
                                                    if (i21 != i19) {
                                                        if (bArr5[i21] == 68) {
                                                            int i22 = i20 + 2;
                                                            if (i22 != i19) {
                                                                if (bArr5[i22] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i23 = i20 + 1;
                                                if (i23 != i19) {
                                                    byte b3 = bArr5[i23];
                                                    if ((((65280 | ((b3 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == i16) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c = 65535;
                            }
                            r4 = true;
                        }
                        c = 65535;
                        r4 = true;
                    }
                    int i24 = this.l;
                    int i25 = i14 | i24;
                    if (i25 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 768;
                    } else if (i25 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = RemoteCameraConfig.Mic.BUFFER_SIZE;
                    } else if (i25 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 1024;
                    } else {
                        if (i25 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            d7kVar2.H(0);
                            d7kVar.H(i);
                            break;
                        }
                        c2 = 256;
                        if (i24 != 256) {
                            this.l = 256;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i11 = r4;
                            c4 = c;
                            i9 = 4;
                            i10 = i4;
                            i8 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i12 = i;
                    i11 = r4;
                    c4 = c;
                    i9 = 4;
                    i10 = i4;
                    i8 = i3;
                }
                this.q = (b & 8) >> 3;
                this.m = (b & 1) == 0;
                if (this.n) {
                    this.j = i2;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                d7kVar.H(i);
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = d7kVar2.a;
                    int min = Math.min(d7kVar.a(), 10 - this.k);
                    d7kVar.f(bArr6, this.k, min);
                    int i26 = this.k + min;
                    this.k = i26;
                    if (i26 == 10) {
                        this.i.b(d7kVar2, 10, 0);
                        d7kVar2.H(6);
                        azs azsVar = this.i;
                        int u = d7kVar2.u() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = azsVar;
                        this.w = 0L;
                        this.t = u;
                    }
                } else if (i7 == 3) {
                    int i27 = this.m ? 7 : 5;
                    byte[] bArr7 = v94Var.b;
                    int min2 = Math.min(d7kVar.a(), i27 - this.k);
                    d7kVar.f(bArr7, this.k, min2);
                    int i28 = this.k + min2;
                    this.k = i28;
                    if (i28 == i27) {
                        v94Var.q(0);
                        if (this.r) {
                            v94Var.t(10);
                        } else {
                            int i29 = v94Var.i(2) + 1;
                            if (i29 != 2) {
                                vq1.n0("AdtsReader", "Detected audio object type: " + i29 + ", but assuming AAC LC.");
                                i29 = 2;
                            }
                            v94Var.t(5);
                            byte[] F = zsd.F(i29, this.p, v94Var.i(3));
                            c1 x0 = zsd.x0(new v94(F, 2), false);
                            bsc bscVar = new bsc();
                            bscVar.a = this.g;
                            bscVar.l = l5i.p(this.f);
                            bscVar.m = l5i.p("audio/mp4a-latm");
                            bscVar.j = x0.a;
                            bscVar.C = x0.c;
                            bscVar.D = x0.b;
                            bscVar.p = Collections.singletonList(F);
                            bscVar.d = this.d;
                            bscVar.f = this.e;
                            dsc dscVar = new dsc(bscVar);
                            this.s = 1024000000 / dscVar.E;
                            this.h.d(dscVar);
                            this.r = true;
                        }
                        v94Var.t(4);
                        int i30 = v94Var.i(13);
                        int i31 = i30 - 7;
                        if (this.m) {
                            i31 = i30 - 9;
                        }
                        azs azsVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = azsVar2;
                        this.w = j;
                        this.t = i31;
                    }
                } else {
                    if (i7 != 4) {
                        e7o.n();
                        return;
                    }
                    int min3 = Math.min(d7kVar.a(), this.t - this.k);
                    this.v.b(d7kVar, min3, 0);
                    int i32 = this.k + min3;
                    this.k = i32;
                    if (i32 == this.t) {
                        vq1.A(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (d7kVar.a() != 0) {
                v94Var.b[0] = d7kVar.a[d7kVar.b];
                v94Var.q(2);
                int i33 = v94Var.i(4);
                int i34 = this.p;
                if (i34 == -1 || i33 == i34) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i33;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.g = (String) cp2Var.e;
        cp2Var.i();
        azs M = t2cVar.M(cp2Var.c, 1);
        this.h = M;
        this.v = M;
        if (!this.a) {
            this.i = new z48();
            return;
        }
        cp2Var.g();
        cp2Var.i();
        azs M2 = t2cVar.M(cp2Var.c, 5);
        this.i = M2;
        bsc bscVar = new bsc();
        cp2Var.i();
        bscVar.a = (String) cp2Var.e;
        bscVar.l = l5i.p(this.f);
        bscVar.m = l5i.p("application/id3");
        eta.o(bscVar, M2);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
    }
}
