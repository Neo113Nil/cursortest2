package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cla implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kvh b;

    public /* synthetic */ cla(kvh kvhVar, int i) {
        this.a = i;
        this.b = kvhVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new pja(rjcVar, 5), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new orc(rjcVar, 13), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new orc(rjcVar, 23), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new roh(rjcVar, 13), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new j7l(rjcVar, 9), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new uql(rjcVar, 5), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new x1n(rjcVar, 10), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            case 7:
                Object collect8 = this.b.collect(new k4q(rjcVar, 13), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
            case 8:
                Object collect9 = this.b.collect(new k4q(rjcVar, 29), continuation);
                if (collect9 != nm6.a) {
                    break;
                }
                break;
            case 9:
                Object collect10 = this.b.collect(new zzs(rjcVar, 9), continuation);
                if (collect10 != nm6.a) {
                    break;
                }
                break;
            case 10:
                Object collect11 = this.b.collect(new zzs(rjcVar, 14), continuation);
                if (collect11 != nm6.a) {
                    break;
                }
                break;
            case 11:
                Object collect12 = this.b.collect(new zzs(rjcVar, 21), continuation);
                if (collect12 != nm6.a) {
                    break;
                }
                break;
            case 12:
                Object collect13 = this.b.collect(new bnu(rjcVar, 4), continuation);
                if (collect13 != nm6.a) {
                    break;
                }
                break;
            case 13:
                Object collect14 = this.b.collect(new bnu(rjcVar, 7), continuation);
                if (collect14 != nm6.a) {
                    break;
                }
                break;
            case 14:
                Object collect15 = this.b.collect(new bnu(rjcVar, 16), continuation);
                if (collect15 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect16 = this.b.collect(new bnu(rjcVar, 23), continuation);
                if (collect16 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
