package com.squareup.cash.cdf.personalprofile;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PersonalProfileViewOpenScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final PersonalProfileSubScreen screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntryPoint {
        public static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint APP_MESSAGE;
        public static final EntryPoint PROFILE;

        static {
            EntryPoint entryPoint = new EntryPoint("APP_MESSAGE", 0);
            APP_MESSAGE = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("PROFILE", 1);
            PROFILE = entryPoint2;
            $VALUES = new EntryPoint[]{entryPoint, entryPoint2};
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PersonalProfileSubScreen {
        public static final /* synthetic */ PersonalProfileSubScreen[] $VALUES;
        public static final PersonalProfileSubScreen BUSINESS_INFO;
        public static final PersonalProfileSubScreen DOCUMENTS;
        public static final PersonalProfileSubScreen FAMILY_ACCOUNTS;
        public static final PersonalProfileSubScreen FAVORITES;
        public static final PersonalProfileSubScreen INFO;
        public static final PersonalProfileSubScreen INVITE_FRIENDS;
        public static final PersonalProfileSubScreen LIMITS;
        public static final PersonalProfileSubScreen LINKED_BANKS;
        public static final PersonalProfileSubScreen LINKED_BUSINESSES;
        public static final PersonalProfileSubScreen NOTIFICATIONS;
        public static final PersonalProfileSubScreen OPEN_SOURCE;
        public static final PersonalProfileSubScreen PASSKEYS;
        public static final PersonalProfileSubScreen PRIVACY;
        public static final PersonalProfileSubScreen PROFILE_PHOTO;
        public static final PersonalProfileSubScreen PROFILE_UPSELL;
        public static final PersonalProfileSubScreen PROMOTIONS_HOME;
        public static final PersonalProfileSubScreen QR_CODE;
        public static final PersonalProfileSubScreen REFERRAL_REWARDS_STATUS;
        public static final PersonalProfileSubScreen SECURITY;
        public static final PersonalProfileSubScreen SHOPPING;
        public static final PersonalProfileSubScreen SIGN_OUT;
        public static final PersonalProfileSubScreen SUPPORT;
        public static final PersonalProfileSubScreen THEMES;
        public static final PersonalProfileSubScreen TRUSTED_DEVICES;
        public static final PersonalProfileSubScreen VERIFY_IDENTITY;

        static {
            PersonalProfileSubScreen personalProfileSubScreen = new PersonalProfileSubScreen("BUSINESS_INFO", 0);
            BUSINESS_INFO = personalProfileSubScreen;
            PersonalProfileSubScreen personalProfileSubScreen2 = new PersonalProfileSubScreen("DATA_SHARING", 1);
            PersonalProfileSubScreen personalProfileSubScreen3 = new PersonalProfileSubScreen("DOCUMENTS", 2);
            DOCUMENTS = personalProfileSubScreen3;
            PersonalProfileSubScreen personalProfileSubScreen4 = new PersonalProfileSubScreen("FAMILY_ACCOUNTS", 3);
            FAMILY_ACCOUNTS = personalProfileSubScreen4;
            PersonalProfileSubScreen personalProfileSubScreen5 = new PersonalProfileSubScreen("FAVORITES", 4);
            FAVORITES = personalProfileSubScreen5;
            PersonalProfileSubScreen personalProfileSubScreen6 = new PersonalProfileSubScreen("INFO", 5);
            INFO = personalProfileSubScreen6;
            PersonalProfileSubScreen personalProfileSubScreen7 = new PersonalProfileSubScreen("INVITE_FRIENDS", 6);
            INVITE_FRIENDS = personalProfileSubScreen7;
            PersonalProfileSubScreen personalProfileSubScreen8 = new PersonalProfileSubScreen("LINKED_BANKS", 7);
            LINKED_BANKS = personalProfileSubScreen8;
            PersonalProfileSubScreen personalProfileSubScreen9 = new PersonalProfileSubScreen("LINKED_BUSINESSES", 8);
            LINKED_BUSINESSES = personalProfileSubScreen9;
            PersonalProfileSubScreen personalProfileSubScreen10 = new PersonalProfileSubScreen("LIMITS", 9);
            LIMITS = personalProfileSubScreen10;
            PersonalProfileSubScreen personalProfileSubScreen11 = new PersonalProfileSubScreen("NOTIFICATIONS", 10);
            NOTIFICATIONS = personalProfileSubScreen11;
            PersonalProfileSubScreen personalProfileSubScreen12 = new PersonalProfileSubScreen("OPEN_SOURCE", 11);
            OPEN_SOURCE = personalProfileSubScreen12;
            PersonalProfileSubScreen personalProfileSubScreen13 = new PersonalProfileSubScreen("PRIVACY", 12);
            PRIVACY = personalProfileSubScreen13;
            PersonalProfileSubScreen personalProfileSubScreen14 = new PersonalProfileSubScreen("PRIVACY_AND_SECURITY", 13);
            PersonalProfileSubScreen personalProfileSubScreen15 = new PersonalProfileSubScreen("PROFILE_PHOTO", 14);
            PROFILE_PHOTO = personalProfileSubScreen15;
            PersonalProfileSubScreen personalProfileSubScreen16 = new PersonalProfileSubScreen("PROFILE_UPSELL", 15);
            PROFILE_UPSELL = personalProfileSubScreen16;
            PersonalProfileSubScreen personalProfileSubScreen17 = new PersonalProfileSubScreen("PROMOTIONS_HOME", 16);
            PROMOTIONS_HOME = personalProfileSubScreen17;
            PersonalProfileSubScreen personalProfileSubScreen18 = new PersonalProfileSubScreen("QR_CODE", 17);
            QR_CODE = personalProfileSubScreen18;
            PersonalProfileSubScreen personalProfileSubScreen19 = new PersonalProfileSubScreen("REFERRAL_REWARDS_STATUS", 18);
            REFERRAL_REWARDS_STATUS = personalProfileSubScreen19;
            PersonalProfileSubScreen personalProfileSubScreen20 = new PersonalProfileSubScreen("SECURITY", 19);
            SECURITY = personalProfileSubScreen20;
            PersonalProfileSubScreen personalProfileSubScreen21 = new PersonalProfileSubScreen("SHOPPING", 20);
            SHOPPING = personalProfileSubScreen21;
            PersonalProfileSubScreen personalProfileSubScreen22 = new PersonalProfileSubScreen("SIGN_OUT", 21);
            SIGN_OUT = personalProfileSubScreen22;
            PersonalProfileSubScreen personalProfileSubScreen23 = new PersonalProfileSubScreen("SUPPORT", 22);
            SUPPORT = personalProfileSubScreen23;
            PersonalProfileSubScreen personalProfileSubScreen24 = new PersonalProfileSubScreen("THEMES", 23);
            THEMES = personalProfileSubScreen24;
            PersonalProfileSubScreen personalProfileSubScreen25 = new PersonalProfileSubScreen("TRUSTED_DEVICES", 24);
            TRUSTED_DEVICES = personalProfileSubScreen25;
            PersonalProfileSubScreen personalProfileSubScreen26 = new PersonalProfileSubScreen("VERIFY_IDENTITY", 25);
            VERIFY_IDENTITY = personalProfileSubScreen26;
            PersonalProfileSubScreen personalProfileSubScreen27 = new PersonalProfileSubScreen("PASSKEYS", 26);
            PASSKEYS = personalProfileSubScreen27;
            $VALUES = new PersonalProfileSubScreen[]{personalProfileSubScreen, personalProfileSubScreen2, personalProfileSubScreen3, personalProfileSubScreen4, personalProfileSubScreen5, personalProfileSubScreen6, personalProfileSubScreen7, personalProfileSubScreen8, personalProfileSubScreen9, personalProfileSubScreen10, personalProfileSubScreen11, personalProfileSubScreen12, personalProfileSubScreen13, personalProfileSubScreen14, personalProfileSubScreen15, personalProfileSubScreen16, personalProfileSubScreen17, personalProfileSubScreen18, personalProfileSubScreen19, personalProfileSubScreen20, personalProfileSubScreen21, personalProfileSubScreen22, personalProfileSubScreen23, personalProfileSubScreen24, personalProfileSubScreen25, personalProfileSubScreen26, personalProfileSubScreen27};
        }

        public static PersonalProfileSubScreen valueOf(String str) {
            return (PersonalProfileSubScreen) Enum.valueOf(PersonalProfileSubScreen.class, str);
        }

        public static PersonalProfileSubScreen[] values() {
            return (PersonalProfileSubScreen[]) $VALUES.clone();
        }
    }

    public PersonalProfileViewOpenScreen(PersonalProfileSubScreen personalProfileSubScreen, EntryPoint entryPoint) {
        this.screen = personalProfileSubScreen;
        this.entry_point = entryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "screen", personalProfileSubScreen);
        Countries.putSafe(m, "entry_point", entryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileViewOpenScreen)) {
            return false;
        }
        PersonalProfileViewOpenScreen personalProfileViewOpenScreen = (PersonalProfileViewOpenScreen) obj;
        return this.screen == personalProfileViewOpenScreen.screen && this.entry_point == personalProfileViewOpenScreen.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View OpenScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        PersonalProfileSubScreen personalProfileSubScreen = this.screen;
        int hashCode = (personalProfileSubScreen == null ? 0 : personalProfileSubScreen.hashCode()) * 31;
        EntryPoint entryPoint = this.entry_point;
        return hashCode + (entryPoint != null ? entryPoint.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalProfileViewOpenScreen(screen=" + this.screen + ", entry_point=" + this.entry_point + ")";
    }
}
