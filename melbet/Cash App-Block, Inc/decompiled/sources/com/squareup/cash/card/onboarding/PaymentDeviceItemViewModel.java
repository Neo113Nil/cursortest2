package com.squareup.cash.card.onboarding;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentDeviceItemViewModel {
    public final String accessibilityText;
    public final PaymentDeviceAvailability availability;
    public final AvailabilityPill availabilityPill;
    public final Image backgroundImage;
    public final String id;
    public final String name;
    public final String priceLabel;
    public final ProductDetailsPageViewModel productDetailsPage;
    public final GridItemVisual visual;

    public PaymentDeviceItemViewModel(String str, GridItemVisual gridItemVisual, String str2, String str3, String str4, PaymentDeviceAvailability paymentDeviceAvailability, AvailabilityPill availabilityPill, ProductDetailsPageViewModel productDetailsPageViewModel, Image image) {
        str.getClass();
        gridItemVisual.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        paymentDeviceAvailability.getClass();
        this.id = str;
        this.visual = gridItemVisual;
        this.name = str2;
        this.priceLabel = str3;
        this.accessibilityText = str4;
        this.availability = paymentDeviceAvailability;
        this.availabilityPill = availabilityPill;
        this.productDetailsPage = productDetailsPageViewModel;
        this.backgroundImage = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceItemViewModel)) {
            return false;
        }
        PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) obj;
        return Intrinsics.areEqual(this.id, paymentDeviceItemViewModel.id) && Intrinsics.areEqual(this.visual, paymentDeviceItemViewModel.visual) && Intrinsics.areEqual(this.name, paymentDeviceItemViewModel.name) && Intrinsics.areEqual(this.priceLabel, paymentDeviceItemViewModel.priceLabel) && Intrinsics.areEqual(this.accessibilityText, paymentDeviceItemViewModel.accessibilityText) && this.availability == paymentDeviceItemViewModel.availability && Intrinsics.areEqual(this.availabilityPill, paymentDeviceItemViewModel.availabilityPill) && Intrinsics.areEqual(this.productDetailsPage, paymentDeviceItemViewModel.productDetailsPage) && Intrinsics.areEqual(this.backgroundImage, paymentDeviceItemViewModel.backgroundImage);
    }

    public final int hashCode() {
        int hashCode = (this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.visual.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.name), 31, this.priceLabel), 31, this.accessibilityText)) * 31;
        AvailabilityPill availabilityPill = this.availabilityPill;
        int hashCode2 = (hashCode + (availabilityPill == null ? 0 : availabilityPill.hashCode())) * 31;
        ProductDetailsPageViewModel productDetailsPageViewModel = this.productDetailsPage;
        int hashCode3 = (hashCode2 + (productDetailsPageViewModel == null ? 0 : productDetailsPageViewModel.hashCode())) * 31;
        Image image = this.backgroundImage;
        return hashCode3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentDeviceItemViewModel(id=");
        sb.append(this.id);
        sb.append(", visual=");
        sb.append(this.visual);
        sb.append(", name=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.name, ", priceLabel=", this.priceLabel, ", accessibilityText=");
        sb.append(this.accessibilityText);
        sb.append(", availability=");
        sb.append(this.availability);
        sb.append(", availabilityPill=");
        sb.append(this.availabilityPill);
        sb.append(", productDetailsPage=");
        sb.append(this.productDetailsPage);
        sb.append(", backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PaymentDeviceItemViewModel(String str, GridItemVisual gridItemVisual, String str2, String str3, String str4, PaymentDeviceAvailability paymentDeviceAvailability, AvailabilityPill availabilityPill, int i) {
        this(str, gridItemVisual, str2, str3, str4, paymentDeviceAvailability, (i & 64) != 0 ? null : availabilityPill, null, null);
    }
}
