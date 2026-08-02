package com.squareup.cash.blockers.web.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class WebViewBlockerHeaderModel {
    public final boolean closeButtonOnly;
    public final boolean shouldHideUrl;
    public final String titleText;
    public final String urlText;

    public WebViewBlockerHeaderModel(String str, String str2, boolean z, boolean z2) {
        this.titleText = str;
        this.urlText = str2;
        this.closeButtonOnly = z;
        this.shouldHideUrl = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewBlockerHeaderModel)) {
            return false;
        }
        WebViewBlockerHeaderModel webViewBlockerHeaderModel = (WebViewBlockerHeaderModel) obj;
        return Intrinsics.areEqual(this.titleText, webViewBlockerHeaderModel.titleText) && Intrinsics.areEqual(this.urlText, webViewBlockerHeaderModel.urlText) && this.closeButtonOnly == webViewBlockerHeaderModel.closeButtonOnly && this.shouldHideUrl == webViewBlockerHeaderModel.shouldHideUrl;
    }

    public final int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.urlText;
        return Boolean.hashCode(this.shouldHideUrl) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.closeButtonOnly);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebViewBlockerHeaderModel(titleText=", this.titleText, ", urlText=", this.urlText, ", closeButtonOnly="), this.closeButtonOnly, ", shouldHideUrl=", this.shouldHideUrl, ")");
    }
}
