package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mw1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm6 b;
    public final /* synthetic */ n4c c;

    public /* synthetic */ mw1(mm6 mm6Var, n4c n4cVar, int i) {
        this.a = i;
        this.b = mm6Var;
        this.c = n4cVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                if (gld.T(this.b)) {
                    this.c.l(floatValue, h4c.QUEUE_LAUNCHER);
                }
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                if (gld.T(this.b)) {
                    this.c.l(floatValue2, h4c.QUEUE_LAUNCHER);
                }
                break;
        }
        return Unit.a;
    }
}
