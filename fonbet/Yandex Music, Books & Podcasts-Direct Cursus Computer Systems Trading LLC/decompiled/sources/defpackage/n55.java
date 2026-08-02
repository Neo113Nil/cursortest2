package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kja k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n55(kja kjaVar, Continuation continuation) {
        super(2, continuation);
        this.k = kjaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        n55 n55Var = new n55(this.k, continuation);
        n55Var.j = obj;
        return n55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.m, this.k.name());
        return Unit.a;
    }
}
