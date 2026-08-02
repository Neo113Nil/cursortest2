package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s4e {
    public final hi3 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public wtd[] e = new wtd[8];
    public int f = 7;

    public s4e(hi3 hi3Var) {
        this.a = hi3Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                wtd wtdVar = this.e[length];
                wtdVar.getClass();
                i -= wtdVar.c;
                int i4 = this.h;
                wtd wtdVar2 = this.e[length];
                wtdVar2.getClass();
                this.h = i4 - wtdVar2.c;
                this.g--;
                i3++;
                length--;
            }
            wtd[] wtdVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(wtdVarArr, i5, wtdVarArr, i5 + i3, this.g);
            wtd[] wtdVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(wtdVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(wtd wtdVar) {
        int i = wtdVar.c;
        int i2 = this.d;
        if (i > i2) {
            wtd[] wtdVarArr = this.e;
            uz0.l(0, wtdVarArr.length, null, wtdVarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        wtd[] wtdVarArr2 = this.e;
        if (i3 > wtdVarArr2.length) {
            wtd[] wtdVarArr3 = new wtd[wtdVarArr2.length * 2];
            System.arraycopy(wtdVarArr2, 0, wtdVarArr3, wtdVarArr2.length, wtdVarArr2.length);
            this.f = this.e.length - 1;
            this.e = wtdVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = wtdVar;
        this.g++;
        this.h += i;
    }

    public final void c(pn3 pn3Var) {
        pn3Var.getClass();
        int[] iArr = c8e.a;
        int d = pn3Var.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < d; i++) {
            byte k = pn3Var.k(i);
            byte[] bArr = cvt.a;
            j2 += c8e.b[k & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int d2 = pn3Var.d();
        hi3 hi3Var = this.a;
        if (i2 >= d2) {
            e(pn3Var.d(), 127, 0);
            hi3Var.L0(pn3Var);
            return;
        }
        hi3 hi3Var2 = new hi3();
        int[] iArr2 = c8e.a;
        int d3 = pn3Var.d();
        int i3 = 0;
        for (int i4 = 0; i4 < d3; i4++) {
            byte k2 = pn3Var.k(i4);
            byte[] bArr2 = cvt.a;
            int i5 = k2 & 255;
            int i6 = c8e.a[i5];
            byte b = c8e.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                hi3Var2.M0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            hi3Var2.M0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        pn3 g0 = hi3Var2.g0(hi3Var2.b);
        e(g0.d(), 127, 128);
        hi3Var.L0(g0);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            wtd wtdVar = (wtd) arrayList.get(i4);
            pn3 s = wtdVar.a.s();
            pn3 pn3Var = wtdVar.b;
            Integer num = (Integer) t4e.b.get(s);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    wtd[] wtdVarArr = t4e.a;
                    if (Intrinsics.d(wtdVarArr[intValue].b, pn3Var)) {
                        i = i2;
                    } else if (Intrinsics.d(wtdVarArr[i2].b, pn3Var)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    wtd wtdVar2 = this.e[i5];
                    wtdVar2.getClass();
                    if (Intrinsics.d(wtdVar2.a, s)) {
                        wtd wtdVar3 = this.e[i5];
                        wtdVar3.getClass();
                        if (Intrinsics.d(wtdVar3.b, pn3Var)) {
                            i2 = t4e.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + t4e.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.M0(64);
                c(s);
                c(pn3Var);
                b(wtdVar);
            } else {
                pn3 pn3Var2 = wtd.d;
                s.getClass();
                pn3Var2.getClass();
                if (!s.p(0, pn3Var2, pn3Var2.d()) || Intrinsics.d(wtd.i, s)) {
                    e(i, 63, 64);
                    c(pn3Var);
                    b(wtdVar);
                } else {
                    e(i, 15, 0);
                    c(pn3Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        hi3 hi3Var = this.a;
        if (i < i2) {
            hi3Var.M0(i | i3);
            return;
        }
        hi3Var.M0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            hi3Var.M0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        hi3Var.M0(i4);
    }
}
