package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class xo2 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc4 b;

    public /* synthetic */ xo2(yc4 yc4Var, int i) {
        this.a = i;
        this.b = yc4Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g62(rjcVar, 13), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new l34(rjcVar, 3), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new orc(rjcVar, 9), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new bgj(rjcVar, 7), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new x1n(rjcVar, 3), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new o0o(rjcVar, 15), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new k4q(rjcVar, 5), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = this.b.collect(new oov(rjcVar, 1), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = this.b.collect(new sdw(rjcVar, 11), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect10 = this.b.collect(new sdw(rjcVar, 20), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
