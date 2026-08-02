package com.squareup.cash.offers.presenters;

import app.cash.api.ApiResult;
import com.squareup.cash.afterpayapplet.backend.AppletCreditLineState;
import com.squareup.cash.boost.db.Slots;
import com.squareup.protos.cash.postcard.CashAppCard;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersDetailsState {
    public final Slots activeBoostSlot;
    public final AppletCreditLineState appletCreditLineState;
    public final CashAppCard.PhysicalCardOrderState cardState;
    public final OfferDetailsFooterState footerState;
    public final OfferAddedConfirmationState offerAddedConfirmationState;
    public final ApiResult response;

    public OffersDetailsState(ApiResult apiResult, AppletCreditLineState appletCreditLineState, Slots slots, CashAppCard.PhysicalCardOrderState physicalCardOrderState, OfferDetailsFooterState offerDetailsFooterState, OfferAddedConfirmationState offerAddedConfirmationState) {
        physicalCardOrderState.getClass();
        offerDetailsFooterState.getClass();
        this.response = apiResult;
        this.appletCreditLineState = appletCreditLineState;
        this.activeBoostSlot = slots;
        this.cardState = physicalCardOrderState;
        this.footerState = offerDetailsFooterState;
        this.offerAddedConfirmationState = offerAddedConfirmationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersDetailsState)) {
            return false;
        }
        OffersDetailsState offersDetailsState = (OffersDetailsState) obj;
        return Intrinsics.areEqual(this.response, offersDetailsState.response) && Intrinsics.areEqual(this.appletCreditLineState, offersDetailsState.appletCreditLineState) && Intrinsics.areEqual(this.activeBoostSlot, offersDetailsState.activeBoostSlot) && this.cardState == offersDetailsState.cardState && this.footerState == offersDetailsState.footerState && Intrinsics.areEqual(this.offerAddedConfirmationState, offersDetailsState.offerAddedConfirmationState);
    }

    public final int hashCode() {
        ApiResult apiResult = this.response;
        int hashCode = (apiResult == null ? 0 : apiResult.hashCode()) * 31;
        AppletCreditLineState appletCreditLineState = this.appletCreditLineState;
        int hashCode2 = (hashCode + (appletCreditLineState == null ? 0 : appletCreditLineState.hashCode())) * 31;
        Slots slots = this.activeBoostSlot;
        int hashCode3 = (this.footerState.hashCode() + ((this.cardState.hashCode() + ((hashCode2 + (slots == null ? 0 : slots.hashCode())) * 31)) * 31)) * 31;
        OfferAddedConfirmationState offerAddedConfirmationState = this.offerAddedConfirmationState;
        return hashCode3 + (offerAddedConfirmationState != null ? offerAddedConfirmationState.hashCode() : 0);
    }

    public final String toString() {
        return "OffersDetailsState(response=" + this.response + ", appletCreditLineState=" + this.appletCreditLineState + ", activeBoostSlot=" + this.activeBoostSlot + ", cardState=" + this.cardState + ", footerState=" + this.footerState + ", offerAddedConfirmationState=" + this.offerAddedConfirmationState + ")";
    }
}
