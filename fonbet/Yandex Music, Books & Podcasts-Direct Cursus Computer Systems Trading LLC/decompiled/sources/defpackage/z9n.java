package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z9n extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dan k;
    public final /* synthetic */ igr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9n(dan danVar, igr igrVar, Continuation continuation) {
        super(2, continuation);
        this.k = danVar;
        this.l = igrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        z9n z9nVar = new z9n(this.k, this.l, continuation);
        z9nVar.j = obj;
        return z9nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z9n) create((v9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        v9n v9nVar = (v9n) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return dan.b(this.l, v9nVar);
    }
}
