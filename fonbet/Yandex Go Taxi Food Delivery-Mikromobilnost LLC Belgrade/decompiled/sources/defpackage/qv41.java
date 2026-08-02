package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class qv41 implements lz60 {
    public final Context a;
    public final h3y b;

    public qv41(Context context, h3y h3yVar) {
        this.a = context;
        this.b = h3yVar;
    }

    public final void d() {
        if (((Boolean) ((jbh) ((rqo) this.b.get())).f(SimplePersistentBooleanExperiment.SUPERAPP_WEB_VIEW_WARM_UP).c()).booleanValue()) {
            WebSettings.getDefaultUserAgent(this.a);
        }
    }

    @Override // defpackage.lz60
    public final void g() {
        d();
    }

    @Override // defpackage.s150
    public final String getName() {
        return "WebViewWarmUpLCPListener";
    }
}
