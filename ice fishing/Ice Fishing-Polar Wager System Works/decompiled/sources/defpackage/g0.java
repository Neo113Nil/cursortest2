package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements java.lang.Runnable {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.v0 xiZrDbcSW0;

    public /* synthetic */ g0(defpackage.v0 v0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.adDC3e2L;
        defpackage.v0 v0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.l6 l6Var = v0Var.DFo87pBq1E5;
                android.os.Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!l6Var.isEmpty()) {
                    try {
                        ((defpackage.vz) l6Var.removeLast()).IHQe1A4L2xu();
                    } finally {
                        android.os.Trace.endSection();
                    }
                }
                return;
            case 1:
                v0Var.fzubgBFo = false;
                android.view.MotionEvent motionEvent = v0Var.Ay906ovssqgN;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    v0Var.SiPhmbmu(motionEvent);
                    return;
                } else {
                    defpackage.db.AARZUJiTa("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.v0.SyNS6RMn(v0Var.getRoot());
                return;
            default:
                defpackage.v0.SyNS6RMn(v0Var.getRoot());
                return;
        }
    }
}
