package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class vvf extends rar {
    public final Continuation d;

    public vvf(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.d = qxe.a(this, this, function2);
    }

    @Override // defpackage.h3f
    public final void d0() {
        n7w.b0(this.d, this);
    }
}
