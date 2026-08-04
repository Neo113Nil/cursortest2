package com.gamericefishpro.space.i3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public final a d;
    public f a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public b(com.gamericefishpro.space.a8.c cVar) {
        this.d = new a(this, cVar);
    }

    public final void a(c cVar, int i) {
        this.d.g(cVar.j(i), 1.0f);
        this.d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, -1.0f);
        } else {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(fVar, 1.0f);
            this.d.g(fVar2, -1.0f);
            this.d.g(fVar3, 1.0f);
        } else {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int iD = this.d.d();
        f fVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                f fVarE = this.d.e(i2);
                if ((zArr == null || !zArr[fVarE.e]) && fVarE != fVar && (((i = fVarE.E) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.a;
        if (fVar2 != null) {
            this.d.g(fVar2, -1.0f);
            this.a.i = -1;
            this.a = null;
        }
        float fH = this.d.h(fVar, true) * (-1.0f);
        this.a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        a aVar = this.d;
        int i = aVar.h;
        for (int i2 = 0; i != -1 && i2 < aVar.a; i2++) {
            float[] fArr = aVar.g;
            fArr[i] = fArr[i] / fH;
            i = aVar.f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z) {
        if (fVar.y) {
            float fC = this.d.c(fVar);
            this.b = (fVar.w * fC) + this.b;
            this.d.h(fVar, z);
            if (z) {
                fVar.b(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                cVar.a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z) {
        a aVar = this.d;
        aVar.getClass();
        float fC = aVar.c(bVar.a);
        aVar.h(bVar.a, z);
        a aVar2 = bVar.d;
        int iD = aVar2.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = aVar2.e(i);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z);
        }
        this.b = (bVar.b * fC) + this.b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        cVar.a = true;
    }

    public String toString() {
        boolean z;
        String strH = com.gamericefishpro.space.m5.a.h(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != 0.0f) {
            strH = strH + this.b;
            z = true;
        } else {
            z = false;
        }
        int iD = this.d.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = this.d.e(i);
            if (fVarE != null) {
                float f = this.d.f(i);
                if (f != 0.0f) {
                    String string = fVarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strH = com.gamericefishpro.space.m5.a.h(strH, " + ");
                        } else {
                            strH = com.gamericefishpro.space.m5.a.h(strH, " - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strH = com.gamericefishpro.space.m5.a.h(strH, "- ");
                        f *= -1.0f;
                    }
                    strH = f == 1.0f ? com.gamericefishpro.space.m5.a.h(strH, string) : strH + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? com.gamericefishpro.space.m5.a.h(strH, "0.0") : strH;
    }
}
