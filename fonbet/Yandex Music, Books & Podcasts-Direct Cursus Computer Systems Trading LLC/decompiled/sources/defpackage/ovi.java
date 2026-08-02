package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ovi extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rvi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovi(rvi rviVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = rviVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ovi(this.l, continuation, 0);
            case 1:
                return new ovi(this.l, continuation, 1);
            default:
                return new ovi(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ovi) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                Continuation continuation = null;
                rvi rviVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    jac jacVar = rviVar.p;
                    this.k = 1;
                    jacVar.getClass();
                    Object V = x97.V(dm6.b, new z11((Object) jacVar, false, continuation, 10), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                xdr xdrVar = rviVar.m;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 1:
                rvi rviVar2 = this.l;
                xdr xdrVar2 = rviVar2.m;
                jac jacVar2 = rviVar2.p;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                boolean z = true;
                Continuation continuation2 = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    jacVar2.getClass();
                    obj = x97.V(dm6.b, new m1i(jacVar2, null, 10), this);
                    if (obj == nm6Var) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                    break;
                }
                Boolean bool3 = (Boolean) obj;
                if (bool3 == null) {
                    this.k = 2;
                    jacVar2.getClass();
                    Object V2 = x97.V(dm6.b, new z11(jacVar2, z, continuation2, 10), this);
                    if (V2 != nm6Var) {
                        V2 = Unit.a;
                    }
                    if (V2 == nm6Var) {
                    }
                    Boolean bool22 = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool22);
                } else {
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool3);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.n;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar.emit(j0, this) == nm6Var2) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
