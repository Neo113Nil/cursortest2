package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.card.onboarding.graphics.WandPoseController;

/* loaded from: classes6.dex */
public interface TagPoseController {
    WandPoseConfig getConfig();

    WandPose getCurrentPose();

    boolean isAnimating();

    void onDrag(float f, float f2);

    void onDragEnd(float f);

    void onDragStart();

    void setBlendedPose(WandPose wandPose, float f, float f2);

    void setConfig(WandPoseConfig wandPoseConfig);

    void setPose(WandPose wandPose);

    void snapToPose(WandPose wandPose);

    WandPoseController.Output tick(float f, float f2);
}
