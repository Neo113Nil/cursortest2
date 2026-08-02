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
public final class PersonalProfileViewOpenLink implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Destination destination;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Destination {
        public static final /* synthetic */ Destination[] $VALUES;
        public static final Destination INSTAGRAM;
        public static final Destination PRIVACY_POLICY;
        public static final Destination TERMS_OF_SERVICE;
        public static final Destination TWITTER;

        static {
            Destination destination = new Destination("TWITTER", 0);
            TWITTER = destination;
            Destination destination2 = new Destination("INSTAGRAM", 1);
            INSTAGRAM = destination2;
            Destination destination3 = new Destination("TERMS_OF_SERVICE", 2);
            TERMS_OF_SERVICE = destination3;
            Destination destination4 = new Destination("PRIVACY_POLICY", 3);
            PRIVACY_POLICY = destination4;
            $VALUES = new Destination[]{destination, destination2, destination3, destination4};
        }

        public static Destination valueOf(String str) {
            return (Destination) Enum.valueOf(Destination.class, str);
        }

        public static Destination[] values() {
            return (Destination[]) $VALUES.clone();
        }
    }

    public PersonalProfileViewOpenLink(Destination destination) {
        this.destination = destination;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "destination", destination);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileViewOpenLink) && this.destination == ((PersonalProfileViewOpenLink) obj).destination;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View OpenLink";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.destination.hashCode();
    }

    public final String toString() {
        return "PersonalProfileViewOpenLink(destination=" + this.destination + ")";
    }
}
