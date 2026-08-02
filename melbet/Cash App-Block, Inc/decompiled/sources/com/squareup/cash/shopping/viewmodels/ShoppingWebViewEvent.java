package com.squareup.cash.shopping.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingWebViewEvent {

    public final class ActionButtonPressed extends ShoppingWebViewEvent {
        public static final ActionButtonPressed INSTANCE = new ActionButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionButtonPressed);
        }

        public final int hashCode() {
            return 1726682048;
        }

        public final String toString() {
            return "ActionButtonPressed";
        }
    }

    public final class AfterpayWebCheckoutFlowJsonEvents extends ShoppingWebViewEvent {
        public final String jsonString;

        public AfterpayWebCheckoutFlowJsonEvents(String str) {
            this.jsonString = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterpayWebCheckoutFlowJsonEvents) && this.jsonString.equals(((AfterpayWebCheckoutFlowJsonEvents) obj).jsonString);
        }

        public final int hashCode() {
            return this.jsonString.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayWebCheckoutFlowJsonEvents(jsonString=", this.jsonString, ")");
        }
    }

    public final class AutofillPillShown extends ShoppingWebViewEvent {
        public static final AutofillPillShown INSTANCE = new AutofillPillShown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutofillPillShown);
        }

        public final int hashCode() {
            return 1034061580;
        }

        public final String toString() {
            return "AutofillPillShown";
        }
    }

    public final class CardAutofillPressed extends ShoppingWebViewEvent {
        public static final CardAutofillPressed INSTANCE = new CardAutofillPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAutofillPressed);
        }

        public final int hashCode() {
            return -1362720602;
        }

        public final String toString() {
            return "CardAutofillPressed";
        }
    }

    public final class Close extends ShoppingWebViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 93514302;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CustomerDataAutofillPressed extends ShoppingWebViewEvent {
        public static final CustomerDataAutofillPressed INSTANCE = new CustomerDataAutofillPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CustomerDataAutofillPressed);
        }

        public final int hashCode() {
            return 779597326;
        }

        public final String toString() {
            return "CustomerDataAutofillPressed";
        }
    }

    public final class FooterPillPressed extends ShoppingWebViewEvent {
        public static final FooterPillPressed INSTANCE = new FooterPillPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FooterPillPressed);
        }

        public final int hashCode() {
            return 295790420;
        }

        public final String toString() {
            return "FooterPillPressed";
        }
    }

    public final class InfoButtonPressed extends ShoppingWebViewEvent {
        public static final InfoButtonPressed INSTANCE = new InfoButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InfoButtonPressed);
        }

        public final int hashCode() {
            return 118303176;
        }

        public final String toString() {
            return "InfoButtonPressed";
        }
    }

    public final class InfoSheetViewed extends ShoppingWebViewEvent {
        public final ShoppingInfoSheetScreen screen;

        public InfoSheetViewed(ShoppingInfoSheetScreen shoppingInfoSheetScreen) {
            shoppingInfoSheetScreen.getClass();
            this.screen = shoppingInfoSheetScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfoSheetViewed) && Intrinsics.areEqual(this.screen, ((InfoSheetViewed) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return "InfoSheetViewed(screen=" + this.screen + ")";
        }
    }

    public final class NavigationFailed extends ShoppingWebViewEvent {
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

    public final class NavigationStateUpdated extends ShoppingWebViewEvent {
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

    public abstract class PayKitShopViewEvent extends ShoppingWebViewEvent {

        public final class AuthorizeCustomerRequest extends PayKitShopViewEvent {
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

        public final class CashAppPayContinuePressed extends PayKitShopViewEvent {
            public static final CashAppPayContinuePressed INSTANCE = new CashAppPayContinuePressed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CashAppPayContinuePressed);
            }

            public final int hashCode() {
                return 1504208618;
            }

            public final String toString() {
                return "CashAppPayContinuePressed";
            }
        }

        public final class CashAppPayPromptDismissed extends PayKitShopViewEvent {
            public static final CashAppPayPromptDismissed INSTANCE = new CashAppPayPromptDismissed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CashAppPayPromptDismissed);
            }

            public final int hashCode() {
                return -2053315308;
            }

            public final String toString() {
                return "CashAppPayPromptDismissed";
            }
        }

        /* loaded from: classes9.dex */
        public final class PaykitToastClosePressed extends PayKitShopViewEvent {
            public static final PaykitToastClosePressed INSTANCE = new PaykitToastClosePressed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PaykitToastClosePressed);
            }

            public final int hashCode() {
                return -2114968020;
            }

            public final String toString() {
                return "PaykitToastClosePressed";
            }
        }

        public final class PromptToAuthorize extends PayKitShopViewEvent {
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

    public final class ProgressUpdated extends ShoppingWebViewEvent {
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

    public final class RefreshButtonPressed extends ShoppingWebViewEvent {
        public final String url;

        public RefreshButtonPressed(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshButtonPressed) && Intrinsics.areEqual(this.url, ((RefreshButtonPressed) obj).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RefreshButtonPressed(url=", this.url, ")");
        }
    }

    public final class RestrictedItemWarningDismissed extends ShoppingWebViewEvent {
        public static final RestrictedItemWarningDismissed INSTANCE = new RestrictedItemWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RestrictedItemWarningDismissed);
        }

        public final int hashCode() {
            return 954297621;
        }

        public final String toString() {
            return "RestrictedItemWarningDismissed";
        }
    }

    public final class ScrollingDown extends ShoppingWebViewEvent {
        public static final ScrollingDown INSTANCE = new ScrollingDown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollingDown);
        }

        public final int hashCode() {
            return -1360847235;
        }

        public final String toString() {
            return "ScrollingDown";
        }
    }

    public final class ScrollingUp extends ShoppingWebViewEvent {
        public static final ScrollingUp INSTANCE = new ScrollingUp();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollingUp);
        }

        public final int hashCode() {
            return 1468973878;
        }

        public final String toString() {
            return "ScrollingUp";
        }
    }

    public final class SingleUsePaymentCancelDialogConfirmed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentCancelDialogConfirmed INSTANCE = new SingleUsePaymentCancelDialogConfirmed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentCancelDialogConfirmed);
        }

        public final int hashCode() {
            return 1339511484;
        }

        public final String toString() {
            return "SingleUsePaymentCancelDialogConfirmed";
        }
    }

    public final class SingleUsePaymentCancelDialogDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentCancelDialogDismissed INSTANCE = new SingleUsePaymentCancelDialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentCancelDialogDismissed);
        }

        public final int hashCode() {
            return -1991879674;
        }

        public final String toString() {
            return "SingleUsePaymentCancelDialogDismissed";
        }
    }

    public final class SingleUsePaymentConnectionFailedWarningDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentConnectionFailedWarningDismissed INSTANCE = new SingleUsePaymentConnectionFailedWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentConnectionFailedWarningDismissed);
        }

        public final int hashCode() {
            return -659917751;
        }

        public final String toString() {
            return "SingleUsePaymentConnectionFailedWarningDismissed";
        }
    }

    public final class SingleUsePaymentCreditLimitWarningExceededDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentCreditLimitWarningExceededDismissed INSTANCE = new SingleUsePaymentCreditLimitWarningExceededDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentCreditLimitWarningExceededDismissed);
        }

        public final int hashCode() {
            return 424775707;
        }

        public final String toString() {
            return "SingleUsePaymentCreditLimitWarningExceededDismissed";
        }
    }

    public final class SingleUsePaymentLoanLimitReachedWarningDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentLoanLimitReachedWarningDismissed INSTANCE = new SingleUsePaymentLoanLimitReachedWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentLoanLimitReachedWarningDismissed);
        }

        public final int hashCode() {
            return -730106443;
        }

        public final String toString() {
            return "SingleUsePaymentLoanLimitReachedWarningDismissed";
        }
    }

    public final class SingleUsePaymentMinimumSpendWarningDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentMinimumSpendWarningDismissed INSTANCE = new SingleUsePaymentMinimumSpendWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentMinimumSpendWarningDismissed);
        }

        public final int hashCode() {
            return 1976929278;
        }

        public final String toString() {
            return "SingleUsePaymentMinimumSpendWarningDismissed";
        }
    }

    public final class SingleUsePaymentNonEmptyCartWarningDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentNonEmptyCartWarningDismissed INSTANCE = new SingleUsePaymentNonEmptyCartWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentNonEmptyCartWarningDismissed);
        }

        public final int hashCode() {
            return 1877992398;
        }

        public final String toString() {
            return "SingleUsePaymentNonEmptyCartWarningDismissed";
        }
    }

    public final class SingleUsePaymentReviewPlanDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentReviewPlanDismissed INSTANCE = new SingleUsePaymentReviewPlanDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentReviewPlanDismissed);
        }

        public final int hashCode() {
            return -1907224473;
        }

        public final String toString() {
            return "SingleUsePaymentReviewPlanDismissed";
        }
    }

    public final class SingleUsePaymentSpendingLimitReachedWarningDismissed extends ShoppingWebViewEvent {
        public static final SingleUsePaymentSpendingLimitReachedWarningDismissed INSTANCE = new SingleUsePaymentSpendingLimitReachedWarningDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentSpendingLimitReachedWarningDismissed);
        }

        public final int hashCode() {
            return 862270473;
        }

        public final String toString() {
            return "SingleUsePaymentSpendingLimitReachedWarningDismissed";
        }
    }

    public final class TitleUpdated extends ShoppingWebViewEvent {
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

    public final class UrlUpdated extends ShoppingWebViewEvent {
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

    public final class WebMonitoringJsonEvents extends ShoppingWebViewEvent {
        public final String jsonString;

        public WebMonitoringJsonEvents(String str) {
            this.jsonString = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebMonitoringJsonEvents) && this.jsonString.equals(((WebMonitoringJsonEvents) obj).jsonString);
        }

        public final int hashCode() {
            return this.jsonString.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebMonitoringJsonEvents(jsonString=", this.jsonString, ")");
        }
    }
}
