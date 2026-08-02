package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class b22 extends bnc {
    public final r12 d;
    public final w12 e;
    public final c22 f;
    public final rmb g;
    public final xdr h;
    public final xdr i;
    public final fkn j;
    public boolean k;

    public b22(r12 r12Var, w12 w12Var, c22 c22Var, rmb rmbVar) {
        r12Var.getClass();
        w12Var.getClass();
        c22Var.getClass();
        this.d = r12Var;
        this.e = w12Var;
        this.f = c22Var;
        this.g = rmbVar;
        this.h = ydr.a(null);
        xdr a = ydr.a(Boolean.TRUE);
        this.i = a;
        this.j = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        mm6Var.getClass();
        return new u21(10, new bca(this.h, 18), zsd.b0(new ez(((a72) this.e.a.getValue()).a(), 14)), new a22(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(cg6 cg6Var) {
        z12 z12Var;
        int i;
        if (cg6Var instanceof z12) {
            z12Var = (z12) cg6Var;
            int i2 = z12Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z12Var.l = i2 - Integer.MIN_VALUE;
                Object obj = z12Var.j;
                Object obj2 = nm6.a;
                i = z12Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    z12Var.l = 1;
                    f22 f22Var = (f22) this.f;
                    Object a = lmm.a(((dc7) f22Var.a).c(f22Var.b.c().a, "downloaded_flags"), new e22(2, null), z12Var);
                    if (a != obj2) {
                        a = Unit.a;
                    }
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Boolean bool = Boolean.TRUE;
                xdr xdrVar = this.i;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            }
        }
        z12Var = new z12(this, cg6Var);
        Object obj3 = z12Var.j;
        Object obj22 = nm6.a;
        i = z12Var.l;
        if (i != 0) {
        }
        Boolean bool2 = Boolean.TRUE;
        xdr xdrVar2 = this.i;
        xdrVar2.getClass();
        xdrVar2.m(null, bool2);
        return Unit.a;
    }
}
