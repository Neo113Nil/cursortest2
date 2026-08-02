package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class t61 {
    public final pho a;

    public void a(String str, String str2) {
        HashMap p = x4e.p("type", str);
        if (str2 != null) {
            p.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, str2);
        }
        this.a.a("AltpinB.ConfirmationScreen.ModalButton.Tap", p, 1, new HashMap());
    }

    public void b(String str) {
        this.a.a("LaunchProcessing.Processor.Conflict", x4e.p("when", str), 1, new HashMap());
    }
}
