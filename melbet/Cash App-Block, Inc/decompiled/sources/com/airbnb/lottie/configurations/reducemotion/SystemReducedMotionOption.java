package com.airbnb.lottie.configurations.reducemotion;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.utils.Utils;

/* loaded from: classes3.dex */
public class SystemReducedMotionOption implements ReducedMotionOption {
    @Override // com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption
    public ReducedMotionMode getCurrentReducedMotionMode(Context context) {
        return (context == null || Utils.getAnimationScale(context) != RecyclerView.DECELERATION_RATE) ? ReducedMotionMode.STANDARD_MOTION : ReducedMotionMode.REDUCED_MOTION;
    }
}
