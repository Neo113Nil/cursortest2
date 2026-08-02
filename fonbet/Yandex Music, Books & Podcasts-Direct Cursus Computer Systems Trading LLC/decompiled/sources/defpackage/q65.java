package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q65 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ u65 b;

    public /* synthetic */ q65(u65 u65Var, int i) {
        this.a = i;
        this.b = u65Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                xdr xdrVar = this.b.p;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 1:
                List list = (List) obj;
                xdr xdrVar2 = this.b.o;
                xdrVar2.m(null, l65.a((l65) xdrVar2.getValue(), !list.isEmpty() ? new d5u(list) : e5u.a, null, 2));
                break;
            default:
                List list2 = (List) obj;
                xdr xdrVar3 = this.b.o;
                xdrVar3.m(null, l65.a((l65) xdrVar3.getValue(), null, !list2.isEmpty() ? new d5u(list2) : e5u.a, 1));
                break;
        }
        return Unit.a;
    }
}
