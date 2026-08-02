package defpackage;

import android.content.Intent;
import android.view.ContextThemeWrapper;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.OpenUrlAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes3.dex */
public final class v1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContextThemeWrapper b;

    public /* synthetic */ v1h(ContextThemeWrapper contextThemeWrapper, int i) {
        this.a = i;
        this.b = contextThemeWrapper;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        EmptyList emptyList = EmptyList.a;
        ContextThemeWrapper contextThemeWrapper = this.b;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.CopyText) {
                    DeeplinkAction.CopyText copyText = (DeeplinkAction.CopyText) baseDeeplinkAction;
                    rje.b(contextThemeWrapper, copyText.getText(), copyText.getText());
                    break;
                }
                break;
            case 1:
                if (baseDeeplinkAction instanceof DeeplinkAction.NotificationsSettings) {
                    Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", contextThemeWrapper.getPackageName());
                    putExtra.addFlags(SelfTester_JCP.IMITA);
                    if (rje.k(contextThemeWrapper, putExtra)) {
                        break;
                    }
                }
                break;
            default:
                if (baseDeeplinkAction instanceof OpenUrlAction) {
                    rje.i(contextThemeWrapper, ((OpenUrlAction) baseDeeplinkAction).getUrl());
                    break;
                }
                break;
        }
        return new v0h(emptyList, null, 6);
    }
}
