package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.StartSessionOnInitConfig;

/* loaded from: classes9.dex */
public abstract class x1u0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.e;
        byte[] bArr2 = new byte[34];
        for (int i = 0; i < 34; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, StartSessionOnInitConfig.class), new CommonExperiment(new StartSessionOnInitConfig(true, false), ExperimentApplyType.LATEST));
    }
}
