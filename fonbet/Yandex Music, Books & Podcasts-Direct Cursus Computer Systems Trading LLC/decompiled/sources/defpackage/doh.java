package defpackage;

/* loaded from: classes3.dex */
public final class doh extends zc4 {
    public final v29 n;
    public final o19 o;
    public final tz9 p;
    public final efb q;
    public final tx8 r;

    public doh(v29 v29Var, o19 o19Var, tz9 tz9Var, efb efbVar, tx8 tx8Var) {
        this.n = v29Var;
        this.o = o19Var;
        this.p = tz9Var;
        this.q = efbVar;
        this.r = tx8Var;
    }

    @Override // defpackage.zc4
    public final void f0(v19 v19Var) {
        e23 bindingContext = v19Var.getBindingContext();
        if (bindingContext == null) {
            return;
        }
        gc8 gc8Var = bindingContext.a;
        fb8 div = v19Var.getDiv();
        if (div != null) {
            i19 i19Var = div.c;
            dw8 dataTag = gc8Var.getDataTag();
            dfb a = this.q.a(gc8Var.getDivData(), dataTag);
            o19 o19Var = this.o;
            o19Var.getClass();
            o19Var.G(v19Var, gc8Var, bindingContext.b, i19Var, a);
            this.r.c(i19Var);
        }
    }

    @Override // defpackage.zc4
    public final void g0(i39 i39Var) {
        hb8 div;
        e23 bindingContext = i39Var.getBindingContext();
        if (bindingContext == null || (div = i39Var.getDiv()) == null) {
            return;
        }
        i29 i29Var = div.c;
        gc8 gc8Var = bindingContext.a;
        this.n.J(i39Var, bindingContext, i29Var, this.q.a(gc8Var.getDivData(), gc8Var.getDataTag()));
        this.r.c(i29Var);
    }

    @Override // defpackage.zc4
    public final void j0(l0a l0aVar) {
        sb8 div;
        e23 bindingContext = l0aVar.getBindingContext();
        if (bindingContext == null || (div = l0aVar.getDiv()) == null) {
            return;
        }
        pz9 pz9Var = div.c;
        pm9 path = l0aVar.getPath();
        if (path == null) {
            return;
        }
        this.p.K(l0aVar, bindingContext, pz9Var, path);
        this.r.c(pz9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zc4
    public final void x(f29 f29Var) {
        jc8 div;
        if (f29Var.getBindingContext() == null || (div = f29Var.getDiv()) == null) {
            return;
        }
        this.r.c(div.d());
    }
}
