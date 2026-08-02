package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.rconfig.MainScreen;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DefaultProductForDashboardSchema;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final class u470 {
    public final b a;

    static {
        scc.g("DashboardScreen", "ProductsScreen");
    }

    public u470(b bVar) {
        this.a = bVar;
    }

    public final Deeplink a() {
        BaseDeeplinkAction dashboardAction;
        b bVar = this.a;
        if (((MainScreen) bVar.d(bVar.i.h).getData()).isEnabled()) {
            dashboardAction = DeeplinkAction.Products.INSTANCE;
        } else {
            dashboardAction = new DeeplinkAction.DashboardAction(((DefaultProductForDashboardSchema) bVar.d(lih.a).getData()).getProduct().getProductId(), null, null, null, 8, null);
        }
        return new Deeplink(dashboardAction, null, DeeplinkNavigation.ReplaceRoot.INSTANCE, null, null, null, false, false, 250, null);
    }
}
