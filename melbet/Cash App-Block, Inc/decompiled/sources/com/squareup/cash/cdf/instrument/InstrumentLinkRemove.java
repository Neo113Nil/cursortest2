package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class InstrumentLinkRemove implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final InstrumentType f1092type;

    public InstrumentLinkRemove(String str, InstrumentType instrumentType) {
        this.token = str;
        this.f1092type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "token", str);
        Countries.putSafe(m, "type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkRemove)) {
            return false;
        }
        InstrumentLinkRemove instrumentLinkRemove = (InstrumentLinkRemove) obj;
        return this.token.equals(instrumentLinkRemove.token) && this.f1092type == instrumentLinkRemove.f1092type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Remove";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1092type.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "InstrumentLinkRemove(token=" + this.token + ", type=" + this.f1092type + ")";
    }
}
