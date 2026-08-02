package com.squareup.cash.payments.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SchedulePaymentViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SchedulePaymentViewModel f$1;

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda0(SchedulePaymentViewModel schedulePaymentViewModel, Function1 function1) {
        this.f$1 = schedulePaymentViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        SchedulePaymentViewModel schedulePaymentViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape)), null, null, Expect_jvmKt.rememberComposableLambda(2016271806, new PdfPreviewViewKt$$ExternalSyntheticLambda4(3, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1304585519, new SchedulePaymentViewKt$$ExternalSyntheticLambda0(schedulePaymentViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1352873128, new SchedulePaymentViewKt$$ExternalSyntheticLambda4(function1, schedulePaymentViewModel), gapComposer), gapComposer, 224256, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.VERTICAL, Expect_jvmKt.rememberComposableLambda(490682096, new PoolListSectionKt$$ExternalSyntheticLambda2(schedulePaymentViewModel, 6), gapComposer2), Expect_jvmKt.rememberComposableLambda(756684209, new SchedulePaymentViewKt$$ExternalSyntheticLambda4(schedulePaymentViewModel, function1), gapComposer2), gapComposer2, 28032, 3);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda0(Function1 function1, SchedulePaymentViewModel schedulePaymentViewModel) {
        this.f$0 = function1;
        this.f$1 = schedulePaymentViewModel;
    }
}
