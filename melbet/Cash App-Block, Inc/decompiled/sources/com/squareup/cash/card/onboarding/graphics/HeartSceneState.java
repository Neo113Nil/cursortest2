package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HeartSceneState {
    public final float opacity;
    public final Vector3 position;
    public final Quat rotation;
    public final float scale;

    public HeartSceneState(float f, Quat quat, Vector3 vector3, float f2) {
        quat.getClass();
        vector3.getClass();
        this.scale = f;
        this.rotation = quat;
        this.position = vector3;
        this.opacity = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartSceneState)) {
            return false;
        }
        HeartSceneState heartSceneState = (HeartSceneState) obj;
        return Float.compare(this.scale, heartSceneState.scale) == 0 && Intrinsics.areEqual(this.rotation, heartSceneState.rotation) && Intrinsics.areEqual(this.position, heartSceneState.position) && Float.compare(this.opacity, heartSceneState.opacity) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.opacity) + ((this.position.hashCode() + ((this.rotation.hashCode() + (Float.hashCode(this.scale) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HeartSceneState(scale=" + this.scale + ", rotation=" + this.rotation + ", position=" + this.position + ", opacity=" + this.opacity + ")";
    }
}
