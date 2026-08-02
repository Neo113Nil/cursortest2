package defpackage;

import defpackage.hmm;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nkd extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkd(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        nkd nkdVar = new nkd(this.k, this.l, continuation);
        nkdVar.j = obj;
        return nkdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nkd) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm hmmVar = (hmm) this.j;
        lpi b = hmmVar.b();
        hmm.a aVar = okd.g;
        Set set = (Set) hmmVar.a(aVar);
        if (set == null) {
            set = q5b.a;
        }
        String str = this.k;
        b.h(aVar, wop.j(set, str));
        b.h(hkd.a(okd.d, str), this.l);
        return b.c();
    }
}
