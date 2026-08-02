package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuToken;
import app.cash.local.primitives.MessageToken;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalBrandProfileViewEvent {

    public final class BackClicked implements LocalBrandProfileViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1523376312;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CheckedInSheetDismissed implements LocalBrandProfileViewEvent {
        public static final CheckedInSheetDismissed INSTANCE = new CheckedInSheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckedInSheetDismissed);
        }

        public final int hashCode() {
            return 1566912094;
        }

        public final String toString() {
            return "CheckedInSheetDismissed";
        }
    }

    public final class HoursDropdownOptionClicked implements LocalBrandProfileViewEvent {
        public final LocalFulfillmentType fulfillmentType;

        public HoursDropdownOptionClicked(LocalFulfillmentType localFulfillmentType) {
            this.fulfillmentType = localFulfillmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HoursDropdownOptionClicked) && this.fulfillmentType == ((HoursDropdownOptionClicked) obj).fulfillmentType;
        }

        public final int hashCode() {
            return this.fulfillmentType.hashCode();
        }

        public final String toString() {
            return "HoursDropdownOptionClicked(fulfillmentType=" + this.fulfillmentType + ")";
        }
    }

    public final class InvalidCouponToastDismissed implements LocalBrandProfileViewEvent {
        public static final InvalidCouponToastDismissed INSTANCE = new InvalidCouponToastDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidCouponToastDismissed);
        }

        public final int hashCode() {
            return 367830695;
        }

        public final String toString() {
            return "InvalidCouponToastDismissed";
        }
    }

    public final class LocationAddressClicked implements LocalBrandProfileViewEvent {
        public static final LocationAddressClicked INSTANCE = new LocationAddressClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationAddressClicked);
        }

        public final int hashCode() {
            return 603171232;
        }

        public final String toString() {
            return "LocationAddressClicked";
        }
    }

    public final class MarketingMessageClicked implements LocalBrandProfileViewEvent {
        public final String messageToken;

        public MarketingMessageClicked(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketingMessageClicked) && Intrinsics.areEqual(this.messageToken, ((MarketingMessageClicked) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MarketingMessageClicked(messageToken=", MessageToken.m1273toStringimpl(this.messageToken), ")");
        }
    }

    public final class MenuCategoryClicked implements LocalBrandProfileViewEvent {
        public final String menu;
        public final String token;

        public MenuCategoryClicked(String str, String str2) {
            this.menu = str;
            this.token = str2;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            boolean areEqual2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuCategoryClicked)) {
                return false;
            }
            MenuCategoryClicked menuCategoryClicked = (MenuCategoryClicked) obj;
            String str = menuCategoryClicked.menu;
            String str2 = this.menu;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            if (!areEqual) {
                return false;
            }
            String str3 = menuCategoryClicked.token;
            String str4 = this.token;
            if (str4 == null) {
                if (str3 == null) {
                    areEqual2 = true;
                }
                areEqual2 = false;
            } else {
                if (str3 != null) {
                    areEqual2 = Intrinsics.areEqual(str4, str3);
                }
                areEqual2 = false;
            }
            return areEqual2;
        }

        public final int hashCode() {
            String str = this.menu;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.token;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.menu;
            String m1269toStringimpl = str == null ? "null" : MenuToken.m1269toStringimpl(str);
            String str2 = this.token;
            return Boxes$$ExternalSyntheticOutline1.m("MenuCategoryClicked(menu=", m1269toStringimpl, ", token=", str2 != null ? MenuCategoryToken.m1259toStringimpl(str2) : "null", ")");
        }
    }

    public final class MenuItemClicked implements LocalBrandProfileViewEvent {
        public final int index;
        public final String token;

        public MenuItemClicked(String str, int i) {
            str.getClass();
            this.token = str;
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuItemClicked)) {
                return false;
            }
            MenuItemClicked menuItemClicked = (MenuItemClicked) obj;
            return Intrinsics.areEqual(this.token, menuItemClicked.token) && this.index == menuItemClicked.index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index) + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m("MenuItemClicked(token=", this.index, MenuItemToken.m1264toStringimpl(this.token), ", index=", ")");
        }
    }

    public final class MenuSelectorClicked implements LocalBrandProfileViewEvent {
        public static final MenuSelectorClicked INSTANCE = new MenuSelectorClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MenuSelectorClicked);
        }

        public final int hashCode() {
            return 451983857;
        }

        public final String toString() {
            return "MenuSelectorClicked";
        }
    }

    public final class OfferToastDismissed implements LocalBrandProfileViewEvent {
        public static final OfferToastDismissed INSTANCE = new OfferToastDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferToastDismissed);
        }

        public final int hashCode() {
            return 399365574;
        }

        public final String toString() {
            return "OfferToastDismissed";
        }
    }

    public final class ShowAllMessagesClicked implements LocalBrandProfileViewEvent {
        public static final ShowAllMessagesClicked INSTANCE = new ShowAllMessagesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowAllMessagesClicked);
        }

        public final int hashCode() {
            return -1434312657;
        }

        public final String toString() {
            return "ShowAllMessagesClicked";
        }
    }

    public final class StartOrderingClicked implements LocalBrandProfileViewEvent {
        public static final StartOrderingClicked INSTANCE = new StartOrderingClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartOrderingClicked);
        }

        public final int hashCode() {
            return -1959577111;
        }

        public final String toString() {
            return "StartOrderingClicked";
        }
    }
}
