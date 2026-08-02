package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes3.dex */
public final class DefaultTransformableState {
    public final TransformableStateKt$$ExternalSyntheticLambda1 onTransformation;
    public final DefaultTransformableState$transformScope$1 transformScope = new DefaultTransformableState$transformScope$1(this);
    public final MutatorMutex transformMutex = new MutatorMutex();
    public final ParcelableSnapshotMutableState isTransformingState = Updater.mutableStateOf$default(Boolean.FALSE);

    public DefaultTransformableState(TransformableStateKt$$ExternalSyntheticLambda1 transformableStateKt$$ExternalSyntheticLambda1) {
        this.onTransformation = transformableStateKt$$ExternalSyntheticLambda1;
    }
}
