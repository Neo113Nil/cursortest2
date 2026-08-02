package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class zxu extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ cyu k;
    public final /* synthetic */ xxu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxu(cyu cyuVar, xxu xxuVar, Continuation continuation) {
        super(2, continuation);
        this.k = cyuVar;
        this.l = xxuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        zxu zxuVar = new zxu(this.k, this.l, continuation);
        zxuVar.j = obj;
        return zxuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zxu) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = new hmm.a("notification_dot_hash_key");
        String str = this.l.b;
        lpiVar.getClass();
        lpiVar.h(aVar, str);
        return Unit.a;
    }
}
