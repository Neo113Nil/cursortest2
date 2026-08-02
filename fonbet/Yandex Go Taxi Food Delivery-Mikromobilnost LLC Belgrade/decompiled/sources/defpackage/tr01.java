package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.a;

/* loaded from: classes3.dex */
public final class tr01 {
    public final us3 a;
    public final AppAnalyticsReporter b;
    public final TransferMainResultScreenParams c;
    public final hwo0 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public tr01(us3 us3Var, AppAnalyticsReporter appAnalyticsReporter, vfy0 vfy0Var, TransferMainResultScreenParams transferMainResultScreenParams) {
        this.a = us3Var;
        this.b = appAnalyticsReporter;
        this.c = transferMainResultScreenParams;
        String templatePaymentType = transferMainResultScreenParams.getTemplatePaymentType();
        a aVar = PrerequisiteParam.TransfersPagePrerequisiteType.Companion;
        templatePaymentType = templatePaymentType == null ? "" : templatePaymentType;
        aVar.getClass();
        PrerequisiteParam.TransfersPagePrerequisiteType a = a.a(templatePaymentType);
        int i = a == null ? -1 : sfy0.b[a.ordinal()];
        TemplatePaymentTypeTransfers templatePaymentTypeTransfers = i != 1 ? i != 2 ? i != 3 ? null : TemplatePaymentTypeTransfers.TELECOM : TemplatePaymentTypeTransfers.MOBILE : TemplatePaymentTypeTransfers.PHONE;
        this.d = templatePaymentTypeTransfers != null ? new hwo0((AppAnalyticsReporter) vfy0Var.a.a.get(), templatePaymentTypeTransfers, "", (String) null) : null;
        this.e = transferMainResultScreenParams.getProduct();
        this.f = transferMainResultScreenParams.getTransferSessionId();
        this.g = transferMainResultScreenParams.getDirection().name();
        TransferScenario scenario = transferMainResultScreenParams.getScenario();
        this.h = scenario != null ? scenario.name() : null;
        String transferId = transferMainResultScreenParams.getTransferId();
        this.i = transferId == null ? transferMainResultScreenParams.getCheckId() : transferId;
    }

    public static AnalyticsPaymentStatus a(ResultStatus resultStatus) {
        switch (rr01.a[resultStatus.ordinal()]) {
            case 1:
                return AnalyticsPaymentStatus.TIMEOUT;
            case 2:
                return AnalyticsPaymentStatus.FAILED;
            case 3:
                return AnalyticsPaymentStatus.ERROR;
            case 4:
                return AnalyticsPaymentStatus.ACCEPTED;
            case 5:
            case 6:
                return AnalyticsPaymentStatus.SUCCESS;
            case 7:
                return AnalyticsPaymentStatus.PROCESSING;
            default:
                w511.b();
                return null;
        }
    }
}
