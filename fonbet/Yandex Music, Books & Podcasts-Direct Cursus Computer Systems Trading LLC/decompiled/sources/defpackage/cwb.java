package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class cwb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sdr l;
    public final /* synthetic */ fvf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwb(sdr sdrVar, fvf fvfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = sdrVar;
        this.m = fvfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new cwb(this.l, this.m, continuation, 0);
            default:
                return new cwb(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((cwb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(zsd.b0(szf.s0(new xtb(this.l, 2))), 1);
                    o50 o50Var = new o50(this.m, 3);
                    this.k = 1;
                    Object collect = d0.collect(new pja(o50Var, 17), this);
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var) {
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
                    h7a d02 = zsd.d0(zsd.b0(szf.s0(new xtb(this.l, 5))), 1);
                    o50 o50Var2 = new o50(this.m, 4);
                    this.k = 1;
                    Object collect2 = d02.collect(new pja(o50Var2, 19), this);
                    if (collect2 != nm6Var2) {
                        collect2 = Unit.a;
                    }
                    if (collect2 == nm6Var2) {
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
