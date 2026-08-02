package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.protos.common.location.GlobalAddress;

/* loaded from: classes4.dex */
public abstract class SetAddressViewEvent {

    public final class Exit extends SetAddressViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1646913531;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class GoBack extends SetAddressViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -2088168682;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HelpClick extends SetAddressViewEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 932855872;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class Submit extends SetAddressViewEvent {
        public final GlobalAddress address;
        public final SignalsContext signalsContext;
        public final boolean validated;

        public Submit(GlobalAddress globalAddress, boolean z, SignalsContext signalsContext) {
            globalAddress.getClass();
            this.address = globalAddress;
            this.validated = z;
            this.signalsContext = signalsContext;
        }
    }
}
