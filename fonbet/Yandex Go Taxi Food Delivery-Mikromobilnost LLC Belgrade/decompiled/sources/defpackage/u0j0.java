package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class u0j0 implements ccm, vq90, q0u, e35, uix {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final LottieDrawable c;
    public final l35 d;
    public final String e;
    public final boolean f;
    public final kor g;
    public final kor h;
    public final iw01 i;
    public fge j;

    public u0j0(LottieDrawable lottieDrawable, l35 l35Var, t0j0 t0j0Var) {
        this.c = lottieDrawable;
        this.d = l35Var;
        this.e = (String) t0j0Var.e;
        this.f = t0j0Var.d;
        kor I = t0j0Var.b.I();
        this.g = I;
        l35Var.c(I);
        I.a(this);
        kor I2 = t0j0Var.c.I();
        this.h = I2;
        l35Var.c(I2);
        I2.a(this);
        ge2 ge2Var = (ge2) t0j0Var.f;
        ge2Var.getClass();
        iw01 iw01Var = new iw01(ge2Var);
        this.i = iw01Var;
        iw01Var.a(l35Var);
        iw01Var.b(this);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            uee ueeVar = (uee) this.j.i.get(i2);
            if (ueeVar instanceof uix) {
                ti20.g(sixVar, i, arrayList, sixVar2, (uix) ueeVar);
            }
        }
    }

    @Override // defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.j.b(rectF, matrix, z);
    }

    @Override // defpackage.q0u
    public final void c(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((uee) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new fge(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.e35
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        this.j.e(list, list2);
    }

    @Override // defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        iw01 iw01Var = this.i;
        float floatValue3 = ((Float) iw01Var.v.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) iw01Var.w.f()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(iw01Var.f(f + floatValue2));
            this.j.f(canvas, matrix2, (int) (ti20.f(floatValue3, floatValue4, f / floatValue) * i), aVar);
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        if (this.i.c(puzVar, obj)) {
            return;
        }
        if (obj == cuz.s) {
            this.g.k(puzVar);
        } else if (obj == cuz.t) {
            this.h.k(puzVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix f = this.i.f(i + floatValue2);
            Matrix matrix = this.a;
            matrix.set(f);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
