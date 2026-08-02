package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ebc implements fqa, yr2, cbf {
    public final Path a;
    public final pif b;
    public final ds2 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final s85 g;
    public final s85 h;
    public rwt i;
    public final czg j;
    public cs2 k;
    public float l;

    public ebc(czg czgVar, ds2 ds2Var, kup kupVar) {
        Path path = new Path();
        this.a = path;
        this.b = new pif(1, 0);
        this.f = new ArrayList();
        this.c = ds2Var;
        String str = kupVar.c;
        gk0 gk0Var = kupVar.e;
        gk0 gk0Var2 = kupVar.d;
        this.d = str;
        this.e = kupVar.f;
        this.j = czgVar;
        if (ds2Var.k() != null) {
            yic a = ((hk0) ds2Var.k().b).a();
            this.k = a;
            a.a(this);
            ds2Var.e(this.k);
        }
        if (gk0Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(kupVar.b);
        cs2 a2 = gk0Var2.a();
        this.g = (s85) a2;
        a2.a(this);
        ds2Var.e(a2);
        cs2 a3 = gk0Var.a();
        this.h = (s85) a3;
        a3.a(this);
        ds2Var.e(a3);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            lb6 lb6Var = (lb6) list2.get(i);
            if (lb6Var instanceof hak) {
                this.f.add((hak) lb6Var);
            }
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
    }

    @Override // defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
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

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        PointF pointF = lzg.a;
        if (obj == 1) {
            this.g.j(szgVar);
            return;
        }
        if (obj == 4) {
            this.h.j(szgVar);
            return;
        }
        ColorFilter colorFilter = lzg.I;
        ds2 ds2Var = this.c;
        if (obj == colorFilter) {
            rwt rwtVar = this.i;
            if (rwtVar != null) {
                ds2Var.n(rwtVar);
            }
            if (szgVar == null) {
                this.i = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.i = rwtVar2;
            rwtVar2.a(this);
            ds2Var.e(this.i);
            return;
        }
        if (obj == lzg.e) {
            cs2 cs2Var = this.k;
            if (cs2Var != null) {
                cs2Var.j(szgVar);
                return;
            }
            rwt rwtVar3 = new rwt(szgVar, null);
            this.k = rwtVar3;
            rwtVar3.a(this);
            ds2Var.e(this.k);
        }
    }

    @Override // defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        s85 s85Var = this.g;
        float intValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int c = (y5i.c((int) (i * intValue)) << 24) | (s85Var.l(s85Var.c.e(), s85Var.c()) & 16777215);
        pif pifVar = this.b;
        pifVar.setColor(c);
        rwt rwtVar = this.i;
        if (rwtVar != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar.e());
        }
        cs2 cs2Var = this.k;
        if (cs2Var != null) {
            float floatValue = ((Float) cs2Var.e()).floatValue();
            if (floatValue == 0.0f) {
                pifVar.setMaskFilter(null);
            } else if (floatValue != this.l) {
                ds2 ds2Var = this.c;
                if (ds2Var.A == floatValue) {
                    blurMaskFilter = ds2Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    ds2Var.B = blurMaskFilter2;
                    ds2Var.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                pifVar.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        if (qraVar != null) {
            qraVar.a((int) (intValue * 255.0f), pifVar);
        } else {
            pifVar.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, pifVar);
                return;
            } else {
                path.addPath(((hak) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.d;
    }
}
