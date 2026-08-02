package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DeeplinkParamsFilterSchema;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class z2h {
    public static final dfr a;

    static {
        byte[] bArr = tje.q3;
        byte[] bArr2 = new byte[27];
        for (int i = 0; i < 27; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, DeeplinkParamsFilterSchema.class), new CommonExperiment(new DeeplinkParamsFilterSchema(b.f(), null), ExperimentApplyType.HOT_START));
    }
}
