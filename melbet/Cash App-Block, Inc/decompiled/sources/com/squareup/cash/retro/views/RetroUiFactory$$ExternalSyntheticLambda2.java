package com.squareup.cash.retro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class RetroUiFactory$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelectPaymentPlanViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ RetroUiFactory$$ExternalSyntheticLambda2(SelectPaymentPlanViewModel selectPaymentPlanViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = selectPaymentPlanViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1253785668, new RetroUiFactory$$ExternalSyntheticLambda2(this.f$0, this.f$1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SelectPaymentPlanViewKt.SelectPaymentPlanView(this.f$0, this.f$1, null, null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
