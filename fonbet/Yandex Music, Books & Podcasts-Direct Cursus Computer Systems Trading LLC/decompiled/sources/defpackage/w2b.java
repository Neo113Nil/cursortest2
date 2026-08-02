package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w2b implements hak, yr2, cbf {
    public final String b;
    public final czg c;
    public final bod d;
    public final cs2 e;
    public final jl4 f;
    public boolean h;
    public final Path a = new Path();
    public final ls5 g = new ls5(0);

    public w2b(czg czgVar, ds2 ds2Var, jl4 jl4Var) {
        this.b = jl4Var.a;
        this.c = czgVar;
        cs2 a = jl4Var.c.a();
        this.d = (bod) a;
        cs2 a2 = jl4Var.b.a();
        this.e = a2;
        this.f = jl4Var;
        ds2Var.e(a);
        ds2Var.e(a2);
        a.a(this);
        a2.a(this);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a.add(satVar);
                    satVar.c(this);
                }
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
        if (obj == lzg.f) {
            this.d.j(szgVar);
        } else if (obj == lzg.i) {
            this.e.j(szgVar);
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        jl4 jl4Var = this.f;
        if (jl4Var.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (jl4Var.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.b(path);
        this.h = true;
        return path;
    }
}
