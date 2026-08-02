package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class pjb extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qne s;
    public final /* synthetic */ w60 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pjb(qne qneVar, w60 w60Var, int i) {
        super(1);
        this.r = i;
        this.s = qneVar;
        this.t = w60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.A((vtm) this.t.invoke()).y();
                break;
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                this.s.k(r7wVar.getMessage(), (vtm) this.t.invoke()).y();
                break;
        }
        return Unit.a;
    }
}
