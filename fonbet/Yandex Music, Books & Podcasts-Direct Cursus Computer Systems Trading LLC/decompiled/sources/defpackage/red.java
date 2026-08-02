package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class red implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub7 b;

    public /* synthetic */ red(ub7 ub7Var, int i) {
        this.a = i;
        this.b = ub7Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new orc(rjcVar, 14), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new orc(rjcVar, 15), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
