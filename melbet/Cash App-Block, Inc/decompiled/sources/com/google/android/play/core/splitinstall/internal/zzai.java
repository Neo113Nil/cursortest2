package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.squareup.cash.R;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class zzai {
    public static final void applyNavigationState(NavigationState navigationState, Function0 function0, Function0 function02, Function0 function03, Pi2NavigationBar pi2NavigationBar, View view) {
        navigationState.getClass();
        pi2NavigationBar.getClass();
        view.getClass();
        pi2NavigationBar.setState$shared_release(navigationState, function0, function02, function03);
        UiScreenRunner$$ExternalSyntheticLambda29 uiScreenRunner$$ExternalSyntheticLambda29 = new UiScreenRunner$$ExternalSyntheticLambda29(23, navigationState, function0, function02);
        view.setTag(R.id.pi2_back_press_handler, new KClasses$$Lambda$1(19));
        if (navigationState.handleBackPress) {
            BackPressHandlerKt.setBackPressedHandler(view, uiScreenRunner$$ExternalSyntheticLambda29);
        }
    }

    public static final long getBackgroundColor(ColorModel colorModel, Composer composer) {
        colorModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Color forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel, ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)), gapComposer);
        if (forThemeComposable != null) {
            gapComposer.startReplaceGroup(189221412);
            gapComposer.end(false);
            return forThemeComposable.value;
        }
        gapComposer.startReplaceGroup(189223799);
        long j = MooncakeTheme.getColors(gapComposer).secondaryBackground;
        gapComposer.end(false);
        return j;
    }
}
