package defpackage;

/* loaded from: classes.dex */
public final class n2 implements defpackage.p20 {
    public static boolean xiZrDbcSW0 = true;
    public boolean F7NU4MC0GW;
    public final defpackage.v0 IHQe1A4L2xu;
    public final defpackage.l2 adDC3e2L;
    public final java.lang.Object oh6vYeIP = new java.lang.Object();
    public defpackage.um1 r1MBDhnF;

    public n2(defpackage.v0 v0Var) {
        this.IHQe1A4L2xu = v0Var;
        defpackage.l2 l2Var = new defpackage.l2();
        this.adDC3e2L = l2Var;
        if (v0Var.isAttachedToWindow()) {
            android.content.Context context = v0Var.getContext();
            if (!this.F7NU4MC0GW) {
                context.getApplicationContext().registerComponentCallbacks(l2Var);
                this.F7NU4MC0GW = true;
            }
        }
        v0Var.addOnAttachStateChangeListener(new defpackage.m2(0, this));
    }

    @Override // defpackage.p20
    public final void IHQe1A4L2xu(defpackage.q20 q20Var) {
        synchronized (this.oh6vYeIP) {
            if (!q20Var.EgCjBq0SZwJ) {
                q20Var.EgCjBq0SZwJ = true;
                q20Var.oh6vYeIP();
            }
        }
    }

    @Override // defpackage.p20
    public final defpackage.q20 oh6vYeIP() {
        defpackage.s20 z20Var;
        defpackage.s20 s20Var;
        defpackage.q20 q20Var;
        synchronized (this.oh6vYeIP) {
            try {
                defpackage.v0 v0Var = this.IHQe1A4L2xu;
                int i = android.os.Build.VERSION.SDK_INT;
                if (i >= 29) {
                    v0Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    s20Var = new defpackage.x20();
                } else {
                    if (xiZrDbcSW0) {
                        try {
                            z20Var = new defpackage.v20(this.IHQe1A4L2xu, new defpackage.kb(), new defpackage.jb());
                        } catch (java.lang.Throwable unused) {
                            xiZrDbcSW0 = false;
                            z20Var = new defpackage.z20(r1MBDhnF(this.IHQe1A4L2xu));
                        }
                    } else {
                        z20Var = new defpackage.z20(r1MBDhnF(this.IHQe1A4L2xu));
                    }
                    s20Var = z20Var;
                }
                q20Var = new defpackage.q20(s20Var);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return q20Var;
    }

    public final defpackage.ur r1MBDhnF(defpackage.v0 v0Var) {
        defpackage.um1 um1Var = this.r1MBDhnF;
        if (um1Var != null) {
            return um1Var;
        }
        defpackage.um1 um1Var2 = new defpackage.um1(v0Var.getContext());
        um1Var2.setClipChildren(false);
        um1Var2.setClipToPadding(false);
        um1Var2.setTag(com.combinations.spin.balbi.R.id.hide_graphics_layer_in_inspector_tag, java.lang.Boolean.TRUE);
        v0Var.addView(um1Var2, -1);
        this.r1MBDhnF = um1Var2;
        return um1Var2;
    }
}
