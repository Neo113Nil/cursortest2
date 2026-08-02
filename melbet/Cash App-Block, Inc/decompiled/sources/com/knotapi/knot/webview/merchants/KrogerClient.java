package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class KrogerClient extends KnotViewClient {
    public KrogerClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void checkNoSubscriptionStatus() {
        if (!this.knotView.getUrl().contains("confirm/send") || this.knotView.merchantViewListener.isErrorViewVisible()) {
            return;
        }
        showErrorPage(getErrorView());
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public ErrorView getErrorView() {
        ErrorView errorView = super.getErrorView();
        errorView.setTitle(this.bot.getConfirmationErrorTitle());
        errorView.setContent(this.bot.getConfirmationErrorMessage());
        return errorView;
    }
}
