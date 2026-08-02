package com.knotapi.knot.services;

import com.knotapi.knot.services.Reporter;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class Reporter$$ExternalSyntheticLambda3 implements Reporter.QueueModifier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Reporter.Report f$0;

    public /* synthetic */ Reporter$$ExternalSyntheticLambda3(Reporter.Report report, int i) {
        this.$r8$classId = i;
        this.f$0 = report;
    }

    @Override // com.knotapi.knot.services.Reporter.QueueModifier
    public final void modify(List list) {
        int i = this.$r8$classId;
        Reporter.Report report = this.f$0;
        switch (i) {
            case 0:
                Reporter.lambda$addReportToQueue$7(report, list);
                break;
            default:
                Reporter.lambda$removeReportFromQueue$9(report, list);
                break;
        }
    }
}
