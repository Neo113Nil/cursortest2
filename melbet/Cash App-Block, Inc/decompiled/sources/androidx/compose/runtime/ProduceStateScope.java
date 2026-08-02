package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public interface ProduceStateScope extends MutableState, CoroutineScope {
    void awaitDispose(Function0 function0, ContinuationImpl continuationImpl);
}
