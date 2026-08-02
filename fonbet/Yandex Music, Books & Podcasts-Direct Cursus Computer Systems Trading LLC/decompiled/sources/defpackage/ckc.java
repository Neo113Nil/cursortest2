package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ckc implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ ckc(u21 u21Var, int i) {
        this.a = i;
        this.b = u21Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new pja(rjcVar, 25), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new orc(rjcVar, 19), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
