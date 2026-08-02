package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrReaderDescription;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class wbg0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.u0;
        byte[] bArr2 = new byte[26];
        for (int i = 0; i < 26; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrReaderDescription.class), new CommonExperiment(new QrReaderDescription(true, b.i(new Pair("bottom_bar", unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_qr_scanner_description_bottom_bar)), new Pair("qr_payments_promo", new Text.Resource(dzh0.ybsdk_qr_payment_qr_scanner_description_go)))), ExperimentApplyType.LATEST));
    }
}
