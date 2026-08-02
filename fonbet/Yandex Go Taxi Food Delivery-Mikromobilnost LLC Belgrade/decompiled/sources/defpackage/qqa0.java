package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PdfErrorDetailsReportingFlag;

/* loaded from: classes9.dex */
public abstract class qqa0 {
    public static final dfr a = new dfr("yb_mobile_pdf_error_details_reporting", Types.newParameterizedType(CommonExperiment.class, PdfErrorDetailsReportingFlag.class), new CommonExperiment(new PdfErrorDetailsReportingFlag(false, false), ExperimentApplyType.LATEST));
}
