package com.squareup.cash.history.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPasscodeDialogView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentPasscodeDialogView f$0;

    public /* synthetic */ PaymentPasscodeDialogView$$ExternalSyntheticLambda0(PaymentPasscodeDialogView paymentPasscodeDialogView, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentPasscodeDialogView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PaymentPasscodeDialogView paymentPasscodeDialogView = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1514979447, new PaymentPasscodeDialogView$$ExternalSyntheticLambda0(paymentPasscodeDialogView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) paymentPasscodeDialogView.currentModel$delegate.getValue();
                    if (passcodeDialogViewModel == null) {
                        gapComposer2.startReplaceGroup(-1236272624);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 320.0f);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.background.f1047app, ColorKt.RectangleShape), gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1235849722);
                        Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(paymentPasscodeDialogView.vibrator), Expect_jvmKt.rememberComposableLambda(-1993834075, new ErrorView$$ExternalSyntheticLambda1(29, passcodeDialogViewModel, paymentPasscodeDialogView), gapComposer2), gapComposer2, 56);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
