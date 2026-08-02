package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel.Success f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19(EarnerEnrollmentBlockerViewModel.Success success, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = success;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        EarnerEnrollmentBlockerViewModel.Success success = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessBanner(success.bannerImageUrl, gapComposer, 0);
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessDetails(success, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessBanner(success.bannerImageUrl, gapComposer2, 0);
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessDetails(success, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentDoneButton(success, function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentDoneButton(success, function1, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
