package com.squareup.cash.shopping.viewmodels;

import android.net.Uri;
import androidx.glance.appwidget.IgnoreResultKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.webview.android.WebViewUseCase;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingViewModel {

    public final class ErrorUrl extends ShoppingViewModel {
        public final ErrorUrlAction action;
        public final String errorDescription;
        public final boolean fillrEnabled;
        public final WebNavigationFooterViewModel footerModel;
        public final WebNavigationHeaderModel headerModel;
        public final IgnoreResultKt injectJavascriptViewModel;
        public final PaykitInfoToastState paykitInfoToastState;

        public ErrorUrl(WebNavigationHeaderModel webNavigationHeaderModel, WebNavigationFooterViewModel webNavigationFooterViewModel, boolean z, String str, ErrorUrlAction errorUrlAction) {
            PaykitInfoToastState paykitInfoToastState = PaykitInfoToastState.PAYKIT_LOADING;
            webNavigationHeaderModel.getClass();
            webNavigationFooterViewModel.getClass();
            str.getClass();
            this.headerModel = webNavigationHeaderModel;
            this.footerModel = webNavigationFooterViewModel;
            this.injectJavascriptViewModel = InjectJavascriptViewModel$Empty.INSTANCE;
            this.paykitInfoToastState = paykitInfoToastState;
            this.fillrEnabled = z;
            this.errorDescription = str;
            this.action = errorUrlAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorUrl)) {
                return false;
            }
            ErrorUrl errorUrl = (ErrorUrl) obj;
            return Intrinsics.areEqual(this.headerModel, errorUrl.headerModel) && Intrinsics.areEqual(this.footerModel, errorUrl.footerModel) && Intrinsics.areEqual(this.injectJavascriptViewModel, errorUrl.injectJavascriptViewModel) && this.paykitInfoToastState == errorUrl.paykitInfoToastState && this.fillrEnabled == errorUrl.fillrEnabled && Intrinsics.areEqual(this.errorDescription, errorUrl.errorDescription) && this.action == errorUrl.action;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final boolean getFillrEnabled() {
            return this.fillrEnabled;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebNavigationFooterViewModel getFooterModel() {
            return this.footerModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebNavigationHeaderModel getHeaderModel() {
            return this.headerModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final IgnoreResultKt getInjectJavascriptViewModel() {
            return this.injectJavascriptViewModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final PaykitInfoToastState getPaykitInfoToastState() {
            return this.paykitInfoToastState;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final PaykitInfoToastViewModel getPaykitInfoToastViewModel() {
            return null;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final boolean getShouldSyncCookies() {
            return false;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebViewUseCase getWebViewUseCase() {
            return null;
        }

        public final int hashCode() {
            return (this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.paykitInfoToastState.hashCode() + ((this.injectJavascriptViewModel.hashCode() + ((this.footerModel.hashCode() + (this.headerModel.hashCode() * 31)) * 31)) * 961)) * 31, 31, this.fillrEnabled), 31, false), 31, this.errorDescription)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorUrl(headerModel=");
            sb.append(this.headerModel);
            sb.append(", footerModel=");
            sb.append(this.footerModel);
            sb.append(", injectJavascriptViewModel=");
            sb.append(this.injectJavascriptViewModel);
            sb.append(", paykitInfoToastViewModel=null, paykitInfoToastState=");
            sb.append(this.paykitInfoToastState);
            sb.append(", fillrEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.fillrEnabled, ", shouldSyncCookies=false, errorDescription=", this.errorDescription, ", action=");
            sb.append(this.action);
            sb.append(", webViewUseCase=null)");
            return sb.toString();
        }
    }

    public final class ValidUrl extends ShoppingViewModel {
        public final AutofillFooterViewModel autofillFooterViewModel;
        public final boolean fillrEnabled;
        public final WebNavigationFooterViewModel footerModel;
        public final WebNavigationHeaderModel headerModel;
        public final IgnoreResultKt injectJavascriptViewModel;
        public final Uri monitoringScriptUri;
        public final PaykitInfoToastState paykitInfoToastState;
        public final PaykitInfoToastViewModel paykitInfoToastViewModel;
        public final boolean shouldMonitorWeb;
        public final boolean shouldSyncCookies;
        public final boolean showAutofillSuccessToast;
        public final WebViewUseCase webViewUseCase;

        public ValidUrl(WebNavigationHeaderModel webNavigationHeaderModel, WebNavigationFooterViewModel webNavigationFooterViewModel, IgnoreResultKt ignoreResultKt, PaykitInfoToastViewModel paykitInfoToastViewModel, PaykitInfoToastState paykitInfoToastState, boolean z, boolean z2, Uri uri, boolean z3, WebViewUseCase webViewUseCase, AutofillFooterViewModel autofillFooterViewModel, boolean z4) {
            webNavigationHeaderModel.getClass();
            webNavigationFooterViewModel.getClass();
            this.headerModel = webNavigationHeaderModel;
            this.footerModel = webNavigationFooterViewModel;
            this.injectJavascriptViewModel = ignoreResultKt;
            this.paykitInfoToastViewModel = paykitInfoToastViewModel;
            this.paykitInfoToastState = paykitInfoToastState;
            this.fillrEnabled = z;
            this.shouldSyncCookies = z2;
            this.monitoringScriptUri = uri;
            this.shouldMonitorWeb = z3;
            this.webViewUseCase = webViewUseCase;
            this.autofillFooterViewModel = autofillFooterViewModel;
            this.showAutofillSuccessToast = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidUrl)) {
                return false;
            }
            ValidUrl validUrl = (ValidUrl) obj;
            return Intrinsics.areEqual(this.headerModel, validUrl.headerModel) && Intrinsics.areEqual(this.footerModel, validUrl.footerModel) && this.injectJavascriptViewModel.equals(validUrl.injectJavascriptViewModel) && Intrinsics.areEqual(this.paykitInfoToastViewModel, validUrl.paykitInfoToastViewModel) && this.paykitInfoToastState == validUrl.paykitInfoToastState && this.fillrEnabled == validUrl.fillrEnabled && this.shouldSyncCookies == validUrl.shouldSyncCookies && Intrinsics.areEqual(this.monitoringScriptUri, validUrl.monitoringScriptUri) && this.shouldMonitorWeb == validUrl.shouldMonitorWeb && this.webViewUseCase == validUrl.webViewUseCase && Intrinsics.areEqual(this.autofillFooterViewModel, validUrl.autofillFooterViewModel) && this.showAutofillSuccessToast == validUrl.showAutofillSuccessToast;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final boolean getFillrEnabled() {
            return this.fillrEnabled;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebNavigationFooterViewModel getFooterModel() {
            return this.footerModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebNavigationHeaderModel getHeaderModel() {
            return this.headerModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final IgnoreResultKt getInjectJavascriptViewModel() {
            return this.injectJavascriptViewModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final PaykitInfoToastState getPaykitInfoToastState() {
            return this.paykitInfoToastState;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final PaykitInfoToastViewModel getPaykitInfoToastViewModel() {
            return this.paykitInfoToastViewModel;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final boolean getShouldSyncCookies() {
            return this.shouldSyncCookies;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ShoppingViewModel
        public final WebViewUseCase getWebViewUseCase() {
            return this.webViewUseCase;
        }

        public final int hashCode() {
            int hashCode = (this.injectJavascriptViewModel.hashCode() + ((this.footerModel.hashCode() + (this.headerModel.hashCode() * 31)) * 31)) * 31;
            PaykitInfoToastViewModel paykitInfoToastViewModel = this.paykitInfoToastViewModel;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.paykitInfoToastState.hashCode() + ((hashCode + (paykitInfoToastViewModel == null ? 0 : paykitInfoToastViewModel.hashCode())) * 31)) * 31, 31, this.fillrEnabled), 31, this.shouldSyncCookies);
            Uri uri = this.monitoringScriptUri;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.shouldMonitorWeb);
            WebViewUseCase webViewUseCase = this.webViewUseCase;
            int hashCode2 = (m2 + (webViewUseCase == null ? 0 : webViewUseCase.hashCode())) * 31;
            AutofillFooterViewModel autofillFooterViewModel = this.autofillFooterViewModel;
            return Boolean.hashCode(this.showAutofillSuccessToast) + ((hashCode2 + (autofillFooterViewModel != null ? autofillFooterViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ValidUrl(headerModel=" + this.headerModel + ", footerModel=" + this.footerModel + ", injectJavascriptViewModel=" + this.injectJavascriptViewModel + ", paykitInfoToastViewModel=" + this.paykitInfoToastViewModel + ", paykitInfoToastState=" + this.paykitInfoToastState + ", fillrEnabled=" + this.fillrEnabled + ", shouldSyncCookies=" + this.shouldSyncCookies + ", monitoringScriptUri=" + this.monitoringScriptUri + ", shouldMonitorWeb=" + this.shouldMonitorWeb + ", webViewUseCase=" + this.webViewUseCase + ", autofillFooterViewModel=" + this.autofillFooterViewModel + ", showAutofillSuccessToast=" + this.showAutofillSuccessToast + ")";
        }
    }

    public abstract boolean getFillrEnabled();

    public abstract WebNavigationFooterViewModel getFooterModel();

    public abstract WebNavigationHeaderModel getHeaderModel();

    public abstract IgnoreResultKt getInjectJavascriptViewModel();

    public abstract PaykitInfoToastState getPaykitInfoToastState();

    public abstract PaykitInfoToastViewModel getPaykitInfoToastViewModel();

    public abstract boolean getShouldSyncCookies();

    public abstract WebViewUseCase getWebViewUseCase();
}
