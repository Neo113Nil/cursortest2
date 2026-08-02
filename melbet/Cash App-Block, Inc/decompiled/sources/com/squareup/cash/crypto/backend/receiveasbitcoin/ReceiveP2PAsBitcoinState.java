package com.squareup.cash.crypto.backend.receiveasbitcoin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface ReceiveP2PAsBitcoinState {

    /* loaded from: classes4.dex */
    public final class Active implements ReceiveP2PAsBitcoinState {
        public final int allocationPercentage;

        public Active(int i) {
            this.allocationPercentage = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Active) && this.allocationPercentage == ((Active) obj).allocationPercentage;
        }

        public final int hashCode() {
            return Integer.hashCode(this.allocationPercentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.allocationPercentage, "Active(allocationPercentage=", ")");
        }
    }

    public final class Inactive implements ReceiveP2PAsBitcoinState {
        public static final Inactive INSTANCE = new Inactive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Inactive);
        }

        public final int hashCode() {
            return -1259688295;
        }

        public final String toString() {
            return "Inactive";
        }
    }

    public final class Paused implements ReceiveP2PAsBitcoinState {
        public static final Paused INSTANCE = new Paused();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Paused);
        }

        public final int hashCode() {
            return -1421238564;
        }

        public final String toString() {
            return "Paused";
        }
    }
}
