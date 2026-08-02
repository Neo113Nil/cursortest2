package com.squareup.cash.crypto.backend.roundups;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface BitcoinRoundUpsAvailability {

    /* loaded from: classes5.dex */
    public interface Available extends BitcoinRoundUpsAvailability {

        /* loaded from: classes6.dex */
        public final class Bitcoin implements Available {
            public final boolean active;

            public Bitcoin(boolean z) {
                this.active = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Bitcoin) && this.active == ((Bitcoin) obj).active;
            }

            @Override // com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability.Available
            public final boolean getActive() {
                return this.active;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.active);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Bitcoin(active=", ")", this.active);
            }
        }

        /* loaded from: classes6.dex */
        public final class Other implements Available {
            public final boolean active;

            public Other(boolean z) {
                this.active = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Other) && this.active == ((Other) obj).active;
            }

            @Override // com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability.Available
            public final boolean getActive() {
                return this.active;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.active);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Other(active=", ")", this.active);
            }
        }

        boolean getActive();
    }

    public final class Unavailable implements BitcoinRoundUpsAvailability {
        public static final Unavailable INSTANCE = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return -206359786;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
