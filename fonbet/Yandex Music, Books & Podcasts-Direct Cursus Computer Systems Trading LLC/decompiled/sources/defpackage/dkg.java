package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class dkg extends aur implements Function2 {
    public final /* synthetic */ fkg j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ lpi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(fkg fkgVar, String str, String str2, String str3, lpi lpiVar, Continuation continuation) {
        super(2, continuation);
        this.j = fkgVar;
        this.k = str;
        this.l = str2;
        this.m = str3;
        this.n = lpiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new dkg(this.j, this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dkg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = new hmm.a(fkg.e(this.k, this.l));
        String str = this.m;
        lpi lpiVar = this.n;
        if (str == null) {
            return lpiVar.f(aVar);
        }
        lpiVar.getClass();
        lpiVar.h(aVar, str);
        return Unit.a;
    }
}
