package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class za8 implements pjc {
    public final pjc a;
    public final Function1 b;
    public final Function2 c;

    public za8(pjc pjcVar, Function1 function1, Function2 function2) {
        this.a = pjcVar;
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        xqn xqnVar = new xqn();
        xqnVar.a = ugj.a;
        Object collect = this.a.collect(new tl0(12, this, xqnVar, rjcVar), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
