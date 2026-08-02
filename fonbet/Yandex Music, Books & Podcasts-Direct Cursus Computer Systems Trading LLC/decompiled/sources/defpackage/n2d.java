package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n2d extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p2d k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2d(p2d p2dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.k = p2dVar;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        n2d n2dVar = new n2d(this.k, this.l, continuation);
        n2dVar.j = obj;
        return n2dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2d) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.k.getClass();
        hmm.a aVar = new hmm.a("gdpr_first_authorized_user_id");
        lpiVar.getClass();
        lpiVar.h(aVar, this.l);
        return Unit.a;
    }
}
