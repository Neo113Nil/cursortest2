package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p2r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ aqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2r(Function2 function2, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = function2;
        this.n = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                p2r p2rVar = new p2r(this.m, this.n, continuation, 0);
                p2rVar.l = obj;
                return p2rVar;
            case 1:
                p2r p2rVar2 = new p2r(this.m, this.n, continuation, 1);
                p2rVar2.l = obj;
                return p2rVar2;
            case 2:
                p2r p2rVar3 = new p2r(this.m, this.n, continuation, 2);
                p2rVar3.l = obj;
                return p2rVar3;
            case 3:
                p2r p2rVar4 = new p2r(this.m, this.n, continuation, 3);
                p2rVar4.l = obj;
                return p2rVar4;
            default:
                p2r p2rVar5 = new p2r(this.m, this.n, continuation, 4);
                p2rVar5.l = obj;
                return p2rVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p2r) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    jtm jtmVar = new jtm(this.n, ((mm6) this.l).getCoroutineContext());
                    this.k = 1;
                    if (this.m.invoke(jtmVar, this) == nm6Var) {
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
                    jtm jtmVar2 = new jtm(this.n, ((mm6) this.l).getCoroutineContext());
                    this.k = 1;
                    if (this.m.invoke(jtmVar2, this) == nm6Var2) {
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
                    jtm jtmVar3 = new jtm(this.n, ((mm6) this.l).getCoroutineContext());
                    this.k = 1;
                    if (this.m.invoke(jtmVar3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    jtm jtmVar4 = new jtm(this.n, ((mm6) this.l).getCoroutineContext());
                    this.k = 1;
                    if (this.m.invoke(jtmVar4, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    jtm jtmVar5 = new jtm(this.n, ((mm6) this.l).getCoroutineContext());
                    this.k = 1;
                    if (this.m.invoke(jtmVar5, this) == nm6Var5) {
                    }
                } else if (i5 != 1) {
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
