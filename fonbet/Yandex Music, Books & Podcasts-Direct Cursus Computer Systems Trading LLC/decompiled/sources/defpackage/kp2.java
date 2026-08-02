package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class kp2 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4s b;

    public /* synthetic */ kp2(y4s y4sVar, int i) {
        this.a = i;
        this.b = y4sVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g62(rjcVar, 14), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new k4q(rjcVar, 16), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new k4q(rjcVar, 18), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new brw(rjcVar, 3), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect5 = this.b.collect(new brw(rjcVar, 4), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
