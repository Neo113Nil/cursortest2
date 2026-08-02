package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class stq implements cpa {
    public final m10 a;
    public final x6k b = szf.g0(Boolean.FALSE);
    public final fa0 c = new fa0(3, this);
    public final mqi d = new mqi();

    public stq(m10 m10Var) {
        this.a = m10Var;
    }

    @Override // defpackage.cpa
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        Object Q = gld.Q(new fpq(this, hqiVar, function2, (Continuation) null), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }
}
