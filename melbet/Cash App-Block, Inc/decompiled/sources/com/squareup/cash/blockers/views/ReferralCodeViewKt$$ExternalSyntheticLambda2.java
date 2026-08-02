package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ReferralCodeViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReferralCodeViewModel f$1;
    public final /* synthetic */ FocusRequester f$2;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ MutableState f$5;

    public /* synthetic */ ReferralCodeViewKt$$ExternalSyntheticLambda2(ReferralCodeViewModel referralCodeViewModel, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$1 = referralCodeViewModel;
        this.f$2 = focusRequester;
        this.f$3 = delegatingSoftwareKeyboardController;
        this.f$4 = function1;
        this.f$5 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-639350833, new ReferralCodeViewKt$$ExternalSyntheticLambda2(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, 1), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
                    ReferralCodeViewModel referralCodeViewModel = this.f$1;
                    Strings.LoadableFullScreenContent(referralCodeViewModel, referralCodeViewModel.showLoadingScreen, m, null, null, Expect_jvmKt.rememberComposableLambda(-1653536271, new TabToolbarsKt$$ExternalSyntheticLambda16(this.f$2, this.f$3, this.f$4, this.f$5), gapComposer2), gapComposer2, 196608, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
