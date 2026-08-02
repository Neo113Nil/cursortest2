package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.graphics.backend.math.Vector3;

/* loaded from: classes6.dex */
public final class HeartPoseController implements TagPoseController {
    public final WandPoseController delegate;
    public final float translationScale;

    public HeartPoseController(WandPose wandPose, float f) {
        WandPoseConfig wandPoseConfig = HeartPoseControllerKt.HEART_POSE_CONFIG;
        wandPose.getClass();
        wandPoseConfig.getClass();
        this.translationScale = f;
        this.delegate = new WandPoseController(wandPose, wandPoseConfig);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final WandPoseConfig getConfig() {
        return this.delegate.config;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final WandPose getCurrentPose() {
        return this.delegate.currentPose;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final boolean isAnimating() {
        return this.delegate.isAnimating();
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDrag(float f, float f2) {
        this.delegate.onDrag(f, f2);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDragEnd(float f) {
        this.delegate.onDragEnd(f);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void onDragStart() {
        this.delegate.onDragStart();
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setBlendedPose(WandPose wandPose, float f, float f2) {
        WandPose wandPose2 = WandPose.Float;
        this.delegate.setBlendedPose(wandPose, f, f2);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setConfig(WandPoseConfig wandPoseConfig) {
        this.delegate.config = wandPoseConfig;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void setPose(WandPose wandPose) {
        this.delegate.setPose(wandPose);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final void snapToPose(WandPose wandPose) {
        this.delegate.snapToPose(wandPose);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.TagPoseController
    public final WandPoseController.Output tick(float f, float f2) {
        WandPoseController.Output tick = this.delegate.tick(f, f2);
        Vector3 vector3 = tick.positionOffset;
        float f3 = vector3.x;
        float f4 = this.translationScale;
        return WandPoseController.Output.copy$default(tick, new Vector3(f3 * f4, vector3.y * f4, vector3.z * f4));
    }
}
