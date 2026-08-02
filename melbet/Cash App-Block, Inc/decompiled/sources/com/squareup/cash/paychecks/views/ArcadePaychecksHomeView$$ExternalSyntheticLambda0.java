package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadePaychecksHomeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PaychecksHomeViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ArcadePaychecksHomeView$$ExternalSyntheticLambda0(PaychecksHomeViewModel paychecksHomeViewModel, Function1 function1) {
        this.f$0 = paychecksHomeViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PaychecksHomeViewModel paychecksHomeViewModel = this.f$0;
        Function1 function1 = this.f$1;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    HelpSheetViewKt.ArcadePaychecksHome(paychecksHomeViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-438905843, new MusicViewKt$$ExternalSyntheticLambda7(24, function1), gapComposer2), null, Expect_jvmKt.rememberComposableLambda(-1094771721, new ProfileKt$$ExternalSyntheticLambda1(i2, (Object) paychecksHomeViewModel, (Object) function1), gapComposer2), gapComposer2, 199680, 22);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadePaychecksHomeView$$ExternalSyntheticLambda0(Function1 function1, PaychecksHomeViewModel paychecksHomeViewModel) {
        this.f$1 = function1;
        this.f$0 = paychecksHomeViewModel;
    }
}
