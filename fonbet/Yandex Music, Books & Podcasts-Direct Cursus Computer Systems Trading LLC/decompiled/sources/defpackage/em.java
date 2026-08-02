package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class em implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ em(u21 u21Var, int i) {
        this.a = i;
        this.b = u21Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new dm(rjcVar, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new g62(rjcVar, 0), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new l34(rjcVar, 5), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new pja(rjcVar, 13), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new roh(rjcVar, 10), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new roh(rjcVar, 18), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new x1n(rjcVar, 1), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = this.b.collect(new k4q(rjcVar, 17), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = this.b.collect(new zzs(rjcVar, 22), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect10 = this.b.collect(new sdw(rjcVar, 4), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
