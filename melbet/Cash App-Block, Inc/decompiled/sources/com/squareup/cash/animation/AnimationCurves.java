package com.squareup.cash.animation;

import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public abstract class AnimationCurves {
    public static final PathInterpolator longTail = new PathInterpolator(0.3f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);

    static {
        new PathInterpolator(0.3f, RecyclerView.DECELERATION_RATE, 0.5f, 1.0f);
        new PathInterpolator(0.5f, RecyclerView.DECELERATION_RATE, 0.5f, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.7f, 1.0f);
        new PathInterpolator(1.0f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new PathInterpolator(0.5f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new PathInterpolator(0.3f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
    }
}
