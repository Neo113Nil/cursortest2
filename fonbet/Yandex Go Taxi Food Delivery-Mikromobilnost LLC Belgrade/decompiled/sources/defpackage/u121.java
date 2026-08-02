package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.UnknownDeeplinkQueryConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class u121 {
    public static final dfr a;

    static {
        byte[] bArr = tje.r;
        byte[] bArr2 = new byte[46];
        for (int i = 0; i < 46; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, UnknownDeeplinkQueryConfig.class), new CommonExperiment(new UnknownDeeplinkQueryConfig(false, EmptyList.a), ExperimentApplyType.LATEST));
    }
}
