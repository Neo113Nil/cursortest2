package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcButtonBadgesConfig;

/* loaded from: classes9.dex */
public abstract class u760 {
    public static final dfr a;

    static {
        byte[] bArr = tje.G;
        byte[] bArr2 = new byte[36];
        for (int i = 0; i < 36; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcButtonBadgesConfig.class), new CommonExperiment(new NfcButtonBadgesConfig(null, null, null, null, null, null), ExperimentApplyType.LATEST));
    }
}
