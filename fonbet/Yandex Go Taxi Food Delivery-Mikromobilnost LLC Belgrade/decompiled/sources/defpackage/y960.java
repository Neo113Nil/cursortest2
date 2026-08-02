package defpackage;

import android.net.Uri;
import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class y960 {
    public static DeeplinkAction.ShowNfcShortcutFlow a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.PRODUCT);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
        return new DeeplinkAction.ShowNfcShortcutFlow(o != null ? new NfcPaymentMethod.Product(atb1.c(o)) : o2 != null ? new NfcPaymentMethod.External(o2) : null);
    }
}
