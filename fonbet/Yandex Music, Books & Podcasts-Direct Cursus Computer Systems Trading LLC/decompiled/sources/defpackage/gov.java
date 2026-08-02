package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class gov extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hov k;
    public final /* synthetic */ l9q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gov(hov hovVar, l9q l9qVar, Continuation continuation) {
        super(2, continuation);
        this.k = hovVar;
        this.l = l9qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        gov govVar = new gov(this.k, this.l, continuation);
        govVar.j = obj;
        return govVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gov) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = new hmm.a("widget_color_setting");
        String str = this.l.a;
        lpiVar.getClass();
        lpiVar.h(aVar, str);
        return Unit.a;
    }
}
