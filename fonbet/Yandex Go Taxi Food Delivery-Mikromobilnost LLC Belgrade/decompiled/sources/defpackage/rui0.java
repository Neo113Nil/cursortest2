package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.RemoteConfigCallConfig;
import com.ybsdk.rconfig.configs.RemoteConfigCallType;

/* loaded from: classes9.dex */
public abstract class rui0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.l3;
        byte[] bArr2 = new byte[30];
        for (int i = 0; i < 30; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, RemoteConfigCallConfig.class), new CommonExperiment(new RemoteConfigCallConfig(RemoteConfigCallType.DEFAULT_RESULT), ExperimentApplyType.LATEST));
    }
}
