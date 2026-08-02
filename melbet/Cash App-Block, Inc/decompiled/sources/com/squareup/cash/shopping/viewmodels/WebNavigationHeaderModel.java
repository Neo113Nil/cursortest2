package com.squareup.cash.shopping.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WebNavigationHeaderModel {
    public final boolean collapsed;
    public final boolean hideUrl;
    public final String titleText;
    public final String urlText;

    public WebNavigationHeaderModel(String str, String str2, boolean z, boolean z2) {
        this.titleText = str;
        this.urlText = str2;
        this.collapsed = z;
        this.hideUrl = z2;
    }

    public static WebNavigationHeaderModel copy$default(WebNavigationHeaderModel webNavigationHeaderModel, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = webNavigationHeaderModel.titleText;
        }
        if ((i & 2) != 0) {
            str2 = webNavigationHeaderModel.urlText;
        }
        if ((i & 4) != 0) {
            z = webNavigationHeaderModel.collapsed;
        }
        boolean z2 = webNavigationHeaderModel.hideUrl;
        webNavigationHeaderModel.getClass();
        return new WebNavigationHeaderModel(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebNavigationHeaderModel)) {
            return false;
        }
        WebNavigationHeaderModel webNavigationHeaderModel = (WebNavigationHeaderModel) obj;
        return Intrinsics.areEqual(this.titleText, webNavigationHeaderModel.titleText) && Intrinsics.areEqual(this.urlText, webNavigationHeaderModel.urlText) && this.collapsed == webNavigationHeaderModel.collapsed && this.hideUrl == webNavigationHeaderModel.hideUrl;
    }

    public final int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.urlText;
        return Boolean.hashCode(this.hideUrl) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.collapsed);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebNavigationHeaderModel(titleText=", this.titleText, ", urlText=", this.urlText, ", collapsed="), this.collapsed, ", hideUrl=", this.hideUrl, ")");
    }
}
