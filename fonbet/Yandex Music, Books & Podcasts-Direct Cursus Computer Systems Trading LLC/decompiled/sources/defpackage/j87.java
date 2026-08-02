package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j87 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ j87(fs fsVar, int i) {
        this.a = i;
        this.b = fsVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new a56(rjcVar, 6), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new a56(rjcVar, 7), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
