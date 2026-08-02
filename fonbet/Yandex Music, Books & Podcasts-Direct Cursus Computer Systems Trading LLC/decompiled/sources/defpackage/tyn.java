package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tyn implements fqa, hak, gpd, yr2, cbf {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final czg c;
    public final ds2 d;
    public final String e;
    public final boolean f;
    public final yic g;
    public final yic h;
    public final z6t i;
    public bc6 j;

    public tyn(czg czgVar, ds2 ds2Var, kon konVar) {
        this.c = czgVar;
        this.d = ds2Var;
        this.e = konVar.b;
        this.f = konVar.d;
        yic a = konVar.c.a();
        this.g = a;
        ds2Var.e(a);
        a.a(this);
        yic a2 = ((hk0) konVar.e).a();
        this.h = a2;
        ds2Var.e(a2);
        a2.a(this);
        mk0 mk0Var = (mk0) konVar.f;
        mk0Var.getClass();
        z6t z6tVar = new z6t(mk0Var);
        this.i = z6tVar;
        z6tVar.a(ds2Var);
        z6tVar.b(this);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            lb6 lb6Var = (lb6) this.j.i.get(i2);
            if (lb6Var instanceof cbf) {
                y5i.g(abfVar, i, arrayList, abfVar2, (cbf) lb6Var);
            }
        }
    }

    @Override // defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.gpd
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((lb6) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new bc6(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        if (this.i.c(szgVar, obj)) {
            return;
        }
        if (obj == lzg.s) {
            this.g.j(szgVar);
        } else if (obj == lzg.t) {
            this.h.j(szgVar);
        }
    }

    @Override // defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        z6t z6tVar = this.i;
        float floatValue3 = ((Float) z6tVar.v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) z6tVar.w.e()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(z6tVar.f(f + floatValue2));
            this.j.g(canvas, matrix2, (int) (y5i.f(floatValue3, floatValue4, f / floatValue) * i), qraVar);
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix f = this.i.f(i + floatValue2);
            Matrix matrix = this.a;
            matrix.set(f);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
