package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ nd4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b55(nd4 nd4Var, Continuation continuation) {
        super(2, continuation);
        this.k = nd4Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        b55 b55Var = new b55(this.k, continuation);
        b55Var.j = obj;
        return b55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.g, this.k.name());
        return Unit.a;
    }
}
