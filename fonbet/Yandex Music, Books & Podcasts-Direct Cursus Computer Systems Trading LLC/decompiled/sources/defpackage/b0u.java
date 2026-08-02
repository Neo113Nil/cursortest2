package defpackage;

/* loaded from: classes.dex */
public final class b0u {
    public final boolean a;
    public final a0u b;
    public final int c;
    public final la7[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public b0u(boolean z, a0u a0uVar) {
        int i;
        this.a = z;
        this.b = a0uVar;
        if (z && a0uVar.equals(a0u.a)) {
            xq0.q("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = a0uVar.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new la7[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        la7[] la7VarArr = this.d;
        la7 la7Var = la7VarArr[i];
        if (la7Var != null) {
            la7Var.a = j;
            la7Var.b = f;
        } else {
            la7 la7Var2 = new la7();
            la7Var2.a = j;
            la7Var2.b = f;
            la7VarArr[i] = la7Var2;
        }
    }

    public final float b(float f) {
        a0u a0uVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4 = f;
        float f5 = 0.0f;
        if (f4 <= 0.0f) {
            sme.b("maximumVelocity should be a positive value. You specified=" + f4);
        }
        int i2 = this.e;
        la7[] la7VarArr = this.d;
        la7 la7Var = la7VarArr[i2];
        if (la7Var == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            la7 la7Var2 = la7Var;
            while (true) {
                la7 la7Var3 = la7VarArr[i2];
                boolean z2 = this.a;
                a0uVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (la7Var3 != null) {
                    long j = la7Var.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = la7Var3.a;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - la7Var2.a);
                    la7Var2 = (a0uVar == a0u.a || z) ? la7Var3 : la7Var;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = la7Var3.b;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int ordinal = a0uVar.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        ezf.M(fArr2, fArr, i3, fArr3);
                        f3 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f3 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        b6e.s();
                        return 0.0f;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f3 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2));
                }
                f5 = f3 * 1000;
            } else {
                f5 = f2;
            }
        }
        if (f5 == f2 || Float.isNaN(f5)) {
            return f2;
        }
        if (f5 <= f2) {
            f4 = -f4;
            if (f5 >= f4) {
                return f5;
            }
        } else if (f5 <= f4) {
            f4 = f5;
        }
        return f4;
    }

    public /* synthetic */ b0u() {
        this(false, a0u.a);
    }

    public b0u(int i) {
        this(true, a0u.b);
    }
}
