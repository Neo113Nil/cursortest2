package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import app.cash.trifle.KeyHandle$keyPair$2;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class CompositionContext {
    public abstract void composeInitial$runtime(CompositionImpl compositionImpl, Function2 function2);

    public abstract MutableScatterSet composeInitialPaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, Function2 function2);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public PersistentCompositionLocalHashMap getCompositionLocalScope$runtime() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }

    public abstract CoroutineContext getEffectCoroutineContext();

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void invalidate$runtime(CompositionImpl compositionImpl);

    public abstract MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference);

    public abstract MutableScatterSet recomposePaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, MutableScatterSet mutableScatterSet);

    public abstract void recordInspectionTable$runtime(Set set);

    public void registerComposer$runtime(GapComposer gapComposer) {
    }

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime(CompositionImpl compositionImpl);

    public abstract CancellationHandle scheduleFrameEndCallback(KeyHandle$keyPair$2 keyHandle$keyPair$2);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(GapComposer gapComposer) {
    }

    public abstract void unregisterComposition$runtime(CompositionImpl compositionImpl);
}
