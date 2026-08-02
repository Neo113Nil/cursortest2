package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PfmDelaysConfig;

/* loaded from: classes9.dex */
public abstract class q9b0 {
    public static final dfr a = new dfr("yb_mobile_pfm_delays", Types.newParameterizedType(CommonExperiment.class, PfmDelaysConfig.class), new CommonExperiment(new PfmDelaysConfig(0), ExperimentApplyType.LATEST));
}
