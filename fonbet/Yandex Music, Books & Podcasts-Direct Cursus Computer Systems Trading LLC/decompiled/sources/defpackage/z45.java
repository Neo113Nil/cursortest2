package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z45 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dk1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(dk1 dk1Var, Continuation continuation) {
        super(2, continuation);
        this.k = dk1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        z45 z45Var = new z45(this.k, continuation);
        z45Var.j = obj;
        return z45Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z45) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.y, this.k.name());
        return Unit.a;
    }
}
