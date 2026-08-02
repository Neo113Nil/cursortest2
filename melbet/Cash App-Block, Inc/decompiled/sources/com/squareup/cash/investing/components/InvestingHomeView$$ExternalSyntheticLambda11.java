package com.squareup.cash.investing.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingHomeView$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingHomeViewModel f$0;
    public final /* synthetic */ InvestingHomeView f$1;

    public /* synthetic */ InvestingHomeView$$ExternalSyntheticLambda11(InvestingHomeViewModel investingHomeViewModel, InvestingHomeView investingHomeView, int i) {
        this.$r8$classId = i;
        this.f$0 = investingHomeViewModel;
        this.f$1 = investingHomeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingHomeView investingHomeView = this.f$1;
        InvestingHomeViewModel investingHomeViewModel = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(634295122, new InvestingHomeView$$ExternalSyntheticLambda11(investingHomeViewModel, investingHomeView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String toolbarTitle = investingHomeViewModel.getToolbarTitle();
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changedInstance = gapComposer2.changedInstance(investingHomeView);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InvestingHomeView$$ExternalSyntheticLambda2(investingHomeView, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(toolbarTitle, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1030578163, new MoneyTabBookletKt$$ExternalSyntheticLambda4(14, investingHomeViewModel, investingHomeView), gapComposer2), gapComposer2, 1572912, 44);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
