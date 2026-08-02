package defpackage;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.HomeScreenEvents$LimitsPageOpenContext;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.a;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.common.c;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class tfs0 {
    public final ContextThemeWrapper a;
    public final FragmentActivity b;
    public final np41 c;
    public final b d;
    public final j3h e;
    public final AppAnalyticsReporter f;
    public final yvf0 g;
    public final c h;
    public final AppAnalyticsReporter i;

    public tfs0(ContextThemeWrapper contextThemeWrapper, FragmentActivity fragmentActivity, np41 np41Var, b bVar, j3h j3hVar, AppAnalyticsReporter appAnalyticsReporter, yvf0 yvf0Var, c cVar, AppAnalyticsReporter appAnalyticsReporter2) {
        this.a = contextThemeWrapper;
        this.b = fragmentActivity;
        this.c = np41Var;
        this.d = bVar;
        this.e = j3hVar;
        this.f = appAnalyticsReporter;
        this.g = yvf0Var;
        this.h = cVar;
        this.i = appAnalyticsReporter2;
    }

    public final void a() {
        qq7 qq7Var = this.f.D;
        HomeScreenEvents$LimitsPageOpenContext homeScreenEvents$LimitsPageOpenContext = HomeScreenEvents$LimitsPageOpenContext.DEEPLINK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("context", homeScreenEvents$LimitsPageOpenContext.getOriginalValue());
        qq7Var.a.a("limits_page.open", linkedHashMap);
        b bVar = this.d;
        bVar.getClass();
        a aVar = bVar.i;
        YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
        YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
        String accountStatusUrl = ybCommonUrlsImpl.getAccountStatusUrl();
        if (accountStatusUrl.length() == 0) {
            accountStatusUrl = ybCommonUrlsImpl2.getAccountStatusUrl();
        }
        h791.f((j3h) this.g.get(), accountStatusUrl, com.ybsdk.navigation.a.a(this.c, accountStatusUrl));
    }
}
