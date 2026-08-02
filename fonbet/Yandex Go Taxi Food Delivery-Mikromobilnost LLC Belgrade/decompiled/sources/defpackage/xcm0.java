package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.IncomeWidgetProgressAnimationConfig;

/* loaded from: classes9.dex */
public abstract class xcm0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.K1;
        byte[] bArr2 = new byte[45];
        for (int i = 0; i < 45; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, IncomeWidgetProgressAnimationConfig.class), new CommonExperiment(new IncomeWidgetProgressAnimationConfig(300, 750), ExperimentApplyType.LATEST));
    }
}
