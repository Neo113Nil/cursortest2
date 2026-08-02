package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class r9o {
    public static DeeplinkAction.DeeplinkError a(Uri uri) {
        return new DeeplinkAction.DeeplinkError(bzk0.o(uri, SdkUri$QueryParam.TITLE), bzk0.o(uri, SdkUri$QueryParam.DESCRIPTION), bzk0.o(uri, SdkUri$QueryParam.BUTTON_TEXT), bzk0.o(uri, SdkUri$QueryParam.BUTTON_ACTION), bzk0.o(uri, SdkUri$QueryParam.HYPERLINK_TEXT), bzk0.o(uri, SdkUri$QueryParam.HYPERLINK_ACTION), bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL), bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_DARK));
    }
}
