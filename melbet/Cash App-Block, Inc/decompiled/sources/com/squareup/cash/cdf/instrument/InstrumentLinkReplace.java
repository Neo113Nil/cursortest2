package com.squareup.cash.cdf.instrument;

import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentLinkReplace implements Event {
    public static final zzc Companion = new zzc(22);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final InstrumentType f1093type;

    public InstrumentLinkReplace(String str, InstrumentType instrumentType) {
        this.token = str;
        this.f1093type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "token", str);
        Countries.putSafe(m, "type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkReplace)) {
            return false;
        }
        InstrumentLinkReplace instrumentLinkReplace = (InstrumentLinkReplace) obj;
        return Intrinsics.areEqual(this.token, instrumentLinkReplace.token) && this.f1093type == instrumentLinkReplace.f1093type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Replace";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.token;
        return (this.f1093type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "InstrumentLinkReplace(token=" + this.token + ", type=" + this.f1093type + ", entry_point=null)";
    }
}
