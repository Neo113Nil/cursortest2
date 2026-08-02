package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.navigation.InternalScreenIntent;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final class wdp0 {
    public InternalScreenIntent a;

    public final String a() {
        Deeplink deeplink;
        Uri parsedUri;
        InternalScreenIntent internalScreenIntent = this.a;
        if (internalScreenIntent == null || (deeplink = internalScreenIntent.getDeeplink()) == null || (parsedUri = deeplink.getParsedUri()) == null) {
            return null;
        }
        return parsedUri.toString();
    }

    public final String b() {
        Uri deeplinkUri;
        Deeplink deeplink;
        InternalScreenIntent internalScreenIntent = this.a;
        BaseDeeplinkAction action = (internalScreenIntent == null || (deeplink = internalScreenIntent.getDeeplink()) == null) ? null : deeplink.getAction();
        DeeplinkAction.Registration registration = action instanceof DeeplinkAction.Registration ? (DeeplinkAction.Registration) action : null;
        if (registration == null || (deeplinkUri = registration.getDeeplinkUri()) == null) {
            return null;
        }
        return deeplinkUri.toString();
    }
}
