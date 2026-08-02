package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yf1 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc4 b;

    public /* synthetic */ yf1(tc4 tc4Var, int i) {
        this.a = i;
        this.b = tc4Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new dm(rjcVar, 18), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new k4q(rjcVar, 20), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
