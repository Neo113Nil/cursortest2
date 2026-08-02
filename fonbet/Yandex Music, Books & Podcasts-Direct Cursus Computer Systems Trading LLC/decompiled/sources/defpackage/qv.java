package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class qv extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ poi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv(poi poiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = poiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qv(this.l, continuation, 0);
            case 1:
                return new qv(this.l, continuation, 1);
            case 2:
                return new qv(this.l, continuation, 2);
            default:
                return new qv(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qv) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    poi poiVar = this.l;
                    float e = ((t6k) poiVar).e();
                    pv pvVar = new pv(poiVar, 0);
                    this.k = 1;
                    if (v5g.p(e, 1.0f, null, pvVar, this, 12) == nm6Var) {
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
                    poi poiVar2 = this.l;
                    float e2 = ((t6k) poiVar2).e();
                    pv pvVar2 = new pv(poiVar2, 1);
                    this.k = 1;
                    if (v5g.p(e2, 1.0f, null, pvVar2, this, 12) == nm6Var2) {
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
                    poi poiVar3 = this.l;
                    float e3 = ((t6k) poiVar3).e();
                    pv pvVar3 = new pv(poiVar3, 4);
                    this.k = 1;
                    if (v5g.p(e3, 1.0f, null, pvVar3, this, 12) == nm6Var3) {
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
                    poi poiVar4 = this.l;
                    float e4 = ((t6k) poiVar4).e();
                    pv pvVar4 = new pv(poiVar4, 5);
                    this.k = 1;
                    if (v5g.p(e4, 1.0f, null, pvVar4, this, 12) == nm6Var4) {
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
