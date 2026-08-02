package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nl7 implements cpa {
    public final Function1 a;
    public final fa0 b = new fa0(2, this);
    public final mqi c = new mqi();

    public nl7(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.cpa
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        Object Q = gld.Q(new j57(this, hqiVar, function2, (Continuation) null), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }
}
