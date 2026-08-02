package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AccountSettingsRow {

    public final class BusinessInfo implements AccountSettingsRow {
        public static final BusinessInfo INSTANCE = new BusinessInfo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BusinessInfo);
        }

        public final int hashCode() {
            return 664278219;
        }

        public final String toString() {
            return "BusinessInfo";
        }
    }

    public final class Documents implements AccountSettingsRow {
        public static final Documents INSTANCE = new Documents();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Documents);
        }

        public final int hashCode() {
            return -1558337637;
        }

        public final String toString() {
            return "Documents";
        }
    }

    public final class Family implements AccountSettingsRow {
        public final boolean shouldBadge;

        public Family(boolean z) {
            this.shouldBadge = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Family) && this.shouldBadge == ((Family) obj).shouldBadge;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldBadge);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Family(shouldBadge=", ")", this.shouldBadge);
        }
    }

    public final class Favorites implements AccountSettingsRow {
        public final List favorites;
        public final int totalCount;

        public Favorites(int i, List list) {
            list.getClass();
            this.totalCount = i;
            this.favorites = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Favorites)) {
                return false;
            }
            Favorites favorites = (Favorites) obj;
            return this.totalCount == favorites.totalCount && Intrinsics.areEqual(this.favorites, favorites.favorites);
        }

        public final int hashCode() {
            return this.favorites.hashCode() + (Integer.hashCode(this.totalCount) * 31);
        }

        public final String toString() {
            return "Favorites(totalCount=" + this.totalCount + ", favorites=" + this.favorites + ")";
        }
    }

    public interface GlobalSetting {
    }

    public final class Limits implements AccountSettingsRow, GlobalSetting {
        public final boolean shouldBadge;

        public Limits(boolean z) {
            this.shouldBadge = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Limits) && this.shouldBadge == ((Limits) obj).shouldBadge;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldBadge);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Limits(shouldBadge=", ")", this.shouldBadge);
        }
    }

    public final class LinkedBanks implements AccountSettingsRow {
        public final boolean shouldBadge;

        public LinkedBanks(boolean z) {
            this.shouldBadge = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkedBanks) && this.shouldBadge == ((LinkedBanks) obj).shouldBadge;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldBadge);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("LinkedBanks(shouldBadge=", ")", this.shouldBadge);
        }
    }

    public final class LinkedBusinesses implements AccountSettingsRow {
        public static final LinkedBusinesses INSTANCE = new LinkedBusinesses();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkedBusinesses);
        }

        public final int hashCode() {
            return 1775126820;
        }

        public final String toString() {
            return "LinkedBusinesses";
        }
    }

    public final class Notifications implements AccountSettingsRow, GlobalSetting {
        public static final Notifications INSTANCE = new Notifications();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Notifications);
        }

        public final int hashCode() {
            return -219430837;
        }

        public final String toString() {
            return "Notifications";
        }
    }

    public final class Passkeys implements AccountSettingsRow, GlobalSetting {
        public static final Passkeys INSTANCE = new Passkeys();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Passkeys);
        }

        public final int hashCode() {
            return 27534402;
        }

        public final String toString() {
            return "Passkeys";
        }
    }

    public final class Personal implements AccountSettingsRow, GlobalSetting {
        public final boolean shouldBadge;
        public final String title;

        public Personal(boolean z, String str) {
            str.getClass();
            this.shouldBadge = z;
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Personal)) {
                return false;
            }
            Personal personal = (Personal) obj;
            return this.shouldBadge == personal.shouldBadge && Intrinsics.areEqual(this.title, personal.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + (Boolean.hashCode(this.shouldBadge) * 31);
        }

        public final String toString() {
            return "Personal(shouldBadge=" + this.shouldBadge + ", title=" + this.title + ")";
        }
    }

    public final class Privacy implements AccountSettingsRow {
        public static final Privacy INSTANCE = new Privacy();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Privacy);
        }

        public final int hashCode() {
            return -1461234389;
        }

        public final String toString() {
            return "Privacy";
        }
    }

    public final class PromotionsReferrals implements AccountSettingsRow {
        public static final PromotionsReferrals INSTANCE = new PromotionsReferrals();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PromotionsReferrals);
        }

        public final int hashCode() {
            return 1553107785;
        }

        public final String toString() {
            return "PromotionsReferrals";
        }
    }

    public final class Security implements AccountSettingsRow {
        public final boolean shouldBadge;

        public Security(boolean z) {
            this.shouldBadge = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Security) && this.shouldBadge == ((Security) obj).shouldBadge;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldBadge);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Security(shouldBadge=", ")", this.shouldBadge);
        }
    }

    public final class Shopping implements AccountSettingsRow {
        public static final Shopping INSTANCE = new Shopping();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Shopping);
        }

        public final int hashCode() {
            return -1533545435;
        }

        public final String toString() {
            return "Shopping";
        }
    }

    public final class Support implements AccountSettingsRow {
        public final boolean shouldBadge;

        public Support(boolean z) {
            this.shouldBadge = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Support) && this.shouldBadge == ((Support) obj).shouldBadge;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldBadge);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Support(shouldBadge=", ")", this.shouldBadge);
        }
    }

    public final class ThemeSwitcher implements AccountSettingsRow {
        public static final ThemeSwitcher INSTANCE = new ThemeSwitcher();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ThemeSwitcher);
        }

        public final int hashCode() {
            return 434369325;
        }

        public final String toString() {
            return "ThemeSwitcher";
        }
    }

    public final class TrustedDevices implements AccountSettingsRow, GlobalSetting {
        public static final TrustedDevices INSTANCE = new TrustedDevices();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrustedDevices);
        }

        public final int hashCode() {
            return -1245496093;
        }

        public final String toString() {
            return "TrustedDevices";
        }
    }
}
