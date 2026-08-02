package com.squareup.cash.graphics.backend.engine;

import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;

/* loaded from: classes6.dex */
public final class EntityStateImpl implements EntityState {
    public final State position;
    public final State rotation;
    public final State scale;
    public final State transformMatrix;

    public EntityStateImpl(State state, State state2, State state3) {
        DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(state, state3, state2));
        state.getClass();
        state2.getClass();
        state3.getClass();
        this.rotation = state;
        this.position = state2;
        this.scale = state3;
        this.transformMatrix = derivedStateOf;
    }

    @Override // com.squareup.cash.graphics.backend.engine.EntityState
    public final State getPosition() {
        return this.position;
    }

    @Override // com.squareup.cash.graphics.backend.engine.EntityState
    public final State getTransformMatrix() {
        return this.transformMatrix;
    }
}
