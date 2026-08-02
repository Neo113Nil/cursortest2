package com.squareup.cash.cdf.moneybot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class MoneybotTemplateCardResolved implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String goose_session_id;
    public final LinkedHashMap parameters;
    public final String source;
    public final String target;
    public final String tool_name;
    public final String tool_request_id;

    public MoneybotTemplateCardResolved(String str, String str2, String str3, String str4, String str5) {
        this.goose_session_id = str;
        this.tool_request_id = str2;
        this.tool_name = str3;
        this.source = str4;
        this.target = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Moneybot", "cdf_action", "TemplateCard");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "tool_request_id", str2);
        Countries.putSafe(m, "tool_name", str3);
        Countries.putSafe(m, "source", str4);
        Countries.putSafe(m, "target", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotTemplateCardResolved)) {
            return false;
        }
        MoneybotTemplateCardResolved moneybotTemplateCardResolved = (MoneybotTemplateCardResolved) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotTemplateCardResolved.goose_session_id) && Intrinsics.areEqual(this.tool_request_id, moneybotTemplateCardResolved.tool_request_id) && Intrinsics.areEqual(this.tool_name, moneybotTemplateCardResolved.tool_name) && Intrinsics.areEqual(this.source, moneybotTemplateCardResolved.source) && Intrinsics.areEqual(this.target, moneybotTemplateCardResolved.target);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot TemplateCard Resolved";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tool_request_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tool_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.target;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotTemplateCardResolved(goose_session_id=", this.goose_session_id, ", tool_request_id=", this.tool_request_id, ", tool_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.tool_name, ", source=", this.source, ", target=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.target, ")");
    }
}
