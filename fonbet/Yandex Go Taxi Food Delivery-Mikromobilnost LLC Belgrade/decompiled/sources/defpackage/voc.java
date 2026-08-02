package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PollingConfigsImpl;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class voc {
    public static final dfr a;

    static {
        byte[] bArr = tje.m;
        byte[] bArr2 = new byte[26];
        for (int i = 0; i < 26; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, PollingConfigsImpl.class), new CommonExperiment(new PollingConfigsImpl(b.f()), ExperimentApplyType.LATEST));
    }
}
