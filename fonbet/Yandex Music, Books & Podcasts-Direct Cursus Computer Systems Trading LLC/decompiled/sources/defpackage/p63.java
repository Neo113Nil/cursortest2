package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p63 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q63 k;
    public final /* synthetic */ wfm l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p63(q63 q63Var, wfm wfmVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.k = q63Var;
        this.l = wfmVar;
        this.m = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        p63 p63Var = new p63(this.k, this.l, this.m, continuation);
        p63Var.j = obj;
        return p63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p63) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        String c = this.l.c();
        c.getClass();
        hmm.a aVar = new hmm.a(c);
        Boolean valueOf = Boolean.valueOf(this.m);
        lpiVar.getClass();
        lpiVar.h(aVar, valueOf);
        return Unit.a;
    }
}
