package com.squareup.cash.shopping.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class WebNavigationFooterViewModel {
    public final FooterButtonStyle buttonStyle;
    public final boolean canGoBack;
    public final boolean canGoForward;

    public WebNavigationFooterViewModel(boolean z, boolean z2, FooterButtonStyle footerButtonStyle) {
        this.canGoBack = z;
        this.canGoForward = z2;
        this.buttonStyle = footerButtonStyle;
    }

    public static WebNavigationFooterViewModel copy$default(WebNavigationFooterViewModel webNavigationFooterViewModel, boolean z, boolean z2, FooterButtonStyle footerButtonStyle, int i) {
        if ((i & 1) != 0) {
            z = webNavigationFooterViewModel.canGoBack;
        }
        if ((i & 2) != 0) {
            z2 = webNavigationFooterViewModel.canGoForward;
        }
        if ((i & 4) != 0) {
            footerButtonStyle = webNavigationFooterViewModel.buttonStyle;
        }
        webNavigationFooterViewModel.getClass();
        webNavigationFooterViewModel.getClass();
        return new WebNavigationFooterViewModel(z, z2, footerButtonStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebNavigationFooterViewModel)) {
            return false;
        }
        WebNavigationFooterViewModel webNavigationFooterViewModel = (WebNavigationFooterViewModel) obj;
        return this.canGoBack == webNavigationFooterViewModel.canGoBack && this.canGoForward == webNavigationFooterViewModel.canGoForward && this.buttonStyle.equals(webNavigationFooterViewModel.buttonStyle);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.buttonStyle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canGoBack) * 31, 31, this.canGoForward)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("WebNavigationFooterViewModel(canGoBack=", ", canGoForward=", ", buttonStyle=", this.canGoBack, this.canGoForward);
        m.append(this.buttonStyle);
        m.append(", buttonLoading=false)");
        return m.toString();
    }
}
