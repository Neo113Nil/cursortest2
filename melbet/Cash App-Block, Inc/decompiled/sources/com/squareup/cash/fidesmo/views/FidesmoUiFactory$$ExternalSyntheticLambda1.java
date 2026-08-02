package com.squareup.cash.fidesmo.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FidesmoUiFactory$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FidesmoProvisioningViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ FidesmoUiFactory$$ExternalSyntheticLambda1(FidesmoProvisioningViewModel fidesmoProvisioningViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = fidesmoProvisioningViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    FidesmoProvisioningViewKt.FidesmoProvisioningView(this.f$0, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ChromeConfigKt.ChromeConfig(ChromeSystemIconColor.ALWAYS_LIGHT, (Boolean) null, gapComposer2, 6, 14);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    FidesmoProvisioningViewModel fidesmoProvisioningViewModel = this.f$0;
                    boolean z2 = fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Loading;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(28);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(fidesmoProvisioningViewModel, z2, systemBarsPadding, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-84991409, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, i2), gapComposer2), gapComposer2, 199680, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
