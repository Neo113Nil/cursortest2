package com.squareup.cash.growtools.views.manager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.KCallablesJvm;

/* loaded from: classes9.dex */
public final /* synthetic */ class GrowToolsCompleteActivityView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ GrowToolsActivityViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ GrowToolsCompleteActivityView$$ExternalSyntheticLambda0(GrowToolsActivityViewModel growToolsActivityViewModel, Function1 function1) {
        this.f$0 = growToolsActivityViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        GrowToolsActivityViewModel growToolsActivityViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    KCallablesJvm.GrowToolsCompleteActivity(growToolsActivityViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                KCallablesJvm.GrowToolsCompleteActivity(growToolsActivityViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GrowToolsCompleteActivityView$$ExternalSyntheticLambda0(GrowToolsActivityViewModel growToolsActivityViewModel, Function1 function1, int i) {
        this.f$0 = growToolsActivityViewModel;
        this.f$1 = function1;
    }
}
