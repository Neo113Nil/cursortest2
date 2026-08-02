package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbSupportedQrFormatsSchema;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class sx51 {
    public static final dfr a = new dfr("yb_mobile_supported_qr_formats", Types.newParameterizedType(CommonExperiment.class, YbSupportedQrFormatsSchema.class), new CommonExperiment(new YbSupportedQrFormatsSchema(Collections.singletonList("qr_code")), ExperimentApplyType.LATEST));
}
