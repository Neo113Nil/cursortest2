package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DivkitResetConfigSchema;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class tul {
    public static final dfr a = new dfr("yb_div_kit_reset_config", Types.newParameterizedType(CommonExperiment.class, DivkitResetConfigSchema.class), new CommonExperiment(new DivkitResetConfigSchema(EmptyList.a), ExperimentApplyType.LATEST));
}
