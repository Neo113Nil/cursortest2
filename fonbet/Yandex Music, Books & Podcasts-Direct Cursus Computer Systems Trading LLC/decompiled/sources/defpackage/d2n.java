package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d2n implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ j2n c;

    public /* synthetic */ d2n(pjc pjcVar, j2n j2nVar, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = j2nVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new c2n(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new x1n(rjcVar, this.c), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new c2n(rjcVar, this.c, 1), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
