package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.HapticFeedbackFlag;

/* loaded from: classes9.dex */
public abstract class x6u {
    public static final dfr a;

    static {
        byte[] bArr = tje.L;
        byte[] bArr2 = new byte[20];
        for (int i = 0; i < 20; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, HapticFeedbackFlag.class), new CommonExperiment(new HapticFeedbackFlag(false, true), ExperimentApplyType.LATEST));
    }
}
