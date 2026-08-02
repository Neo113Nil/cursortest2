package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class xqk extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n43 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqk(n43 n43Var, int i, Continuation continuation) {
        super(2, continuation);
        this.k = n43Var;
        this.l = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        xqk xqkVar = new xqk(this.k, this.l, continuation);
        xqkVar.j = obj;
        return xqkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xqk) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = yqk.b;
        hmm.a aVar2 = new hmm.a("block_revision_".concat(this.k.getKey()));
        Integer num = new Integer(this.l);
        lpiVar.getClass();
        lpiVar.h(aVar2, num);
        return Unit.a;
    }
}
