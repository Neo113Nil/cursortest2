package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ax2 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ lx2 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(lx2 lx2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.k = lx2Var;
        this.l = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ax2 ax2Var = new ax2(this.k, this.l, continuation);
        ax2Var.j = obj;
        return ax2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ax2) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(this.k.d, new Long(this.l));
        return Unit.a;
    }
}
