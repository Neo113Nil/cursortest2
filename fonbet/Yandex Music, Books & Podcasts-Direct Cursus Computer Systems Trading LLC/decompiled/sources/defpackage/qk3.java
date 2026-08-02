package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qk3 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ eno b;

    public /* synthetic */ qk3(eno enoVar, int i) {
        this.a = i;
        this.b = enoVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new g62(rjcVar, 25), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new g62(rjcVar, 26), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new pja(rjcVar, 18), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new pja(rjcVar, 20), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new pja(rjcVar, 23), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new roh(rjcVar, 3), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new bgj(rjcVar, 26), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = this.b.collect(new x1n(rjcVar, 26), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = this.b.collect(new o0o(rjcVar, 27), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 9:
                Object collect10 = this.b.collect(new k4q(rjcVar, 19), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect11 = this.b.collect(new sdw(rjcVar, 24), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
