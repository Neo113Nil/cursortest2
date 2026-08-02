package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class v60 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x60 s;
    public final /* synthetic */ qne t;
    public final /* synthetic */ w60 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v60(x60 x60Var, qne qneVar, w60 w60Var, int i) {
        super(1);
        this.r = i;
        this.s = x60Var;
        this.t = qneVar;
        this.u = w60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.a(this.t.A((vtm) this.u.invoke()));
                break;
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                this.s.a(this.t.k(r7wVar.getMessage(), (vtm) this.u.invoke()));
                break;
        }
        return Unit.a;
    }
}
