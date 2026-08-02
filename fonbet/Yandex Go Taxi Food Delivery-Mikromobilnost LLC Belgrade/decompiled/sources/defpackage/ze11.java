package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ze11 extends i7 {
    public final u4x a;
    public ywl d;
    public j6x e;
    public boolean g;
    public n530 h;
    public final zjr b = new zjr(xfz.b(ze11.class.getSimpleName()));
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedList f = new LinkedList();

    public ze11(k6x k6xVar, u4x u4xVar) {
        this.a = u4xVar;
        this.e = k6xVar.c(new zvl(1, this));
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void dispose() {
        j6x j6xVar = this.e;
        if (j6xVar != null) {
            j6xVar.x();
        }
        this.e = null;
        oay0 oay0Var = new oay0(7, this);
        if (this.g) {
            this.f.add(oay0Var);
        } else {
            this.g = true;
            oay0Var.invoke();
            this.g = false;
        }
        this.d = null;
    }

    public final void e(ywl ywlVar) {
        this.d = ywlVar;
        af11 af11Var = (af11) ywlVar.c.b(qoi0.a(af11.class));
        Map map = af11Var != null ? af11Var.a : null;
        oay0 oay0Var = new oay0(7, this);
        if (this.g) {
            this.f.add(oay0Var);
        } else {
            this.g = true;
            oay0Var.invoke();
            this.g = false;
        }
        if (map != null) {
            this.c.putAll(map);
        }
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, ywl ywlVar) {
        this.h = l1oVar.a;
        e(ywlVar);
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
        this.h = l1oVar.a;
        e(ywlVar);
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        this.h = l1oVar.a;
    }
}
