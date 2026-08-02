package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fea k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e55(fea feaVar, Continuation continuation) {
        super(2, continuation);
        this.k = feaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e55 e55Var = new e55(this.k, continuation);
        e55Var.j = obj;
        return e55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.q, this.k.name());
        return Unit.a;
    }
}
