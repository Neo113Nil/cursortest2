package com.squareup.cash.mooncake.components;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.android.Views;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class PushOnPressAnimator extends StateListAnimator {
    public final long duration;
    public final View view;

    public PushOnPressAnimator(View view, int i) {
        float f = (i & 4) != 0 ? 0.95f : 1.0f;
        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda2 = new P2PListViewKt$$ExternalSyntheticLambda2(1);
        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda22 = new P2PListViewKt$$ExternalSyntheticLambda2(2);
        this.view = view;
        this.duration = 80L;
        addState(new int[]{R.attr.state_pressed}, createAnimator(f, p2PListViewKt$$ExternalSyntheticLambda2));
        addState(new int[]{-16842919}, createAnimator(1.0f, p2PListViewKt$$ExternalSyntheticLambda22));
    }

    public final ObjectAnimator createAnimator(float f, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.view, Views.SCALE, f);
        ofFloat.setDuration(this.duration);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(1, function0));
        return ofFloat;
    }
}
