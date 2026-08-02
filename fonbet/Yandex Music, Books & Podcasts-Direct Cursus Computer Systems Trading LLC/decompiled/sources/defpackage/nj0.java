package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class nj0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ oj0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj0(oj0 oj0Var, int i) {
        super(0);
        this.r = i;
        this.s = oj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wzj snapshotObserver;
        switch (this.r) {
            case 0:
                this.s.getLayoutNode().B();
                break;
            default:
                oj0 oj0Var = this.s;
                if (oj0Var.e && oj0Var.isAttachedToWindow() && oj0Var.getView().getParent() == oj0Var) {
                    snapshotObserver = oj0Var.getSnapshotObserver();
                    snapshotObserver.a(oj0Var, d5.I, oj0Var.getUpdate());
                }
                break;
        }
        return Unit.a;
    }
}
