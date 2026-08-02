package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ujq implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ za8 b;

    public /* synthetic */ ujq(za8 za8Var, int i) {
        this.a = i;
        this.b = za8Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new k4q(rjcVar, 4), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new zzs(rjcVar, 18), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
