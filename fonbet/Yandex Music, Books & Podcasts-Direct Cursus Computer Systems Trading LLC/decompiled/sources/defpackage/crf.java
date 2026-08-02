package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class crf extends oi {
    public Continuation e;

    @Override // defpackage.oc4, defpackage.fgp
    public final Object c(Object obj) {
        start();
        return super.c(obj);
    }

    @Override // defpackage.h3f
    public final void d0() {
        n7w.b0(this.e, this);
    }

    @Override // defpackage.oc4, defpackage.fgp
    public final Object m(Object obj, Continuation continuation) {
        start();
        Object m = super.m(obj, continuation);
        return m == nm6.a ? m : Unit.a;
    }

    @Override // defpackage.oc4
    public final boolean p0(Throwable th) {
        boolean p0 = super.p0(th);
        start();
        return p0;
    }
}
