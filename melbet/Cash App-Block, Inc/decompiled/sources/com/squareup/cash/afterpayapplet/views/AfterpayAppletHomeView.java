package com.squareup.cash.afterpayapplet.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeView extends ComposeUiView {
    public final RealImageLoader imageLoader;
    public final boolean shouldHideCalendar;
    public final boolean useOptimizeExperimentHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletHomeView(Context context, RealImageLoader realImageLoader, boolean z, boolean z2) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.useOptimizeExperimentHeader = z;
        this.shouldHideCalendar = z2;
    }

    public final void Content(AfterpayAppletHomeViewModel afterpayAppletHomeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1047508691);
        int i3 = (gapComposer.changedInstance(afterpayAppletHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletHomeViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletHomeView$$ExternalSyntheticLambda0(this, afterpayAppletHomeViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(395619678, new AfterpayAppletHomeView$$ExternalSyntheticLambda0(afterpayAppletHomeViewModel, function1, this, i4), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterpayAppletHomeView$$ExternalSyntheticLambda0(this, afterpayAppletHomeViewModel, function1, i2, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AfterpayAppletHomeViewModel) obj, function1, gapComposer, 0);
    }
}
