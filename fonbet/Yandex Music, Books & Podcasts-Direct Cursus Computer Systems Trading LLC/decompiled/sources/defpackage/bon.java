package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bon implements yr2, cbf, hak {
    public final String c;
    public final boolean d;
    public final czg e;
    public final cs2 f;
    public final cs2 g;
    public final yic h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final ls5 i = new ls5(0);
    public cs2 j = null;

    public bon(czg czgVar, ds2 ds2Var, kon konVar) {
        this.c = konVar.b;
        this.d = konVar.d;
        this.e = czgVar;
        cs2 a = konVar.e.a();
        this.f = a;
        cs2 a2 = ((ok0) konVar.f).a();
        this.g = a2;
        yic a3 = konVar.c.a();
        this.h = a3;
        ds2Var.e(a);
        ds2Var.e(a2);
        ds2Var.e(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            lb6 lb6Var = (lb6) arrayList.get(i);
            if (lb6Var instanceof sat) {
                sat satVar = (sat) lb6Var;
                if (satVar.c == 1) {
                    this.i.a.add(satVar);
                    satVar.c(this);
                    i++;
                }
            }
            if (lb6Var instanceof xgo) {
                this.j = ((xgo) lb6Var).b;
            }
            i++;
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
    }

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        if (obj == lzg.g) {
            this.g.j(szgVar);
        } else if (obj == lzg.i) {
            this.f.j(szgVar);
        } else if (obj == lzg.h) {
            this.h.j(szgVar);
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        float f;
        cs2 cs2Var;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        yic yicVar = this.h;
        float l = yicVar == null ? 0.0f : yicVar.l();
        if (l == 0.0f && (cs2Var = this.j) != null) {
            l = Math.min(((Float) cs2Var.e()).floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (l > min) {
            l = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + l);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - l);
        RectF rectF = this.b;
        if (l > 0.0f) {
            float f4 = pointF2.x + f2;
            float f5 = l * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + l, pointF2.y + f3);
        if (l > 0.0f) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = l * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + l);
        if (l > 0.0f) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = l * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - l, pointF2.y - f3);
        if (l > 0.0f) {
            float f13 = pointF2.x + f2;
            float f14 = l * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.b(path);
        this.k = true;
        return path;
    }
}
