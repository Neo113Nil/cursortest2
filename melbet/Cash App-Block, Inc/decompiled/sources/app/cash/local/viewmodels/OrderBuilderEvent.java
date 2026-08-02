package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.primitives.RewardToken;
import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface OrderBuilderEvent {

    public final class AddDiscountCode implements OrderBuilderEvent, RequireServerUpdate {
        public final DiscountCode.Entered discountCode;

        public AddDiscountCode(DiscountCode.Entered entered) {
            this.discountCode = entered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddDiscountCode) && this.discountCode.equals(((AddDiscountCode) obj).discountCode);
        }

        public final int hashCode() {
            return this.discountCode.code.hashCode();
        }

        public final String toString() {
            return "AddDiscountCode(discountCode=" + this.discountCode + ")";
        }
    }

    public final class ClearGiftCardError implements OrderBuilderEvent {
        public static final ClearGiftCardError INSTANCE = new ClearGiftCardError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearGiftCardError);
        }

        public final int hashCode() {
            return -430199286;
        }

        public final String toString() {
            return "ClearGiftCardError";
        }
    }

    public final class ContinueToTip implements OrderBuilderEvent {
        public static final ContinueToTip INSTANCE = new ContinueToTip();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueToTip);
        }

        public final int hashCode() {
            return 561709194;
        }

        public final String toString() {
            return "ContinueToTip";
        }
    }

    public final class CreateOrder implements OrderBuilderEvent {
        public static final CreateOrder INSTANCE = new CreateOrder();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateOrder);
        }

        public final int hashCode() {
            return 1116478659;
        }

        public final String toString() {
            return "CreateOrder";
        }
    }

    public final class CreateOrderWithWorkflow implements OrderBuilderEvent {
        public final boolean includePaymentData;
        public final OrderWorkflow orderWorkflow;

        public CreateOrderWithWorkflow(OrderWorkflow orderWorkflow, boolean z) {
            orderWorkflow.getClass();
            this.orderWorkflow = orderWorkflow;
            this.includePaymentData = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateOrderWithWorkflow)) {
                return false;
            }
            CreateOrderWithWorkflow createOrderWithWorkflow = (CreateOrderWithWorkflow) obj;
            return this.orderWorkflow == createOrderWithWorkflow.orderWorkflow && this.includePaymentData == createOrderWithWorkflow.includePaymentData;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.includePaymentData) + (this.orderWorkflow.hashCode() * 31);
        }

        public final String toString() {
            return "CreateOrderWithWorkflow(orderWorkflow=" + this.orderWorkflow + ", includePaymentData=" + this.includePaymentData + ")";
        }
    }

    public final class PrepareForPayAtEnd implements OrderBuilderEvent {
        public static final PrepareForPayAtEnd INSTANCE = new PrepareForPayAtEnd();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepareForPayAtEnd);
        }

        public final int hashCode() {
            return -1945745903;
        }

        public final String toString() {
            return "PrepareForPayAtEnd";
        }
    }

    public final class RemoveDiscountCode implements OrderBuilderEvent, RequireServerUpdate {
        public final DiscountCode.Entered discountCode;

        public RemoveDiscountCode(DiscountCode.Entered entered) {
            this.discountCode = entered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveDiscountCode) && this.discountCode.equals(((RemoveDiscountCode) obj).discountCode);
        }

        public final int hashCode() {
            return this.discountCode.code.hashCode();
        }

        public final String toString() {
            return "RemoveDiscountCode(discountCode=" + this.discountCode + ")";
        }
    }

    public interface RequireServerUpdate {
    }

    public final class SelectRewardToken implements OrderBuilderEvent, RequireServerUpdate {
        public final String token;

        public SelectRewardToken(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectRewardToken)) {
                return false;
            }
            String str = ((SelectRewardToken) obj).token;
            String str2 = this.token;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            return areEqual;
        }

        public final int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.token;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectRewardToken(token=", str == null ? "null" : RewardToken.m1283toStringimpl(str), ")");
        }
    }

    public final class UpdateBuyerInfo implements OrderBuilderEvent {
        public final OrderBuilderModel.BuyerInfo.UiReady buyerInfo;

        public UpdateBuyerInfo(OrderBuilderModel.BuyerInfo.UiReady uiReady) {
            this.buyerInfo = uiReady;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBuyerInfo) && this.buyerInfo.equals(((UpdateBuyerInfo) obj).buyerInfo);
        }

        public final int hashCode() {
            return this.buyerInfo.hashCode();
        }

        public final String toString() {
            return "UpdateBuyerInfo(buyerInfo=" + this.buyerInfo + ")";
        }
    }

    public final class UpdateCurbsideDetails implements OrderBuilderEvent {
        public final CurbsidePickupDetails details;

        public UpdateCurbsideDetails(CurbsidePickupDetails curbsidePickupDetails) {
            this.details = curbsidePickupDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCurbsideDetails) && this.details.equals(((UpdateCurbsideDetails) obj).details);
        }

        public final int hashCode() {
            return this.details.hashCode();
        }

        public final String toString() {
            return "UpdateCurbsideDetails(details=" + this.details + ")";
        }
    }

    public final class UpdateDropoffNotes implements OrderBuilderEvent {
        public final String dropoffNotes;

        public UpdateDropoffNotes(String str) {
            this.dropoffNotes = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDropoffNotes) && this.dropoffNotes.equals(((UpdateDropoffNotes) obj).dropoffNotes);
        }

        public final int hashCode() {
            return this.dropoffNotes.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdateDropoffNotes(dropoffNotes=", this.dropoffNotes, ")");
        }
    }

    public final class UpdateFulfillmentScheduling implements OrderBuilderEvent, RequireServerUpdate {
        public final LocalFulfillment.SchedulingDetails schedulingDetails;

        public UpdateFulfillmentScheduling(LocalFulfillment.SchedulingDetails schedulingDetails) {
            this.schedulingDetails = schedulingDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFulfillmentScheduling) && this.schedulingDetails.equals(((UpdateFulfillmentScheduling) obj).schedulingDetails);
        }

        public final int hashCode() {
            return this.schedulingDetails.hashCode();
        }

        public final String toString() {
            return "UpdateFulfillmentScheduling(schedulingDetails=" + this.schedulingDetails + ")";
        }
    }

    public final class UpdateGiftCards implements OrderBuilderEvent, RequireServerUpdate {
        public final List codes;

        public UpdateGiftCards(List list) {
            list.getClass();
            this.codes = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGiftCards) && Intrinsics.areEqual(this.codes, ((UpdateGiftCards) obj).codes);
        }

        public final int hashCode() {
            return this.codes.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("UpdateGiftCards(codes=", ")", this.codes);
        }
    }

    public final class UpdateNoContactDelivery implements OrderBuilderEvent {
        public final boolean noContactDelivery;

        public UpdateNoContactDelivery(boolean z) {
            this.noContactDelivery = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNoContactDelivery) && this.noContactDelivery == ((UpdateNoContactDelivery) obj).noContactDelivery;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.noContactDelivery);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("UpdateNoContactDelivery(noContactDelivery=", ")", this.noContactDelivery);
        }
    }

    public final class UpdateOrderNotes implements OrderBuilderEvent {
        public final String notes;

        public UpdateOrderNotes(String str) {
            this.notes = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateOrderNotes) && Intrinsics.areEqual(this.notes, ((UpdateOrderNotes) obj).notes);
        }

        public final int hashCode() {
            String str = this.notes;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdateOrderNotes(notes=", this.notes, ")");
        }
    }

    public final class UpdatePaymentMethod implements OrderBuilderEvent {
        public final String token;

        public UpdatePaymentMethod(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePaymentMethod) && Intrinsics.areEqual(this.token, ((UpdatePaymentMethod) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdatePaymentMethod(token=", PaymentMethodToken.m1282toStringimpl(this.token), ")");
        }
    }

    public final class UpdateRedeemLocalCashBalance implements OrderBuilderEvent {
        public final boolean redeem;

        public UpdateRedeemLocalCashBalance(boolean z) {
            this.redeem = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRedeemLocalCashBalance) && this.redeem == ((UpdateRedeemLocalCashBalance) obj).redeem;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.redeem);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("UpdateRedeemLocalCashBalance(redeem=", ")", this.redeem);
        }
    }

    public final class UpdateTipAmount implements OrderBuilderEvent {
        public final LocalMoney tipAmount;

        public UpdateTipAmount(LocalMoney localMoney) {
            this.tipAmount = localMoney;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTipAmount) && this.tipAmount.equals(((UpdateTipAmount) obj).tipAmount);
        }

        public final int hashCode() {
            return this.tipAmount.hashCode();
        }

        public final String toString() {
            return "UpdateTipAmount(tipAmount=" + this.tipAmount + ")";
        }
    }
}
