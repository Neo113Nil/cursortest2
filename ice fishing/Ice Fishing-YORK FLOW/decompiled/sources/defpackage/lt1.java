package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lt1 {
    public final defpackage.jn[] JhCgjQRTAOCT;
    public final float[] P05cfTpS5W5L;
    public final float[] QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public final boolean ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final defpackage.kt1 giKS3J6vZuNy;
    public final float[] oh71FJcDz6S2;

    public lt1(boolean z, defpackage.kt1 kt1Var) {
        int i;
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = kt1Var;
        if (z && kt1Var.equals(defpackage.kt1.WDYagTQQm9ns)) {
            defpackage.h7.P05cfTpS5W5L("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = kt1Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                defpackage.h7.T1fB7bDYiVJQ();
                throw null;
            }
            i = 2;
        }
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = new defpackage.jn[20];
        this.oh71FJcDz6S2 = new float[20];
        this.QiMR8OkAhezm = new float[20];
        this.P05cfTpS5W5L = new float[3];
    }

    public final void ZpBGe2uQfcn8(long j, float f) {
        int i = (this.WDYagTQQm9ns + 1) % 20;
        this.WDYagTQQm9ns = i;
        defpackage.jn[] jnVarArr = this.JhCgjQRTAOCT;
        defpackage.jn jnVar = jnVarArr[i];
        if (jnVar != null) {
            jnVar.ZpBGe2uQfcn8 = j;
            jnVar.giKS3J6vZuNy = f;
        } else {
            defpackage.jn jnVar2 = new defpackage.jn();
            jnVar2.ZpBGe2uQfcn8 = j;
            jnVar2.giKS3J6vZuNy = f;
            jnVarArr[i] = jnVar2;
        }
    }

    public final float giKS3J6vZuNy(float f) {
        defpackage.kt1 kt1Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            defpackage.e80.giKS3J6vZuNy("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.WDYagTQQm9ns;
        defpackage.jn[] jnVarArr = this.JhCgjQRTAOCT;
        defpackage.jn jnVar = jnVarArr[i2];
        if (jnVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            defpackage.jn jnVar2 = jnVar;
            while (true) {
                defpackage.jn jnVar3 = jnVarArr[i2];
                boolean z2 = this.ZpBGe2uQfcn8;
                kt1Var = this.giKS3J6vZuNy;
                fArr = this.oh71FJcDz6S2;
                fArr2 = this.QiMR8OkAhezm;
                if (jnVar3 != null) {
                    long j = jnVar.ZpBGe2uQfcn8;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = jnVar3.ZpBGe2uQfcn8;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = java.lang.Math.abs(j2 - jnVar2.ZpBGe2uQfcn8);
                    jnVar2 = (kt1Var == defpackage.kt1.WDYagTQQm9ns || z) ? jnVar3 : jnVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = jnVar3.giKS3J6vZuNy;
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
            if (i3 >= this.fWTAfUmVKrZq) {
                int ordinal = kt1Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.P05cfTpS5W5L;
                        defpackage.v70.qjMheFZ0l9kA(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (java.lang.IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        defpackage.h7.T1fB7bDYiVJQ();
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
                            f8 += java.lang.Math.abs(f10) * (f10 - (java.lang.Math.signum(f8) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = java.lang.Math.signum(f8) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || java.lang.Float.isNaN(f3)) {
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

    public /* synthetic */ lt1() {
        this(false, defpackage.kt1.WDYagTQQm9ns);
    }

    public lt1(int i) {
        this(true, defpackage.kt1.oh71FJcDz6S2);
    }
}
