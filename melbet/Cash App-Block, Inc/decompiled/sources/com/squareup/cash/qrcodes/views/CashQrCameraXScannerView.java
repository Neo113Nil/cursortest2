package com.squareup.cash.qrcodes.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.views.BirthdayView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.OverridesSystemBars;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class CashQrCameraXScannerView extends ComposeUiView implements OverridesSystemBars {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object cashVibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashQrCameraXScannerView(Context context, AndroidPermissionManager androidPermissionManager) {
        super(context);
        context.getClass();
        this.cashVibrator = androidPermissionManager;
    }

    public void Content(CashQrScannerViewModel cashQrScannerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-288700561);
        int i2 = (gapComposer.changedInstance(cashQrScannerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (cashQrScannerViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(11, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime((RealCashVibrator) this.cashVibrator), Expect_jvmKt.rememberComposableLambda(-2051990481, new CashQrCameraXScannerView$$ExternalSyntheticLambda2(cashQrScannerViewModel, function1, 0), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(this, cashQrScannerViewModel, function1, i, 5);
        }
    }

    @Override // com.squareup.cash.ui.OverridesSystemBars
    public final boolean isLightSystemBars() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashQrCameraXScannerView(Context context, RealCashVibrator realCashVibrator) {
        super(context);
        context.getClass();
        this.cashVibrator = realCashVibrator;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((CashQrScannerViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((CardActivationQrViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(CardActivationQrViewModel cardActivationQrViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-212920128);
        int i2 = (gapComposer.changedInstance(cardActivationQrViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (cardActivationQrViewModel != null) {
            Continuation continuation = null;
            if (!cardActivationQrViewModel.cameraPermissions) {
                gapComposer.startReplaceGroup(563332826);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TemporaryStorage$getDir$2(this, continuation, 5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(563402018);
                gapComposer.end(false);
            }
            SsnViewKt.CardActivationQrScanner(cardActivationQrViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, cardActivationQrViewModel, function1, i, 13);
        }
    }
}
