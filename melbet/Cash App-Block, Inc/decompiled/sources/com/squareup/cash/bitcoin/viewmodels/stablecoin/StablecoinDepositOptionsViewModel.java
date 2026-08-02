package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface StablecoinDepositOptionsViewModel {

    public final class Error implements StablecoinDepositOptionsViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 186027789;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements StablecoinDepositOptionsViewModel {
        public final ArrayList networks;

        public Loaded(ArrayList arrayList) {
            this.networks = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.networks.equals(((Loaded) obj).networks);
        }

        public final int hashCode() {
            return this.networks.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Loaded(networks=", ")", this.networks);
        }
    }

    public final class Loading implements StablecoinDepositOptionsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 199717121;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NetworkRow {
        public final StackedAvatarViewModel.Avatar avatar;
        public final StablecoinNetwork network;

        public NetworkRow(StablecoinNetwork stablecoinNetwork, StackedAvatarViewModel.Avatar avatar) {
            stablecoinNetwork.getClass();
            this.network = stablecoinNetwork;
            this.avatar = avatar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkRow)) {
                return false;
            }
            NetworkRow networkRow = (NetworkRow) obj;
            return Intrinsics.areEqual(this.network, networkRow.network) && this.avatar.equals(networkRow.avatar);
        }

        public final int hashCode() {
            return this.avatar.hashCode() + (this.network.hashCode() * 31);
        }

        public final String toString() {
            return "NetworkRow(network=" + this.network + ", avatar=" + this.avatar + ")";
        }
    }
}
