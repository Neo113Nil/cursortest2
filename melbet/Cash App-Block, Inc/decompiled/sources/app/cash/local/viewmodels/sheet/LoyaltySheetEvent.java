package app.cash.local.viewmodels.sheet;

import app.cash.local.primitives.RewardToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LoyaltySheetEvent {

    public final class Redeem implements LoyaltySheetEvent {
        public static final Redeem INSTANCE = new Redeem();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Redeem);
        }

        public final int hashCode() {
            return 455477094;
        }

        public final String toString() {
            return "Redeem";
        }
    }

    public final class SelectTier implements LoyaltySheetEvent {
        public final String token;

        public SelectTier(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTier) && this.token.equals(((SelectTier) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectTier(token=", RewardToken.m1283toStringimpl(this.token), ")");
        }
    }

    public final class SheetDismissed implements LoyaltySheetEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return -324434476;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }
}
