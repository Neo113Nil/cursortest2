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
public final class PersonalProfileViewShare implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final PersonalProfileShareOrigin origin;
    public final LinkedHashMap parameters;
    public final PersonalProfileShareSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PersonalProfileShareOrigin {
        public static final /* synthetic */ PersonalProfileShareOrigin[] $VALUES;
        public static final PersonalProfileShareOrigin BUTTON;
        public static final PersonalProfileShareOrigin TOP_BAR;

        static {
            PersonalProfileShareOrigin personalProfileShareOrigin = new PersonalProfileShareOrigin("TOP_BAR", 0);
            TOP_BAR = personalProfileShareOrigin;
            PersonalProfileShareOrigin personalProfileShareOrigin2 = new PersonalProfileShareOrigin("BUTTON", 1);
            BUTTON = personalProfileShareOrigin2;
            $VALUES = new PersonalProfileShareOrigin[]{personalProfileShareOrigin, personalProfileShareOrigin2};
        }

        public static PersonalProfileShareOrigin valueOf(String str) {
            return (PersonalProfileShareOrigin) Enum.valueOf(PersonalProfileShareOrigin.class, str);
        }

        public static PersonalProfileShareOrigin[] values() {
            return (PersonalProfileShareOrigin[]) $VALUES.clone();
        }
    }

    public PersonalProfileViewShare(PersonalProfileShareOrigin personalProfileShareOrigin, PersonalProfileShareSource personalProfileShareSource) {
        this.origin = personalProfileShareOrigin;
        this.source = personalProfileShareSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "origin", personalProfileShareOrigin);
        Countries.putSafe(m, "source", personalProfileShareSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileViewShare)) {
            return false;
        }
        PersonalProfileViewShare personalProfileViewShare = (PersonalProfileViewShare) obj;
        return this.origin == personalProfileViewShare.origin && this.source == personalProfileViewShare.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View Share";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return (this.source.hashCode() + (this.origin.hashCode() * 31)) * 961;
    }

    public final String toString() {
        return "PersonalProfileViewShare(is_business_profile=null, origin=" + this.origin + ", source=" + this.source + ", trigger=null, experience=null)";
    }
}
