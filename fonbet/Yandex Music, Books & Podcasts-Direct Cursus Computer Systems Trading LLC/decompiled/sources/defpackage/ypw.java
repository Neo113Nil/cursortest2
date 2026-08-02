package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ypw implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpw b;

    public /* synthetic */ ypw(vpw vpwVar, int i) {
        this.a = i;
        this.b = vpwVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new sdw(rjcVar, 26), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new sdw(rjcVar, 28), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
