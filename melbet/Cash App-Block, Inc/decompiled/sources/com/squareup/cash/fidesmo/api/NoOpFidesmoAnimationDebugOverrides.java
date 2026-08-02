package com.squareup.cash.fidesmo.api;

/* loaded from: classes8.dex */
public final class NoOpFidesmoAnimationDebugOverrides implements FidesmoAnimationDebugOverrides {
    public static final NoOpFidesmoAnimationDebugOverrides INSTANCE = new NoOpFidesmoAnimationDebugOverrides();

    @Override // com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides
    public final FidesmoAnimationLocationOverride locationOverride() {
        return FidesmoAnimationLocationOverride.DEFAULT;
    }

    @Override // com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides
    public final FidesmoAnimationShapeOverride shapeOverride() {
        return FidesmoAnimationShapeOverride.DEFAULT;
    }
}
