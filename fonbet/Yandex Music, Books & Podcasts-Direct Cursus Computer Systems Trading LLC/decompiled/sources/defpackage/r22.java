package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class r22 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r22(boolean z, Continuation continuation) {
        super(2, continuation);
        this.k = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        r22 r22Var = new r22(this.k, continuation);
        r22Var.j = obj;
        return r22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r22) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(z22.f, Boolean.valueOf(this.k));
        return Unit.a;
    }
}
