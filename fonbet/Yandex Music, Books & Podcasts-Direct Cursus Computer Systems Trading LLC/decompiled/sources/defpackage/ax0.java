package defpackage;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ax0 implements AppsFlyerConversionListener {
    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map map) {
        if (((ku0) sk3.I(ku0.class)).b.getInt("app_launch_count", 0) < 2) {
            Object obj = map.get("af_status");
            if ((obj instanceof String) && "Non-organic".equalsIgnoreCase((String) obj)) {
                lg3.e0("AppsFlyer_Install_Source", map);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
    }
}
