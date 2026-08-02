package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public interface r2f extends CoroutineContext.Element {
    CancellationException D();

    qa8 R(Function1 function1);

    boolean X();

    qa8 Y(boolean z, boolean z2, aub aubVar);

    Sequence a();

    boolean b();

    void g(CancellationException cancellationException);

    boolean isCancelled();

    Object j0(Continuation continuation);

    hj4 l0(h3f h3fVar);

    boolean start();
}
