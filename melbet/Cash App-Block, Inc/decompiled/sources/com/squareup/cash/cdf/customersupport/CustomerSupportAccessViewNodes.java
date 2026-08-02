package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportAccessViewNodes implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String display_types;
    public final String entitiy_id;
    public final String flow_token;
    public final LoadTransactionStatus load_transaction_status;
    public final String node_tokens;
    public final LinkedHashMap parameters;
    public final String parent_token;
    public final SearchStatus search_status;
    public final String search_text;
    public final Integer total_count;
    public final Trigger trigger;
    public final String view_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class LoadTransactionStatus {
        public static final /* synthetic */ LoadTransactionStatus[] $VALUES;
        public static final LoadTransactionStatus FAILURE;
        public static final LoadTransactionStatus NOT_APPLICABLE;
        public static final LoadTransactionStatus SUCCESS;

        static {
            LoadTransactionStatus loadTransactionStatus = new LoadTransactionStatus("NOT_APPLICABLE", 0);
            NOT_APPLICABLE = loadTransactionStatus;
            LoadTransactionStatus loadTransactionStatus2 = new LoadTransactionStatus("SUCCESS", 1);
            SUCCESS = loadTransactionStatus2;
            LoadTransactionStatus loadTransactionStatus3 = new LoadTransactionStatus("FAILURE", 2);
            FAILURE = loadTransactionStatus3;
            $VALUES = new LoadTransactionStatus[]{loadTransactionStatus, loadTransactionStatus2, loadTransactionStatus3};
        }

        public static LoadTransactionStatus valueOf(String str) {
            return (LoadTransactionStatus) Enum.valueOf(LoadTransactionStatus.class, str);
        }

        public static LoadTransactionStatus[] values() {
            return (LoadTransactionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class SearchStatus {
        public static final /* synthetic */ SearchStatus[] $VALUES;
        public static final SearchStatus FAILURE;
        public static final SearchStatus SUCCESS;

        static {
            SearchStatus searchStatus = new SearchStatus("SUCCESS", 0);
            SUCCESS = searchStatus;
            SearchStatus searchStatus2 = new SearchStatus("FAILURE", 1);
            FAILURE = searchStatus2;
            $VALUES = new SearchStatus[]{searchStatus, searchStatus2};
        }

        public static SearchStatus valueOf(String str) {
            return (SearchStatus) Enum.valueOf(SearchStatus.class, str);
        }

        public static SearchStatus[] values() {
            return (SearchStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME;
        public static final Trigger NODE;
        public static final Trigger SEARCH;

        static {
            Trigger trigger = new Trigger("NODE", 0);
            NODE = trigger;
            Trigger trigger2 = new Trigger("HOME", 1);
            HOME = trigger2;
            Trigger trigger3 = new Trigger("SEARCH", 2);
            SEARCH = trigger3;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessViewNodes(String str, String str2, String str3, String str4, SearchStatus searchStatus, String str5, Integer num, Trigger trigger, String str6, String str7, LoadTransactionStatus loadTransactionStatus, int i) {
        String str8 = (i & 8) != 0 ? null : str4;
        SearchStatus searchStatus2 = (i & 16) != 0 ? null : searchStatus;
        String str9 = (i & 32) != 0 ? null : str5;
        String str10 = (i & 1024) != 0 ? null : str7;
        LoadTransactionStatus loadTransactionStatus2 = (i & 2048) == 0 ? loadTransactionStatus : null;
        this.display_types = str;
        this.flow_token = str2;
        this.node_tokens = str3;
        this.parent_token = str8;
        this.search_status = searchStatus2;
        this.search_text = str9;
        this.total_count = num;
        this.trigger = trigger;
        this.view_token = str6;
        this.entitiy_id = str10;
        this.load_transaction_status = loadTransactionStatus2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "display_types", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "node_tokens", str3);
        Countries.putSafe(m, "parent_token", str8);
        Countries.putSafe(m, "search_status", searchStatus2);
        Countries.putSafe(m, "search_text", str9);
        Countries.putSafe(m, "total_count", num);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "view_token", str6);
        Countries.putSafe(m, "entitiy_id", str10);
        Countries.putSafe(m, "load_transaction_status", loadTransactionStatus2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewNodes)) {
            return false;
        }
        CustomerSupportAccessViewNodes customerSupportAccessViewNodes = (CustomerSupportAccessViewNodes) obj;
        return Intrinsics.areEqual(this.display_types, customerSupportAccessViewNodes.display_types) && Intrinsics.areEqual(this.flow_token, customerSupportAccessViewNodes.flow_token) && Intrinsics.areEqual(this.node_tokens, customerSupportAccessViewNodes.node_tokens) && Intrinsics.areEqual(this.parent_token, customerSupportAccessViewNodes.parent_token) && this.search_status == customerSupportAccessViewNodes.search_status && Intrinsics.areEqual(this.search_text, customerSupportAccessViewNodes.search_text) && Intrinsics.areEqual(this.total_count, customerSupportAccessViewNodes.total_count) && this.trigger == customerSupportAccessViewNodes.trigger && Intrinsics.areEqual(this.view_token, customerSupportAccessViewNodes.view_token) && Intrinsics.areEqual(this.entitiy_id, customerSupportAccessViewNodes.entitiy_id) && this.load_transaction_status == customerSupportAccessViewNodes.load_transaction_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewNodes";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.display_types;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.node_tokens;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parent_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SearchStatus searchStatus = this.search_status;
        int hashCode5 = (hashCode4 + (searchStatus == null ? 0 : searchStatus.hashCode())) * 31;
        String str5 = this.search_text;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.total_count;
        int hashCode7 = (this.trigger.hashCode() + ((hashCode6 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str6 = this.view_token;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 961;
        String str7 = this.entitiy_id;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        LoadTransactionStatus loadTransactionStatus = this.load_transaction_status;
        return (hashCode9 + (loadTransactionStatus != null ? loadTransactionStatus.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessViewNodes(display_types=", this.display_types, ", flow_token=", this.flow_token, ", node_tokens=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.node_tokens, ", parent_token=", this.parent_token, ", search_status=");
        m.append(this.search_status);
        m.append(", search_text=");
        m.append(this.search_text);
        m.append(", total_count=");
        m.append(this.total_count);
        m.append(", trigger=");
        m.append(this.trigger);
        m.append(", view_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.view_token, ", channel_availability=null, entitiy_id=", this.entitiy_id, ", load_transaction_status=");
        m.append(this.load_transaction_status);
        m.append(", can_navigate_to_receipt=null)");
        return m.toString();
    }
}
