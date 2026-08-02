package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcBannerEnabledConfig;

/* loaded from: classes9.dex */
public abstract class z860 {
    public static final dfr a;

    static {
        Boolean bool = Boolean.FALSE;
        NfcBannerEnabledConfig nfcBannerEnabledConfig = new NfcBannerEnabledConfig(false, false, false, false, bool, bool);
        byte[] bArr = tje.v0;
        byte[] bArr2 = new byte[54];
        for (int i = 0; i < 54; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcBannerEnabledConfig.class), new CommonExperiment(nfcBannerEnabledConfig, ExperimentApplyType.LATEST));
    }
}
