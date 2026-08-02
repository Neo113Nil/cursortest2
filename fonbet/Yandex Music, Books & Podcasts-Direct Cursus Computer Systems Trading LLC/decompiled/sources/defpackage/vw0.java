package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vw0 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ww0 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(ww0 ww0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.k = ww0Var;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        vw0 vw0Var = new vw0(this.k, this.l, continuation);
        vw0Var.j = obj;
        return vw0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vw0) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.e();
        lpiVar.h(new hmm.a("campaign_start_time"), new Long(this.k.a.b()));
        lpiVar.h(new hmm.a("campaign_id"), this.l);
        return Unit.a;
    }
}
