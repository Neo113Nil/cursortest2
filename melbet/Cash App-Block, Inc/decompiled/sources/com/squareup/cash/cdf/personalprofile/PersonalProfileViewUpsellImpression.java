package com.squareup.cash.cdf.personalprofile;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalProfileViewUpsellImpression implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final String f1105type;

    public PersonalProfileViewUpsellImpression(String str) {
        this.f1105type = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PersonalProfile", "cdf_action", "View");
        Countries.putSafe(m, "type", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileViewUpsellImpression) && Intrinsics.areEqual(this.f1105type, ((PersonalProfileViewUpsellImpression) obj).f1105type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile View UpsellImpression";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.f1105type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PersonalProfileViewUpsellImpression(type=", this.f1105type, ")");
    }
}
