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
public final class PersonalProfileEditOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final PersonalProfileEditScreen screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class PersonalProfileEditScreen {
        public static final /* synthetic */ PersonalProfileEditScreen[] $VALUES;
        public static final PersonalProfileEditScreen EDIT;
        public static final PersonalProfileEditScreen PREVIEW;

        static {
            PersonalProfileEditScreen personalProfileEditScreen = new PersonalProfileEditScreen("EDIT", 0);
            EDIT = personalProfileEditScreen;
            PersonalProfileEditScreen personalProfileEditScreen2 = new PersonalProfileEditScreen("PREVIEW", 1);
            PREVIEW = personalProfileEditScreen2;
            $VALUES = new PersonalProfileEditScreen[]{personalProfileEditScreen, personalProfileEditScreen2};
        }

        public static PersonalProfileEditScreen valueOf(String str) {
            return (PersonalProfileEditScreen) Enum.valueOf(PersonalProfileEditScreen.class, str);
        }

        public static PersonalProfileEditScreen[] values() {
            return (PersonalProfileEditScreen[]) $VALUES.clone();
        }
    }

    public PersonalProfileEditOpen(PersonalProfileEditScreen personalProfileEditScreen) {
        this.screen = personalProfileEditScreen;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "Edit");
        Countries.putSafe(m, "screen", personalProfileEditScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileEditOpen) && this.screen == ((PersonalProfileEditOpen) obj).screen;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile Edit Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.screen.hashCode() * 31;
    }

    public final String toString() {
        return "PersonalProfileEditOpen(screen=" + this.screen + ", is_business_profile=null)";
    }
}
