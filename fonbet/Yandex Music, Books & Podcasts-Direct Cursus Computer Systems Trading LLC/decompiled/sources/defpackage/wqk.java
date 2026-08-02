package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class wqk extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ nvl k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqk(nvl nvlVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.k = nvlVar;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        wqk wqkVar = new wqk(this.k, this.l, continuation);
        wqkVar.j = obj;
        return wqkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wqk) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = yqk.b;
        hmm.a aVar2 = new hmm.a("playlist_all_values_".concat(this.k.d()));
        Boolean valueOf = Boolean.valueOf(this.l);
        lpiVar.getClass();
        lpiVar.h(aVar2, valueOf);
        return Unit.a;
    }
}
