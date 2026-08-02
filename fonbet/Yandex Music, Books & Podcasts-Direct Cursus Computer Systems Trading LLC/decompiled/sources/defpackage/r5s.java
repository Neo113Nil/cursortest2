package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class r5s extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t5s k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5s(t5s t5sVar, long j, Continuation continuation) {
        super(2, continuation);
        this.k = t5sVar;
        this.l = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        r5s r5sVar = new r5s(this.k, this.l, continuation);
        r5sVar.j = obj;
        return r5sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r5s) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(this.k.b, new Long(this.l));
        return Unit.a;
    }
}
