package com.squareup.cash.benefits.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsUiFactory$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GreenEligibleTransactionsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BenefitsUiFactory$$ExternalSyntheticLambda3(GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = greenEligibleTransactionsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BenefitsHomeViewKt.GreenEligibleTransactions(greenEligibleTransactionsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
                    GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel2 = this.f$0;
                    Strings.LoadableFullScreenContent(greenEligibleTransactionsViewModel2, greenEligibleTransactionsViewModel2 instanceof GreenEligibleTransactionsViewModel.Loading, m, null, null, Expect_jvmKt.rememberComposableLambda(-1017249205, new SetPinViewKt$$ExternalSyntheticLambda4(12, function1), gapComposer2), gapComposer2, 196608, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.GreenEligibleTransactions(greenEligibleTransactionsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BenefitsUiFactory$$ExternalSyntheticLambda3(GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = greenEligibleTransactionsViewModel;
        this.f$1 = function1;
    }
}
