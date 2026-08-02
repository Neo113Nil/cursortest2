package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class w00 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e10 b;

    public /* synthetic */ w00(e10 e10Var, int i) {
        this.a = i;
        this.b = e10Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                m1g m1gVar = (m1g) obj;
                j1g j1gVar = m1gVar.a;
                int i = m1gVar.b;
                e10 e10Var = this.b;
                v3w.n(j1gVar == j1g.a, e10Var.z0, null);
                xdr xdrVar = e10Var.A0;
                Integer num = new Integer(i);
                xdrVar.getClass();
                xdrVar.m(null, num);
                break;
            default:
                Object emit = this.b.v0.emit((Function1) obj, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
