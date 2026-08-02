package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i2h implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk3 b;

    public /* synthetic */ i2h(yk3 yk3Var, int i) {
        this.a = i;
        this.b = yk3Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((xdr) this.b.e).l((o3h) obj);
                break;
            default:
                this.b.a = false;
                break;
        }
        return Unit.a;
    }
}
