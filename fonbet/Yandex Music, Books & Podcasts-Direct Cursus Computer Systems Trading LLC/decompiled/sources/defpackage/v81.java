package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class v81 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub7 b;

    public /* synthetic */ v81(ub7 ub7Var, int i) {
        this.a = i;
        this.b = ub7Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new dm(rjcVar, 16), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new dm(rjcVar, 19), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new g62(rjcVar, 8), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new a56(rjcVar, 1), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new fgf(rjcVar, 29), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new j7l(rjcVar, 12), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new oov(rjcVar, 14), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = this.b.collect(new oov(rjcVar, 15), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = this.b.collect(new sdw(rjcVar, 18), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 9:
                Object collect10 = this.b.collect(new sdw(rjcVar, 19), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            case 10:
                Object collect11 = this.b.collect(new sdw(rjcVar, 21), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect12 = this.b.collect(new sdw(rjcVar, 22), continuation);
                if (collect12 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
