package com.anythink.expressad.splash.c;

import android.content.Context;
import android.os.Handler;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;

/* loaded from: classes.dex */
public final class f extends b {
    public f(Context context, String str, String str2) {
        super(context, str, str2);
    }

    private void g() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f21301g = false;
        if (this.f21300f > 0 && (handler = this.f21303j) != null) {
            handler.removeMessages(1);
            this.f21303j.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertHide", "");
    }

    private void h() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f21301g = true;
        if (this.f21300f > 0 && (handler = this.f21303j) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertShow", "");
    }

    @Override // com.anythink.expressad.splash.c.b
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            try {
                dVar.aC();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        b(dVar);
    }
}
