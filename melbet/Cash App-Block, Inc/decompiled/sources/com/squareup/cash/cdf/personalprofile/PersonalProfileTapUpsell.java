package com.squareup.cash.cdf.personalprofile;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalProfileTapUpsell implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final String f1104type;
    public final String url;

    public PersonalProfileTapUpsell(String str, String str2) {
        this.url = str;
        this.f1104type = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "Tap");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "type", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileTapUpsell)) {
            return false;
        }
        PersonalProfileTapUpsell personalProfileTapUpsell = (PersonalProfileTapUpsell) obj;
        return Intrinsics.areEqual(this.url, personalProfileTapUpsell.url) && Intrinsics.areEqual(this.f1104type, personalProfileTapUpsell.f1104type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile Tap Upsell";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1104type;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PersonalProfileTapUpsell(url=", this.url, ", type=", this.f1104type, ")");
    }
}
