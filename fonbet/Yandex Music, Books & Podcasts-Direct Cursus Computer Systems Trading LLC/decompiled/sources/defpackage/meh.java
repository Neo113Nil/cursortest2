package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class meh extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rxv l;
    public final /* synthetic */ float m;
    public final /* synthetic */ tm0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meh(rxv rxvVar, float f, tm0 tm0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = rxvVar;
        this.m = f;
        this.n = tm0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new meh(this.l, this.m, (act) this.n, continuation, 0);
            default:
                return new meh(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((meh) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        rxv rxvVar = this.l;
        byte b = 0;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    float e = rxvVar.i.e();
                    act actVar = (act) this.n;
                    leh lehVar = new leh(rxvVar, b, b);
                    this.k = 1;
                    if (v5g.p(e, this.m, actVar, lehVar, this, 4) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    act actVar2 = rxv.K;
                    rxvVar.p(false);
                    float c = yhn.c(this.m, rxvVar.a, rxvVar.b);
                    float e2 = rxvVar.h.e();
                    leh lehVar2 = new leh(rxvVar, 2, b);
                    this.k = 1;
                    if (v5g.p(e2, c, this.n, lehVar2, this, 4) == nm6Var2) {
                        break;
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
