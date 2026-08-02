package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class psm extends bz0 {
    public i3r[] f;
    public i3r[] g;
    public int h;
    public aqd i;

    @Override // defpackage.bz0
    public final i3r d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            i3r[] i3rVarArr = this.f;
            i3r i3rVar = i3rVarArr[i2];
            if (!zArr[i3rVar.b]) {
                aqd aqdVar = this.i;
                aqdVar.b = i3rVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((i3r) aqdVar.b).h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    i3r i3rVar2 = i3rVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = i3rVar2.h[i3];
                            float f3 = ((i3r) aqdVar.b).h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.bz0
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.bz0
    public final void i(j7g j7gVar, bz0 bz0Var, boolean z) {
        i3r i3rVar = bz0Var.a;
        if (i3rVar == null) {
            return;
        }
        float[] fArr = i3rVar.h;
        py0 py0Var = bz0Var.d;
        int d = py0Var.d();
        for (int i = 0; i < d; i++) {
            i3r e = py0Var.e(i);
            float f = py0Var.f(i);
            aqd aqdVar = this.i;
            aqdVar.b = e;
            if (e.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((i3r) aqdVar.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((i3r) aqdVar.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((psm) aqdVar.c).k((i3r) aqdVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((i3r) aqdVar.b).h[i3] = f4;
                    } else {
                        ((i3r) aqdVar.b).h[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (bz0Var.b * f) + this.b;
        }
        k(i3rVar);
    }

    public final void j(i3r i3rVar) {
        int i;
        i3r[] i3rVarArr;
        int i2 = this.h + 1;
        i3r[] i3rVarArr2 = this.f;
        if (i2 > i3rVarArr2.length) {
            i3r[] i3rVarArr3 = (i3r[]) Arrays.copyOf(i3rVarArr2, i3rVarArr2.length * 2);
            this.f = i3rVarArr3;
            this.g = (i3r[]) Arrays.copyOf(i3rVarArr3, i3rVarArr3.length * 2);
        }
        i3r[] i3rVarArr4 = this.f;
        int i3 = this.h;
        i3rVarArr4[i3] = i3rVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && i3rVarArr4[i3].b > i3rVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                i3rVarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                i3rVarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(i3rVarArr, 0, i, new ehf(27));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        i3rVar.a = true;
        i3rVar.a(this);
    }

    public final void k(i3r i3rVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == i3rVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        i3rVar.a = false;
                        return;
                    } else {
                        i3r[] i3rVarArr = this.f;
                        int i3 = i + 1;
                        i3rVarArr[i] = i3rVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.bz0
    public final String toString() {
        aqd aqdVar = this.i;
        String m = su4.m(this.b, ") : ", new StringBuilder(" goal -> ("));
        for (int i = 0; i < this.h; i++) {
            aqdVar.b = this.f[i];
            m = m + aqdVar + StringUtil.SPACE;
        }
        return m;
    }
}
