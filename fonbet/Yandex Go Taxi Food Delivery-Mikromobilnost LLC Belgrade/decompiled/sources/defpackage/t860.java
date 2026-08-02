package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcOldUserPromoConfig;

/* loaded from: classes9.dex */
public abstract class t860 {
    public static final dfr a;

    static {
        byte[] bArr = tje.v3;
        byte[] bArr2 = new byte[30];
        for (int i = 0; i < 30; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcOldUserPromoConfig.class), new CommonExperiment(new NfcOldUserPromoConfig(null, null), ExperimentApplyType.LATEST));
    }
}
