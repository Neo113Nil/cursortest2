package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xe0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ye0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe0(ye0 ye0Var, int i) {
        super(1);
        this.r = i;
        this.s = ye0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                View view = this.s.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                qwo qwoVar = (qwo) obj;
                if (qwoVar.b.contains(qwoVar)) {
                    ye0 ye0Var = this.s;
                    ye0Var.d.getSnapshotObserver().a(qwoVar, ye0Var.O, new ha0(5, qwoVar, ye0Var));
                }
                return Unit.a;
        }
    }
}
