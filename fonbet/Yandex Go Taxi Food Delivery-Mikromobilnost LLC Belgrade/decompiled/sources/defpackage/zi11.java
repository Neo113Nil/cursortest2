package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TsarButtonConfigV2;

/* loaded from: classes9.dex */
public abstract class zi11 {
    public static final dfr a;

    static {
        byte[] bArr = tje.H1;
        byte[] bArr2 = new byte[27];
        for (int i = 0; i < 27; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, TsarButtonConfigV2.class), new CommonExperiment(new TsarButtonConfigV2(false, null), ExperimentApplyType.LATEST));
    }
}
