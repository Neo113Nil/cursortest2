package com.squareup.cash.afterpayapplet.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterpayAppletUpsellSheetView extends ComposeUiView implements BottomSheetConfig, OutsideTapCloses {
    public final /* synthetic */ int $r8$classId;
    public final ArcadeBottomSheetStyle bottomSheetStyle;
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletUpsellSheetView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 1:
                super(context);
                this.imageLoader = realImageLoader;
                this.bottomSheetStyle = Navigation.ArcadeBottomSheetStyle(this);
                break;
            default:
                this.imageLoader = realImageLoader;
                this.bottomSheetStyle = Navigation.ArcadeBottomSheetStyle(this);
                break;
        }
    }

    public void Content(AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1049640328);
        int i2 = (gapComposer.changedInstance(afterpayAppletUpsellSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletUpsellSheetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletUpsellSheetView$$ExternalSyntheticLambda0(this, afterpayAppletUpsellSheetViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1388110029, new AfterpayAppletUpsellSheetView$$ExternalSyntheticLambda0(this, afterpayAppletUpsellSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterpayAppletUpsellSheetView$$ExternalSyntheticLambda0(this, afterpayAppletUpsellSheetViewModel, function1, i, 2);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        switch (this.$r8$classId) {
        }
        return this.bottomSheetStyle;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((AfterpayAppletUpsellSheetViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((AfterpayAppletMerchantSheetViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1416358601);
        int i2 = (gapComposer.changed(afterpayAppletMerchantSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletMerchantSheetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0(this, afterpayAppletMerchantSheetViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2091109026, new AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0(this, afterpayAppletMerchantSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0(this, afterpayAppletMerchantSheetViewModel, function1, i, 2);
        }
    }
}
