package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l44 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p44 k;
    public final /* synthetic */ f24 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l44(p44 p44Var, f24 f24Var, Continuation continuation) {
        super(2, continuation);
        this.k = p44Var;
        this.l = f24Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        l44 l44Var = new l44(this.k, this.l, continuation);
        l44Var.j = obj;
        return l44Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l44) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a c = p44.c(this.l);
        Long l = new Long(((zzp) this.k.a.getValue()).b());
        lpiVar.getClass();
        lpiVar.h(c, l);
        return Unit.a;
    }
}
