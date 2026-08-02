package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcShortcutBannersConfig;

/* loaded from: classes9.dex */
public abstract class w960 {
    public static final dfr a;

    static {
        byte[] bArr = tje.E0;
        byte[] bArr2 = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcShortcutBannersConfig.class), new CommonExperiment(new NfcShortcutBannersConfig(false, null), ExperimentApplyType.LATEST));
    }
}
