package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yj1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk1 b;

    public /* synthetic */ yj1(bk1 bk1Var, int i) {
        this.a = i;
        this.b = bk1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                bk1 bk1Var = this.b;
                xdr xdrVar = bk1Var.l;
                bpq bpqVar = new bpq((List) obj, bk1Var.o.f());
                xdrVar.getClass();
                xdrVar.m(null, bpqVar);
                return Unit.a;
            default:
                nj1 nj1Var = (nj1) obj;
                if (nj1Var != null) {
                    this.b.H(nj1Var.a);
                    return Unit.a;
                }
                b6e.s();
                return null;
        }
    }
}
