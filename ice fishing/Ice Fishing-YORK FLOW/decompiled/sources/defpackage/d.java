package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.u oh71FJcDz6S2;

    public /* synthetic */ d(defpackage.u uVar, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WDYagTQQm9ns;
        defpackage.u uVar = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.p7 p7Var = uVar.h3m55N1URyyK;
                android.os.Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!p7Var.isEmpty()) {
                    try {
                        ((defpackage.n10) p7Var.removeLast()).ZpBGe2uQfcn8();
                    } finally {
                        android.os.Trace.endSection();
                    }
                }
                return;
            case 1:
                uVar.SJaTq1YjP6B8 = false;
                android.view.MotionEvent motionEvent = uVar.TlJvUa0ZXCBu;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    uVar.KrtOTfE6jiS2(motionEvent);
                    return;
                } else {
                    defpackage.h7.P05cfTpS5W5L("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                defpackage.u.gUjdnLbkVAaA(uVar.getRoot());
                return;
            default:
                defpackage.u.gUjdnLbkVAaA(uVar.getRoot());
                return;
        }
    }
}
