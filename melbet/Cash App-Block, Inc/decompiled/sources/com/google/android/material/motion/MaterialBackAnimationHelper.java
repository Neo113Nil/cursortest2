package com.google.android.material.motion;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.BackEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public abstract class MaterialBackAnimationHelper {
    public BackEventCompat backEvent;
    public final int cancelDuration;
    public final int hideDurationMax;
    public final int hideDurationMin;
    public final PathInterpolator progressInterpolator = new PathInterpolator(0.1f, 0.1f, RecyclerView.DECELERATION_RATE, 1.0f);
    public final View view;

    public MaterialBackAnimationHelper(View view) {
        this.view = view;
        Context context = view.getContext();
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public final BackEventCompat onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.backEvent;
        this.backEvent = null;
        return backEventCompat;
    }
}
