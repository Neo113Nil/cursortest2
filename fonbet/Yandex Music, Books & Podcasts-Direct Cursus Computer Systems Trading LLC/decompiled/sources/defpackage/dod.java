package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dod implements fqa, yr2, cbf {
    public final String a;
    public final boolean b;
    public final ds2 c;
    public final ovg d = new ovg((Object) null);
    public final ovg e = new ovg((Object) null);
    public final Path f;
    public final pif g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final bod k;
    public final s85 l;
    public final bod m;
    public final bod n;
    public rwt o;
    public rwt p;
    public final czg q;
    public final int r;
    public cs2 s;
    public float t;

    public dod(czg czgVar, ayg aygVar, ds2 ds2Var, cod codVar) {
        Path path = new Path();
        this.f = path;
        this.g = new pif(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = ds2Var;
        this.a = codVar.g;
        this.b = codVar.h;
        this.q = czgVar;
        this.j = codVar.a;
        path.setFillType(codVar.b);
        this.r = (int) (aygVar.b() / 32.0f);
        cs2 a = codVar.c.a();
        this.k = (bod) a;
        a.a(this);
        ds2Var.e(a);
        cs2 a2 = codVar.d.a();
        this.l = (s85) a2;
        a2.a(this);
        ds2Var.e(a2);
        cs2 a3 = codVar.e.a();
        this.m = (bod) a3;
        a3.a(this);
        ds2Var.e(a3);
        cs2 a4 = codVar.f.a();
        this.n = (bod) a4;
        a4.a(this);
        ds2Var.e(a4);
        if (ds2Var.k() != null) {
            yic a5 = ((hk0) ds2Var.k().b).a();
            this.s = a5;
            a5.a(this);
            ds2Var.e(this.s);
        }
    }

    @Override // defpackage.yr2
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            lb6 lb6Var = (lb6) list2.get(i);
            if (lb6Var instanceof hak) {
                this.i.add((hak) lb6Var);
            }
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
    }

    @Override // defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((hak) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        rwt rwtVar = this.p;
        if (rwtVar != null) {
            Integer[] numArr = (Integer[]) rwtVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        PointF pointF = lzg.a;
        if (obj == 4) {
            this.l.j(szgVar);
            return;
        }
        ColorFilter colorFilter = lzg.I;
        ds2 ds2Var = this.c;
        if (obj == colorFilter) {
            rwt rwtVar = this.o;
            if (rwtVar != null) {
                ds2Var.n(rwtVar);
            }
            if (szgVar == null) {
                this.o = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.o = rwtVar2;
            rwtVar2.a(this);
            ds2Var.e(this.o);
            return;
        }
        if (obj != lzg.J) {
            if (obj == lzg.e) {
                cs2 cs2Var = this.s;
                if (cs2Var != null) {
                    cs2Var.j(szgVar);
                    return;
                }
                rwt rwtVar3 = new rwt(szgVar, null);
                this.s = rwtVar3;
                rwtVar3.a(this);
                ds2Var.e(this.s);
                return;
            }
            return;
        }
        rwt rwtVar4 = this.p;
        if (rwtVar4 != null) {
            ds2Var.n(rwtVar4);
        }
        if (szgVar == null) {
            this.p = null;
            return;
        }
        this.d.b();
        this.e.b();
        rwt rwtVar5 = new rwt(szgVar, null);
        this.p = rwtVar5;
        rwtVar5.a(this);
        ds2Var.e(this.p);
    }

    @Override // defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((hak) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        bod bodVar = this.k;
        bod bodVar2 = this.n;
        bod bodVar3 = this.m;
        if (i3 == 1) {
            long h = h();
            ovg ovgVar = this.d;
            shader = (LinearGradient) ovgVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) bodVar3.e();
                PointF pointF2 = (PointF) bodVar2.e();
                aod aodVar = (aod) bodVar.e();
                int[] e = e(aodVar.b);
                float[] fArr2 = aodVar.a;
                if (e.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{e[0], e[0]};
                } else {
                    iArr2 = e;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                ovgVar.f(h, shader);
            }
        } else {
            long h2 = h();
            ovg ovgVar2 = this.e;
            RadialGradient radialGradient = (RadialGradient) ovgVar2.c(h2);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) bodVar3.e();
                PointF pointF4 = (PointF) bodVar2.e();
                aod aodVar2 = (aod) bodVar.e();
                int[] e2 = e(aodVar2.b);
                float[] fArr3 = aodVar2.a;
                if (e2.length < 2) {
                    iArr = new int[]{e2[0], e2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = e2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, iArr, fArr, Shader.TileMode.CLAMP);
                ovgVar2.f(h2, radialGradient2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        pif pifVar = this.g;
        pifVar.setShader(shader);
        rwt rwtVar = this.o;
        if (rwtVar != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar.e());
        }
        cs2 cs2Var = this.s;
        if (cs2Var != null) {
            float floatValue = ((Float) cs2Var.e()).floatValue();
            if (floatValue == 0.0f) {
                pifVar.setMaskFilter(null);
            } else if (floatValue != this.t) {
                pifVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        float intValue = ((Integer) this.l.e()).intValue() / 100.0f;
        pifVar.setAlpha(y5i.c((int) (i * intValue)));
        if (qraVar != null) {
            qraVar.a((int) (intValue * 255.0f), pifVar);
        }
        canvas.drawPath(path, pifVar);
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.a;
    }

    public final int h() {
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
