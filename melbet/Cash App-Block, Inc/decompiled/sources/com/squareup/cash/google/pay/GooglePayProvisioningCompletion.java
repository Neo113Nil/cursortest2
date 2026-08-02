package com.squareup.cash.google.pay;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GooglePayProvisioningCompletion {

    public final class Failure implements GooglePayProvisioningCompletion {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -74187509;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements GooglePayProvisioningCompletion {
        public final BlockersData blockersData;

        public Success(BlockersData blockersData) {
            blockersData.getClass();
            this.blockersData = blockersData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.blockersData, ((Success) obj).blockersData);
        }

        public final int hashCode() {
            return this.blockersData.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "Success(blockersData=", ")");
        }
    }
}
