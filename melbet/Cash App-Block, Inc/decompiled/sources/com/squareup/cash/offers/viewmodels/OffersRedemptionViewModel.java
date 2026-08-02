package com.squareup.cash.offers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersRedemptionViewModel {
    public final String bodyText;
    public final String headerText;
    public final int imgResource;

    public OffersRedemptionViewModel(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.imgResource = i;
        this.headerText = str;
        this.bodyText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersRedemptionViewModel)) {
            return false;
        }
        OffersRedemptionViewModel offersRedemptionViewModel = (OffersRedemptionViewModel) obj;
        return this.imgResource == offersRedemptionViewModel.imgResource && Intrinsics.areEqual(this.headerText, offersRedemptionViewModel.headerText) && Intrinsics.areEqual(this.bodyText, offersRedemptionViewModel.bodyText);
    }

    public final int hashCode() {
        return this.bodyText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.imgResource) * 31, 31, this.headerText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("OffersRedemptionViewModel(imgResource=", this.imgResource, ", headerText=", this.headerText, ", bodyText="), this.bodyText, ")");
    }
}
