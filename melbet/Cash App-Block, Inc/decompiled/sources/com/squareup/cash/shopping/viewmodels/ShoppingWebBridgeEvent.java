package com.squareup.cash.shopping.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingWebBridgeEvent {

    public final class AfterpayWebCheckoutFlowJsonEvents extends ShoppingWebBridgeEvent {
        public final String data;

        public AfterpayWebCheckoutFlowJsonEvents(String str) {
            this.data = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterpayWebCheckoutFlowJsonEvents) && this.data.equals(((AfterpayWebCheckoutFlowJsonEvents) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayWebCheckoutFlowJsonEvents(data=", this.data, ")");
        }
    }

    public final class NavigationFailed extends ShoppingWebBridgeEvent {
        public final String error;
        public final Integer errorCode;
        public final boolean isForMainFrame;
        public final Integer statusCode;
        public final String url;

        public NavigationFailed(String str, Integer num, Integer num2, String str2, boolean z) {
            this.error = str;
            this.statusCode = num;
            this.errorCode = num2;
            this.url = str2;
            this.isForMainFrame = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigationFailed)) {
                return false;
            }
            NavigationFailed navigationFailed = (NavigationFailed) obj;
            return Intrinsics.areEqual(this.error, navigationFailed.error) && Intrinsics.areEqual(this.statusCode, navigationFailed.statusCode) && Intrinsics.areEqual(this.errorCode, navigationFailed.errorCode) && Intrinsics.areEqual(this.url, navigationFailed.url) && this.isForMainFrame == navigationFailed.isForMainFrame;
        }

        public final int hashCode() {
            String str = this.error;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.statusCode;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.errorCode;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.url;
            return Boolean.hashCode(this.isForMainFrame) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.statusCode, "NavigationFailed(error=", this.error, ", statusCode=", ", errorCode=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.errorCode, ", url=", this.url, ", isForMainFrame=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isForMainFrame, ")");
        }
    }

    public final class NavigationStateUpdated extends ShoppingWebBridgeEvent {
        public final boolean canGoBack;
        public final boolean canGoForward;
        public final boolean isPageFinished;
        public final String url;

        public NavigationStateUpdated(boolean z, boolean z2, boolean z3, String str) {
            this.canGoBack = z;
            this.canGoForward = z2;
            this.isPageFinished = z3;
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigationStateUpdated)) {
                return false;
            }
            NavigationStateUpdated navigationStateUpdated = (NavigationStateUpdated) obj;
            return this.canGoBack == navigationStateUpdated.canGoBack && this.canGoForward == navigationStateUpdated.canGoForward && this.isPageFinished == navigationStateUpdated.isPageFinished && Intrinsics.areEqual(this.url, navigationStateUpdated.url);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canGoBack) * 31, 31, this.canGoForward), 31, this.isPageFinished);
            String str = this.url;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("NavigationStateUpdated(canGoBack=", ", canGoForward=", ", isPageFinished=", this.canGoBack, this.canGoForward);
            m.append(this.isPageFinished);
            m.append(", url=");
            m.append(this.url);
            m.append(")");
            return m.toString();
        }
    }

    public abstract class PayKitShopBridgeEvent extends ShoppingWebBridgeEvent {

        public final class AuthorizeCustomerRequest extends PayKitShopBridgeEvent {
            public final String url;

            public AuthorizeCustomerRequest(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AuthorizeCustomerRequest) && Intrinsics.areEqual(this.url, ((AuthorizeCustomerRequest) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthorizeCustomerRequest(url=", this.url, ")");
            }
        }

        public final class PromptToAuthorize extends PayKitShopBridgeEvent {
            public final String url;

            public PromptToAuthorize(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PromptToAuthorize) && Intrinsics.areEqual(this.url, ((PromptToAuthorize) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromptToAuthorize(url=", this.url, ")");
            }
        }
    }

    public final class ProgressUpdated extends ShoppingWebBridgeEvent {
        public final int progress;
        public final String url;

        public ProgressUpdated(int i, String str) {
            this.progress = i;
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressUpdated)) {
                return false;
            }
            ProgressUpdated progressUpdated = (ProgressUpdated) obj;
            return this.progress == progressUpdated.progress && Intrinsics.areEqual(this.url, progressUpdated.url);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.progress) * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ProgressUpdated(progress=" + this.progress + ", url=" + this.url + ")";
        }
    }

    public final class TitleUpdated extends ShoppingWebBridgeEvent {
        public final String title;

        public TitleUpdated(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleUpdated) && Intrinsics.areEqual(this.title, ((TitleUpdated) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleUpdated(title=", this.title, ")");
        }
    }

    public final class UrlUpdated extends ShoppingWebBridgeEvent {
        public final String url;

        public UrlUpdated(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlUpdated) && Intrinsics.areEqual(this.url, ((UrlUpdated) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlUpdated(url=", this.url, ")");
        }
    }

    public final class WebMonitoringJsonEvents extends ShoppingWebBridgeEvent {
        public final String data;

        public WebMonitoringJsonEvents(String str) {
            this.data = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebMonitoringJsonEvents) && this.data.equals(((WebMonitoringJsonEvents) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebMonitoringJsonEvents(data=", this.data, ")");
        }
    }
}
