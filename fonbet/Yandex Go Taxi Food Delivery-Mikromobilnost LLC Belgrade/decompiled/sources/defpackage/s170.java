package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.OnboardingStoriesTimeoutConfig;

/* loaded from: classes9.dex */
public abstract class s170 {
    public static final dfr a;

    static {
        byte[] bArr = tje.f2;
        byte[] bArr2 = new byte[38];
        for (int i = 0; i < 38; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, OnboardingStoriesTimeoutConfig.class), new CommonExperiment(new OnboardingStoriesTimeoutConfig(false, 5000), ExperimentApplyType.LATEST));
    }
}
