package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface qdi extends CoroutineContext.Element {
    Object P(Function1 function1, Continuation continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default f getKey() {
        return l48.f;
    }
}
