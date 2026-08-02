package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcButtonOnDashboardConfig;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class v760 {
    public static final dfr a;

    static {
        byte[] bArr = tje.J2;
        byte[] bArr2 = new byte[42];
        for (int i = 0; i < 42; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NfcButtonOnDashboardConfig.class);
        Boolean bool = Boolean.FALSE;
        a = new dfr(str, newParameterizedType, new CommonExperiment(new NfcButtonOnDashboardConfig(bool, bool, bool, bool, bool, bool), ExperimentApplyType.LATEST));
    }
}
