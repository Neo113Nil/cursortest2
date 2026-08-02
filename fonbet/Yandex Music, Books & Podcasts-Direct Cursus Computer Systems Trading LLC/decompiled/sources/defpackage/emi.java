package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class emi extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gmi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emi(Continuation continuation, gmi gmiVar, int i) {
        super(2, continuation);
        this.j = i;
        this.m = gmiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                emi emiVar = new emi(continuation, this.m, 0);
                emiVar.l = obj;
                return emiVar;
            case 1:
                emi emiVar2 = new emi(continuation, this.m, 1);
                emiVar2.l = obj;
                return emiVar2;
            default:
                emi emiVar3 = new emi(continuation, this.m, 2);
                emiVar3.l = obj;
                return emiVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((emi) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((emi) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((emi) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                gmi gmiVar = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (gmi.a(gmiVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = gmiVar.v;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                this.l = null;
                this.k = 2;
                y2x.m(this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (gmi.a(this.m, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.l = null;
                this.k = 2;
                y2x.m(this);
                return nm6Var2;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (gmi.a(this.m, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.l = null;
                this.k = 2;
                y2x.m(this);
                return nm6Var3;
        }
    }
}
