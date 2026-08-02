package app.cash.local.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.CurbsidePickupDetails;
import app.cash.local.viewmodels.OrderBuilderModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OrderBuilder$Payload {
    public final OrderBuilderModel.BuyerInfo buyerInfo;
    public final CurbsidePickupDetails curbsidePickupDetails;
    public final String dropoffNotes;
    public final List giftCardCodes;
    public final boolean noContactDelivery;
    public final String orderNotes;
    public final boolean redeemLocalCashBalance;

    public OrderBuilder$Payload(OrderBuilderModel.BuyerInfo buyerInfo, boolean z, boolean z2, String str, String str2, List list, CurbsidePickupDetails curbsidePickupDetails) {
        list.getClass();
        curbsidePickupDetails.getClass();
        this.buyerInfo = buyerInfo;
        this.redeemLocalCashBalance = z;
        this.noContactDelivery = z2;
        this.dropoffNotes = str;
        this.orderNotes = str2;
        this.giftCardCodes = list;
        this.curbsidePickupDetails = curbsidePickupDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderBuilder$Payload)) {
            return false;
        }
        OrderBuilder$Payload orderBuilder$Payload = (OrderBuilder$Payload) obj;
        return Intrinsics.areEqual(this.buyerInfo, orderBuilder$Payload.buyerInfo) && this.redeemLocalCashBalance == orderBuilder$Payload.redeemLocalCashBalance && this.noContactDelivery == orderBuilder$Payload.noContactDelivery && Intrinsics.areEqual(this.dropoffNotes, orderBuilder$Payload.dropoffNotes) && Intrinsics.areEqual(this.orderNotes, orderBuilder$Payload.orderNotes) && Intrinsics.areEqual(this.giftCardCodes, orderBuilder$Payload.giftCardCodes) && Intrinsics.areEqual(this.curbsidePickupDetails, orderBuilder$Payload.curbsidePickupDetails);
    }

    public final int hashCode() {
        OrderBuilderModel.BuyerInfo buyerInfo = this.buyerInfo;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((buyerInfo == null ? 0 : buyerInfo.hashCode()) * 31, 31, this.redeemLocalCashBalance), 31, this.noContactDelivery);
        String str = this.dropoffNotes;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderNotes;
        return this.curbsidePickupDetails.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.giftCardCodes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(buyerInfo=");
        sb.append(this.buyerInfo);
        sb.append(", redeemLocalCashBalance=");
        sb.append(this.redeemLocalCashBalance);
        sb.append(", noContactDelivery=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.noContactDelivery, ", dropoffNotes=", this.dropoffNotes, ", orderNotes=");
        NavAction$$ExternalSyntheticOutline0.m(this.orderNotes, ", giftCardCodes=", ", curbsidePickupDetails=", sb, this.giftCardCodes);
        sb.append(this.curbsidePickupDetails);
        sb.append(")");
        return sb.toString();
    }
}
