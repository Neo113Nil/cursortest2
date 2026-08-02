package com.squareup.cash.blockers.web.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WebViewBlockerFooterModel {
    public final boolean isPrimaryEndFlowAction;
    public final boolean isSecondaryEndFlowAction;
    public final String primaryActionId;
    public final String primaryActionText;
    public final String secondaryActionId;
    public final String secondaryActionText;

    public WebViewBlockerFooterModel(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.primaryActionText = str;
        this.primaryActionId = str2;
        this.isPrimaryEndFlowAction = z;
        this.secondaryActionText = str3;
        this.secondaryActionId = str4;
        this.isSecondaryEndFlowAction = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewBlockerFooterModel)) {
            return false;
        }
        WebViewBlockerFooterModel webViewBlockerFooterModel = (WebViewBlockerFooterModel) obj;
        return Intrinsics.areEqual(this.primaryActionText, webViewBlockerFooterModel.primaryActionText) && Intrinsics.areEqual(this.primaryActionId, webViewBlockerFooterModel.primaryActionId) && this.isPrimaryEndFlowAction == webViewBlockerFooterModel.isPrimaryEndFlowAction && Intrinsics.areEqual(this.secondaryActionText, webViewBlockerFooterModel.secondaryActionText) && Intrinsics.areEqual(this.secondaryActionId, webViewBlockerFooterModel.secondaryActionId) && this.isSecondaryEndFlowAction == webViewBlockerFooterModel.isSecondaryEndFlowAction;
    }

    public final int hashCode() {
        String str = this.primaryActionText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryActionId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isPrimaryEndFlowAction);
        String str3 = this.secondaryActionText;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryActionId;
        return Boolean.hashCode(this.isSecondaryEndFlowAction) + ((hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebViewBlockerFooterModel(primaryActionText=", this.primaryActionText, ", primaryActionId=", this.primaryActionId, ", isPrimaryEndFlowAction=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.isPrimaryEndFlowAction, ", secondaryActionText=", this.secondaryActionText, ", secondaryActionId=");
        return re$$ExternalSyntheticOutline0.m(m, this.secondaryActionId, ", isSecondaryEndFlowAction=", this.isSecondaryEndFlowAction, ")");
    }
}
