package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class k23 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pt0 s;
    public final /* synthetic */ qv3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k23(pt0 pt0Var, qv3 qv3Var, int i) {
        super(0);
        this.r = i;
        this.s = pt0Var;
        this.t = qv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                qv3 qv3Var = this.t;
                this.s.onSuccess(new tv3(new fg3(qv3Var.a, qv3Var.b)));
                break;
            case 1:
                qv3 qv3Var2 = this.t;
                this.s.onSuccess(new tv3(new fg3(qv3Var2.a, qv3Var2.b)));
                break;
            default:
                qv3 qv3Var3 = this.t;
                this.s.onSuccess(new tv3(new fg3(qv3Var3.a, qv3Var3.b)));
                break;
        }
        return Unit.a;
    }
}
