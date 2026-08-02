package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class dep extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xep s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dep(xep xepVar, int i) {
        super(0);
        this.r = i;
        this.s = xepVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                enj enjVar = (enj) this.s.n.getValue();
                break;
            case 1:
                enj enjVar2 = (enj) this.s.o.getValue();
                break;
            case 2:
                xep xepVar = this.s;
                xepVar.n(true);
                xepVar.p.setValue(null);
                xepVar.q.setValue(null);
                break;
            default:
                this.s.i();
                break;
        }
        return Unit.a;
    }
}
