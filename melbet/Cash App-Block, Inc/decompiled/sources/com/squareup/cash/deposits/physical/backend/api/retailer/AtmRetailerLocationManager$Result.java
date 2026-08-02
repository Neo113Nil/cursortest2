package com.squareup.cash.deposits.physical.backend.api.retailer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AtmRetailerLocationManager$Result {

    /* loaded from: classes8.dex */
    public final class Failure extends AtmRetailerLocationManager$Result {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1159123929;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success extends AtmRetailerLocationManager$Result {
        public final List locations;

        public Success(List list) {
            list.getClass();
            this.locations = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.locations, ((Success) obj).locations);
        }

        public final int hashCode() {
            return this.locations.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(locations=", ")", this.locations);
        }
    }
}
