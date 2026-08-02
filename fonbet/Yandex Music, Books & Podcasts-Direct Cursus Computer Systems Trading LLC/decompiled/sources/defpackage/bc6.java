package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class bc6 implements fqa, hak, yr2, bbf {
    public final j4x a;
    public final RectF b;
    public final dnj c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final czg j;
    public ArrayList k;
    public final z6t l;

    public bc6(czg czgVar, ds2 ds2Var, String str, boolean z, ArrayList arrayList, mk0 mk0Var) {
        this.a = new j4x(13);
        this.b = new RectF();
        this.c = new dnj();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = czgVar;
        this.h = z;
        this.i = arrayList;
        if (mk0Var != null) {
            z6t z6tVar = new z6t(mk0Var);
            this.l = z6tVar;
            z6tVar.a(ds2Var);
            z6tVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lb6 lb6Var = (lb6) arrayList.get(size);
            if (lb6Var instanceof gpd) {
                arrayList2.add((gpd) lb6Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((gpd) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.yr2
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            lb6 lb6Var = (lb6) arrayList.get(size2);
            lb6Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(lb6Var);
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        String str = this.g;
        if (!abfVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            abf abfVar3 = new abf(abfVar2);
            abfVar3.a.add(str);
            if (abfVar.a(i, str)) {
                abf abfVar4 = new abf(abfVar3);
                abfVar4.b = this;
                arrayList.add(abfVar4);
            }
            abfVar2 = abfVar3;
        }
        if (!abfVar.d(i, str)) {
            return;
        }
        int b = abfVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            lb6 lb6Var = (lb6) arrayList2.get(i2);
            if (lb6Var instanceof bbf) {
                ((bbf) lb6Var).c(abfVar, b, arrayList, abfVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        z6t z6tVar = this.l;
        if (z6tVar != null) {
            matrix2.preConcat(z6tVar.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lb6 lb6Var = (lb6) arrayList.get(size);
            if (lb6Var instanceof fqa) {
                ((fqa) lb6Var).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                lb6 lb6Var = (lb6) arrayList.get(i);
                if (lb6Var instanceof hak) {
                    this.k.add((hak) lb6Var);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        z6t z6tVar = this.l;
        if (z6tVar != null) {
            z6tVar.c(szgVar, obj);
        }
    }

    @Override // defpackage.fqa
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        z6t z6tVar = this.l;
        if (z6tVar != null) {
            matrix2.preConcat(z6tVar.e());
            i = (int) (((((z6tVar.p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        czg czgVar = this.j;
        boolean z = czgVar.s;
        int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
        boolean z2 = (z && h() && i != 255) || (qraVar != null && czgVar.t && h());
        if (!z2) {
            i2 = i;
        }
        dnj dnjVar = this.c;
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            j4x j4xVar = this.a;
            j4xVar.b = i;
            if (qraVar != null) {
                if (Color.alpha(qraVar.d) > 0) {
                    j4xVar.c = qraVar;
                } else {
                    j4xVar.c = null;
                }
                qraVar = null;
            } else {
                j4xVar.c = null;
            }
            canvas = dnjVar.e(canvas, rectF, j4xVar);
        } else if (qraVar != null) {
            qra qraVar2 = new qra(qraVar);
            qraVar2.b(i2);
            qraVar = qraVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof fqa) {
                ((fqa) obj).g(canvas, matrix2, i2, qraVar);
            }
        }
        if (z2) {
            dnjVar.c();
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        throw null;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        z6t z6tVar = this.l;
        if (z6tVar != null) {
            matrix.set(z6tVar.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                lb6 lb6Var = (lb6) arrayList.get(size);
                if (lb6Var instanceof hak) {
                    path.addPath(((hak) lb6Var).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof fqa) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bc6(czg czgVar, ds2 ds2Var, mup mupVar, ayg aygVar) {
        this(czgVar, ds2Var, r3, r4, r5, r11);
        mk0 mk0Var;
        String str = mupVar.a;
        boolean z = mupVar.c;
        List list = mupVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            lb6 a = ((tc6) list.get(i2)).a(czgVar, aygVar, ds2Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                mk0Var = null;
                break;
            }
            tc6 tc6Var = (tc6) list.get(i);
            if (tc6Var instanceof mk0) {
                mk0Var = (mk0) tc6Var;
                break;
            }
            i++;
        }
    }
}
