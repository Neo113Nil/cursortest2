package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o61 extends xmm {
    public final rmb d;
    public final q61 e;
    public final f61 f;
    public final xdr g;

    public o61(s63 s63Var, rmb rmbVar, q61 q61Var) {
        q61Var.getClass();
        this.d = rmbVar;
        this.e = q61Var;
        this.f = (f61) s63Var.a;
        this.g = ydr.a(new r61(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.f;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.g.getValue() instanceof s61;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        n61 n61Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof n61) {
            n61Var = (n61) cg6Var;
            int i2 = n61Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n61Var.l = i2 - Integer.MIN_VALUE;
                Object obj = n61Var.j;
                nm6 nm6Var = nm6.a;
                i = n61Var.l;
                xdr xdrVar = this.g;
                f61 f61Var = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        r61 r61Var = new r61(true);
                        xdrVar.getClass();
                        xdrVar.m(null, r61Var);
                    }
                    n61Var.l = 1;
                    obj = this.e.a(f61Var, z, n61Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        r61 r61Var2 = new r61(false);
                        xdrVar.getClass();
                        xdrVar.m(null, r61Var2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(f61Var);
                }
                g61 g61Var = (g61) ((qj6) rj6Var).a;
                g61Var.getClass();
                ArrayList arrayList = g61Var.a;
                Object r61Var3 = arrayList.isEmpty() ? new r61(false) : new s61(arrayList);
                if (r61Var3 instanceof r61) {
                    if (!n()) {
                        r61 r61Var4 = new r61(false);
                        xdrVar.getClass();
                        xdrVar.m(null, r61Var4);
                    }
                } else {
                    if (!(r61Var3 instanceof s61)) {
                        b6e.s();
                        return null;
                    }
                    p43 p43Var = g61Var.b;
                    this.d.g(1, p43Var != null ? p43Var.a : null);
                    xdrVar.getClass();
                    xdrVar.m(null, r61Var3);
                }
                return new d73(f61Var);
            }
        }
        n61Var = new n61(this, cg6Var);
        Object obj2 = n61Var.j;
        nm6 nm6Var2 = nm6.a;
        i = n61Var.l;
        xdr xdrVar2 = this.g;
        f61 f61Var2 = this.f;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
