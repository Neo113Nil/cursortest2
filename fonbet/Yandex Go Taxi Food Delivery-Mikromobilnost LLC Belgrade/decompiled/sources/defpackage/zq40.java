package defpackage;

/* loaded from: classes6.dex */
public final class zq40 implements pft0 {
    public final uq40 a;
    public final i130 b;
    public g18 c;

    public zq40(uq40 uq40Var, i130 i130Var) {
        this.a = uq40Var;
        this.b = i130Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        uq40 uq40Var = this.a;
        as21 as21Var = uq40Var.e;
        tit0 tit0Var = uq40Var.n;
        if (tit0Var.c() && ((tit0Var.k || as21Var.a("MULTIEXIT_AREA_PICKER_STATE", false)) && !((ir40) uq40Var.o.a.b()).b)) {
            if (tit0Var.k) {
                uq40Var.a.f(tit0Var.a(), tit0Var.f);
                uq40Var.z.g();
            }
            tit0Var.k = false;
            as21Var.e("MULTIEXIT_AREA_PICKER_STATE", false);
            mq40 mq40Var = tit0Var.d;
            jr40 jr40Var = tit0Var.n;
            wq40 wq40Var = tit0Var.o;
            if (jr40Var == null || wq40Var == null) {
                StringBuilder sb = new StringBuilder("We are in multiexit area but ");
                if (jr40Var == null) {
                    sb.append("lastSelectedTerminal==null ");
                }
                if (wq40Var == null) {
                    sb.append("lastSelectedEntrance==null ");
                }
                jst.e.k(new IllegalStateException("Can't show multiexit picker on resume"), sb.toString());
            } else {
                uq40Var.f(mq40Var, jr40Var, wq40Var);
            }
        }
        this.c = this.b.a().g(new ka00(1, this));
    }

    @Override // defpackage.pft0
    public final void onPause() {
        uq40 uq40Var = this.a;
        uq40Var.e.e("MULTIEXIT_AREA_PICKER_STATE", uq40Var.d());
        g18 g18Var = this.c;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.c = null;
    }
}
