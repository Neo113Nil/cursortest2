package com.google.common.hash;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ResourceType;

/* loaded from: classes9.dex */
public abstract class AbstractHashFunction {
    public static final Drawable backgroundImageDrawable(StepStyle stepStyle, Context context) {
        Integer resourceIdFromName;
        stepStyle.getClass();
        context.getClass();
        String backgroundImageName = stepStyle.getBackgroundImageName();
        if (backgroundImageName == null || (resourceIdFromName = ResToolsKt.resourceIdFromName(context, backgroundImageName, ResourceType.Drawable)) == null) {
            return null;
        }
        return context.getDrawable(resourceIdFromName.intValue());
    }

    public static final EntityStateImpl rememberEntityState(MutableState mutableState, State state, MutableState mutableState2, Composer composer, int i) {
        if ((i & 1) != 0) {
            mutableState = Updater.rememberUpdatedState(new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f), composer);
        }
        if ((i & 2) != 0) {
            state = Updater.rememberUpdatedState(new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), composer);
        }
        if ((i & 4) != 0) {
            mutableState2 = Updater.rememberUpdatedState(Float.valueOf(1.0f), composer);
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new EntityStateImpl(mutableState, state, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (EntityStateImpl) rememberedValue;
    }
}
