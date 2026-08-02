package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class SquareSpaceClient extends KnotViewClient {
    public SquareSpaceClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setDomain(str2.split("/")[2]);
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public ErrorView getErrorView() {
        ErrorView errorView = super.getErrorView();
        errorView.setName("Square Space");
        return errorView;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        KnotView knotView = this.knotView;
        boolean isUserLoggedIn = knotView.isUserLoggedIn(knotView.getUrl());
        KnotView knotView2 = this.knotView;
        if (isUserLoggedIn) {
            knotView2.getMerchantViewListener().sendRunningEvent(str, str2);
        } else {
            knotView2.getStorageDetails();
        }
    }
}
