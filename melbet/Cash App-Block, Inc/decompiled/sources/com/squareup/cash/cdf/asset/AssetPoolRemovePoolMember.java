package com.squareup.cash.cdf.asset;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class AssetPoolRemovePoolMember implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String pool_token;
    public final Integer query_length;
    public final String section;
    public final Integer section_index;

    public AssetPoolRemovePoolMember(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.pool_token = str2;
        this.query_length = num;
        this.section = str3;
        this.section_index = num2;
        this.entity_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "pool_token", str2);
        Countries.putSafe(m, "query_length", num);
        Countries.putSafe(m, "section", str3);
        Countries.putSafe(m, "section_index", num2);
        Countries.putSafe(m, "entity_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolRemovePoolMember)) {
            return false;
        }
        AssetPoolRemovePoolMember assetPoolRemovePoolMember = (AssetPoolRemovePoolMember) obj;
        return Intrinsics.areEqual(this.flow_token, assetPoolRemovePoolMember.flow_token) && Intrinsics.areEqual(this.pool_token, assetPoolRemovePoolMember.pool_token) && Intrinsics.areEqual(this.query_length, assetPoolRemovePoolMember.query_length) && Intrinsics.areEqual(this.section, assetPoolRemovePoolMember.section) && Intrinsics.areEqual(this.section_index, assetPoolRemovePoolMember.section_index) && Intrinsics.areEqual(this.entity_token, assetPoolRemovePoolMember.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool RemovePoolMember";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pool_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.query_length;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.section;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.section_index;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.entity_token;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetPoolRemovePoolMember(flow_token=", this.flow_token, ", pool_token=", this.pool_token, ", query_length=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.query_length, ", section=", this.section, ", section_index=");
        m.append(this.section_index);
        m.append(", entity_token=");
        m.append(this.entity_token);
        m.append(")");
        return m.toString();
    }
}
