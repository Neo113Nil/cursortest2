package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class igc extends aur implements Function2 {
    public /* synthetic */ long j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        igc igcVar = new igc(2, continuation);
        igcVar.j = ((nsa) obj).a;
        return igcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((igc) create(new nsa(((nsa) obj).a), (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        msa msaVar = nsa.b;
        boolean z = false;
        long M = yd5.M(0, ssa.MILLISECONDS);
        int i = kmd.h;
        long j2 = kmd.g;
        if ((new nsa(j).compareTo(new nsa(M)) < 0 || new nsa(j).compareTo(new nsa(j2)) > 0) && nsa.m(j)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
