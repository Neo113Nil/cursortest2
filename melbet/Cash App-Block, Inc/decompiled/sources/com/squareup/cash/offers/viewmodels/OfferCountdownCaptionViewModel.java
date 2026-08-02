package com.squareup.cash.offers.viewmodels;

import app.cash.paraphrase.FormattedResource;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfferCountdownCaptionViewModel {
    public final Color captionColor;
    public final String captionTemplate;
    public final ShoppingIconId icon;
    public final boolean isExpired;
    public final String stringToReplace;
    public final FormattedResource timeUntilExpirationFormattedResource;

    public OfferCountdownCaptionViewModel(ShoppingIconId shoppingIconId, String str, String str2, FormattedResource formattedResource, Color color, boolean z) {
        str.getClass();
        this.icon = shoppingIconId;
        this.stringToReplace = str;
        this.captionTemplate = str2;
        this.timeUntilExpirationFormattedResource = formattedResource;
        this.captionColor = color;
        this.isExpired = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCountdownCaptionViewModel)) {
            return false;
        }
        OfferCountdownCaptionViewModel offerCountdownCaptionViewModel = (OfferCountdownCaptionViewModel) obj;
        return this.icon == offerCountdownCaptionViewModel.icon && Intrinsics.areEqual(this.stringToReplace, offerCountdownCaptionViewModel.stringToReplace) && Intrinsics.areEqual(this.captionTemplate, offerCountdownCaptionViewModel.captionTemplate) && Intrinsics.areEqual(this.timeUntilExpirationFormattedResource, offerCountdownCaptionViewModel.timeUntilExpirationFormattedResource) && Intrinsics.areEqual(this.captionColor, offerCountdownCaptionViewModel.captionColor) && this.isExpired == offerCountdownCaptionViewModel.isExpired;
    }

    public final int hashCode() {
        ShoppingIconId shoppingIconId = this.icon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((shoppingIconId == null ? 0 : shoppingIconId.hashCode()) * 31, 31, this.stringToReplace);
        String str = this.captionTemplate;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        FormattedResource formattedResource = this.timeUntilExpirationFormattedResource;
        int hashCode2 = (hashCode + (formattedResource == null ? 0 : formattedResource.hashCode())) * 31;
        Color color = this.captionColor;
        return Boolean.hashCode(this.isExpired) + ((hashCode2 + (color != null ? color.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OfferCountdownCaptionViewModel(icon=" + this.icon + ", stringToReplace=" + this.stringToReplace + ", captionTemplate=" + this.captionTemplate + ", timeUntilExpirationFormattedResource=" + this.timeUntilExpirationFormattedResource + ", captionColor=" + this.captionColor + ", isExpired=" + this.isExpired + ")";
    }
}
