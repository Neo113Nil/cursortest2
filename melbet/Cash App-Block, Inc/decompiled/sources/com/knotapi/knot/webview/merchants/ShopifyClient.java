package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class ShopifyClient extends KnotViewClient {
    public ShopifyClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        KnotView knotView = this.knotView;
        boolean isUserLoggedIn = knotView.isUserLoggedIn(knotView.getUrl());
        KnotView knotView2 = this.knotView;
        if (!isUserLoggedIn) {
            knotView2.getStorageDetails();
        } else {
            knotView2.getmExtraInfo().setLoggedInPage(this.knotView.getUrl());
            this.knotView.getMerchantViewListener().sendRunningEvent(str, str2);
        }
    }
}
