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
public final class PersonalProfileViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PersonalProfileScreen {
        public static final /* synthetic */ PersonalProfileScreen[] $VALUES;
        public static final PersonalProfileScreen YOUR_ACCOUNT;

        /* JADX INFO: Fake field, exist only in values array */
        PersonalProfileScreen EF0;

        static {
            PersonalProfileScreen personalProfileScreen = new PersonalProfileScreen("MY_PROFILE", 0);
            PersonalProfileScreen personalProfileScreen2 = new PersonalProfileScreen("YOUR_ACCOUNT", 1);
            YOUR_ACCOUNT = personalProfileScreen2;
            $VALUES = new PersonalProfileScreen[]{personalProfileScreen, personalProfileScreen2, new PersonalProfileScreen("SETTINGS", 2)};
        }

        public static PersonalProfileScreen valueOf(String str) {
            return (PersonalProfileScreen) Enum.valueOf(PersonalProfileScreen.class, str);
        }

        public static PersonalProfileScreen[] values() {
            return (PersonalProfileScreen[]) $VALUES.clone();
        }
    }

    public PersonalProfileViewOpen() {
        PersonalProfileScreen personalProfileScreen = PersonalProfileScreen.YOUR_ACCOUNT;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "screen", personalProfileScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileViewOpen)) {
            return false;
        }
        PersonalProfileScreen personalProfileScreen = PersonalProfileScreen.YOUR_ACCOUNT;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return PersonalProfileScreen.YOUR_ACCOUNT.hashCode() * 31;
    }

    public final String toString() {
        return "PersonalProfileViewOpen(screen=" + PersonalProfileScreen.YOUR_ACCOUNT + ", is_business_profile=null)";
    }
}
