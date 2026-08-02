package com.squareup.cash.card.onboarding.graphics;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class MiniCardPoseControllerKt {
    public static final WandPoseConfig MINI_CARD_GRID_POSE_CONFIG;
    public static final WandPoseConfig MINI_CARD_POSE_CONFIG;

    static {
        WandPoseConfig wandPoseConfig = new WandPoseConfig(-10.0f, -30.0f, -30.0f, RecyclerView.DECELERATION_RATE, -10.0f, -50.0f, -20.0f, -10.0f, -120.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -90.0f, 122880, -230333);
        MINI_CARD_POSE_CONFIG = wandPoseConfig;
        MINI_CARD_GRID_POSE_CONFIG = WandPoseConfig.copy$default(wandPoseConfig, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 536870911, -1);
    }
}
