package com.squareup.cash.banking.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class OverdraftCoverageSheetView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftCoverageSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(OverdraftViewModel overdraftViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(818139291);
        int i2 = (gapComposer.changedInstance(overdraftViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (overdraftViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-989756890, new BadgeKt$$ExternalSyntheticLambda2(15, function1, overdraftViewModel), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(this, overdraftViewModel, function1, i, 12);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((OverdraftViewModel) obj, function1, gapComposer, 0);
    }
}
