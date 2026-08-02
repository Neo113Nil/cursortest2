package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class pu4 {
    public final xbc a;
    public final ru4 b;
    public final ju4 c;
    public final rmb d;
    public final xdr e;
    public final xdr f;
    public final xdr g;

    public pu4(xbc xbcVar, ru4 ru4Var, ju4 ju4Var, rmb rmbVar) {
        xbcVar.getClass();
        ru4Var.getClass();
        ju4Var.getClass();
        rmbVar.getClass();
        this.a = xbcVar;
        this.b = ru4Var;
        this.c = ju4Var;
        this.d = rmbVar;
        this.e = ru4Var.l;
        this.f = ru4Var.m;
        this.g = ru4Var.o;
    }

    public final void a(qab qabVar, spd spdVar, boolean z, String str) {
        thj thjVar;
        int i = spdVar.b;
        int i2 = spdVar.a;
        str.getClass();
        if (qabVar instanceof oab) {
            thjVar = c3x.w(lxe.B(((oab) qabVar).a), i2, i);
        } else {
            if (!(qabVar instanceof pab)) {
                b6e.s();
                return;
            }
            pkb pkbVar = pkb.UpcomingAlbum;
            String str2 = ((pab) qabVar).a.b;
            str2.getClass();
            thjVar = new thj(pkbVar, str2, i2 + 1, i + 1, "");
        }
        ru4 ru4Var = this.b;
        tu4 tu4Var = (tu4) ru4Var.s.getValue();
        List list = (List) ru4Var.o.getValue();
        tu4Var.getClass();
        weo.H(this.d, thjVar, z, str, bg3.o(tu4.a(list)));
    }
}
