package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes7.dex */
public final class v681 implements gz71 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public fb81 b;
    public final n971 c;
    public final dl81 d;
    public final c150 e;
    public final boolean[] f = new boolean[4];
    public final v381 g = new v381();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public v681(n971 n971Var) {
        this.c = n971Var;
        if (n971Var != null) {
            this.e = new c150(178, 1);
            this.d = new dl81();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.gz71
    public final void a() {
        sba1.e(this.f);
        v381 v381Var = this.g;
        v381Var.a = false;
        v381Var.b = 0;
        v381Var.c = 0;
        c150 c150Var = this.e;
        if (c150Var != null) {
            c150Var.b = false;
            c150Var.c = false;
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        this.l = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dl81 dl81Var) {
        v381 v381Var;
        c150 c150Var;
        int i;
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j4;
        fb81 fb81Var = this.b;
        if (fb81Var == null) {
            ny61.k();
            return;
        }
        int i5 = dl81Var.b;
        int i6 = dl81Var.c;
        byte[] bArr = dl81Var.a;
        int i7 = i6 - i5;
        this.h += i7;
        fb81Var.a(i7, dl81Var);
        while (true) {
            int b = sba1.b(bArr, i5, i6, this.f);
            v381Var = this.g;
            c150Var = this.e;
            if (b == i6) {
                break;
            }
            int i8 = b + 3;
            int i9 = dl81Var.a[i8] & 255;
            int i10 = b - i5;
            if (this.j) {
                i = i6;
            } else {
                if (i10 > 0) {
                    v381Var.a(i5, b, bArr);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                if (v381Var.a) {
                    int i12 = v381Var.b - i11;
                    v381Var.b = i12;
                    if (v381Var.c == 0 && i9 == 181) {
                        v381Var.c = i12;
                        i = i6;
                    } else {
                        v381Var.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(v381Var.d, v381Var.b);
                        int i13 = copyOf[4] & 255;
                        byte b2 = copyOf[5];
                        i = i6;
                        int i14 = (i13 << 4) | ((b2 & 255) >> 4);
                        int i15 = (copyOf[6] & 255) | ((b2 & PKIBody._CCP) << 8);
                        int i16 = (copyOf[7] & 240) >> 4;
                        if (i16 == 2) {
                            f = i15 * 4;
                            i3 = i14 * 3;
                        } else if (i16 == 3) {
                            f = i15 * 16;
                            i3 = i14 * 9;
                        } else if (i16 != 4) {
                            f2 = 1.0f;
                            da81 da81Var = new da81();
                            da81Var.a = str;
                            da81Var.k = "video/mpeg2";
                            da81Var.p = i14;
                            da81Var.q = i15;
                            da81Var.t = f2;
                            da81Var.m = Collections.singletonList(copyOf);
                            qd81 qd81Var = new qd81(da81Var);
                            i4 = (copyOf[7] & PKIBody._CCP) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = q[i4];
                                byte b3 = copyOf[v381Var.c + 9];
                                int i17 = (b3 & 96) >> 5;
                                if (i17 != (b3 & 31)) {
                                    d *= (i17 + 1.0d) / (r6 + 1);
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(qd81Var, Long.valueOf(j4));
                            this.b.k((qd81) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f = i15 * Constants.VPN_TRAFFIC;
                            i3 = i14 * 100;
                        }
                        f2 = f / i3;
                        da81 da81Var2 = new da81();
                        da81Var2.a = str;
                        da81Var2.k = "video/mpeg2";
                        da81Var2.p = i14;
                        da81Var2.q = i15;
                        da81Var2.t = f2;
                        da81Var2.m = Collections.singletonList(copyOf);
                        qd81 qd81Var2 = new qd81(da81Var2);
                        i4 = (copyOf[7] & PKIBody._CCP) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(qd81Var2, Long.valueOf(j4));
                        this.b.k((qd81) create2.first);
                        this.k = ((Long) create2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i = i6;
                    if (i9 == 179) {
                        v381Var.a = true;
                    }
                }
                v381Var.a(0, 3, v381.e);
            }
            if (c150Var != null) {
                if (i10 > 0) {
                    c150Var.a(i5, b, bArr);
                    i2 = 0;
                } else {
                    i2 = -i10;
                }
                if (c150Var.b(i2)) {
                    int a = sba1.a(c150Var.e, c150Var.d);
                    int i18 = rf71.a;
                    byte[] bArr2 = c150Var.d;
                    dl81 dl81Var2 = this.d;
                    dl81Var2.a = bArr2;
                    dl81Var2.c = a;
                    dl81Var2.b = 0;
                    long j5 = this.n;
                    n971 n971Var = this.c;
                    n971Var.getClass();
                    if (dl81Var2.c - dl81Var2.b >= 9) {
                        int a2 = dl81Var2.a();
                        int a3 = dl81Var2.a();
                        int s = dl81Var2.s();
                        if (a2 == 434 && a3 == 1195456820 && s == 3) {
                            aba1.c(j5, dl81Var2, n971Var.c);
                        }
                    }
                }
                if (i9 == 178) {
                    z = true;
                    if (dl81Var.a[b + 2] == 1) {
                        c150Var.d(i9);
                    }
                    if (i9 != 0 || i9 == 179) {
                        int i19 = i - b;
                        if (this.p && this.j) {
                            j3 = this.n;
                            if (j3 != -9223372036854775807L) {
                                j = -9223372036854775807L;
                                this.b.b(j3, this.o ? 1 : 0, ((int) (this.h - this.m)) - i19, i19, null);
                                if (this.i || this.p) {
                                    this.m = this.h - i19;
                                    j2 = this.l;
                                    if (j2 == j) {
                                        long j6 = this.n;
                                        j2 = j6 != j ? j6 + this.k : j;
                                    }
                                    this.n = j2;
                                    z2 = false;
                                    this.o = false;
                                    this.l = j;
                                    z3 = true;
                                    this.i = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.p = i9 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.i) {
                        }
                        this.m = this.h - i19;
                        j2 = this.l;
                        if (j2 == j) {
                        }
                        this.n = j2;
                        z2 = false;
                        this.o = false;
                        this.l = j;
                        z3 = true;
                        this.i = true;
                        this.p = i9 == 0 ? z3 : z2;
                    } else if (i9 == 184) {
                        this.o = z;
                    }
                    i5 = i8;
                    i6 = i;
                }
            }
            z = true;
            if (i9 != 0) {
            }
            int i192 = i - b;
            if (this.p) {
                j3 = this.n;
                if (j3 != -9223372036854775807L) {
                }
            }
            j = -9223372036854775807L;
            if (this.i) {
            }
            this.m = this.h - i192;
            j2 = this.l;
            if (j2 == j) {
            }
            this.n = j2;
            z2 = false;
            this.o = false;
            this.l = j;
            z3 = true;
            this.i = true;
            this.p = i9 == 0 ? z3 : z2;
            i5 = i8;
            i6 = i;
        }
        if (!this.j) {
            v381Var.a(i5, i6, bArr);
        }
        if (c150Var != null) {
            c150Var.a(i5, i6, bArr);
        }
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.a = xi11Var.e;
        xi11Var.b();
        this.b = yg71Var.l(xi11Var.d, 2);
        n971 n971Var = this.c;
        if (n971Var != null) {
            n971Var.a(yg71Var, xi11Var);
        }
    }
}
