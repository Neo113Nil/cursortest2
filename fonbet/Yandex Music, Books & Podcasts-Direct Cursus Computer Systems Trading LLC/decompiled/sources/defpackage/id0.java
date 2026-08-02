package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class id0 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc4 b;

    public /* synthetic */ id0(tc4 tc4Var, int i) {
        this.a = i;
        this.b = tc4Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new dm(rjcVar, 8), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new dm(rjcVar, 9), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new k4q(rjcVar, 28), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
