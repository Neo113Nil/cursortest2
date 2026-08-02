package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class eu3 implements cu3 {
    public final pjc a;

    public eu3(pjc pjcVar) {
        this.a = pjcVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new g62(rjcVar, 27), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
