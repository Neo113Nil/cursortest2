package com.squareup.cash.cdf.moneybot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.common.internal.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MoneybotMessageClientReceive implements Event {
    public static final zza Companion = new zza(26);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String goose_session_id;
    public final String message_id;
    public final LinkedHashMap parameters;

    public MoneybotMessageClientReceive(String str, String str2) {
        this.goose_session_id = str;
        this.message_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Moneybot", "cdf_action", "Message");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "message_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotMessageClientReceive)) {
            return false;
        }
        MoneybotMessageClientReceive moneybotMessageClientReceive = (MoneybotMessageClientReceive) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotMessageClientReceive.goose_session_id) && Intrinsics.areEqual(this.message_id, moneybotMessageClientReceive.message_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Message ClientReceive";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message_id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MoneybotMessageClientReceive(goose_session_id=", this.goose_session_id, ", message_id=", this.message_id, ")");
    }
}
