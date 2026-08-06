package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h extends h50 implements hv {
    public final /* synthetic */ i AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = iVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        i iVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                View view = iVar.encWxUiV2;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                yx0 yx0Var = (yx0) obj;
                if (yx0Var.EljAMC1QTz.contains(yx0Var)) {
                    in0 snapshotObserver = iVar.encWxUiV2.getSnapshotObserver();
                    snapshotObserver.GWasM1elztuh.X1lG3V04pd(yx0Var, iVar.z19UFEN2I, new psOJLYhIz(1, yx0Var, iVar));
                }
                return kc1.GWasM1elztuh;
        }
    }
}
