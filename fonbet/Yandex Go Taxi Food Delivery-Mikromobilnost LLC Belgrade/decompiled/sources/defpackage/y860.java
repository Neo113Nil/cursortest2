package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcPaymentScreenBadgesConfig;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class y860 {
    public static final dfr a;
    public static final dfr b;

    static {
        String q = tje.q(tje.P0);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NfcPaymentScreenBadgesConfig.class);
        NfcPaymentScreenBadgesConfig nfcPaymentScreenBadgesConfig = new NfcPaymentScreenBadgesConfig(null, null, null, null, null, null);
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(q, newParameterizedType, new CommonExperiment(nfcPaymentScreenBadgesConfig, experimentApplyType));
        b = new dfr(tje.q(tje.j2), Types.newParameterizedType(CommonExperiment.class, NfcPaymentScreenBadgesConfig.class), new CommonExperiment(new NfcPaymentScreenBadgesConfig(null, null, null, null, null, null), experimentApplyType));
    }
}
