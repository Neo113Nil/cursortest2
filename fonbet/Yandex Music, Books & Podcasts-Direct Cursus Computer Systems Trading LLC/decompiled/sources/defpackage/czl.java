package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class czl extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czl(boolean z, Continuation continuation) {
        super(2, continuation);
        this.k = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        czl czlVar = new czl(this.k, continuation);
        czlVar.j = obj;
        return czlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((czl) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        hmm hmmVar = (hmm) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpi b = hmmVar.b();
        b.g(dzl.e, Boolean.valueOf(this.k));
        return b;
    }
}
