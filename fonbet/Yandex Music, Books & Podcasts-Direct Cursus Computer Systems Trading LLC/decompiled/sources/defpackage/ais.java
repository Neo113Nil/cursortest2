package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ais implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ bis b;

    public /* synthetic */ ais(bis bisVar, int i) {
        this.a = i;
        this.b = bisVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        rhs rhsVar;
        n7q n7qVar;
        Object value2;
        rhs rhsVar2;
        boolean z;
        switch (this.a) {
            case 0:
                d6l x = p6g.x((e6l) obj);
                mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
                if (b != null) {
                    xdr xdrVar = this.b.d;
                    do {
                        value = xdrVar.getValue();
                        rhsVar = (rhs) value;
                    } while (!xdrVar.k(value, ((Boolean) dag.p(b, aaw.d)).booleanValue() ? rhs.a(rhsVar, 0L, true, false, false, 13) : rhs.a(rhsVar, 0L, false, false, false, 9)));
                }
                break;
            default:
                mjs mjsVar = (mjs) obj;
                bis bisVar = this.b;
                xdr xdrVar2 = bisVar.d;
                do {
                    value2 = xdrVar2.getValue();
                    rhsVar2 = (rhs) value2;
                    z = mjsVar instanceof kjs;
                } while (!xdrVar2.k(value2, rhs.a(rhsVar2, z ? ((kjs) mjsVar).b() : rhsVar2.d ? bisVar.a : rhsVar2.a, false, mjsVar instanceof ijs, z, 2)));
        }
        return Unit.a;
    }
}
