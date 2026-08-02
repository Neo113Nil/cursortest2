package com.squareup.cash.buynowpaylater.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderHubViewEvent {

    /* loaded from: classes4.dex */
    public final class ActionButtonClicked extends AfterPayOrderHubViewEvent {
        public final String url;

        public ActionButtonClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionButtonClicked) && Intrinsics.areEqual(this.url, ((ActionButtonClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionButtonClicked(url=", this.url, ")");
        }
    }

    public final class OpenUrl extends AfterPayOrderHubViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class OrderRowClicked extends AfterPayOrderHubViewEvent {
        public final String url;

        public OrderRowClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderRowClicked) && Intrinsics.areEqual(this.url, ((OrderRowClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OrderRowClicked(url=", this.url, ")");
        }
    }

    public abstract class TextWithInfoClicked extends AfterPayOrderHubViewEvent {

        public final class AvailableBalanceInfoClicked extends TextWithInfoClicked {
            public final InfoSheetViewModel infoSheetViewModel;

            public AvailableBalanceInfoClicked(InfoSheetViewModel infoSheetViewModel) {
                this.infoSheetViewModel = infoSheetViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvailableBalanceInfoClicked) && this.infoSheetViewModel.equals(((AvailableBalanceInfoClicked) obj).infoSheetViewModel);
            }

            @Override // com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent.TextWithInfoClicked
            public final InfoSheetViewModel getInfoSheetViewModel() {
                return this.infoSheetViewModel;
            }

            public final int hashCode() {
                return this.infoSheetViewModel.stackableContent.hashCode();
            }

            public final String toString() {
                return "AvailableBalanceInfoClicked(infoSheetViewModel=" + this.infoSheetViewModel + ")";
            }
        }

        public final class NonCashAppPayInfoClicked extends TextWithInfoClicked {
            public final InfoSheetViewModel infoSheetViewModel;
            public final String orderId;

            public NonCashAppPayInfoClicked(InfoSheetViewModel infoSheetViewModel, String str) {
                str.getClass();
                this.infoSheetViewModel = infoSheetViewModel;
                this.orderId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NonCashAppPayInfoClicked)) {
                    return false;
                }
                NonCashAppPayInfoClicked nonCashAppPayInfoClicked = (NonCashAppPayInfoClicked) obj;
                return this.infoSheetViewModel.equals(nonCashAppPayInfoClicked.infoSheetViewModel) && Intrinsics.areEqual(this.orderId, nonCashAppPayInfoClicked.orderId);
            }

            @Override // com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent.TextWithInfoClicked
            public final InfoSheetViewModel getInfoSheetViewModel() {
                return this.infoSheetViewModel;
            }

            public final int hashCode() {
                return this.orderId.hashCode() + (this.infoSheetViewModel.stackableContent.hashCode() * 31);
            }

            public final String toString() {
                return "NonCashAppPayInfoClicked(infoSheetViewModel=" + this.infoSheetViewModel + ", orderId=" + this.orderId + ")";
            }
        }

        public final class TotalOwedInfoClicked extends TextWithInfoClicked {
            public final InfoSheetViewModel infoSheetViewModel;

            public TotalOwedInfoClicked(InfoSheetViewModel infoSheetViewModel) {
                this.infoSheetViewModel = infoSheetViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TotalOwedInfoClicked) && this.infoSheetViewModel.equals(((TotalOwedInfoClicked) obj).infoSheetViewModel);
            }

            @Override // com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent.TextWithInfoClicked
            public final InfoSheetViewModel getInfoSheetViewModel() {
                return this.infoSheetViewModel;
            }

            public final int hashCode() {
                return this.infoSheetViewModel.stackableContent.hashCode();
            }

            public final String toString() {
                return "TotalOwedInfoClicked(infoSheetViewModel=" + this.infoSheetViewModel + ")";
            }
        }

        public abstract InfoSheetViewModel getInfoSheetViewModel();
    }

    public final class ToolbarBackClicked extends AfterPayOrderHubViewEvent {
        public static final ToolbarBackClicked INSTANCE = new ToolbarBackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToolbarBackClicked);
        }

        public final int hashCode() {
            return -488395512;
        }

        public final String toString() {
            return "ToolbarBackClicked";
        }
    }

    public final class TryAgainClicked extends AfterPayOrderHubViewEvent {
        public static final TryAgainClicked INSTANCE = new TryAgainClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainClicked);
        }

        public final int hashCode() {
            return -1541946721;
        }

        public final String toString() {
            return "TryAgainClicked";
        }
    }
}
