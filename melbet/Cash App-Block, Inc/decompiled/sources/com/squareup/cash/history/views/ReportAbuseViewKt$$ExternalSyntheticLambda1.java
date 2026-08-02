package com.squareup.cash.history.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ReportAbuseViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReportAbuseViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ReportAbuseViewKt$$ExternalSyntheticLambda1(ReportAbuseViewModel reportAbuseViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = reportAbuseViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ReportAbuseViewModel reportAbuseViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ReportAbuseViewKt.ReportAbuse(reportAbuseViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                int i2 = ReportAbuseDialogView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (reportAbuseViewModel == null) {
                        gapComposer.startReplaceGroup(1020399477);
                    } else {
                        gapComposer.startReplaceGroup(1020399478);
                        ReportAbuseViewKt.ReportAbuseDialog(reportAbuseViewModel, function1, gapComposer, 0);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                ReportAbuseViewKt.ReportAbuseDialog(reportAbuseViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ReportAbuseViewKt$$ExternalSyntheticLambda1(ReportAbuseViewModel reportAbuseViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = reportAbuseViewModel;
        this.f$1 = function1;
    }
}
