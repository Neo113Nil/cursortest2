package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class m01 extends xmm {
    public final u51 d;
    public final rmb e;
    public final q01 f;
    public final ozw g;
    public final d01 h;
    public final xdr i;

    public m01(s63 s63Var, u51 u51Var, rmb rmbVar, q01 q01Var, ozw ozwVar) {
        u51Var.getClass();
        q01Var.getClass();
        this.d = u51Var;
        this.e = rmbVar;
        this.f = q01Var;
        this.g = ozwVar;
        this.h = (d01) s63Var.a;
        this.i = ydr.a(new r01(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.h;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.i.getValue() instanceof s01;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        l01 l01Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof l01) {
            l01Var = (l01) cg6Var;
            int i2 = l01Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l01Var.l = i2 - Integer.MIN_VALUE;
                Object obj = l01Var.j;
                nm6 nm6Var = nm6.a;
                i = l01Var.l;
                d01 d01Var = this.h;
                xdr xdrVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        r01 r01Var = new r01(true);
                        xdrVar.getClass();
                        xdrVar.m(null, r01Var);
                    }
                    String str = this.d.a;
                    l01Var.l = 1;
                    obj = this.f.b(d01Var, z, l01Var);
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
                        r01 r01Var2 = new r01(false);
                        xdrVar.getClass();
                        xdrVar.m(null, r01Var2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(d01Var);
                }
                e01 e01Var = (e01) ((qj6) rj6Var).a;
                e01Var.getClass();
                String str2 = ((d01) this.g.b).d;
                String str3 = e01Var.b;
                if (str3 == null || StringsKt.U(str3)) {
                    str3 = null;
                }
                s01 s01Var = new s01(str2, str3, e01Var.c, e01Var.a);
                xdrVar.getClass();
                xdrVar.m(null, s01Var);
                p43 p43Var = e01Var.d;
                this.e.g(1, p43Var != null ? p43Var.a : null);
                return new d73(d01Var);
            }
        }
        l01Var = new l01(this, cg6Var);
        Object obj2 = l01Var.j;
        nm6 nm6Var2 = nm6.a;
        i = l01Var.l;
        d01 d01Var2 = this.h;
        xdr xdrVar2 = this.i;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
