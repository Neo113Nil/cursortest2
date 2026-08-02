package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gup implements hak, yr2, cbf {
    public final String b;
    public final boolean c;
    public final czg d;
    public final oup e;
    public boolean f;
    public final Path a = new Path();
    public final ls5 g = new ls5(0);

    public gup(czg czgVar, ds2 ds2Var, yup yupVar) {
        this.b = yupVar.a;
        this.c = yupVar.d;
        this.d = czgVar;
        oup oupVar = new oup(yupVar.c.b);
        this.e = oupVar;
        ds2Var.e(oupVar);
        oupVar.a(this);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            lb6 lb6Var = (lb6) arrayList2.get(i);
            if (lb6Var instanceof sat) {
                sat satVar = (sat) lb6Var;
                if (satVar.c == 1) {
                    this.g.a.add(satVar);
                    satVar.c(this);
                    i++;
                }
            }
            if (lb6Var instanceof xgo) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                xgo xgoVar = (xgo) lb6Var;
                xgoVar.b.a(this);
                arrayList.add(xgoVar);
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
        if (obj == lzg.N) {
            this.e.j(szgVar);
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        boolean z = this.f;
        oup oupVar = this.e;
        Path path = this.a;
        if (z && oupVar.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) oupVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(path);
        this.f = true;
        return path;
    }
}
