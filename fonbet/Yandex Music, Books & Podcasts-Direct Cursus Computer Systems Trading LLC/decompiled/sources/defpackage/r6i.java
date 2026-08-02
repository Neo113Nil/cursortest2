package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class r6i implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ j7i c;

    public /* synthetic */ r6i(pjc pjcVar, j7i j7iVar, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = j7iVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new q6i(rjcVar, this.c, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new q6i(rjcVar, this.c, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new q6i(rjcVar, this.c, 2), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
