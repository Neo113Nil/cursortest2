package defpackage;

/* loaded from: classes.dex */
public final class z0 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.a1 AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(defpackage.a1 a1Var, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = a1Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.a1 a1Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                android.view.View view = a1Var.EXtogiMhuM;
                return java.lang.Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (android.view.accessibility.AccessibilityEvent) obj));
            default:
                defpackage.k51 k51Var = (defpackage.k51) obj;
                if (k51Var.xiZrDbcSW0.contains(k51Var)) {
                    defpackage.ws0 snapshotObserver = a1Var.EXtogiMhuM.getSnapshotObserver();
                    snapshotObserver.IHQe1A4L2xu.oh6vYeIP(k51Var, a1Var.TFRaUu83X3E, new defpackage.o0(1, k51Var, a1Var));
                }
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }
}
