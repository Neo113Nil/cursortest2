package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hw1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw1 b;

    public /* synthetic */ hw1(iw1 iw1Var, int i) {
        this.a = i;
        this.b = iw1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        xdr xdrVar;
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                this.b.g();
                break;
            default:
                ((Number) obj).floatValue();
                iw1 iw1Var = this.b;
                nej nejVar = iw1Var.g;
                if (nejVar == null || (xdrVar = nejVar.a) == null || !((Boolean) xdrVar.getValue()).booleanValue()) {
                    iw1Var.g();
                }
                break;
        }
        return Unit.a;
    }
}
