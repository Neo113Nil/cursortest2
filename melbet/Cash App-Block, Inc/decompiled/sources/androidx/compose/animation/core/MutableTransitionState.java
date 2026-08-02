package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class MutableTransitionState extends InteractionResult {
    public final ParcelableSnapshotMutableState currentState$delegate;
    public final ParcelableSnapshotMutableState targetState$delegate;

    public MutableTransitionState(Object obj) {
        super((byte) 0, 1);
        this.currentState$delegate = Updater.mutableStateOf$default(obj);
        this.targetState$delegate = Updater.mutableStateOf$default(obj);
    }

    @Override // papa.InteractionResult
    public final Object getCurrentState() {
        return this.currentState$delegate.getValue();
    }

    @Override // papa.InteractionResult
    public final Object getTargetState() {
        return this.targetState$delegate.getValue();
    }

    @Override // papa.InteractionResult
    public final void setCurrentState$animation_core(Object obj) {
        this.currentState$delegate.setValue(obj);
    }

    public final void setTargetState(Boolean bool) {
        this.targetState$delegate.setValue(bool);
    }

    @Override // papa.InteractionResult
    public final void transitionConfigured$animation_core(Transition transition) {
    }

    @Override // papa.InteractionResult
    public final void transitionRemoved$animation_core() {
    }
}
