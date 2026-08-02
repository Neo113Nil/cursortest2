package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class vqk extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n43 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqk(n43 n43Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.k = n43Var;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        vqk vqkVar = new vqk(this.k, this.l, continuation);
        vqkVar.j = obj;
        return vqkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vqk) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = yqk.b;
        hmm.a aVar2 = new hmm.a("block_all_values_".concat(this.k.getKey()));
        Boolean valueOf = Boolean.valueOf(this.l);
        lpiVar.getClass();
        lpiVar.h(aVar2, valueOf);
        return Unit.a;
    }
}
