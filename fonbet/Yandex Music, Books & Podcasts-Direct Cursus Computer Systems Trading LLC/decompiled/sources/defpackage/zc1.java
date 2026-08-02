package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class zc1 extends xmm {
    public final rmb d;
    public final bd1 e;
    public final jyr f;
    public final tun g;
    public final xdr h;

    public zc1(s63 s63Var, rmb rmbVar, bd1 bd1Var, jyr jyrVar) {
        bd1Var.getClass();
        this.d = rmbVar;
        this.e = bd1Var;
        this.f = jyrVar;
        this.g = (tun) s63Var.a;
        this.h = ydr.a(new cd1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof dd1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        yc1 yc1Var;
        int i;
        rj6 rj6Var;
        Object dd1Var;
        if (cg6Var instanceof yc1) {
            yc1Var = (yc1) cg6Var;
            int i2 = yc1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yc1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = yc1Var.j;
                nm6 nm6Var = nm6.a;
                i = yc1Var.l;
                tun tunVar = this.g;
                xdr xdrVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        cd1 cd1Var = new cd1(true);
                        xdrVar.getClass();
                        xdrVar.m(null, cd1Var);
                    }
                    yc1Var.l = 1;
                    obj = this.e.a(tunVar, z, yc1Var);
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
                        cd1 cd1Var2 = new cd1(false);
                        xdrVar.getClass();
                        xdrVar.m(null, cd1Var2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(tunVar);
                }
                nc1 nc1Var = (nc1) ((qj6) rj6Var).a;
                m7g m7gVar = nc1Var.a;
                ((xc1) this.f.getValue()).getClass();
                String str = m7gVar.a;
                String str2 = m7gVar.b;
                if (str2 == null) {
                    dd1Var = new cd1(false);
                } else {
                    String str3 = m7gVar.c;
                    String str4 = m7gVar.d;
                    dd1Var = new dd1(str, str2, str3, str4 != null ? new jcv(str4, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : "");
                }
                xdrVar.getClass();
                xdrVar.m(null, dd1Var);
                p43 p43Var = nc1Var.b;
                this.d.g(1, p43Var != null ? p43Var.a : null);
                return new d73(tunVar);
            }
        }
        yc1Var = new yc1(this, cg6Var);
        Object obj2 = yc1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = yc1Var.l;
        tun tunVar2 = this.g;
        xdr xdrVar2 = this.h;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
