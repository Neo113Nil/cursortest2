package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.ResponseCacheConfigExperiment;

/* loaded from: classes9.dex */
public abstract class tvj0 {
    public static final dfr a = new dfr("yb_insta_killswitch", Types.newParameterizedType(CommonExperiment.class, ResponseCacheConfigExperiment.class), new CommonExperiment(new ResponseCacheConfigExperiment(false), ExperimentApplyType.LATEST));
}
