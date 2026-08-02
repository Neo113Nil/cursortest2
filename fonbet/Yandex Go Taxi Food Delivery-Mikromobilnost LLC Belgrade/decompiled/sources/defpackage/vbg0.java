package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrReaderContentConfig;

/* loaded from: classes9.dex */
public abstract class vbg0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.Y;
        byte[] bArr2 = new byte[30];
        for (int i = 0; i < 30; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrReaderContentConfig.class), new CommonExperiment(new QrReaderContentConfig(null, null, null), ExperimentApplyType.LATEST));
    }
}
