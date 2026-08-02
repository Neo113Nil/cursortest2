package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class lua extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sdr l;
    public final /* synthetic */ sdr m;
    public final /* synthetic */ sdr n;
    public final /* synthetic */ sdr o;
    public final /* synthetic */ aqi p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lua(sdr sdrVar, sdr sdrVar2, sdr sdrVar3, sdr sdrVar4, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = sdrVar;
        this.m = sdrVar2;
        this.n = sdrVar3;
        this.o = sdrVar4;
        this.p = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new lua(this.l, this.m, this.n, this.o, this.p, continuation, 0);
            default:
                return new lua(this.l, this.m, this.n, this.o, this.p, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((lua) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ub7 P = zsd.P(szf.s0(new oj2(this.l, 1)), szf.s0(new oj2(this.m, 2)), szf.s0(new oj2(this.n, 3)), szf.s0(new la1(this.o, 27)), new kua(5, 0, null));
                    oc ocVar = new oc(this.p, 2);
                    this.k = 1;
                    if (P.collect(ocVar, this) == nm6Var) {
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
                    ub7 P2 = zsd.P(szf.s0(new oj2(this.l, 5)), szf.s0(new oj2(this.m, 6)), szf.s0(new oj2(this.n, 7)), szf.s0(new f6u(this.o, 13)), new kua(5, 1, null));
                    oc ocVar2 = new oc(this.p, 8);
                    this.k = 1;
                    if (P2.collect(ocVar2, this) == nm6Var2) {
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
