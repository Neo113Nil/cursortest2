package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public final class z6t {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public cs2 l;
    public cs2 m;
    public cs2 n;
    public cs2 o;
    public cs2 p;
    public yic q;
    public yic r;
    public yic s;
    public yic t;
    public yic u;
    public cs2 v;
    public cs2 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public z6t(mk0 mk0Var) {
        ik0 ik0Var = mk0Var.a;
        this.l = ik0Var == null ? null : ik0Var.a();
        ok0 ok0Var = mk0Var.b;
        this.m = ok0Var == null ? null : ok0Var.a();
        gk0 gk0Var = mk0Var.c;
        this.n = gk0Var == null ? null : gk0Var.a();
        hk0 hk0Var = mk0Var.d;
        this.o = hk0Var == null ? null : hk0Var.a();
        hk0 hk0Var2 = mk0Var.f;
        this.q = hk0Var2 == null ? null : hk0Var2.a();
        this.x = mk0Var.m;
        hk0 hk0Var3 = mk0Var.h;
        this.s = hk0Var3 == null ? null : hk0Var3.a();
        hk0 hk0Var4 = mk0Var.i;
        this.t = hk0Var4 == null ? null : hk0Var4.a();
        hk0 hk0Var5 = mk0Var.j;
        this.u = hk0Var5 == null ? null : hk0Var5.a();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        hk0 hk0Var6 = mk0Var.g;
        this.r = hk0Var6 == null ? null : hk0Var6.a();
        gk0 gk0Var2 = mk0Var.e;
        if (gk0Var2 != null) {
            this.p = gk0Var2.a();
        }
        hk0 hk0Var7 = mk0Var.k;
        if (hk0Var7 != null) {
            this.v = hk0Var7.a();
        } else {
            this.v = null;
        }
        hk0 hk0Var8 = mk0Var.l;
        if (hk0Var8 != null) {
            this.w = hk0Var8.a();
        } else {
            this.w = null;
        }
    }

    public final void a(ds2 ds2Var) {
        ds2Var.e(this.p);
        ds2Var.e(this.v);
        ds2Var.e(this.w);
        ds2Var.e(this.l);
        ds2Var.e(this.m);
        ds2Var.e(this.n);
        ds2Var.e(this.o);
        ds2Var.e(this.q);
        ds2Var.e(this.r);
        ds2Var.e(this.s);
        ds2Var.e(this.t);
        ds2Var.e(this.u);
    }

    public final void b(yr2 yr2Var) {
        cs2 cs2Var = this.p;
        if (cs2Var != null) {
            cs2Var.a(yr2Var);
        }
        cs2 cs2Var2 = this.v;
        if (cs2Var2 != null) {
            cs2Var2.a(yr2Var);
        }
        cs2 cs2Var3 = this.w;
        if (cs2Var3 != null) {
            cs2Var3.a(yr2Var);
        }
        cs2 cs2Var4 = this.l;
        if (cs2Var4 != null) {
            cs2Var4.a(yr2Var);
        }
        cs2 cs2Var5 = this.m;
        if (cs2Var5 != null) {
            cs2Var5.a(yr2Var);
        }
        cs2 cs2Var6 = this.n;
        if (cs2Var6 != null) {
            cs2Var6.a(yr2Var);
        }
        cs2 cs2Var7 = this.o;
        if (cs2Var7 != null) {
            cs2Var7.a(yr2Var);
        }
        yic yicVar = this.q;
        if (yicVar != null) {
            yicVar.a(yr2Var);
        }
        yic yicVar2 = this.r;
        if (yicVar2 != null) {
            yicVar2.a(yr2Var);
        }
        yic yicVar3 = this.s;
        if (yicVar3 != null) {
            yicVar3.a(yr2Var);
            this.s.a(new y6t(0, this));
        }
        yic yicVar4 = this.t;
        if (yicVar4 != null) {
            yicVar4.a(yr2Var);
            this.t.a(new y6t(1, this));
        }
        yic yicVar5 = this.u;
        if (yicVar5 != null) {
            yicVar5.a(yr2Var);
            this.u.a(new y6t(2, this));
        }
    }

    public final boolean c(szg szgVar, Object obj) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (obj == lzg.a) {
            cs2 cs2Var = this.l;
            if (cs2Var == null) {
                this.l = new rwt(szgVar, new PointF());
                return true;
            }
            cs2Var.j(szgVar);
            return true;
        }
        if (obj == lzg.b) {
            cs2 cs2Var2 = this.m;
            if (cs2Var2 == null) {
                this.m = new rwt(szgVar, new PointF());
                return true;
            }
            cs2Var2.j(szgVar);
            return true;
        }
        if (obj == lzg.c) {
            cs2 cs2Var3 = this.m;
            if (cs2Var3 instanceof n8r) {
                n8r n8rVar = (n8r) cs2Var3;
                szg szgVar2 = n8rVar.m;
                n8rVar.m = szgVar;
                return true;
            }
        }
        if (obj == lzg.d) {
            cs2 cs2Var4 = this.m;
            if (cs2Var4 instanceof n8r) {
                n8r n8rVar2 = (n8r) cs2Var4;
                szg szgVar3 = n8rVar2.n;
                n8rVar2.n = szgVar;
                return true;
            }
        }
        if (obj == lzg.j) {
            cs2 cs2Var5 = this.n;
            if (cs2Var5 == null) {
                this.n = new rwt(szgVar, new tso());
                return true;
            }
            cs2Var5.j(szgVar);
            return true;
        }
        if (obj == lzg.k) {
            cs2 cs2Var6 = this.o;
            if (cs2Var6 == null) {
                this.o = new rwt(szgVar, valueOf2);
                return true;
            }
            cs2Var6.j(szgVar);
            return true;
        }
        if (obj == 3) {
            cs2 cs2Var7 = this.p;
            if (cs2Var7 == null) {
                this.p = new rwt(szgVar, 100);
                return true;
            }
            cs2Var7.j(szgVar);
            return true;
        }
        if (obj == lzg.A) {
            cs2 cs2Var8 = this.v;
            if (cs2Var8 == null) {
                this.v = new rwt(szgVar, valueOf);
                return true;
            }
            cs2Var8.j(szgVar);
            return true;
        }
        if (obj == lzg.B) {
            cs2 cs2Var9 = this.w;
            if (cs2Var9 == null) {
                this.w = new rwt(szgVar, valueOf);
                return true;
            }
            cs2Var9.j(szgVar);
            return true;
        }
        if (obj == lzg.o) {
            if (this.q == null) {
                this.q = new yic(Collections.singletonList(new acf(valueOf2)));
            }
            this.q.j(szgVar);
            return true;
        }
        if (obj == lzg.p) {
            if (this.r == null) {
                this.r = new yic(Collections.singletonList(new acf(valueOf2)));
            }
            this.r.j(szgVar);
            return true;
        }
        if (obj == lzg.l) {
            if (this.s == null) {
                this.s = new yic(Collections.singletonList(new acf(valueOf2)));
            }
            this.s.j(szgVar);
            return true;
        }
        if (obj == lzg.m) {
            if (this.t == null) {
                this.t = new yic(Collections.singletonList(new acf(valueOf2)));
            }
            this.t.j(szgVar);
            return true;
        }
        if (obj != lzg.n) {
            return false;
        }
        if (this.u == null) {
            this.u = new yic(Collections.singletonList(new acf(valueOf2)));
        }
        this.u.j(szgVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        yic yicVar;
        yic yicVar2;
        PointF pointF;
        tso tsoVar;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        yic yicVar3 = this.s;
        if ((yicVar3 == null || yicVar3.l() == 0.0f) && (((yicVar = this.t) == null || yicVar.l() == 0.0f) && ((yicVar2 = this.u) == null || yicVar2.l() == 0.0f))) {
            cs2 cs2Var = this.m;
            if (cs2Var != null && (pointF2 = (PointF) cs2Var.e()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                cs2 cs2Var2 = this.o;
                if (cs2Var2 != null) {
                    float floatValue = cs2Var2 instanceof rwt ? ((Float) cs2Var2.e()).floatValue() : ((yic) cs2Var2).l();
                    if (floatValue != 0.0f) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (cs2Var != null) {
                float f2 = cs2Var.d;
                PointF pointF3 = (PointF) cs2Var.e();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                cs2Var.i(1.0E-4f + f2);
                PointF pointF4 = (PointF) cs2Var.e();
                cs2Var.i(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            if (this.q != null) {
                float cos = this.r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float sin = this.r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f5 = -sin;
                fArr[3] = f5;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f5;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            cs2 cs2Var3 = this.n;
            if (cs2Var3 != null && (tsoVar = (tso) cs2Var3.e()) != null) {
                float f6 = tsoVar.a;
                if (f6 != 1.0f || tsoVar.b != 1.0f) {
                    matrix.preScale(f6, tsoVar.b);
                }
            }
            cs2 cs2Var4 = this.l;
            if (cs2Var4 != null && (pointF = (PointF) cs2Var4.e()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            yic yicVar4 = this.s;
            float l = yicVar4 != null ? yicVar4.l() : 0.0f;
            yic yicVar5 = this.t;
            float l2 = yicVar5 != null ? yicVar5.l() : 0.0f;
            yic yicVar6 = this.u;
            float l3 = yicVar6 != null ? yicVar6.l() : 0.0f;
            if (this.k || l != this.f || l2 != this.g || l3 != this.h) {
                this.f = l;
                this.g = l2;
                this.h = l3;
                if (l != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(l));
                } else {
                    this.i = 1.0f;
                }
                if (l2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(l2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            cs2 cs2Var5 = this.l;
            PointF pointF5 = cs2Var5 == null ? null : (PointF) cs2Var5.e();
            cs2 cs2Var6 = this.m;
            PointF pointF6 = cs2Var6 == null ? null : (PointF) cs2Var6.e();
            cs2 cs2Var7 = this.n;
            tso tsoVar2 = cs2Var7 != null ? (tso) cs2Var7.e() : null;
            float f8 = tsoVar2 != null ? tsoVar2.a : 1.0f;
            float f9 = tsoVar2 != null ? tsoVar2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (l3 != 0.0f) {
                matrix.preRotate(l3);
            }
            if (l2 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (l != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        cs2 cs2Var = this.m;
        PointF pointF = cs2Var == null ? null : (PointF) cs2Var.e();
        cs2 cs2Var2 = this.n;
        tso tsoVar = cs2Var2 == null ? null : (tso) cs2Var2.e();
        cs2 cs2Var3 = this.l;
        PointF pointF2 = cs2Var3 != null ? (PointF) cs2Var3.e() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        yic yicVar = this.s;
        float l = yicVar != null ? yicVar.l() * f : 0.0f;
        yic yicVar2 = this.t;
        float l2 = yicVar2 != null ? yicVar2.l() * f : 0.0f;
        yic yicVar3 = this.u;
        float l3 = yicVar3 != null ? yicVar3.l() * f : 0.0f;
        if (l == 0.0f && l2 == 0.0f && l3 == 0.0f) {
            cs2 cs2Var4 = this.o;
            if (cs2Var4 != null) {
                matrix.preRotate(((Float) cs2Var4.e()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float cos = l != 0.0f ? (float) Math.cos(Math.toRadians(l)) : 1.0f;
            float cos2 = l2 != 0.0f ? (float) Math.cos(Math.toRadians(l2)) : 1.0f;
            if (l3 != 0.0f) {
                matrix.preRotate(l3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (l2 != 0.0f) {
                matrix.preScale(cos2, 1.0f);
            }
            if (l != 0.0f) {
                matrix.preScale(1.0f, cos);
            }
        }
        if (tsoVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(tsoVar.a, d), (float) Math.pow(tsoVar.b, d));
        }
        return matrix;
    }
}
