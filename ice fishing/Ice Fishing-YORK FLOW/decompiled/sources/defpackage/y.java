package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ defpackage.z QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(defpackage.z zVar, int i) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = zVar;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.z zVar = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                android.view.View view = zVar.P05cfTpS5W5L;
                return java.lang.Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (android.view.accessibility.AccessibilityEvent) obj));
            default:
                defpackage.z81 z81Var = (defpackage.z81) obj;
                if (z81Var.oh71FJcDz6S2.contains(z81Var)) {
                    defpackage.rv0 snapshotObserver = zVar.P05cfTpS5W5L.getSnapshotObserver();
                    snapshotObserver.ZpBGe2uQfcn8.JhCgjQRTAOCT(z81Var, zVar.OVwOqzUGHcCU, new defpackage.l(1, z81Var, zVar));
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }
}
