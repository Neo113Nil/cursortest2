package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c6j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ iv1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6j(iv1 iv1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = iv1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c6j(this.l, continuation, 0);
            case 1:
                return new c6j(this.l, continuation, 1);
            case 2:
                return new c6j(this.l, continuation, 2);
            default:
                return new c6j(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c6j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = (xdr) this.l.b;
                    Boolean bool = Boolean.TRUE;
                    this.k = 1;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    if (Unit.a == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = (xdr) this.l.b;
                    Boolean bool2 = Boolean.FALSE;
                    this.k = 1;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                    if (Unit.a == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = (xdr) this.l.b;
                    Boolean bool3 = Boolean.TRUE;
                    this.k = 1;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool3);
                    if (Unit.a == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar4 = (xdr) this.l.b;
                    Boolean bool4 = Boolean.FALSE;
                    this.k = 1;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool4);
                    if (Unit.a == nm6Var4) {
                    }
                } else if (i4 != 1) {
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
