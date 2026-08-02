package com.squareup.cash.payments.views.nearby;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ NearbyPaymentsInfoViewModel f$1;

    public /* synthetic */ NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda0(Function1 function1, NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nearbyPaymentsInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(958248126, new NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda0(function1, nearbyPaymentsInfoViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(520165014, new PdfPreviewViewKt$$ExternalSyntheticLambda4(7, function1), gapComposer2), null, Expect_jvmKt.rememberComposableLambda(1089974784, new ProfileKt$$ExternalSyntheticLambda1(12, (Object) nearbyPaymentsInfoViewModel, (Object) function1), gapComposer2), gapComposer2, 199680, 22);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
