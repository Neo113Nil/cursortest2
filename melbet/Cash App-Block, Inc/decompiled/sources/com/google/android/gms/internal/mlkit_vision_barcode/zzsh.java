package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.lifecycle.WindowBoundLifecycleOwner;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class zzsh {
    public static final void WindowBoundLifecycle(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1625626430);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new WindowBoundLifecycleOwner(lifecycleOwner);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WindowBoundLifecycleOwner windowBoundLifecycleOwner = (WindowBoundLifecycleOwner) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(lifecycleOwner) | gapComposer.changedInstance(windowBoundLifecycleOwner);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda0(6, lifecycleOwner, windowBoundLifecycleOwner);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(lifecycleOwner, (Function1) rememberedValue2, gapComposer);
            Updater.CompositionLocalProvider(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().defaultProvidedValue$runtime(windowBoundLifecycleOwner), Expect_jvmKt.rememberComposableLambda(870428034, new WorkViewFactory$$ExternalSyntheticLambda12(21, windowBoundLifecycleOwner, composableLambdaImpl), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeThemeKt$$ExternalSyntheticLambda2(i, 8, composableLambdaImpl);
        }
    }

    public static final TextFieldStateInputFieldText asInputFieldText(TextFieldState textFieldState) {
        textFieldState.getClass();
        return new TextFieldStateInputFieldText(textFieldState);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowLimitHub.deepLinkSpecs;
    }
}
