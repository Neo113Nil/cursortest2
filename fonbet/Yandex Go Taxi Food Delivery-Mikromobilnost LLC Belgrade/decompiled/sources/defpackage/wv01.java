package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TransfersDashboardTopButtonsConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class wv01 {
    public static final dfr a;

    static {
        byte[] bArr = tje.P;
        byte[] bArr2 = new byte[36];
        for (int i = 0; i < 36; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, TransfersDashboardTopButtonsConfig.class), new CommonExperiment(new TransfersDashboardTopButtonsConfig(EmptyList.a, null), ExperimentApplyType.LATEST));
    }
}
