package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class llp implements flp {
    public final CoroutineContext a;
    public final wb7 b;
    public final AtomicReference c;
    public final ail d;

    public llp(CoroutineContext coroutineContext, wb7 wb7Var) {
        coroutineContext.getClass();
        wb7Var.getClass();
        this.a = coroutineContext;
        this.b = wb7Var;
        this.c = new AtomicReference();
        Continuation continuation = null;
        this.d = new ail(20, new clc(wb7Var.getData(), new ilp(3, 0, continuation)), this);
        x97.y(gld.e(coroutineContext), null, null, new glp(this, continuation, 0), 3);
    }
}
