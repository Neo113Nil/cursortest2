package com.squareup.cash.shopping.backend.api;

import com.squareup.protos.cash.grantly.api.ShippingAddress;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShippingAddressRepository$ShippingAddressResult {

    public final class Failure implements ShippingAddressRepository$ShippingAddressResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -1061033217;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements ShippingAddressRepository$ShippingAddressResult {
        public final ShippingAddress shippingAddress;

        public Success(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.shippingAddress, ((Success) obj).shippingAddress);
        }

        public final int hashCode() {
            ShippingAddress shippingAddress = this.shippingAddress;
            if (shippingAddress == null) {
                return 0;
            }
            return shippingAddress.hashCode();
        }

        public final String toString() {
            return "Success(shippingAddress=" + this.shippingAddress + ")";
        }
    }
}
