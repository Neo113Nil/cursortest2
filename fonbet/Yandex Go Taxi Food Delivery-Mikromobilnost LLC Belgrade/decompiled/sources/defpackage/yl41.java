package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.WebViewAutoRetryConfig;

/* loaded from: classes9.dex */
public abstract class yl41 {
    public static final dfr a;

    static {
        byte[] bArr = tje.o0;
        byte[] bArr2 = new byte[24];
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, WebViewAutoRetryConfig.class), new CommonExperiment(new WebViewAutoRetryConfig(false, 1), ExperimentApplyType.LATEST));
    }
}
