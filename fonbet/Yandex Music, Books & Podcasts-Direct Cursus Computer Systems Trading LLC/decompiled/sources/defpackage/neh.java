package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class neh extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rxv l;
    public final /* synthetic */ long m;
    public final /* synthetic */ tm0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ neh(rxv rxvVar, long j, tm0 tm0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = rxvVar;
        this.m = j;
        this.n = tm0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new neh(this.l, this.m, (act) this.n, continuation, 0);
            default:
                return new neh(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((neh) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    oct octVar = azt.f;
                    rxv rxvVar = this.l;
                    enj enjVar = new enj(rxvVar.g());
                    enj enjVar2 = new enj(this.m);
                    act actVar = (act) this.n;
                    leh lehVar = new leh(rxvVar, 1, (byte) 0);
                    this.k = 1;
                    if (v5g.o(octVar, enjVar, enjVar2, null, actVar, lehVar, this) == nm6Var) {
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
                    rxv rxvVar2 = this.l;
                    fk0 fk0Var = new fk0(new enj(rxvVar2.g()), azt.f, null, 12);
                    enj enjVar3 = new enj(this.m);
                    kk6 kk6Var = new kk6(rxvVar2, 1);
                    this.k = 1;
                    if (fk0.c(fk0Var, enjVar3, this.n, kk6Var, this, 4) == nm6Var2) {
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
}
