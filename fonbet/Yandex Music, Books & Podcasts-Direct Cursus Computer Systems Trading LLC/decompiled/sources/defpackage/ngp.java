package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ngp implements rjc {
    public final fgp a;

    public ngp(ltm ltmVar) {
        this.a = ltmVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object m = this.a.m(obj, continuation);
        return m == nm6.a ? m : Unit.a;
    }
}
