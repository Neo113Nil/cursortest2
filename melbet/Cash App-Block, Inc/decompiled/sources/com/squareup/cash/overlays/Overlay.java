package com.squareup.cash.overlays;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.squareup.cash.ui.OnBackListener;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface Overlay {
    default void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1239636622);
        boolean changed = gapComposer.changed(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Overlay$$ExternalSyntheticLambda0(this, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
        gapComposer.end(false);
    }

    default Animator enterAnimator() {
        return new AnimatorSet();
    }

    default Animator exitAnimator() {
        return new AnimatorSet();
    }

    View getAsView();

    OnBackListener getBackListener();

    default void onEnterDone() {
    }
}
