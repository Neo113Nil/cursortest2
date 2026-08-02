package com.squareup.cash.cdf.instrument;

import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class InstrumentLinkInitiate implements Event {
    public static final zzb Companion = new zzb(22);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.BULLETIN, EventDestination.AMPLITUDE});
    public final InstrumentType current_linked;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final InstrumentType f1091type;

    public InstrumentLinkInitiate(InstrumentType instrumentType, InstrumentType instrumentType2, int i) {
        instrumentType2 = (i & 2) != 0 ? null : instrumentType2;
        this.current_linked = instrumentType;
        this.f1091type = instrumentType2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "current_linked", instrumentType);
        Countries.putSafe(m, "type", instrumentType2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkInitiate)) {
            return false;
        }
        InstrumentLinkInitiate instrumentLinkInitiate = (InstrumentLinkInitiate) obj;
        return this.current_linked == instrumentLinkInitiate.current_linked && this.f1091type == instrumentLinkInitiate.f1091type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Initiate";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InstrumentType instrumentType = this.current_linked;
        int hashCode = (instrumentType == null ? 0 : instrumentType.hashCode()) * 31;
        InstrumentType instrumentType2 = this.f1091type;
        return (hashCode + (instrumentType2 != null ? instrumentType2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "InstrumentLinkInitiate(current_linked=" + this.current_linked + ", type=" + this.f1091type + ", entry_point=null)";
    }
}
