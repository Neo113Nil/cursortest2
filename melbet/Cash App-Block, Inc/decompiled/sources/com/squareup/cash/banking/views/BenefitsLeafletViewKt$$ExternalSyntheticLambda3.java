package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsLeafletViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BenefitsLeafletViewModel f$1;

    public /* synthetic */ BenefitsLeafletViewKt$$ExternalSyntheticLambda3(Function1 function1, BenefitsLeafletViewModel benefitsLeafletViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = benefitsLeafletViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BenefitsLeafletViewModel benefitsLeafletViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(751948972, new BenefitsLeafletViewKt$$ExternalSyntheticLambda3(function1, benefitsLeafletViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(benefitsLeafletViewModel);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BenefitsLeafletViewKt$$ExternalSyntheticLambda2(function1, benefitsLeafletViewModel, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1217686531, new BankingDialogKt$$ExternalSyntheticLambda2(11, (Object) benefitsLeafletViewModel, function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
