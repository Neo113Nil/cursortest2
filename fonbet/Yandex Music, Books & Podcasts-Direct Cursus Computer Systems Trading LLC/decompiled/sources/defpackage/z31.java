package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class z31 extends xmm {
    public final rmb d;
    public final j4x e;
    public final rw5 f;
    public final m31 g;
    public final xdr h = ydr.a(new v31(true));

    public z31(s63 s63Var, rmb rmbVar, j4x j4xVar, mvn mvnVar, rw5 rw5Var) {
        this.d = rmbVar;
        this.e = j4xVar;
        this.f = rw5Var;
        this.g = (m31) s63Var.a;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof w31;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        y31 y31Var;
        int i;
        Long a;
        rj6 rj6Var;
        if (cg6Var instanceof y31) {
            y31Var = (y31) cg6Var;
            int i2 = y31Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y31Var.l = i2 - Integer.MIN_VALUE;
                Object obj = y31Var.j;
                nm6 nm6Var = nm6.a;
                i = y31Var.l;
                xdr xdrVar = this.h;
                m31 m31Var = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        v31 v31Var = new v31(true);
                        xdrVar.getClass();
                        xdrVar.m(null, v31Var);
                    }
                    rw5 rw5Var = this.f;
                    String valueOf = (rw5Var == null || (a = rw5Var.a()) == null) ? null : String.valueOf(a.longValue());
                    y31Var.l = 1;
                    obj = this.e.j(m31Var, z, valueOf, y31Var);
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
                        v31 v31Var2 = new v31(false);
                        xdrVar.getClass();
                        xdrVar.m(null, v31Var2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(m31Var);
                }
                o31 o31Var = (o31) ((qj6) rj6Var).a;
                o31Var.getClass();
                ArrayList arrayList = o31Var.a;
                Object v31Var3 = arrayList.isEmpty() ? new v31(false) : new w31(arrayList);
                if (v31Var3 instanceof v31) {
                    if (!n()) {
                        v31 v31Var4 = new v31(false);
                        xdrVar.getClass();
                        xdrVar.m(null, v31Var4);
                    }
                } else {
                    if (!(v31Var3 instanceof w31)) {
                        b6e.s();
                        return null;
                    }
                    int size = o31Var.a.size();
                    p43 p43Var = o31Var.b;
                    this.d.g(size, p43Var != null ? p43Var.a : null);
                }
                xdrVar.getClass();
                xdrVar.m(null, v31Var3);
                return new d73(m31Var);
            }
        }
        y31Var = new y31(this, cg6Var);
        Object obj2 = y31Var.j;
        nm6 nm6Var2 = nm6.a;
        i = y31Var.l;
        xdr xdrVar2 = this.h;
        m31 m31Var2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
