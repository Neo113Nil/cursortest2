package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lrd implements q2b {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public azs b;
    public final y8p c;
    public final String d;
    public final d7k e;
    public final csb f;
    public final boolean[] g = new boolean[4];
    public final krd h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public lrd(y8p y8pVar, String str) {
        this.c = y8pVar;
        this.d = str;
        krd krdVar = new krd();
        krdVar.d = new byte[128];
        this.h = krdVar;
        if (y8pVar != null) {
            this.f = new csb(178);
            this.e = new d7k();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    @Override // defpackage.q2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar) {
        krd krdVar;
        csb csbVar;
        int i;
        boolean z;
        int i2;
        long j;
        boolean z2;
        boolean z3;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        long j3;
        vq1.B(this.b);
        int i6 = d7kVar.b;
        int i7 = d7kVar.c;
        byte[] bArr = d7kVar.a;
        this.i += d7kVar.a();
        boolean z4 = 0;
        this.b.b(d7kVar, d7kVar.a(), 0);
        while (true) {
            int z5 = zc4.z(bArr, i6, i7, this.g);
            krdVar = this.h;
            csbVar = this.f;
            if (z5 == i7) {
                break;
            }
            int i8 = z5 + 3;
            int i9 = d7kVar.a[i8] & 255;
            int i10 = z5 - i6;
            if (this.k) {
                i = i7;
            } else {
                if (i10 > 0) {
                    krdVar.c(bArr, i6, z5);
                }
                int i11 = i10 < 0 ? -i10 : z4;
                if (krdVar.c) {
                    int i12 = krdVar.a - i11;
                    krdVar.a = i12;
                    if (krdVar.b == 0 && i9 == 181) {
                        krdVar.b = i12;
                        i = i7;
                    } else {
                        krdVar.c = z4;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf((byte[]) krdVar.d, krdVar.a);
                        int i13 = copyOf[4] & 255;
                        byte b = copyOf[5];
                        i = i7;
                        int i14 = ((b & 255) >> 4) | (i13 << 4);
                        int i15 = (copyOf[6] & 255) | ((b & 15) << 8);
                        int i16 = (copyOf[7] & 240) >> 4;
                        if (i16 == 2) {
                            f = i15 * 4;
                            i4 = i14 * 3;
                        } else if (i16 == 3) {
                            f = i15 * 16;
                            i4 = i14 * 9;
                        } else if (i16 != 4) {
                            f2 = 1.0f;
                            bsc bscVar = new bsc();
                            bscVar.a = str;
                            bscVar.l = l5i.p(this.d);
                            bscVar.m = l5i.p("video/mpeg2");
                            bscVar.t = i14;
                            bscVar.u = i15;
                            bscVar.x = f2;
                            bscVar.p = Collections.singletonList(copyOf);
                            dsc dscVar = new dsc(bscVar);
                            i5 = (copyOf[7] & 15) - 1;
                            if (i5 >= 0 || i5 >= 8) {
                                j3 = 0;
                            } else {
                                double d = r[i5];
                                byte b2 = copyOf[krdVar.b + 9];
                                int i17 = (b2 & 96) >> 5;
                                if (i17 != (b2 & 31)) {
                                    d *= (i17 + 1.0d) / (r6 + 1);
                                }
                                j3 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(dscVar, Long.valueOf(j3));
                            this.b.d((dsc) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i15 * 121;
                            i4 = i14 * 100;
                        }
                        f2 = f / i4;
                        bsc bscVar2 = new bsc();
                        bscVar2.a = str;
                        bscVar2.l = l5i.p(this.d);
                        bscVar2.m = l5i.p("video/mpeg2");
                        bscVar2.t = i14;
                        bscVar2.u = i15;
                        bscVar2.x = f2;
                        bscVar2.p = Collections.singletonList(copyOf);
                        dsc dscVar2 = new dsc(bscVar2);
                        i5 = (copyOf[7] & 15) - 1;
                        if (i5 >= 0) {
                        }
                        j3 = 0;
                        Pair create2 = Pair.create(dscVar2, Long.valueOf(j3));
                        this.b.d((dsc) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i7;
                    if (i9 == 179) {
                        krdVar.c = true;
                    }
                }
                krdVar.c(krd.e, 0, 3);
            }
            if (csbVar != null) {
                if (i10 > 0) {
                    csbVar.a(bArr, i6, z5);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (csbVar.d(i3)) {
                    int d0 = zc4.d0(csbVar.c, (byte[]) csbVar.f);
                    int i18 = dvt.a;
                    byte[] bArr2 = (byte[]) csbVar.f;
                    d7k d7kVar2 = this.e;
                    d7kVar2.F(d0, bArr2);
                    this.c.c(this.o, d7kVar2);
                }
                if (i9 == 178) {
                    z = true;
                    if (d7kVar.a[z5 + 2] == 1) {
                        csbVar.g(i9);
                    }
                    if (i9 != 0 || i9 == 179) {
                        i2 = i - z5;
                        if (this.q && this.k) {
                            j2 = this.o;
                            if (j2 != -9223372036854775807L) {
                                this.b.a(j2, this.p ? 1 : 0, ((int) (this.i - this.n)) - i2, i2, null);
                            }
                        }
                        if (this.j || this.q) {
                            this.n = this.i - i2;
                            j = this.m;
                            if (j == -9223372036854775807L) {
                                long j4 = this.o;
                                j = j4 != -9223372036854775807L ? j4 + this.l : -9223372036854775807L;
                            }
                            this.o = j;
                            z2 = false;
                            this.p = false;
                            this.m = -9223372036854775807L;
                            z3 = true;
                            this.j = true;
                        } else {
                            z3 = true;
                            z2 = false;
                        }
                        this.q = i9 != 0 ? z3 : z2 ? 1 : 0;
                    } else {
                        if (i9 == 184) {
                            this.p = z;
                        }
                        z2 = false;
                    }
                    i6 = i8;
                    i7 = i;
                    z4 = z2;
                }
            }
            z = true;
            if (i9 != 0) {
            }
            i2 = i - z5;
            if (this.q) {
                j2 = this.o;
                if (j2 != -9223372036854775807L) {
                }
            }
            if (this.j) {
            }
            this.n = this.i - i2;
            j = this.m;
            if (j == -9223372036854775807L) {
            }
            this.o = j;
            z2 = false;
            this.p = false;
            this.m = -9223372036854775807L;
            z3 = true;
            this.j = true;
            this.q = i9 != 0 ? z3 : z2 ? 1 : 0;
            i6 = i8;
            i7 = i;
            z4 = z2;
        }
        if (!this.k) {
            krdVar.c(bArr, i6, i7);
        }
        if (csbVar != null) {
            csbVar.a(bArr, i6, i7);
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        zc4.t(this.g);
        krd krdVar = this.h;
        krdVar.c = false;
        krdVar.a = 0;
        krdVar.b = 0;
        csb csbVar = this.f;
        if (csbVar != null) {
            csbVar.f();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        vq1.B(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.a = (String) cp2Var.e;
        cp2Var.i();
        this.b = t2cVar.M(cp2Var.c, 2);
        y8p y8pVar = this.c;
        if (y8pVar != null) {
            y8pVar.e(t2cVar, cp2Var);
        }
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.m = j;
    }
}
