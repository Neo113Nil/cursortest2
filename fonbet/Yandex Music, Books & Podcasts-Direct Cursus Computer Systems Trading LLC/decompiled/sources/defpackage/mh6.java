package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class mh6 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh6 b;

    public /* synthetic */ mh6(oh6 oh6Var, int i) {
        this.a = i;
        this.b = oh6Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                xh6 xh6Var = (xh6) obj;
                c8l o = oh6.o(xh6Var);
                oh6 oh6Var = this.b;
                xdr xdrVar = oh6Var.s;
                if (o != null) {
                    oh6Var.r.l(xh6Var);
                    lh6 lh6Var = (lh6) xdrVar.getValue();
                    if (lh6Var instanceof kh6) {
                        kh6 kh6Var = (kh6) lh6Var;
                        kh6 kh6Var2 = new kh6(kh6Var.a, kh6Var.b, o);
                        xdrVar.getClass();
                        xdrVar.m(null, kh6Var2);
                    }
                    break;
                } else {
                    break;
                }
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar2 = this.b.t;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                break;
            case 2:
                this.b.u.l((cdj) obj);
                break;
            default:
                this.b.v.a((Function1) obj);
                break;
        }
        return Unit.a;
    }
}
