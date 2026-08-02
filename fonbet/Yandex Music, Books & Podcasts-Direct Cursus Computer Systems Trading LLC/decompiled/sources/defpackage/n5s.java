package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n5s extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t5s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5s(t5s t5sVar, Continuation continuation) {
        super(2, continuation);
        this.k = t5sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        n5s n5sVar = new n5s(this.k, continuation);
        n5sVar.j = obj;
        return n5sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n5s) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(this.k.e, Boolean.FALSE);
        return Unit.a;
    }
}
