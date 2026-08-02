package com.squareup.cash.deposits.physical.backend.api.retailer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class RetailerLocationResult {

    /* loaded from: classes4.dex */
    public final class Failed extends RetailerLocationResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -2007097623;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Results extends RetailerLocationResult {
        public final List locations;

        public Results(List list) {
            list.getClass();
            this.locations = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Results) && Intrinsics.areEqual(this.locations, ((Results) obj).locations);
        }

        public final int hashCode() {
            return this.locations.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Results(locations=", ")", this.locations);
        }
    }
}
