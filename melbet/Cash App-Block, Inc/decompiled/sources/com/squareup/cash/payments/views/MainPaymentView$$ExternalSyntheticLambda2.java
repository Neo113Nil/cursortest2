package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentView$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainPaymentViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ MainPaymentView f$2;

    public /* synthetic */ MainPaymentView$$ExternalSyntheticLambda2(MainPaymentView mainPaymentView, MainPaymentViewModel mainPaymentViewModel, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$2 = mainPaymentView;
        this.f$0 = mainPaymentViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 2;
        MainPaymentView mainPaymentView = this.f$2;
        Function1 function1 = this.f$1;
        MainPaymentViewModel mainPaymentViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (mainPaymentViewModel.isBitcoin) {
                    gapComposer.startReplaceGroup(1222564540);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-61151818, new MainPaymentView$$ExternalSyntheticLambda2(mainPaymentViewModel, function1, mainPaymentView, i2), gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1222767900);
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(209393293, new MainPaymentView$$ExternalSyntheticLambda2(mainPaymentViewModel, function1, mainPaymentView, 3), gapComposer), gapComposer, 3072, 7);
                    gapComposer.end(false);
                }
                break;
            case 1:
                num.getClass();
                mainPaymentView.Content(mainPaymentViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    MainPaymentViewKt.MainPayment(mainPaymentViewModel, function1, mainPaymentView.imageLoader, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                int intValue3 = num.intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    MainPaymentViewKt.MainPayment(mainPaymentViewModel, function1, mainPaymentView.imageLoader, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentView$$ExternalSyntheticLambda2(MainPaymentViewModel mainPaymentViewModel, Function1 function1, MainPaymentView mainPaymentView, int i) {
        this.$r8$classId = i;
        this.f$0 = mainPaymentViewModel;
        this.f$1 = function1;
        this.f$2 = mainPaymentView;
    }
}
