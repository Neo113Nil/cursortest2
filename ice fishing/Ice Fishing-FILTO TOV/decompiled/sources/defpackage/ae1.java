package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ae1 {
    public final float[] AvO7iQsrTN;
    public final float[] EljAMC1QTz;
    public final boolean GWasM1elztuh;
    public int OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final zd1 Yi7zF1RB1;
    public final float[] encWxUiV2;
    public final fi[] xqGvceK5x;

    public ae1(boolean z, zd1 zd1Var) {
        int i;
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = zd1Var;
        if (z && zd1Var.equals(zd1.OOA6hdeuvCS)) {
            o4.jivtDDk9H("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = zd1Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                o4.xqGvceK5x();
                throw null;
            }
            i = 2;
        }
        this.X1lG3V04pd = i;
        this.xqGvceK5x = new fi[20];
        this.EljAMC1QTz = new float[20];
        this.AvO7iQsrTN = new float[20];
        this.encWxUiV2 = new float[3];
    }

    public final void GWasM1elztuh(float f, long j) {
        int i = (this.OOA6hdeuvCS + 1) % 20;
        this.OOA6hdeuvCS = i;
        fi[] fiVarArr = this.xqGvceK5x;
        fi fiVar = fiVarArr[i];
        if (fiVar != null) {
            fiVar.GWasM1elztuh = j;
            fiVar.Yi7zF1RB1 = f;
        } else {
            fi fiVar2 = new fi();
            fiVar2.GWasM1elztuh = j;
            fiVar2.Yi7zF1RB1 = f;
            fiVarArr[i] = fiVar2;
        }
    }

    public final float Yi7zF1RB1(float f) {
        zd1 zd1Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            t10.Yi7zF1RB1("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.OOA6hdeuvCS;
        fi[] fiVarArr = this.xqGvceK5x;
        fi fiVar = fiVarArr[i2];
        if (fiVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            fi fiVar2 = fiVar;
            while (true) {
                fi fiVar3 = fiVarArr[i2];
                boolean z2 = this.GWasM1elztuh;
                zd1Var = this.Yi7zF1RB1;
                fArr = this.EljAMC1QTz;
                fArr2 = this.AvO7iQsrTN;
                if (fiVar3 != null) {
                    long j = fiVar.GWasM1elztuh;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = fiVar3.GWasM1elztuh;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - fiVar2.GWasM1elztuh);
                    fiVar2 = (zd1Var == zd1.OOA6hdeuvCS || z) ? fiVar3 : fiVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = fiVar3.Yi7zF1RB1;
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
            if (i3 >= this.X1lG3V04pd) {
                int ordinal = zd1Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.encWxUiV2;
                        l60.cilMamHF(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        o4.xqGvceK5x();
                        return f2;
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
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ ae1() {
        this(false, zd1.OOA6hdeuvCS);
    }

    public ae1(int i) {
        this(true, zd1.EljAMC1QTz);
    }
}
