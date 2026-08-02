package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class pf5 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ mqs c;

    public /* synthetic */ pf5(Object obj, mqs mqsVar, int i) {
        this.a = i;
        this.b = (pjc) obj;
        this.c = mqsVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new ta3(rjcVar, this.c, 1), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new ta3(rjcVar, this.c, 2), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new ta3(rjcVar, this.c, 3), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new ta3(rjcVar, this.c, 4), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new ta3(rjcVar, this.c, 5), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new ta3(rjcVar, this.c, 6), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object collect7 = this.b.collect(new ta3(rjcVar, this.c, 7), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect8 = this.b.collect(new ta3(rjcVar, this.c, 8), continuation);
                if (collect8 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
