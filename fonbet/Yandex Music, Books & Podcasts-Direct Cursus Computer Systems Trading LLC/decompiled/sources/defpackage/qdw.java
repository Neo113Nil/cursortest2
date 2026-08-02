package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class qdw implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ z78 b;

    public /* synthetic */ qdw(z78 z78Var, int i) {
        this.a = i;
        this.b = z78Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new oov(rjcVar, 29), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new sdw(rjcVar, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
