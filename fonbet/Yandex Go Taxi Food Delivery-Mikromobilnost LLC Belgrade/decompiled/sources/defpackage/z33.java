package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class z33 extends mif {
    public final double[] a;
    public final y33[] b;
    public final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0032, code lost:
    
        if (r5 == r2) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mif, z33] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z33(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        y33 y33Var;
        int i;
        double[] dArr3;
        y33 y33Var2;
        double[] dArr4 = dArr;
        ?? mifVar = new mif();
        int i2 = 1;
        mifVar.c = true;
        mifVar.a = dArr4;
        mifVar.b = new y33[dArr4.length - 1];
        char c = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        z33 z33Var = mifVar;
        while (true) {
            y33[] y33VarArr = z33Var.b;
            if (i5 >= y33VarArr.length) {
                return;
            }
            int i6 = iArr[i5];
            if (i6 != 0) {
                if (i6 != i2) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                i4 = 4;
                            } else if (i6 == 5) {
                                i4 = 5;
                            }
                        }
                    }
                    i3 = 2;
                    i4 = i3;
                }
                i3 = i2;
                i4 = i3;
            } else {
                i4 = 3;
            }
            double d3 = dArr4[i5];
            int i7 = i5 + 1;
            double d4 = dArr4[i7];
            double[] dArr5 = dArr2[i5];
            double d5 = dArr5[c];
            int i8 = i2;
            boolean z2 = c;
            double d6 = dArr5[i8];
            double[] dArr6 = dArr2[i7];
            double d7 = dArr6[z2 ? 1 : 0];
            int i9 = i5;
            int i10 = i3;
            double d8 = dArr6[i8];
            y33 y33Var3 = new y33();
            y33Var3.r = z2;
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            boolean z3 = i8;
            if (i4 != z3) {
                if (i4 == 4) {
                    y33Var3.q = d10 > 0.0d;
                } else if (i4 != 5) {
                    y33Var3.q = false;
                } else {
                    y33Var3.q = d10 < 0.0d;
                }
                d = d10;
                d2 = d3;
                z = true;
            } else {
                y33Var3.q = z3;
                d = d10;
                d2 = d3;
                z = z3;
            }
            y33Var3.c = d2;
            y33Var3.d = d4;
            double d11 = d4 - d2;
            double d12 = 1.0d / d11;
            y33Var3.i = d12;
            if (3 == i4) {
                y33Var3.r = z;
            }
            if (y33Var3.r || Math.abs(d9) < 0.001d || Math.abs(d) < 0.001d) {
                y33Var = y33Var3;
                i = 1;
                y33Var.r = true;
                y33Var.e = d5;
                y33Var.f = d7;
                y33Var.g = d6;
                y33Var.h = d8;
                double d13 = d;
                double hypot = Math.hypot(d13, d9);
                y33Var.b = hypot;
                y33Var.n = hypot * d12;
                y33Var.l = d9 / d11;
                y33Var.m = d13 / d11;
            } else {
                double[] dArr7 = new double[101];
                y33Var3.a = dArr7;
                boolean z4 = y33Var3.q;
                y33Var3.j = (z4 ? -1 : 1) * d9;
                y33Var3.k = (z4 ? 1 : -1) * d;
                y33Var3.l = z4 ? d7 : d5;
                y33Var3.m = z4 ? d6 : d8;
                double d14 = d6 - d8;
                double d15 = 0.0d;
                double d16 = 0.0d;
                double d17 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = y33.s;
                    if (i11 >= 91) {
                        break;
                    }
                    double d18 = d17;
                    double radians = Math.toRadians((i11 * 90.0d) / 90.0d);
                    double sin = Math.sin(radians) * d9;
                    double cos = Math.cos(radians) * d14;
                    if (i11 > 0) {
                        y33Var2 = y33Var3;
                        d15 += Math.hypot(sin - d16, cos - d18);
                        dArr3[i11] = d15;
                    } else {
                        y33Var2 = y33Var3;
                    }
                    i11++;
                    y33Var3 = y33Var2;
                    d16 = sin;
                    d17 = cos;
                }
                y33Var = y33Var3;
                y33Var.b = d15;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / d15;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d19 = i13 / 100.0d;
                    int binarySearch = Arrays.binarySearch(dArr3, d19);
                    if (binarySearch >= 0) {
                        dArr7[i13] = binarySearch / 90.0d;
                    } else if (binarySearch == -1) {
                        dArr7[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double d20 = dArr3[i15];
                        dArr7[i13] = (((d19 - d20) / (dArr3[i14 - 1] - d20)) + i15) / 90.0d;
                    }
                }
                y33Var.n = y33Var.b * y33Var.i;
                i = 1;
            }
            y33VarArr[i9] = y33Var;
            z33Var = this;
            dArr4 = dArr;
            i2 = i;
            i5 = i7;
            i3 = i10;
            c = 0;
        }
    }

    @Override // defpackage.mif
    public final double b(double d) {
        boolean z = this.c;
        y33[] y33VarArr = this.b;
        if (z) {
            y33 y33Var = y33VarArr[0];
            double d2 = y33Var.c;
            if (d < d2) {
                double d3 = d - d2;
                if (y33Var.r) {
                    return (d3 * y33VarArr[0].l) + y33Var.c(d2);
                }
                y33Var.g(d2);
                return (y33VarArr[0].a() * d3) + y33VarArr[0].e();
            }
            if (d > y33VarArr[y33VarArr.length - 1].d) {
                double d4 = y33VarArr[y33VarArr.length - 1].d;
                double d5 = d - d4;
                int length = y33VarArr.length - 1;
                return (d5 * y33VarArr[length].l) + y33VarArr[length].c(d4);
            }
        } else {
            double d6 = y33VarArr[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > y33VarArr[y33VarArr.length - 1].d) {
                d = y33VarArr[y33VarArr.length - 1].d;
            }
        }
        for (int i = 0; i < y33VarArr.length; i++) {
            y33 y33Var2 = y33VarArr[i];
            if (d <= y33Var2.d) {
                if (y33Var2.r) {
                    return y33Var2.c(d);
                }
                y33Var2.g(d);
                return y33VarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.mif
    public final void c(double d, double[] dArr) {
        boolean z = this.c;
        y33[] y33VarArr = this.b;
        if (z) {
            y33 y33Var = y33VarArr[0];
            double d2 = y33Var.c;
            if (d < d2) {
                double d3 = d - d2;
                if (y33Var.r) {
                    double c = y33Var.c(d2);
                    y33 y33Var2 = y33VarArr[0];
                    dArr[0] = (y33Var2.l * d3) + c;
                    dArr[1] = (d3 * y33VarArr[0].m) + y33Var2.d(d2);
                    return;
                }
                y33Var.g(d2);
                dArr[0] = (y33VarArr[0].a() * d3) + y33VarArr[0].e();
                dArr[1] = (y33VarArr[0].b() * d3) + y33VarArr[0].f();
                return;
            }
            if (d > y33VarArr[y33VarArr.length - 1].d) {
                double d4 = y33VarArr[y33VarArr.length - 1].d;
                double d5 = d - d4;
                int length = y33VarArr.length - 1;
                y33 y33Var3 = y33VarArr[length];
                if (y33Var3.r) {
                    double c2 = y33Var3.c(d4);
                    y33 y33Var4 = y33VarArr[length];
                    dArr[0] = (y33Var4.l * d5) + c2;
                    dArr[1] = (d5 * y33VarArr[length].m) + y33Var4.d(d4);
                    return;
                }
                y33Var3.g(d);
                dArr[0] = (y33VarArr[length].a() * d5) + y33VarArr[length].e();
                dArr[1] = (y33VarArr[length].b() * d5) + y33VarArr[length].f();
                return;
            }
        } else {
            double d6 = y33VarArr[0].c;
            if (d < d6) {
                d = d6;
            }
            if (d > y33VarArr[y33VarArr.length - 1].d) {
                d = y33VarArr[y33VarArr.length - 1].d;
            }
        }
        for (int i = 0; i < y33VarArr.length; i++) {
            y33 y33Var5 = y33VarArr[i];
            if (d <= y33Var5.d) {
                if (y33Var5.r) {
                    dArr[0] = y33Var5.c(d);
                    dArr[1] = y33VarArr[i].d(d);
                    return;
                } else {
                    y33Var5.g(d);
                    dArr[0] = y33VarArr[i].e();
                    dArr[1] = y33VarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.mif
    public final void d(double d, float[] fArr) {
        boolean z = this.c;
        y33[] y33VarArr = this.b;
        if (z) {
            y33 y33Var = y33VarArr[0];
            double d2 = y33Var.c;
            if (d < d2) {
                double d3 = d - d2;
                if (y33Var.r) {
                    double c = y33Var.c(d2);
                    y33 y33Var2 = y33VarArr[0];
                    fArr[0] = (float) ((y33Var2.l * d3) + c);
                    fArr[1] = (float) ((d3 * y33VarArr[0].m) + y33Var2.d(d2));
                    return;
                }
                y33Var.g(d2);
                fArr[0] = (float) ((y33VarArr[0].a() * d3) + y33VarArr[0].e());
                fArr[1] = (float) ((y33VarArr[0].b() * d3) + y33VarArr[0].f());
                return;
            }
            if (d > y33VarArr[y33VarArr.length - 1].d) {
                double d4 = y33VarArr[y33VarArr.length - 1].d;
                double d5 = d - d4;
                int length = y33VarArr.length - 1;
                y33 y33Var3 = y33VarArr[length];
                if (!y33Var3.r) {
                    y33Var3.g(d);
                    fArr[0] = (float) y33VarArr[length].e();
                    fArr[1] = (float) y33VarArr[length].f();
                    return;
                } else {
                    double c2 = y33Var3.c(d4);
                    y33 y33Var4 = y33VarArr[length];
                    fArr[0] = (float) ((y33Var4.l * d5) + c2);
                    fArr[1] = (float) ((d5 * y33VarArr[length].m) + y33Var4.d(d4));
                    return;
                }
            }
        } else {
            double d6 = y33VarArr[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > y33VarArr[y33VarArr.length - 1].d) {
                d = y33VarArr[y33VarArr.length - 1].d;
            }
        }
        for (int i = 0; i < y33VarArr.length; i++) {
            y33 y33Var5 = y33VarArr[i];
            if (d <= y33Var5.d) {
                if (y33Var5.r) {
                    fArr[0] = (float) y33Var5.c(d);
                    fArr[1] = (float) y33VarArr[i].d(d);
                    return;
                } else {
                    y33Var5.g(d);
                    fArr[0] = (float) y33VarArr[i].e();
                    fArr[1] = (float) y33VarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.mif
    public final double e(double d) {
        y33[] y33VarArr = this.b;
        double d2 = y33VarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > y33VarArr[y33VarArr.length - 1].d) {
            d = y33VarArr[y33VarArr.length - 1].d;
        }
        for (int i = 0; i < y33VarArr.length; i++) {
            y33 y33Var = y33VarArr[i];
            if (d <= y33Var.d) {
                if (y33Var.r) {
                    return y33Var.l;
                }
                y33Var.g(d);
                return y33VarArr[i].a();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.mif
    public final void f(double d, double[] dArr) {
        y33[] y33VarArr = this.b;
        double d2 = y33VarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > y33VarArr[y33VarArr.length - 1].d) {
            d = y33VarArr[y33VarArr.length - 1].d;
        }
        for (int i = 0; i < y33VarArr.length; i++) {
            y33 y33Var = y33VarArr[i];
            if (d <= y33Var.d) {
                if (y33Var.r) {
                    dArr[0] = y33Var.l;
                    dArr[1] = y33Var.m;
                    return;
                } else {
                    y33Var.g(d);
                    dArr[0] = y33VarArr[i].a();
                    dArr[1] = y33VarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // defpackage.mif
    public final double[] g() {
        return this.a;
    }
}
