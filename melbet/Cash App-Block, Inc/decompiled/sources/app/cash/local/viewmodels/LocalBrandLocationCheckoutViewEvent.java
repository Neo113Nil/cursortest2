package app.cash.local.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalBrandLocationCheckoutViewEvent {

    public final class ApplyGiftCardClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final ApplyGiftCardClicked INSTANCE = new ApplyGiftCardClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ApplyGiftCardClicked);
        }

        public final int hashCode() {
            return 1361472023;
        }

        public final String toString() {
            return "ApplyGiftCardClicked";
        }
    }

    public final class BackClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 288542658;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CouponCodeSubmitted implements LocalBrandLocationCheckoutViewEvent {
        public final String code;

        public CouponCodeSubmitted(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CouponCodeSubmitted) && Intrinsics.areEqual(this.code, ((CouponCodeSubmitted) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CouponCodeSubmitted(code=", this.code, ")");
        }
    }

    public final class CouponRemoved implements LocalBrandLocationCheckoutViewEvent {
        public final String code;

        public CouponRemoved(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CouponRemoved) && Intrinsics.areEqual(this.code, ((CouponRemoved) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CouponRemoved(code=", this.code, ")");
        }
    }

    public final class CurbsidePickupToggled implements LocalBrandLocationCheckoutViewEvent {
        public final boolean isSelected;

        public CurbsidePickupToggled(boolean z) {
            this.isSelected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CurbsidePickupToggled) && this.isSelected == ((CurbsidePickupToggled) obj).isSelected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSelected);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("CurbsidePickupToggled(isSelected=", ")", this.isSelected);
        }
    }

    public final class DropoffNotesUpdated implements LocalBrandLocationCheckoutViewEvent {
        public final String notes;

        public DropoffNotesUpdated(String str) {
            this.notes = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DropoffNotesUpdated) && this.notes.equals(((DropoffNotesUpdated) obj).notes);
        }

        public final int hashCode() {
            return this.notes.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DropoffNotesUpdated(notes=", this.notes, ")");
        }
    }

    public final class EditBuyerInfoClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final EditBuyerInfoClicked INSTANCE = new EditBuyerInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditBuyerInfoClicked);
        }

        public final int hashCode() {
            return -1466020402;
        }

        public final String toString() {
            return "EditBuyerInfoClicked";
        }
    }

    public final class FulfillmentRowAsapClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final FulfillmentRowAsapClicked INSTANCE = new FulfillmentRowAsapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowAsapClicked);
        }

        public final int hashCode() {
            return 127544140;
        }

        public final String toString() {
            return "FulfillmentRowAsapClicked";
        }
    }

    public final class FulfillmentRowChangeLocationClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final FulfillmentRowChangeLocationClicked INSTANCE = new FulfillmentRowChangeLocationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowChangeLocationClicked);
        }

        public final int hashCode() {
            return 252467112;
        }

        public final String toString() {
            return "FulfillmentRowChangeLocationClicked";
        }
    }

    public final class FulfillmentRowClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final FulfillmentRowClicked INSTANCE = new FulfillmentRowClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowClicked);
        }

        public final int hashCode() {
            return 1795451245;
        }

        public final String toString() {
            return "FulfillmentRowClicked";
        }
    }

    public final class FulfillmentRowLaterClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final FulfillmentRowLaterClicked INSTANCE = new FulfillmentRowLaterClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowLaterClicked);
        }

        public final int hashCode() {
            return 698528373;
        }

        public final String toString() {
            return "FulfillmentRowLaterClicked";
        }
    }

    public final class FulfillmentRowSwitchType implements LocalBrandLocationCheckoutViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final LocalFulfillmentType f919type;

        public FulfillmentRowSwitchType(LocalFulfillmentType localFulfillmentType) {
            localFulfillmentType.getClass();
            this.f919type = localFulfillmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FulfillmentRowSwitchType) && this.f919type == ((FulfillmentRowSwitchType) obj).f919type;
        }

        public final int hashCode() {
            return this.f919type.hashCode();
        }

        public final String toString() {
            return "FulfillmentRowSwitchType(type=" + this.f919type + ")";
        }
    }

    public final class GiftCardCodeEntered implements LocalBrandLocationCheckoutViewEvent {
        public final String code;

        public GiftCardCodeEntered(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GiftCardCodeEntered) && Intrinsics.areEqual(this.code, ((GiftCardCodeEntered) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GiftCardCodeEntered(code=", this.code, ")");
        }
    }

    public final class GiftCardsExpandedChanged implements LocalBrandLocationCheckoutViewEvent {
        public final boolean isExpanded;

        public GiftCardsExpandedChanged(boolean z) {
            this.isExpanded = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GiftCardsExpandedChanged) && this.isExpanded == ((GiftCardsExpandedChanged) obj).isExpanded;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isExpanded);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("GiftCardsExpandedChanged(isExpanded=", ")", this.isExpanded);
        }
    }

    public final class NoContactDeliveryToggled implements LocalBrandLocationCheckoutViewEvent {
        public final boolean toggled;

        public NoContactDeliveryToggled(boolean z) {
            this.toggled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoContactDeliveryToggled) && this.toggled == ((NoContactDeliveryToggled) obj).toggled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("NoContactDeliveryToggled(toggled=", ")", this.toggled);
        }
    }

    public final class OrderNotesUpdated implements LocalBrandLocationCheckoutViewEvent {
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

    public final class PaymentMethodSelected implements LocalBrandLocationCheckoutViewEvent {
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

    public final class PlaceOrderClicked implements LocalBrandLocationCheckoutViewEvent {
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

    public final class RemoveGiftCardClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final RemoveGiftCardClicked INSTANCE = new RemoveGiftCardClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveGiftCardClicked);
        }

        public final int hashCode() {
            return -1667311995;
        }

        public final String toString() {
            return "RemoveGiftCardClicked";
        }
    }

    public final class SuggestedTipClicked implements LocalBrandLocationCheckoutViewEvent {
        public final int index;

        public SuggestedTipClicked(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedTipClicked) && this.index == ((SuggestedTipClicked) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "SuggestedTipClicked(index=", ")");
        }
    }

    public final class TipEntered implements LocalBrandLocationCheckoutViewEvent {
        public final String amount;

        public TipEntered(String str) {
            str.getClass();
            this.amount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TipEntered) && Intrinsics.areEqual(this.amount, ((TipEntered) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TipEntered(amount=", this.amount, ")");
        }
    }

    public final class UrlClicked implements LocalBrandLocationCheckoutViewEvent {
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

    public final class VehicleDescriptionClicked implements LocalBrandLocationCheckoutViewEvent {
        public static final VehicleDescriptionClicked INSTANCE = new VehicleDescriptionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VehicleDescriptionClicked);
        }

        public final int hashCode() {
            return -663426087;
        }

        public final String toString() {
            return "VehicleDescriptionClicked";
        }
    }
}
