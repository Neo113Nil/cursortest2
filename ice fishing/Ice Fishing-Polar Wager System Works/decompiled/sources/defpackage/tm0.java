package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tm0 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.qn0 xiZrDbcSW0;

    public /* synthetic */ tm0(defpackage.qn0 qn0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = qn0Var;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i;
        int i2 = this.adDC3e2L;
        defpackage.qn0 qn0Var = this.xiZrDbcSW0;
        switch (i2) {
            case 0:
                defpackage.p7 p7Var = qn0Var.xiZrDbcSW0;
                boolean z = false;
                if (qn0Var.AARZUJiTa) {
                    defpackage.l6 l6Var = qn0Var.oh6vYeIP.xiZrDbcSW0;
                    if (l6Var == null || !l6Var.isEmpty()) {
                        java.util.Iterator it = l6Var.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((defpackage.nm0) it.next()).xiZrDbcSW0 instanceof defpackage.kn0) && (i = i + 1) < 0) {
                                defpackage.fm.lpprD5VAS();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                p7Var.F7NU4MC0GW(z);
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                android.content.Context context = qn0Var.IHQe1A4L2xu;
                defpackage.po0 po0Var = qn0Var.oh6vYeIP.EgCjBq0SZwJ;
                context.getClass();
                po0Var.getClass();
                return new defpackage.ao0();
        }
    }
}
