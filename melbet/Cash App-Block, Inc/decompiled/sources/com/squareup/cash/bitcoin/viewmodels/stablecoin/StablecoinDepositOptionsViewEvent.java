package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import com.squareup.cash.crypto.address.StablecoinNetwork;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface StablecoinDepositOptionsViewEvent {

    public final class CloseClicked implements StablecoinDepositOptionsViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -545223015;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class NetworkSelected implements StablecoinDepositOptionsViewEvent {
        public final StablecoinNetwork network;

        public NetworkSelected(StablecoinNetwork stablecoinNetwork) {
            stablecoinNetwork.getClass();
            this.network = stablecoinNetwork;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkSelected) && Intrinsics.areEqual(this.network, ((NetworkSelected) obj).network);
        }

        public final int hashCode() {
            return this.network.hashCode();
        }

        public final String toString() {
            return "NetworkSelected(network=" + this.network + ")";
        }
    }
}
