package app.cash.local.viewmodels.pos;

/* loaded from: classes3.dex */
public interface LocalPosLocalCashRedemptionViewEvent {

    public final class ConfirmClicked implements LocalPosLocalCashRedemptionViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return 190857304;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class UnlinkClicked implements LocalPosLocalCashRedemptionViewEvent {
        public static final UnlinkClicked INSTANCE = new UnlinkClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnlinkClicked);
        }

        public final int hashCode() {
            return 388478307;
        }

        public final String toString() {
            return "UnlinkClicked";
        }
    }
}
