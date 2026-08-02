package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d8n implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8n b;

    public /* synthetic */ d8n(g8n g8nVar, int i) {
        this.a = i;
        this.b = g8nVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                v7n v7nVar = (v7n) obj;
                v7nVar.getClass();
                if (v7nVar instanceof t7n) {
                    this.b.e.d(-1, -1, ((t7n) v7nVar).a);
                } else if (!v7nVar.equals(u7n.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                Object p = this.b.p((a8n) obj, continuation);
                return p == nm6.a ? p : Unit.a;
        }
    }
}
