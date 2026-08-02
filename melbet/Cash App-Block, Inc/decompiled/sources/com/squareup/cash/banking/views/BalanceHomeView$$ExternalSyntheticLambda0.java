package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.TransactorKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BalanceHomeViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BalanceHomeView$$ExternalSyntheticLambda0(BalanceHomeViewModel balanceHomeViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = balanceHomeViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-338672802, new BalanceHomeView$$ExternalSyntheticLambda0(this.f$0, function1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    BalanceHomeViewModel balanceHomeViewModel = this.f$0;
                    TransactorKt.LoadableContent(balanceHomeViewModel, balanceHomeViewModel instanceof BalanceHomeViewModel.InitialLoading, null, null, new OffersHomeQueries$$ExternalSyntheticLambda1(false, 4), null, Expect_jvmKt.rememberComposableLambda(-30092994, new SetPinViewKt$$ExternalSyntheticLambda4(8, function1), gapComposer2), gapComposer2, 1572864, 44);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
