package defpackage;

import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class tvv {
    public final AppAnalyticsReporter a;
    public volatile String b;

    public tvv(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    public final void a(boolean z) {
        if (this.b != null) {
            fcy0 fcy0Var = this.a.m0;
            Boolean valueOf = Boolean.valueOf(z);
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("has_pin", valueOf);
            fcy0Var.a.a("tech.initial_deeplink.clear", linkedHashMap);
            this.b = null;
        }
    }

    public final String b() {
        fcy0 fcy0Var = this.a.m0;
        String str = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (str != null) {
            linkedHashMap.put(Constants.DEEPLINK, str);
        }
        fcy0Var.a.a("tech.initial_deeplink.get", linkedHashMap);
        return this.b;
    }
}
