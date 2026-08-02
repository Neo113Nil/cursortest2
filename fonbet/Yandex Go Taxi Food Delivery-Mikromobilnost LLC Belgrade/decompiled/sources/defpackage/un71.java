package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yads.o33;

/* loaded from: classes7.dex */
public final class un71 implements n771 {
    public yg71 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public pa71 o;
    public jf81 p;
    public final dl81 a = new dl81(4);
    public final dl81 b = new dl81(9);
    public final dl81 c = new dl81(11);
    public final dl81 d = new dl81();
    public final ky61 e = new ky61();
    public int g = 1;

    public final dl81 a(w971 w971Var) {
        int i = this.l;
        dl81 dl81Var = this.d;
        byte[] bArr = dl81Var.a;
        if (i > bArr.length) {
            dl81Var.a = new byte[Math.max(bArr.length * 2, i)];
            dl81Var.c = 0;
            dl81Var.b = 0;
        } else {
            dl81Var.m(0);
        }
        dl81Var.k(this.l);
        w971Var.E(dl81Var.a, 0, this.l, false);
        return dl81Var;
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.f = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0006 A[SYNTHETIC] */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        boolean z2;
        if (this.f == null) {
            ny61.k();
            return 0;
        }
        while (true) {
            int i2 = this.g;
            if (i2 == 1) {
                dl81 dl81Var = this.b;
                if (!((w971) bb71Var).E(dl81Var.a, 0, 9, true)) {
                    return -1;
                }
                dl81Var.m(0);
                dl81Var.m(dl81Var.b + 4);
                int s = dl81Var.s();
                boolean z3 = (s & 4) != 0;
                boolean z4 = (s & 1) != 0;
                if (z3 && this.o == null) {
                    this.o = new pa71(18, this.f.l(8, 1));
                }
                if (z4 && this.p == null) {
                    this.p = new jf81(this.f.l(9, 2));
                }
                this.f.mo495a();
                this.j = dl81Var.a() - 5;
                this.g = 2;
            } else if (i2 == 2) {
                ((w971) bb71Var).b(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i2 == 3) {
                dl81 dl81Var2 = this.c;
                if (!((w971) bb71Var).E(dl81Var2.a, 0, 11, true)) {
                    return -1;
                }
                dl81Var2.m(0);
                this.k = dl81Var2.s();
                this.l = dl81Var2.u();
                this.m = dl81Var2.u();
                this.m = ((dl81Var2.s() << 24) | this.m) * 1000;
                dl81Var2.m(dl81Var2.b + 3);
                this.g = 4;
            } else {
                if (i2 != 4) {
                    ny61.k();
                    return 0;
                }
                boolean z5 = this.h;
                ky61 ky61Var = this.e;
                if (z5) {
                    j = this.i + this.m;
                } else if (ky61Var.c == -9223372036854775807L) {
                    j2 = 0;
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i3 = 4;
                        if (i == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (i == 18 || this.n) {
                                ((w971) bb71Var).b(this.l);
                                z = false;
                                z2 = false;
                            } else {
                                dl81 a = a((w971) bb71Var);
                                ky61Var.getClass();
                                if (a.s() == 2 && "onMetaData".equals(ky61.Wg(a)) && a.c - a.b != 0 && a.s() == 8) {
                                    HashMap Vg = ky61.Vg(a);
                                    Object obj = Vg.get("duration");
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            ky61Var.c = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = Vg.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            ky61Var.w = new long[size];
                                            ky61Var.x = new long[size];
                                            for (int i4 = 0; i4 < size; i4++) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    ky61Var.w = new long[0];
                                                    ky61Var.x = new long[0];
                                                    break;
                                                }
                                                ky61Var.w[i4] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                ky61Var.x[i4] = ((Double) obj5).longValue();
                                            }
                                        }
                                    }
                                }
                                long j4 = ky61Var.c;
                                if (j4 != -9223372036854775807L) {
                                    this.f.r(new ul71(j4, ky61Var.x, ky61Var.w));
                                    this.n = true;
                                }
                                z2 = true;
                                z = false;
                            }
                        } else {
                            if (!this.n) {
                                this.f.r(new w471(-9223372036854775807L, 0L));
                                this.n = true;
                            }
                            jf81 jf81Var = this.p;
                            dl81 a2 = a((w971) bb71Var);
                            jf81Var.getClass();
                            dl81 dl81Var3 = jf81Var.c;
                            fb81 fb81Var = (fb81) jf81Var.b;
                            dl81 dl81Var4 = jf81Var.w;
                            int s2 = a2.s();
                            j3 = -9223372036854775807L;
                            int i5 = (s2 >> 4) & 15;
                            int i6 = s2 & 15;
                            if (i6 != 7) {
                                throw new o33(q8a1.c(i6, "Video format not supported: "));
                            }
                            jf81Var.A = i5;
                            if (i5 != 5) {
                                int s3 = a2.s();
                                byte[] bArr = a2.a;
                                int i7 = a2.b;
                                int i8 = i7 + 1;
                                a2.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                a2.b = i7 + 2;
                                int i10 = ((bArr[i8] & 255) << 8) | i9;
                                int i11 = i7 + 3;
                                a2.b = i11;
                                long j5 = ((i10 | (bArr[r15] & 255)) * 1000) + j2;
                                if (s3 == 0 && !jf81Var.y) {
                                    byte[] bArr2 = new byte[a2.c - i11];
                                    dl81 dl81Var5 = new dl81(bArr2);
                                    a2.d(0, a2.c - a2.b, bArr2);
                                    fz71 a3 = fz71.a(dl81Var5);
                                    jf81Var.x = a3.b;
                                    da81 da81Var = new da81();
                                    da81Var.k = "video/avc";
                                    da81Var.h = a3.f;
                                    da81Var.p = a3.c;
                                    da81Var.q = a3.d;
                                    da81Var.t = a3.e;
                                    da81Var.m = a3.a;
                                    fb81Var.k(new qd81(da81Var));
                                    jf81Var.y = true;
                                } else if (s3 == 1 && jf81Var.y) {
                                    int i12 = jf81Var.A == 1 ? 1 : 0;
                                    if (jf81Var.z || i12 != 0) {
                                        byte[] bArr3 = dl81Var4.a;
                                        int i13 = 0;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i14 = 4 - jf81Var.x;
                                        int i15 = 0;
                                        while (a2.c - a2.b > 0) {
                                            a2.d(i14, jf81Var.x, dl81Var4.a);
                                            dl81Var4.m(i13);
                                            int v = dl81Var4.v();
                                            dl81Var3.m(i13);
                                            fb81Var.a(i3, dl81Var3);
                                            fb81Var.a(v, a2);
                                            i15 = i15 + 4 + v;
                                            i13 = 0;
                                            i3 = 4;
                                        }
                                        ((fb81) jf81Var.b).b(j5, i12, i15, 0, null);
                                        jf81Var.z = true;
                                        z = true;
                                        z2 = true;
                                    }
                                }
                            }
                            z2 = true;
                            z = false;
                        }
                    } else {
                        if (!this.n) {
                            this.f.r(new w471(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        pa71 pa71Var = this.o;
                        dl81 a4 = a((w971) bb71Var);
                        boolean z6 = pa71Var.c;
                        fb81 fb81Var2 = (fb81) pa71Var.b;
                        if (z6) {
                            a4.m(a4.b + 1);
                        } else {
                            int s4 = a4.s();
                            int i16 = (s4 >> 4) & 15;
                            pa71Var.x = i16;
                            if (i16 == 2) {
                                int i17 = pa71.y[(s4 >> 2) & 3];
                                da81 da81Var2 = new da81();
                                da81Var2.k = "audio/mpeg";
                                da81Var2.x = 1;
                                da81Var2.y = i17;
                                fb81Var2.k(new qd81(da81Var2));
                                pa71Var.w = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                da81 da81Var3 = new da81();
                                da81Var3.k = str;
                                da81Var3.x = 1;
                                da81Var3.y = 8000;
                                fb81Var2.k(new qd81(da81Var3));
                                pa71Var.w = true;
                            } else if (i16 != 10) {
                                throw new o33("Audio format not supported: " + pa71Var.x);
                            }
                            pa71Var.c = true;
                        }
                        if (pa71Var.x == 2) {
                            int i18 = a4.c - a4.b;
                            fb81Var2.a(i18, a4);
                            ((fb81) pa71Var.b).b(j2, 1, i18, 0, null);
                        } else {
                            int s5 = a4.s();
                            if (s5 == 0 && !pa71Var.w) {
                                int i19 = a4.c - a4.b;
                                byte[] bArr4 = new byte[i19];
                                a4.d(0, i19, bArr4);
                                uh81 uh81Var = new uh81();
                                uh81Var.a = bArr4;
                                uh81Var.d = i19;
                                a4 a5 = vaa1.a(uh81Var, false);
                                da81 da81Var4 = new da81();
                                da81Var4.k = "audio/mp4a-latm";
                                da81Var4.h = a5.a;
                                da81Var4.x = a5.c;
                                da81Var4.y = a5.b;
                                da81Var4.m = Collections.singletonList(bArr4);
                                fb81Var2.k(new qd81(da81Var4));
                                pa71Var.w = true;
                                z2 = true;
                                j3 = -9223372036854775807L;
                                z = false;
                            } else if (pa71Var.x != 10 || s5 == 1) {
                                int i20 = a4.c - a4.b;
                                fb81Var2.a(i20, a4);
                                ((fb81) pa71Var.b).b(j2, 1, i20, 0, null);
                            } else {
                                j3 = -9223372036854775807L;
                                z2 = true;
                                z = false;
                            }
                        }
                        z = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = ky61Var.c != j3 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z2) {
                        return 0;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                }
                int i32 = 4;
                if (i == 9) {
                }
                j3 = -9223372036854775807L;
                if (i == 18) {
                }
                ((w971) bb71Var).b(this.l);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = ky61Var.c != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        dl81 dl81Var = this.a;
        w971 w971Var = (w971) bb71Var;
        w971Var.I(dl81Var.a, 0, 3, false);
        dl81Var.m(0);
        if (dl81Var.u() == 4607062) {
            w971Var.I(dl81Var.a, 0, 2, false);
            dl81Var.m(0);
            if ((dl81Var.x() & 250) == 0) {
                w971Var.I(dl81Var.a, 0, 4, false);
                dl81Var.m(0);
                int a = dl81Var.a();
                w971Var.y = 0;
                w971Var.c(a, false);
                w971Var.I(dl81Var.a, 0, 4, false);
                dl81Var.m(0);
                if (dl81Var.a() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
