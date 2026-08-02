package com.squareup.cash.onboarding.accountpicker.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AccountPickerViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AccountPickerViewKt$$ExternalSyntheticLambda1(int i, AccountPickerViewModel accountPickerViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = accountPickerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AccountPickerViewModel accountPickerViewModel = this.f$0;
        boolean z = false;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.AccountPickerContent(accountPickerViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    AccountPickerViewModel accountPickerViewModel2 = this.f$0;
                    boolean z2 = (accountPickerViewModel2 instanceof AccountPickerViewModel.AccountList) && ((AccountPickerViewModel.AccountList) accountPickerViewModel2).isLoading;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(20);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(accountPickerViewModel2, z2, m177backgroundbw27NRU, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(238335090, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 8), gapComposer), gapComposer, 199680, 16);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AliasPickerViewKt.AccountPickerContent(accountPickerViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountPickerViewKt$$ExternalSyntheticLambda1(AccountPickerViewModel accountPickerViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = accountPickerViewModel;
        this.f$1 = function1;
    }
}
