package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcDefaultAppConfig;
import com.ybsdk.rconfig.configs.NfcShortcutConfig;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class x960 {
    public static final dfr a;
    public static final dfr b;

    static {
        byte[] bArr = tje.L2;
        byte[] bArr2 = new byte[24];
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NfcShortcutConfig.class);
        NfcShortcutConfig nfcShortcutConfig = new NfcShortcutConfig(false, 1);
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(str, newParameterizedType, new CommonExperiment(nfcShortcutConfig, experimentApplyType));
        b = new dfr("yb_mobile_nfc_default_app", Types.newParameterizedType(CommonExperiment.class, NfcDefaultAppConfig.class), new CommonExperiment(new NfcDefaultAppConfig(false, 1), experimentApplyType));
    }
}
