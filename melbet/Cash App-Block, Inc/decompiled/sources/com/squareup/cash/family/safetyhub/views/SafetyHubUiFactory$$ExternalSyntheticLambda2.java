package com.squareup.cash.family.safetyhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SafetyHubUiFactory$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SafetyEducationPageViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SafetyHubUiFactory$$ExternalSyntheticLambda2(SafetyEducationPageViewModel safetyEducationPageViewModel, Function1 function1) {
        this.f$0 = safetyEducationPageViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        SafetyEducationPageViewModel safetyEducationPageViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MultiColorPageTitleKt.SafetyEducationPageView(safetyEducationPageViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                MultiColorPageTitleKt.SafetyEducationPageView(safetyEducationPageViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SafetyHubUiFactory$$ExternalSyntheticLambda2(SafetyEducationPageViewModel safetyEducationPageViewModel, Function1 function1, int i) {
        this.f$0 = safetyEducationPageViewModel;
        this.f$1 = function1;
    }
}
