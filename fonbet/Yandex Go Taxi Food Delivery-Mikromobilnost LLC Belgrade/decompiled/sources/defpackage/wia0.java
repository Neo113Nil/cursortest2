package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PaymentSdkCreds;

/* loaded from: classes9.dex */
public abstract class wia0 {
    public static final dfr a = new dfr("yb_payment_sdk_credentials", Types.newParameterizedType(CommonExperiment.class, PaymentSdkCreds.class), new CommonExperiment(new PaymentSdkCreds(tje.q(tje.S1), "RUB", tje.q(tje.B1)), ExperimentApplyType.LATEST));
}
