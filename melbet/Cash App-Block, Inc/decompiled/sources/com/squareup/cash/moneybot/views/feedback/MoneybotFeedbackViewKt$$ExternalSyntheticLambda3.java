package com.squareup.cash.moneybot.views.feedback;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.broadway.ui.compose.UiScope;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotFeedbackViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MoneybotFeedbackViewModel f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ TextFieldState f$3;

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda3(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1, Modifier modifier, TextFieldState textFieldState) {
        this.f$1 = moneybotFeedbackViewModel;
        this.f$0 = function1;
        this.f$2 = modifier;
        this.f$3 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$0;
        MoneybotFeedbackViewModel moneybotFeedbackViewModel = this.f$1;
        switch (i) {
            case 0:
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    EnterTransitionImpl slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(1, (Function1) rememberedValue);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(uiScope, fillMaxSize, slideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(1, (Function1) rememberedValue2), 4);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(animateEnterExit$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(1862949524, new MusicViewKt$$ExternalSyntheticLambda7(14, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-9301117, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda0(function1, moneybotFeedbackViewModel), gapComposer), Expect_jvmKt.rememberComposableLambda(-1469630614, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda3(moneybotFeedbackViewModel, function1, this.f$2, this.f$3), gapComposer), gapComposer, 224256, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    Countries.PageHeader(moneybotFeedbackViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer2);
                    Modifier modifier = this.f$2;
                    zzacn.FeedbackOptionDropdown(moneybotFeedbackViewModel, function1, modifier, gapComposer2, 0);
                    Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal), companion, 16.0f, gapComposer2);
                    InputAreaKt.InputArea(this.f$3, modifier, false, false, false, null, null, moneybotFeedbackViewModel.commentPlaceholder, null, null, null, null, null, null, null, gapComposer2, 0, 0, 32636);
                    Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal), companion, 32.0f, gapComposer2);
                    String str = moneybotFeedbackViewModel.disclaimerText;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda21(11, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    zzacn.DisclaimerText(0, gapComposer2, modifier, str, (Function0) rememberedValue3);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda3(Function1 function1, MoneybotFeedbackViewModel moneybotFeedbackViewModel, Modifier modifier, TextFieldState textFieldState) {
        this.f$0 = function1;
        this.f$1 = moneybotFeedbackViewModel;
        this.f$2 = modifier;
        this.f$3 = textFieldState;
    }
}
