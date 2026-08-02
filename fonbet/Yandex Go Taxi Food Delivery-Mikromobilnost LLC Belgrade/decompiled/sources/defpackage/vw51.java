package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbDivkitSkeletonsConfig;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class vw51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.o2;
        byte[] bArr2 = new byte[28];
        for (int i = 0; i < 28; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, YbDivkitSkeletonsConfig.class);
        Boolean bool = Boolean.FALSE;
        a = new dfr(str, newParameterizedType, new CommonExperiment(new YbDivkitSkeletonsConfig(true, bool, bool, bool, bool, bool, bool, bool, bool, 86400000L), ExperimentApplyType.LATEST));
    }
}
