package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class r88 extends qp7 {
    public final n88 d;
    public final rmb e;
    public final jyr f;
    public boolean g;
    public boolean h;
    public final xdr i;
    public final thj j;

    public r88(n88 n88Var, rmb rmbVar) {
        n88Var.getClass();
        this.d = n88Var;
        this.e = rmbVar;
        this.f = btf.b(wg.m);
        this.h = true;
        this.i = ydr.a(Boolean.valueOf(true ^ n88Var.c));
        pkb pkbVar = pkb.Shortcut;
        String str = n88Var.b;
        this.j = new thj(pkbVar, str == null ? "" : str, 0, 1, "");
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return this.g;
    }

    @Override // defpackage.qp7
    public final String n() {
        return "Collection:Skeleton:DislikesBlock";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        p88 p88Var;
        int i;
        if (cg6Var instanceof p88) {
            p88Var = (p88) cg6Var;
            int i2 = p88Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p88Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p88Var.j;
                Object obj2 = nm6.a;
                i = p88Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        p88Var.l = 1;
                        if (p(p88Var) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.g = true;
                rmb.h(this.e, 0, 2);
                return new d73(this.d);
            }
        }
        p88Var = new p88(this, cg6Var);
        Object obj3 = p88Var.j;
        Object obj22 = nm6.a;
        i = p88Var.l;
        if (i != 0) {
        }
        this.g = true;
        rmb.h(this.e, 0, 2);
        return new d73(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(cg6 cg6Var) {
        q88 q88Var;
        int i;
        xdr xdrVar;
        if (cg6Var instanceof q88) {
            q88Var = (q88) cg6Var;
            int i2 = q88Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q88Var.m = i2 - Integer.MIN_VALUE;
                Object obj = q88Var.k;
                nm6 nm6Var = nm6.a;
                i = q88Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t88 t88Var = (t88) this.f.getValue();
                    xdr xdrVar2 = this.i;
                    q88Var.j = xdrVar2;
                    q88Var.m = 1;
                    obj = t88Var.a(q88Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    xdrVar = xdrVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = q88Var.j;
                    qgg.h0(obj);
                }
                v3w.n(!((o98) obj).a, xdrVar, null);
                return Unit.a;
            }
        }
        q88Var = new q88(this, cg6Var);
        Object obj2 = q88Var.k;
        nm6 nm6Var2 = nm6.a;
        i = q88Var.m;
        if (i != 0) {
        }
        v3w.n(!((o98) obj2).a, xdrVar, null);
        return Unit.a;
    }
}
