package app.cash.local.viewmodels.fulfillment;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocationToken;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class FulfillmentPickerViewModel {

    public final class Delivery extends FulfillmentPickerViewModel {
        public final GlobalAddressWrapper addressPrefill;
        public final List availableTypes;
        public final String ctaLabel;
        public final LocalText deliveryEstimatedTime;
        public final String deliveryQuote;
        public final GpsCoordinates gpsCoordinates;
        public final boolean hasDeliveryQuote;
        public final ArrayList savedAddresses;

        public Delivery(GlobalAddressWrapper globalAddressWrapper, GpsCoordinates gpsCoordinates, String str, LocalText localText, boolean z, List list, String str2, ArrayList arrayList) {
            list.getClass();
            str2.getClass();
            this.addressPrefill = globalAddressWrapper;
            this.gpsCoordinates = gpsCoordinates;
            this.deliveryQuote = str;
            this.deliveryEstimatedTime = localText;
            this.hasDeliveryQuote = z;
            this.availableTypes = list;
            this.ctaLabel = str2;
            this.savedAddresses = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Delivery)) {
                return false;
            }
            Delivery delivery = (Delivery) obj;
            return Intrinsics.areEqual(this.addressPrefill, delivery.addressPrefill) && Intrinsics.areEqual(this.gpsCoordinates, delivery.gpsCoordinates) && Intrinsics.areEqual(this.deliveryQuote, delivery.deliveryQuote) && Intrinsics.areEqual(this.deliveryEstimatedTime, delivery.deliveryEstimatedTime) && this.hasDeliveryQuote == delivery.hasDeliveryQuote && Intrinsics.areEqual(this.availableTypes, delivery.availableTypes) && Intrinsics.areEqual(this.ctaLabel, delivery.ctaLabel) && this.savedAddresses.equals(delivery.savedAddresses);
        }

        public final int hashCode() {
            GlobalAddressWrapper globalAddressWrapper = this.addressPrefill;
            int hashCode = (globalAddressWrapper == null ? 0 : globalAddressWrapper.hashCode()) * 31;
            GpsCoordinates gpsCoordinates = this.gpsCoordinates;
            int hashCode2 = (hashCode + (gpsCoordinates == null ? 0 : gpsCoordinates.hashCode())) * 31;
            String str = this.deliveryQuote;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            LocalText localText = this.deliveryEstimatedTime;
            return this.savedAddresses.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (localText != null ? localText.hashCode() : 0)) * 31, 31, this.hasDeliveryQuote), 31, this.availableTypes), 31, this.ctaLabel);
        }

        public final String toString() {
            return "Delivery(addressPrefill=" + this.addressPrefill + ", gpsCoordinates=" + this.gpsCoordinates + ", deliveryQuote=" + this.deliveryQuote + ", deliveryEstimatedTime=" + this.deliveryEstimatedTime + ", hasDeliveryQuote=" + this.hasDeliveryQuote + ", availableTypes=" + this.availableTypes + ", ctaLabel=" + this.ctaLabel + ", savedAddresses=" + this.savedAddresses + ")";
        }
    }

    public final class Pickup extends FulfillmentPickerViewModel {
        public final List availableTypes;
        public final String ctaLabel;
        public final ArrayList locations;
        public final String selected;

        public Pickup(ArrayList arrayList, String str, List list, String str2) {
            list.getClass();
            str2.getClass();
            this.locations = arrayList;
            this.selected = str;
            this.availableTypes = list;
            this.ctaLabel = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof Pickup) {
                    Pickup pickup = (Pickup) obj;
                    if (this.locations.equals(pickup.locations)) {
                        String str = pickup.selected;
                        String str2 = this.selected;
                        if (str2 == null) {
                            if (str == null) {
                                equals = true;
                                if (equals && Intrinsics.areEqual(this.availableTypes, pickup.availableTypes) && Intrinsics.areEqual(this.ctaLabel, pickup.ctaLabel)) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        } else {
                            if (str != null) {
                                equals = str2.equals(str);
                                if (equals) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.locations.hashCode() * 31;
            String str = this.selected;
            return this.ctaLabel.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.availableTypes);
        }

        public final String toString() {
            String str = this.selected;
            return "Pickup(locations=" + this.locations + ", selected=" + (str == null ? "null" : LocationToken.m1252toStringimpl(str)) + ", availableTypes=" + this.availableTypes + ", ctaLabel=" + this.ctaLabel + ")";
        }
    }
}
