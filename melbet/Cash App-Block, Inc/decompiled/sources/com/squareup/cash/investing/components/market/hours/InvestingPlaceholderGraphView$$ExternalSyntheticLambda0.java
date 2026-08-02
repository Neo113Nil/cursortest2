package com.squareup.cash.investing.components.market.hours;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPlaceholderGraphView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingPlaceholderGraphView f$0;
    public final /* synthetic */ InvestingPlaceholderGraphViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ InvestingPlaceholderGraphView$$ExternalSyntheticLambda0(InvestingPlaceholderGraphView investingPlaceholderGraphView, InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$0 = investingPlaceholderGraphView;
        this.f$1 = investingPlaceholderGraphViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                int intValue = num.intValue();
                int i = InvestingPlaceholderGraphView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-740815416, new InvestingPlaceholderGraphView$$ExternalSyntheticLambda0(this.f$0, this.f$1, this.f$2, 2, (byte) 0), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                int i2 = InvestingPlaceholderGraphView.$r8$clinit;
                this.f$0.Content(this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                int i3 = InvestingPlaceholderGraphView.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    InvestingPlaceholderGraphView investingPlaceholderGraphView = this.f$0;
                    InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = this.f$1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(899717234, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(4, investingPlaceholderGraphView, investingPlaceholderGraphViewModel), gapComposer2);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    investingPlaceholderGraphView.m3584PlaceholderGraphBx497Mc(investingPlaceholderGraphViewModel, this.f$2, rememberComposableLambda, colors.data.trend.positive, gapComposer2, 33152);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingPlaceholderGraphView$$ExternalSyntheticLambda0(InvestingPlaceholderGraphView investingPlaceholderGraphView, InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = investingPlaceholderGraphView;
        this.f$1 = investingPlaceholderGraphViewModel;
        this.f$2 = function1;
    }
}
