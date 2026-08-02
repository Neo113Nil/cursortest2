package com.squareup.cash.graphics.backend.engine;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.cash.graphics.backend.math.Vector4;

/* loaded from: classes6.dex */
public final class LightStateImpl implements EntityState {
    public final EntityState entityState;
    public final MutableState lightRGB;

    public LightStateImpl(EntityStateImpl entityStateImpl, Vector4 vector4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        entityStateImpl.getClass();
        this.entityState = entityStateImpl;
        this.lightRGB = mutableState3;
    }

    @Override // com.squareup.cash.graphics.backend.engine.EntityState
    public final State getPosition() {
        return this.entityState.getPosition();
    }

    @Override // com.squareup.cash.graphics.backend.engine.EntityState
    public final State getTransformMatrix() {
        return this.entityState.getTransformMatrix();
    }
}
