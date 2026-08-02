package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class axa extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rjc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(rjc rjcVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.m = rjcVar;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new axa(this.m, this.l, continuation);
            default:
                axa axaVar = new axa(this.m, continuation);
                axaVar.l = obj;
                return axaVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((axa) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((axa) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    Object obj2 = this.l;
                    this.k = 1;
                    if (this.m.emit(obj2, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Object obj3 = this.l;
                    this.k = 1;
                    if (this.m.emit(obj3, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(rjc rjcVar, Continuation continuation) {
        super(2, continuation);
        this.m = rjcVar;
    }
}
