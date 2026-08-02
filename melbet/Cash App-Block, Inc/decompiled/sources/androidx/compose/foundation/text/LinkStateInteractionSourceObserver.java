package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes3.dex */
public final class LinkStateInteractionSourceObserver {
    public final MutableInteractionSourceImpl interactionSource;
    public final ParcelableSnapshotMutableIntState interactionState = new ParcelableSnapshotMutableIntState(0);

    public LinkStateInteractionSourceObserver(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.interactionSource = mutableInteractionSourceImpl;
    }
}
