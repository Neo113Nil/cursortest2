package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class we0 extends v50 {
    public final ThreadLocal P7K7Inc8;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public we0(g9 g9Var, l9 l9Var) {
        super(g9Var, l9Var.OnDfzHZD(r0) == null ? l9Var.eVhOlqcC(r0) : l9Var);
        x30 x30Var = x30.wxUZMvaN;
        this.P7K7Inc8 = new ThreadLocal();
        if (g9Var.wxUZMvaN().OnDfzHZD(re.MdtA4re8) instanceof n9) {
            return;
        }
        Object gmkaJpmS = w30.gmkaJpmS(l9Var, null);
        w30.FXJmAAN1(l9Var, gmkaJpmS);
        LfKQckgD(l9Var, gmkaJpmS);
    }

    public final void LfKQckgD(l9 l9Var, Object obj) {
        this.threadLocalIsSet = true;
        this.P7K7Inc8.set(new hx(l9Var, obj));
    }

    @Override // defpackage.v50, defpackage.vn
    public final void OxcuoDLp(Object obj) {
        if (this.threadLocalIsSet) {
            hx hxVar = (hx) this.P7K7Inc8.get();
            if (hxVar != null) {
                w30.FXJmAAN1((l9) hxVar.NCTxEWno, hxVar.MdtA4re8);
            }
            this.P7K7Inc8.remove();
        }
        Object pRiPUEwG = le0.pRiPUEwG(obj);
        g9 g9Var = this.VgvYg0wo;
        l9 wxUZMvaN = g9Var.wxUZMvaN();
        Object gmkaJpmS = w30.gmkaJpmS(wxUZMvaN, null);
        we0 TrssYQ34 = gmkaJpmS != w30.eVhOlqcC ? w30.TrssYQ34(g9Var, wxUZMvaN, gmkaJpmS) : null;
        try {
            this.VgvYg0wo.P7K7Inc8(pRiPUEwG);
            if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                w30.FXJmAAN1(wxUZMvaN, gmkaJpmS);
            }
        } catch (Throwable th) {
            if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                w30.FXJmAAN1(wxUZMvaN, gmkaJpmS);
            }
            throw th;
        }
    }

    public final boolean VGmz0ccI() {
        boolean z = this.threadLocalIsSet && this.P7K7Inc8.get() == null;
        this.P7K7Inc8.remove();
        return !z;
    }
}
