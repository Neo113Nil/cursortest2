package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class pjq implements mm6, fgp {
    public final zi3 a;
    public final /* synthetic */ mm6 b;

    public pjq(mm6 mm6Var, zi3 zi3Var) {
        mm6Var.getClass();
        this.a = zi3Var;
        this.b = mm6Var;
    }

    @Override // defpackage.fgp
    public final Object c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override // defpackage.fgp
    public final Object m(Object obj, Continuation continuation) {
        return this.a.m(obj, continuation);
    }
}
