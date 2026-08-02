package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.MerchantOffersSearchConfig;

/* loaded from: classes9.dex */
public abstract class xp10 {
    public static final dfr a;

    static {
        byte[] bArr = tje.A1;
        byte[] bArr2 = new byte[34];
        for (int i = 0; i < 34; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, MerchantOffersSearchConfig.class), new CommonExperiment(new MerchantOffersSearchConfig(500), ExperimentApplyType.LATEST));
    }
}
