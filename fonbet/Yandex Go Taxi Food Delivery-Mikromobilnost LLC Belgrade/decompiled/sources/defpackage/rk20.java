package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.MlKitExceptionFiltersConfig;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class rk20 {
    public static final dfr a = new dfr("yb_mlkit_exception_filters_config", Types.newParameterizedType(CommonExperiment.class, MlKitExceptionFiltersConfig.class), new CommonExperiment(new MlKitExceptionFiltersConfig(Collections.singletonList("^\\w*MlKitContext is already initialized\\w*$")), ExperimentApplyType.LATEST));
}
