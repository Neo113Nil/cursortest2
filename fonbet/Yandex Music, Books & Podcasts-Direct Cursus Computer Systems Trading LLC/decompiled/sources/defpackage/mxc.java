package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mxc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz7 b;

    public /* synthetic */ mxc(iz7 iz7Var, int i) {
        this.a = i;
        this.b = iz7Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                iz7 iz7Var = this.b;
                g06 g06Var = (g06) iz7Var.g;
                kxc kxcVar = new kxc(iz7Var, 1);
                Object obj2 = g06Var.d;
                if (obj2 != null) {
                    kxcVar.invoke(obj2);
                }
                break;
            default:
                iz7.d(this.b, (cvl) obj);
                break;
        }
        return Unit.a;
    }
}
