package com.squareup.cash.paychecks.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DistributePaycheckViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DistributePaycheckViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DistributePaycheckViewKt$$ExternalSyntheticLambda0(DistributePaycheckViewModel.Loaded loaded, Function1 function1) {
        this.f$0 = loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        DistributePaycheckViewModel.Loaded loaded = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HelpSheetViewKt.Toolbar(loaded.title, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                HelpSheetViewKt.ContentSlot(loaded, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DistributePaycheckViewKt$$ExternalSyntheticLambda0(DistributePaycheckViewModel.Loaded loaded, Function1 function1, int i) {
        this.f$0 = loaded;
        this.f$1 = function1;
    }
}
