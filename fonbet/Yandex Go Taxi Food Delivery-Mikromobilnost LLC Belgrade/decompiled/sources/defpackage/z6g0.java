package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrErrorMessagesConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class z6g0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.W;
        byte[] bArr2 = new byte[22];
        for (int i = 0; i < 22; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrErrorMessagesConfig.class), new CommonExperiment(new QrErrorMessagesConfig(EmptyList.a, false), ExperimentApplyType.LATEST));
    }
}
