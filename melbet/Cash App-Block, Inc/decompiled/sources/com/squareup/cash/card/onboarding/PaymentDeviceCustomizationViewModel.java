package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationViewModel {
    public final Image backgroundImage;
    public final boolean disable3D;
    public final String focusedDeviceId;
    public final ZoomLevel initialZoomLevel;
    public final List items;
    public final String title;

    public PaymentDeviceCustomizationViewModel(String str, List list, String str2, ZoomLevel zoomLevel, boolean z, Image image) {
        str.getClass();
        list.getClass();
        zoomLevel.getClass();
        this.title = str;
        this.items = list;
        this.focusedDeviceId = str2;
        this.initialZoomLevel = zoomLevel;
        this.disable3D = z;
        this.backgroundImage = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceCustomizationViewModel)) {
            return false;
        }
        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj;
        return Intrinsics.areEqual(this.title, paymentDeviceCustomizationViewModel.title) && Intrinsics.areEqual(this.items, paymentDeviceCustomizationViewModel.items) && Intrinsics.areEqual(this.focusedDeviceId, paymentDeviceCustomizationViewModel.focusedDeviceId) && this.initialZoomLevel == paymentDeviceCustomizationViewModel.initialZoomLevel && this.disable3D == paymentDeviceCustomizationViewModel.disable3D && Intrinsics.areEqual(this.backgroundImage, paymentDeviceCustomizationViewModel.backgroundImage);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.items);
        String str = this.focusedDeviceId;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.initialZoomLevel.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.disable3D);
        Image image = this.backgroundImage;
        return m2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PaymentDeviceCustomizationViewModel(title=", this.title, ", items=", ", focusedDeviceId=", this.items);
        m.append(this.focusedDeviceId);
        m.append(", initialZoomLevel=");
        m.append(this.initialZoomLevel);
        m.append(", disable3D=");
        m.append(this.disable3D);
        m.append(", backgroundImage=");
        m.append(this.backgroundImage);
        m.append(")");
        return m.toString();
    }
}
