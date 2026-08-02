package defpackage;

/* loaded from: classes10.dex */
public final class wjp {
    public final rs2 a;
    public final cne0 b;

    public wjp(dne0 dne0Var, rs2 rs2Var) {
        this.a = rs2Var;
        this.b = dne0Var.b();
    }

    public final String a() {
        cne0 cne0Var = this.b;
        String l = cne0Var.l("gcm_registration_id", null);
        if (l == null || l.length() == 0) {
            jst.e.getClass();
            return null;
        }
        int i = cne0Var.i("appVersion", Integer.MIN_VALUE);
        this.a.getClass();
        if (i == 50128354) {
            return l;
        }
        jst.e.getClass();
        return null;
    }

    public final void b(String str) {
        this.a.getClass();
        unr0.C(new Object[]{50128354}, 1, "Saving regId on app version %d", jst.e);
        cne0 cne0Var = this.b;
        cne0Var.r("gcm_registration_id", str);
        cne0Var.p(50128354, "appVersion");
    }
}
