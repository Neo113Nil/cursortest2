package app.cash.local.viewmodels;

import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalOpenTabCheckoutViewEvent {

    public final class BackClicked implements LocalOpenTabCheckoutViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 920359763;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class EditBuyerInfoClicked implements LocalOpenTabCheckoutViewEvent {
        public static final EditBuyerInfoClicked INSTANCE = new EditBuyerInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditBuyerInfoClicked);
        }

        public final int hashCode() {
            return -1363542691;
        }

        public final String toString() {
            return "EditBuyerInfoClicked";
        }
    }

    public final class OrderNotesUpdated implements LocalOpenTabCheckoutViewEvent {
        public final String notes;

        public OrderNotesUpdated(String str) {
            this.notes = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderNotesUpdated) && Intrinsics.areEqual(this.notes, ((OrderNotesUpdated) obj).notes);
        }

        public final int hashCode() {
            String str = this.notes;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OrderNotesUpdated(notes=", this.notes, ")");
        }
    }

    public final class PaymentMethodSelected implements LocalOpenTabCheckoutViewEvent {
        public final String token;

        public PaymentMethodSelected(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethodSelected) && Intrinsics.areEqual(this.token, ((PaymentMethodSelected) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentMethodSelected(token=", PaymentMethodToken.m1282toStringimpl(this.token), ")");
        }
    }

    public final class PaymentTimingSelected implements LocalOpenTabCheckoutViewEvent {
        public final LocalCheckoutPaymentTimingViewModel.Option option;

        public PaymentTimingSelected(LocalCheckoutPaymentTimingViewModel.Option option) {
            this.option = option;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentTimingSelected) && this.option == ((PaymentTimingSelected) obj).option;
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "PaymentTimingSelected(option=" + this.option + ")";
        }
    }

    public final class PlaceOrderClicked implements LocalOpenTabCheckoutViewEvent {
        public final OrderBuilderModel.BuyerInfo buyerInfo;

        public PlaceOrderClicked(OrderBuilderModel.BuyerInfo buyerInfo) {
            buyerInfo.getClass();
            this.buyerInfo = buyerInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceOrderClicked) && Intrinsics.areEqual(this.buyerInfo, ((PlaceOrderClicked) obj).buyerInfo);
        }

        public final int hashCode() {
            return this.buyerInfo.hashCode();
        }

        public final String toString() {
            return "PlaceOrderClicked(buyerInfo=" + this.buyerInfo + ")";
        }
    }

    public final class UrlClicked implements LocalOpenTabCheckoutViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
