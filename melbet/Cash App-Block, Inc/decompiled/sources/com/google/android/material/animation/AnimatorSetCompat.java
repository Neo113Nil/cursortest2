package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class AnimatorSetCompat {
    public static final void GenericIconButton(GenericBaseViewModel.IconButtonViewModel iconButtonViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        String clickableLabel;
        iconButtonViewModel.getClass();
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1925099200);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(iconButtonViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, iconButtonViewModel.size.value);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = iconButtonViewModel.event;
            if (genericTreeElementsViewEvent == null) {
                gapComposer.startReplaceGroup(-67765905);
                gapComposer.end(false);
                clickableLabel = null;
            } else {
                gapComposer.startReplaceGroup(-1110564654);
                clickableLabel = zzbk.toClickableLabel(genericTreeElementsViewEvent, gapComposer);
                gapComposer.end(false);
            }
            boolean changedInstance = gapComposer.changedInstance(iconButtonViewModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(21, iconButtonViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.IconButton((Function0) rememberedValue, m285size3ABfNKs, clickableLabel, false, Expect_jvmKt.rememberComposableLambda(1188105564, new ErrorView$$ExternalSyntheticLambda1(22, iconButtonViewModel, modifier), gapComposer), gapComposer, 24576, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(iconButtonViewModel, modifier, function1, i, 26);
        }
    }

    public static final String countryCodeToFlagEmoji(String str) {
        str.getClass();
        if (str.length() != 2) {
            return "";
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        int codePointAt = Character.codePointAt(upperCase, 0) - (-127397);
        int codePointAt2 = Character.codePointAt(upperCase, 1) - (-127397);
        char[] chars = Character.toChars(codePointAt);
        chars.getClass();
        char[] chars2 = Character.toChars(codePointAt2);
        chars2.getClass();
        return new String(ArraysKt___ArraysJvmKt.plus(chars, chars2));
    }

    public static void playTogether(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
