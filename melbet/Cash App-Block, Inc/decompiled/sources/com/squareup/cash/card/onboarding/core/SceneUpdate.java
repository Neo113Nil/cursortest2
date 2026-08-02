package com.squareup.cash.card.onboarding.core;

import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SceneUpdate {
    public final EquatableBitmap customizationOverride;
    public final Vector4 position;
    public final Quat rotation;
    public final CardModelView.ViewModel viewModel;

    public SceneUpdate(CardModelView.ViewModel viewModel, Quat quat, Vector4 vector4, EquatableBitmap equatableBitmap) {
        viewModel.getClass();
        this.viewModel = viewModel;
        this.rotation = quat;
        this.position = vector4;
        this.customizationOverride = equatableBitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneUpdate)) {
            return false;
        }
        SceneUpdate sceneUpdate = (SceneUpdate) obj;
        return Intrinsics.areEqual(this.viewModel, sceneUpdate.viewModel) && this.rotation.equals(sceneUpdate.rotation) && this.position.equals(sceneUpdate.position) && Intrinsics.areEqual(this.customizationOverride, sceneUpdate.customizationOverride);
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.position.vector) + ((this.rotation.hashCode() + (this.viewModel.hashCode() * 31)) * 31)) * 31;
        EquatableBitmap equatableBitmap = this.customizationOverride;
        return hashCode + (equatableBitmap == null ? 0 : equatableBitmap.pixelHash);
    }

    public final String toString() {
        return "SceneUpdate(viewModel=" + this.viewModel + ", rotation=" + this.rotation + ", position=" + this.position + ", customizationOverride=" + this.customizationOverride + ")";
    }
}
