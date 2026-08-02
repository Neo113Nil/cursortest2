package com.squareup.cash.paychecks.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EditDistributionViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ EditDistributionViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda1(EditDistributionViewModel editDistributionViewModel, Function1 function1, Modifier modifier) {
        this.f$0 = editDistributionViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$2;
        Function1 function1 = this.f$1;
        EditDistributionViewModel editDistributionViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                HelpSheetViewKt.EditDistribution(editDistributionViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    EditDistributionViewModel.Content content = (EditDistributionViewModel.Content) editDistributionViewModel;
                    HelpSheetViewKt.EditDistributionContent(0, gapComposer, modifier, content, function1);
                    BottomSheet bottomSheet = content.explanation;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (bottomSheet == null) {
                        gapComposer.startReplaceGroup(-165877681);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-165877680);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(22, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        HelpSheetViewKt.PaycheckDistributionMonthlyEstimateExplanation(bottomSheet, null, (Function0) rememberedValue, gapComposer, 0);
                        gapComposer.end(false);
                    }
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda2(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda1(EditDistributionViewModel editDistributionViewModel, Function1 function1, Modifier modifier, int i) {
        this.f$0 = editDistributionViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }
}
