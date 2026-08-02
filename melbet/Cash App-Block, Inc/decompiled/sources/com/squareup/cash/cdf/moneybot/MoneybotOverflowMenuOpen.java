package com.squareup.cash.cdf.moneybot;

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
public final class MoneybotOverflowMenuOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final String goose_session_id;
    public final String home_session_id;
    public final LinkedHashMap parameters;
    public final MoneybotSurface surface;

    public MoneybotOverflowMenuOpen(MoneybotSurface moneybotSurface, String str, String str2, String str3) {
        this.surface = moneybotSurface;
        this.client_chat_id = str;
        this.goose_session_id = str2;
        this.home_session_id = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Moneybot", "cdf_action", "OverflowMenu");
        Countries.putSafe(m, "surface", moneybotSurface);
        Countries.putSafe(m, "client_chat_id", str);
        Countries.putSafe(m, "goose_session_id", str2);
        Countries.putSafe(m, "home_session_id", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotOverflowMenuOpen)) {
            return false;
        }
        MoneybotOverflowMenuOpen moneybotOverflowMenuOpen = (MoneybotOverflowMenuOpen) obj;
        return this.surface == moneybotOverflowMenuOpen.surface && Intrinsics.areEqual(this.client_chat_id, moneybotOverflowMenuOpen.client_chat_id) && Intrinsics.areEqual(this.goose_session_id, moneybotOverflowMenuOpen.goose_session_id) && Intrinsics.areEqual(this.home_session_id, moneybotOverflowMenuOpen.home_session_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot OverflowMenu Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.surface.hashCode() * 31;
        String str = this.client_chat_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.goose_session_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.home_session_id;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotOverflowMenuOpen(surface=");
        sb.append(this.surface);
        sb.append(", client_chat_id=");
        sb.append(this.client_chat_id);
        sb.append(", goose_session_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.goose_session_id, ", home_session_id=", this.home_session_id, ")");
    }
}
