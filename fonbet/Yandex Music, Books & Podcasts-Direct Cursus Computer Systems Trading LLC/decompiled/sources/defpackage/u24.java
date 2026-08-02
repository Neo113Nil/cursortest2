package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u24 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ eno b;
    public final /* synthetic */ xqn c;

    public /* synthetic */ u24(eno enoVar, xqn xqnVar, int i) {
        this.a = i;
        this.b = enoVar;
        this.c = xqnVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new u3(rjcVar, this.c, 1), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new u3(rjcVar, this.c, 2), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
