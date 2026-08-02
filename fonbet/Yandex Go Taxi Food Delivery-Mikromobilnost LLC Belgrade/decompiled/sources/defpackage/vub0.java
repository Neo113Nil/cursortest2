package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PinBackupConfig;

/* loaded from: classes9.dex */
public abstract class vub0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.K;
        byte[] bArr2 = new byte[23];
        for (int i = 0; i < 23; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, PinBackupConfig.class), new CommonExperiment(new PinBackupConfig(true, false, Boolean.FALSE), ExperimentApplyType.COLD_START));
    }
}
