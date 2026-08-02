package app.cash.local.viewmodels.fulfillment;

import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.primitives.LocationToken;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface FulfillmentPickerViewEvent {

    public final class DeliveryAddressSelected implements FulfillmentPickerViewEvent {
        public static final DeliveryAddressSelected INSTANCE = new DeliveryAddressSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeliveryAddressSelected);
        }

        public final int hashCode() {
            return 2003292724;
        }

        public final String toString() {
            return "DeliveryAddressSelected";
        }
    }

    public final class Dismissed implements FulfillmentPickerViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -963358078;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class FulfillmentTypeSelected implements FulfillmentPickerViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final LocalFulfillmentType f922type;

        public FulfillmentTypeSelected(LocalFulfillmentType localFulfillmentType) {
            localFulfillmentType.getClass();
            this.f922type = localFulfillmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FulfillmentTypeSelected) && this.f922type == ((FulfillmentTypeSelected) obj).f922type;
        }

        public final int hashCode() {
            return this.f922type.hashCode();
        }

        public final String toString() {
            return "FulfillmentTypeSelected(type=" + this.f922type + ")";
        }
    }

    public final class LocationSelected implements FulfillmentPickerViewEvent {
        public final String locationToken;

        public LocationSelected(String str) {
            this.locationToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationSelected) && this.locationToken.equals(((LocationSelected) obj).locationToken);
        }

        public final int hashCode() {
            return this.locationToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationSelected(locationToken=", LocationToken.m1252toStringimpl(this.locationToken), ")");
        }
    }

    public final class ValidAddressEntered implements FulfillmentPickerViewEvent {
        public final GlobalAddressWrapper address;

        public ValidAddressEntered(GlobalAddressWrapper globalAddressWrapper) {
            this.address = globalAddressWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidAddressEntered) && this.address.equals(((ValidAddressEntered) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return "ValidAddressEntered(address=" + this.address + ")";
        }
    }
}
