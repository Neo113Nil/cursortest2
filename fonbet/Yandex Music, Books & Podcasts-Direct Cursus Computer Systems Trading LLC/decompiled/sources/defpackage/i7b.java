package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class i7b implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1l b;

    public /* synthetic */ i7b(a1l a1lVar, int i) {
        this.a = i;
        this.b = a1lVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new pja(rjcVar, 12), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new fgf(rjcVar, 27), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new j7l(rjcVar, 0), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new uql(rjcVar, 0), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new uql(rjcVar, 2), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect6 = this.b.collect(new zzs(rjcVar, 16), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
