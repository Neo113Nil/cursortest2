package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class qq81 implements gz71 {
    public final n971 a;
    public long e;
    public String g;
    public fb81 h;
    public ln81 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final c150 b = new c150(7, 1);
    public final c150 c = new c150(8, 1);
    public final c150 d = new c150(6, 1);
    public long k = -9223372036854775807L;
    public final dl81 m = new dl81();

    public qq81(n971 n971Var) {
        this.a = n971Var;
    }

    @Override // defpackage.gz71
    public final void a() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        sba1.e(this.f);
        c150 c150Var = this.b;
        c150Var.b = false;
        c150Var.c = false;
        c150 c150Var2 = this.c;
        c150Var2.b = false;
        c150Var2.c = false;
        c150 c150Var3 = this.d;
        c150Var3.b = false;
        c150Var3.c = false;
        ln81 ln81Var = this.i;
        if (ln81Var != null) {
            ln81Var.h = false;
            ln81Var.g.getClass();
        }
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l = ((i & 2) != 0) | this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c8  */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dl81 dl81Var) {
        c150 c150Var;
        c150 c150Var2;
        c150 c150Var3;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        long j;
        ln81 ln81Var;
        boolean z;
        int i4;
        boolean z2;
        fb81 fb81Var = this.h;
        if (fb81Var == null) {
            ny61.k();
            return;
        }
        int i5 = rf71.a;
        int i6 = dl81Var.b;
        int i7 = dl81Var.c;
        byte[] bArr2 = dl81Var.a;
        int i8 = i7 - i6;
        this.e += i8;
        fb81Var.a(i8, dl81Var);
        while (true) {
            int b = sba1.b(bArr2, i6, i7, this.f);
            c150Var = this.d;
            c150Var2 = this.b;
            c150Var3 = this.c;
            if (b == i7) {
                break;
            }
            int i9 = b + 3;
            int i10 = bArr2[i9] & 31;
            int i11 = b - i6;
            if (i11 > 0) {
                if (this.j) {
                    this.i.getClass();
                } else {
                    c150Var2.a(i6, b, bArr2);
                    c150Var3.a(i6, b, bArr2);
                }
                c150Var.a(i6, b, bArr2);
                this.i.getClass();
            }
            int i12 = i7 - b;
            long j2 = this.e - i12;
            int i13 = i11 < 0 ? -i11 : 0;
            long j3 = this.k;
            if (this.j) {
                this.i.getClass();
                i = i12;
            } else {
                c150Var2.b(i13);
                c150Var3.b(i13);
                boolean z3 = this.j;
                boolean z4 = c150Var2.c;
                i = i12;
                if (z3) {
                    i2 = i7;
                    bArr = bArr2;
                    i3 = i9;
                    j = j2;
                    if (z4) {
                        e571 g = sba1.g(3, c150Var2.e, c150Var2.d);
                        this.i.b.append(g.d, g);
                        c150Var2.b = false;
                        c150Var2.c = false;
                    } else if (c150Var3.c) {
                        a69 a69Var = new a69(4, c150Var3.e, 5, c150Var3.d);
                        int k = a69Var.k();
                        int k2 = a69Var.k();
                        a69Var.n();
                        this.i.c.append(k, new wdz(k2, a69Var.g()));
                        c150Var3.b = false;
                        c150Var3.c = false;
                    }
                } else if (z4 && c150Var3.c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c150Var2.d, c150Var2.e));
                    arrayList.add(Arrays.copyOf(c150Var3.d, c150Var3.e));
                    i2 = i7;
                    e571 g2 = sba1.g(3, c150Var2.e, c150Var2.d);
                    bArr = bArr2;
                    i3 = i9;
                    j = j2;
                    a69 a69Var2 = new a69(4, c150Var3.e, 5, c150Var3.d);
                    int k3 = a69Var2.k();
                    int k4 = a69Var2.k();
                    a69Var2.n();
                    wdz wdzVar = new wdz(k4, a69Var2.g());
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(g2.a), Integer.valueOf(g2.b), Integer.valueOf(g2.c));
                    fb81 fb81Var2 = this.h;
                    da81 da81Var = new da81();
                    da81Var.a = this.g;
                    da81Var.k = "video/avc";
                    da81Var.h = format;
                    da81Var.p = g2.e;
                    da81Var.q = g2.f;
                    da81Var.t = g2.g;
                    da81Var.m = arrayList;
                    fb81Var2.k(new qd81(da81Var));
                    this.j = true;
                    this.i.b.append(g2.d, g2);
                    this.i.c.append(k3, wdzVar);
                    c150Var2.b = false;
                    c150Var2.c = false;
                    c150Var3.b = false;
                    c150Var3.c = false;
                }
                if (c150Var.b(i13)) {
                    int a = sba1.a(c150Var.e, c150Var.d);
                    byte[] bArr3 = c150Var.d;
                    dl81 dl81Var2 = this.m;
                    dl81Var2.a = bArr3;
                    dl81Var2.c = a;
                    dl81Var2.b = 0;
                    dl81Var2.m(4);
                    aba1.b(j3, dl81Var2, this.a.c);
                }
                ln81Var = this.i;
                boolean z5 = this.j;
                boolean z6 = this.l;
                if (ln81Var.d == 9) {
                    z = true;
                } else {
                    if (z5 && ln81Var.h) {
                        long j4 = ln81Var.e;
                        int i14 = i + ((int) (j - j4));
                        long j5 = ln81Var.j;
                        if (j5 != -9223372036854775807L) {
                            ln81Var.a.b(j5, ln81Var.k ? 1 : 0, (int) (j4 - ln81Var.i), i14, null);
                        }
                    }
                    ln81Var.i = ln81Var.e;
                    ln81Var.j = ln81Var.f;
                    ln81Var.k = false;
                    z = true;
                    ln81Var.h = true;
                }
                boolean z7 = ln81Var.k;
                i4 = ln81Var.d;
                if (i4 != 5 && (!z6 || i4 != z)) {
                    z = false;
                }
                z2 = z | z7;
                ln81Var.k = z2;
                if (z2) {
                    this.l = false;
                }
                long j6 = this.k;
                if (this.j) {
                    c150Var2.d(i10);
                    c150Var3.d(i10);
                } else {
                    this.i.getClass();
                }
                c150Var.d(i10);
                ln81 ln81Var2 = this.i;
                ln81Var2.d = i10;
                ln81Var2.f = j6;
                ln81Var2.e = j;
                i7 = i2;
                bArr2 = bArr;
                i6 = i3;
            }
            i2 = i7;
            bArr = bArr2;
            i3 = i9;
            j = j2;
            if (c150Var.b(i13)) {
            }
            ln81Var = this.i;
            boolean z52 = this.j;
            boolean z62 = this.l;
            if (ln81Var.d == 9) {
            }
            boolean z72 = ln81Var.k;
            i4 = ln81Var.d;
            if (i4 != 5) {
                z = false;
            }
            z2 = z | z72;
            ln81Var.k = z2;
            if (z2) {
            }
            long j62 = this.k;
            if (this.j) {
            }
            c150Var.d(i10);
            ln81 ln81Var22 = this.i;
            ln81Var22.d = i10;
            ln81Var22.f = j62;
            ln81Var22.e = j;
            i7 = i2;
            bArr2 = bArr;
            i6 = i3;
        }
        if (this.j) {
            this.i.getClass();
        } else {
            c150Var2.a(i6, i7, bArr2);
            c150Var3.a(i6, i7, bArr2);
        }
        c150Var.a(i6, i7, bArr2);
        this.i.getClass();
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.g = xi11Var.e;
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 2);
        this.h = l;
        this.i = new ln81(l);
        this.a.a(yg71Var, xi11Var);
    }
}
