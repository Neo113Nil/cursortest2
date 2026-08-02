package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mb3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ob3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb3(ob3 ob3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ob3Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mb3(this.l, continuation, 0);
            case 1:
                return new mb3(this.l, continuation, 1);
            default:
                return new mb3(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mb3) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.y;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar.emit(unit, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                ob3 ob3Var = this.l;
                ie5 ie5Var = ob3Var.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = ie5Var.e(this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                txr txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        break;
                    } else {
                        ie5Var.f();
                    }
                } else {
                    x97.y(ot0.F(ob3Var), null, null, new mb3(ob3Var, null, 2), 3);
                }
                break;
            default:
                ob3 ob3Var2 = this.l;
                ie5 ie5Var2 = ob3Var2.m;
                xdr xdrVar = ob3Var2.I;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    this.k = 1;
                    obj = ob3.G(ob3Var2, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                cb3 cb3Var = (cb3) obj;
                if (Intrinsics.d(cb3Var, wa3.a)) {
                    ie5Var2.f();
                } else {
                    ob3Var2.C.l(cb3Var);
                    ie5Var2.c();
                }
                Boolean bool2 = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool2);
                break;
        }
        return Unit.a;
    }
}
