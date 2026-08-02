package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.size.DimensionKt;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel.Success f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(EarnerEnrollmentBlockerViewModel.Success success, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = success;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        EarnerEnrollmentBlockerViewModel.Success success = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(344119680, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19(success, function1, 2), gapComposer), gapComposer, 24576, 15);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(SpacerKt.navigationBarsPadding(Modifier.Companion.$$INSTANCE), false, null, null, Expect_jvmKt.rememberComposableLambda(635169022, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19(success, function1, 3), gapComposer2), gapComposer2, 24576, 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                num.getClass();
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessDetails(success, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentDoneButton(success, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(EarnerEnrollmentBlockerViewModel.Success success, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = success;
        this.f$1 = function1;
    }
}
