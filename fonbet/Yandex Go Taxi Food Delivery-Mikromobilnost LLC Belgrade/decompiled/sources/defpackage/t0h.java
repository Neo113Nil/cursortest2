package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NativeUriInterceptorRulesConfig;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class t0h {
    public static final dfr a = new dfr("yb_native_uri_interceptor_rules_config", Types.newParameterizedType(CommonExperiment.class, NativeUriInterceptorRulesConfig.class), new CommonExperiment(new NativeUriInterceptorRulesConfig(b.f()), ExperimentApplyType.LATEST));
}
