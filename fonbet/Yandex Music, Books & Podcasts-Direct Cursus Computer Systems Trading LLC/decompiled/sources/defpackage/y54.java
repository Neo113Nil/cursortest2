package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class y54 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g64 b;

    public /* synthetic */ y54(g64 g64Var, int i) {
        this.a = i;
        this.b = g64Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.h.l((h74) obj);
                break;
            case 1:
                this.b.j.l((a74) obj);
                break;
            default:
                this.b.i.l((u64) obj);
                break;
        }
        return Unit.a;
    }
}
