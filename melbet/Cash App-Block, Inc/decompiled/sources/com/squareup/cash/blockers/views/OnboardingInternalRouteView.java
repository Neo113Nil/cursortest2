package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.room.TransactorKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class OnboardingInternalRouteView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInternalRouteView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(OnboardingInternalRouteViewModel onboardingInternalRouteViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-980944132);
        int i2 = (gapComposer.changedInstance(onboardingInternalRouteViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (onboardingInternalRouteViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            TransactorKt.LoadableContent(onboardingInternalRouteViewModel, onboardingInternalRouteViewModel.loading, ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape), null, new OffersHomeQueries$$ExternalSyntheticLambda1(false, 4), null, Expect_jvmKt.rememberComposableLambda(544665906, new SetPinViewKt$$ExternalSyntheticLambda4(19, function1), gapComposer), gapComposer, (i2 & 14) | 1572864, 40);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, onboardingInternalRouteViewModel, function1, i, 26);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((OnboardingInternalRouteViewModel) obj, function1, gapComposer, 0);
    }
}
