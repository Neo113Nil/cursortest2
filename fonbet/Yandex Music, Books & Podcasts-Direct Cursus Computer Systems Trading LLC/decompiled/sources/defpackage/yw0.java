package defpackage;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes6.dex */
public final class yw0 implements DeepLinkListener {
    public final /* synthetic */ zt3 a;

    public yw0(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public final void onDeepLinking(DeepLinkResult deepLinkResult) {
        deepLinkResult.getClass();
        int i = xw0.a[deepLinkResult.getStatus().ordinal()];
        zt3 zt3Var = this.a;
        if (i == 1) {
            ssg.a(3, "AppsFlyerDeeplinks", "Deep link found", null);
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(deepLinkResult.getDeepLink());
        } else if (i == 2) {
            ssg.a(3, "AppsFlyerDeeplinks", "Deep link not found", null);
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(null);
        } else {
            ssg.a(3, "AppsFlyerDeeplinks", "There was an error getting Deep Link data: " + deepLinkResult.getError(), null);
            r7o r7oVar3 = z7o.b;
            zt3Var.resumeWith(null);
        }
    }
}
