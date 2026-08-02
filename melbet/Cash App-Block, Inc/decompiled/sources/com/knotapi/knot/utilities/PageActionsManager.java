package com.knotapi.knot.utilities;

import android.os.Handler;
import android.os.Looper;
import com.knotapi.knot.models.PageActions;
import com.knotapi.knot.webview.KnotView;
import java.util.List;

/* loaded from: classes4.dex */
public class PageActionsManager {
    private static final String TAG = "PageActionsManager";

    public static void startPageActions(String str, final KnotView knotView, List<PageActions> list) {
        for (final PageActions pageActions : list) {
            if (Helper.isUrlMatch(str, pageActions.getUrl(), pageActions.getIsUrlRegex())) {
                if (pageActions.getRedirectUrl() != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.knotapi.knot.utilities.PageActionsManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            KnotView.this.loadUrl(pageActions.getRedirectUrl());
                        }
                    });
                }
                if (pageActions.getComplete()) {
                    knotView.finalStep();
                    return;
                }
                return;
            }
        }
    }
}
