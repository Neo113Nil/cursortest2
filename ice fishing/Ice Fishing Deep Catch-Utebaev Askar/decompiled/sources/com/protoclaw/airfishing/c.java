package com.protoclaw.airfishing;

import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f109b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f110a;

    public c(MainActivity mainActivity) {
        this.f110a = mainActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        MainActivity mainActivity = this.f110a;
        if (mainActivity.loaderActive) {
            if (i2 < 100) {
                Runnable runnable = mainActivity.pendingHide;
                if (runnable != null) {
                    mainActivity.handler.removeCallbacks(runnable);
                }
                mainActivity.pendingHide = null;
                return;
            }
            String url = view.getUrl();
            if (url == null) {
                url = "";
            }
            if (o.d(url, "file://")) {
                mainActivity.hdLdr();
                return;
            }
            Runnable runnable2 = mainActivity.pendingHide;
            if (runnable2 != null) {
                mainActivity.handler.removeCallbacks(runnable2);
            }
            mainActivity.pendingHide = new a(mainActivity, 3);
            Handler handler = mainActivity.handler;
            Runnable runnable3 = mainActivity.pendingHide;
            Intrinsics.b(runnable3);
            handler.postDelayed(runnable3, 1000L);
        }
    }
}
