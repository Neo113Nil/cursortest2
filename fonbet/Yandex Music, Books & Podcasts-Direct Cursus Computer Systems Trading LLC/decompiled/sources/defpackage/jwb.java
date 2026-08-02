package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class jwb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sdr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwb(sdr sdrVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = sdrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                jwb jwbVar = new jwb(this.m, continuation, 0);
                jwbVar.l = obj;
                return jwbVar;
            case 1:
                jwb jwbVar2 = new jwb(this.m, continuation, 1);
                jwbVar2.l = obj;
                return jwbVar2;
            default:
                jwb jwbVar3 = new jwb(this.m, continuation, 2);
                jwbVar3.l = obj;
                return jwbVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        jtm jtmVar = (jtm) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((jwb) create(jtmVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                jtm jtmVar = (jtm) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(szf.s0(new xtb(this.m, 3)));
                    iwb iwbVar = new iwb(jtmVar, 0);
                    this.l = null;
                    this.k = 1;
                    if (b0.collect(iwbVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                jtm jtmVar2 = (jtm) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pjc b02 = zsd.b0(szf.s0(new xtb(this.m, 6)));
                    iwb iwbVar2 = new iwb(jtmVar2, 2);
                    this.l = null;
                    this.k = 1;
                    if (b02.collect(iwbVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                jtm jtmVar3 = (jtm) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new a9q(this.m, 15));
                    iwb iwbVar3 = new iwb(jtmVar3, 8);
                    this.l = null;
                    this.k = 1;
                    if (s0.collect(iwbVar3, this) == nm6Var3) {
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
