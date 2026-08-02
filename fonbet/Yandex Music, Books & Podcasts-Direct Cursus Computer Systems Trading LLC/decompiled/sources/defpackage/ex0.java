package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ex0 extends lg3 {
    public final double[] y;
    public final dx0[] z;

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0030, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ex0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ex0(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        int i;
        double[] dArr3;
        double d3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.y = dArr4;
        int i2 = 1;
        obj.z = new dx0[dArr4.length - 1];
        char c = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        ex0 ex0Var = obj;
        while (true) {
            dx0[] dx0VarArr = ex0Var.z;
            if (i3 >= dx0VarArr.length) {
                return;
            }
            int i6 = iArr[i3];
            if (i6 != 0) {
                if (i6 != i2) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                i5 = 4;
                            } else if (i6 == 5) {
                                i5 = 5;
                            }
                        }
                    }
                    i4 = 2;
                    i5 = i4;
                }
                i4 = i2;
                i5 = i4;
            } else {
                i5 = 3;
            }
            double d4 = dArr4[i3];
            int i7 = i3 + 1;
            double d5 = dArr4[i7];
            double[] dArr5 = dArr2[i3];
            double d6 = dArr5[c];
            int i8 = i2;
            int i9 = i3;
            double d7 = dArr5[i8];
            double[] dArr6 = dArr2[i7];
            boolean z2 = c;
            double d8 = dArr6[z2 ? 1 : 0];
            double d9 = dArr6[i8];
            dx0 dx0Var = new dx0();
            dx0Var.r = z2;
            int i10 = i4;
            double d10 = d8 - d6;
            double d11 = d9 - d7;
            boolean z3 = i8;
            if (i5 != z3) {
                if (i5 == 4) {
                    dx0Var.q = d11 > 0.0d;
                } else if (i5 != 5) {
                    dx0Var.q = false;
                } else {
                    dx0Var.q = d11 < 0.0d;
                }
                d = d10;
                d2 = d4;
                z = true;
            } else {
                dx0Var.q = z3;
                d = d10;
                d2 = d4;
                z = z3;
            }
            dx0Var.c = d2;
            dx0Var.d = d5;
            double d12 = d5 - d2;
            double d13 = 1.0d / d12;
            dx0Var.i = d13;
            if (3 == i5) {
                dx0Var.r = z;
            }
            if (dx0Var.r || Math.abs(d) < 0.001d || Math.abs(d11) < 0.001d) {
                i = 1;
                dx0Var.r = true;
                dx0Var.e = d6;
                dx0Var.f = d8;
                dx0Var.g = d7;
                dx0Var.h = d9;
                double d14 = d;
                double hypot = Math.hypot(d11, d14);
                dx0Var.b = hypot;
                dx0Var.n = hypot * d13;
                dx0Var.l = d14 / d12;
                dx0Var.m = d11 / d12;
            } else {
                double[] dArr7 = new double[101];
                dx0Var.a = dArr7;
                boolean z4 = dx0Var.q;
                dx0Var.j = (z4 ? -1 : 1) * d;
                dx0Var.k = (z4 ? 1 : -1) * d11;
                dx0Var.l = z4 ? d8 : d6;
                dx0Var.m = z4 ? d7 : d9;
                double d15 = d7 - d9;
                double d16 = 0.0d;
                double d17 = 0.0d;
                double d18 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = dx0.s;
                    if (i11 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d19 = d15;
                    double radians = Math.toRadians((i11 * 90.0d) / 90);
                    double sin = d * Math.sin(radians);
                    double cos = Math.cos(radians) * d19;
                    if (i11 > 0) {
                        d3 = cos;
                        d16 += Math.hypot(sin - d17, d3 - d18);
                        dArr3[i11] = d16;
                    } else {
                        d3 = cos;
                    }
                    i11++;
                    d17 = sin;
                    d15 = d19;
                    d18 = d3;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                dx0Var.b = d16;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / d16;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d20 = i13 / 100;
                    int binarySearch = Arrays.binarySearch(dArr3, d20);
                    if (binarySearch >= 0) {
                        dArr9[i13] = binarySearch / 90;
                    } else if (binarySearch == -1) {
                        dArr9[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double d21 = dArr3[i15];
                        dArr9[i13] = (((d20 - d21) / (dArr3[i14 - 1] - d21)) + i15) / 90;
                    }
                }
                dx0Var.n = dx0Var.b * dx0Var.i;
                i = 1;
            }
            dx0VarArr[i9] = dx0Var;
            ex0Var = this;
            dArr4 = dArr;
            i2 = i;
            i3 = i7;
            i4 = i10;
            c = 0;
        }
    }

    @Override // defpackage.lg3
    public final double h0(double d) {
        dx0[] dx0VarArr = this.z;
        dx0 dx0Var = dx0VarArr[0];
        double d2 = dx0Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (dx0Var.r) {
                return (d3 * dx0VarArr[0].l) + dx0Var.c(d2);
            }
            dx0Var.g(d2);
            return (dx0VarArr[0].a() * d3) + dx0VarArr[0].e();
        }
        if (d > dx0VarArr[dx0VarArr.length - 1].d) {
            double d4 = dx0VarArr[dx0VarArr.length - 1].d;
            double d5 = d - d4;
            int length = dx0VarArr.length - 1;
            return (d5 * dx0VarArr[length].l) + dx0VarArr[length].c(d4);
        }
        for (int i = 0; i < dx0VarArr.length; i++) {
            dx0 dx0Var2 = dx0VarArr[i];
            if (d <= dx0Var2.d) {
                if (dx0Var2.r) {
                    return dx0Var2.c(d);
                }
                dx0Var2.g(d);
                return dx0VarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.lg3
    public final void i0(double d, double[] dArr) {
        dx0[] dx0VarArr = this.z;
        dx0 dx0Var = dx0VarArr[0];
        double d2 = dx0Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (dx0Var.r) {
                double c = dx0Var.c(d2);
                dx0 dx0Var2 = dx0VarArr[0];
                dArr[0] = (dx0Var2.l * d3) + c;
                dArr[1] = (d3 * dx0VarArr[0].m) + dx0Var2.d(d2);
                return;
            }
            dx0Var.g(d2);
            dArr[0] = (dx0VarArr[0].a() * d3) + dx0VarArr[0].e();
            dArr[1] = (dx0VarArr[0].b() * d3) + dx0VarArr[0].f();
            return;
        }
        if (d <= dx0VarArr[dx0VarArr.length - 1].d) {
            for (int i = 0; i < dx0VarArr.length; i++) {
                dx0 dx0Var3 = dx0VarArr[i];
                if (d <= dx0Var3.d) {
                    if (dx0Var3.r) {
                        dArr[0] = dx0Var3.c(d);
                        dArr[1] = dx0VarArr[i].d(d);
                        return;
                    } else {
                        dx0Var3.g(d);
                        dArr[0] = dx0VarArr[i].e();
                        dArr[1] = dx0VarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = dx0VarArr[dx0VarArr.length - 1].d;
        double d5 = d - d4;
        int length = dx0VarArr.length - 1;
        dx0 dx0Var4 = dx0VarArr[length];
        if (dx0Var4.r) {
            double c2 = dx0Var4.c(d4);
            dx0 dx0Var5 = dx0VarArr[length];
            dArr[0] = (dx0Var5.l * d5) + c2;
            dArr[1] = (d5 * dx0VarArr[length].m) + dx0Var5.d(d4);
            return;
        }
        dx0Var4.g(d);
        dArr[0] = (dx0VarArr[length].a() * d5) + dx0VarArr[length].e();
        dArr[1] = (dx0VarArr[length].b() * d5) + dx0VarArr[length].f();
    }

    @Override // defpackage.lg3
    public final void j0(double d, float[] fArr) {
        dx0[] dx0VarArr = this.z;
        dx0 dx0Var = dx0VarArr[0];
        double d2 = dx0Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (dx0Var.r) {
                double c = dx0Var.c(d2);
                dx0 dx0Var2 = dx0VarArr[0];
                fArr[0] = (float) ((dx0Var2.l * d3) + c);
                fArr[1] = (float) ((d3 * dx0VarArr[0].m) + dx0Var2.d(d2));
                return;
            }
            dx0Var.g(d2);
            fArr[0] = (float) ((dx0VarArr[0].a() * d3) + dx0VarArr[0].e());
            fArr[1] = (float) ((dx0VarArr[0].b() * d3) + dx0VarArr[0].f());
            return;
        }
        if (d <= dx0VarArr[dx0VarArr.length - 1].d) {
            for (int i = 0; i < dx0VarArr.length; i++) {
                dx0 dx0Var3 = dx0VarArr[i];
                if (d <= dx0Var3.d) {
                    if (dx0Var3.r) {
                        fArr[0] = (float) dx0Var3.c(d);
                        fArr[1] = (float) dx0VarArr[i].d(d);
                        return;
                    } else {
                        dx0Var3.g(d);
                        fArr[0] = (float) dx0VarArr[i].e();
                        fArr[1] = (float) dx0VarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = dx0VarArr[dx0VarArr.length - 1].d;
        double d5 = d - d4;
        int length = dx0VarArr.length - 1;
        dx0 dx0Var4 = dx0VarArr[length];
        if (!dx0Var4.r) {
            dx0Var4.g(d);
            fArr[0] = (float) dx0VarArr[length].e();
            fArr[1] = (float) dx0VarArr[length].f();
        } else {
            double c2 = dx0Var4.c(d4);
            dx0 dx0Var5 = dx0VarArr[length];
            fArr[0] = (float) ((dx0Var5.l * d5) + c2);
            fArr[1] = (float) ((d5 * dx0VarArr[length].m) + dx0Var5.d(d4));
        }
    }

    @Override // defpackage.lg3
    public final void k0(double d, double[] dArr) {
        dx0[] dx0VarArr = this.z;
        double d2 = dx0VarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > dx0VarArr[dx0VarArr.length - 1].d) {
            d = dx0VarArr[dx0VarArr.length - 1].d;
        }
        for (int i = 0; i < dx0VarArr.length; i++) {
            dx0 dx0Var = dx0VarArr[i];
            if (d <= dx0Var.d) {
                if (dx0Var.r) {
                    dArr[0] = dx0Var.l;
                    dArr[1] = dx0Var.m;
                    return;
                } else {
                    dx0Var.g(d);
                    dArr[0] = dx0VarArr[i].a();
                    dArr[1] = dx0VarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // defpackage.lg3
    public final double[] l0() {
        return this.y;
    }
}
