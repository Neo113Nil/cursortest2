package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s0m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s55(s0m s0mVar, Continuation continuation) {
        super(2, continuation);
        this.k = s0mVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        s55 s55Var = new s55(this.k, continuation);
        s55Var.j = obj;
        return s55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.i, this.k.name());
        return Unit.a;
    }
}
