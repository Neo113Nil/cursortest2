package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PfmFunFactGradientConfig;

/* loaded from: classes9.dex */
public abstract class sbb0 {
    public static final dfr a = new dfr("yb_mobile_pfm_fun_fact_gradient", Types.newParameterizedType(CommonExperiment.class, PfmFunFactGradientConfig.class), new CommonExperiment(new PfmFunFactGradientConfig(0.5f, -0.2f, 1.1f), ExperimentApplyType.LATEST));
}
