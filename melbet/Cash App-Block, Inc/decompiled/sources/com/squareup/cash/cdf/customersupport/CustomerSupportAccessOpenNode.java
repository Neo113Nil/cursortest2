package com.squareup.cash.cdf.customersupport;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CustomerSupportAccessOpenNode implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_client_scenario;
    public final String action_url;
    public final String flow_token;
    public final String node_token;
    public final LinkedHashMap parameters;
    public final SelectedType selected_type;
    public final Integer selected_type_count;
    public final Integer selected_type_index;
    public final Integer total_count;
    public final Trigger trigger;
    public final String trigger_entity_id;
    public final String trigger_search_text;
    public final String view_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class SelectedType {
        public static final /* synthetic */ SelectedType[] $VALUES;
        public static final SelectedType CALL_TO_ACTION;
        public static final SelectedType ML_SUGGESTED;
        public static final SelectedType NODE_TREE;
        public static final SelectedType RECENTLY_VIEWED;
        public static final SelectedType SEARCH;
        public static final SelectedType SUGGESTED;

        static {
            SelectedType selectedType = new SelectedType("NODE_TREE", 0);
            NODE_TREE = selectedType;
            SelectedType selectedType2 = new SelectedType("SEARCH", 1);
            SEARCH = selectedType2;
            SelectedType selectedType3 = new SelectedType("RECENTLY_VIEWED", 2);
            RECENTLY_VIEWED = selectedType3;
            SelectedType selectedType4 = new SelectedType("SUGGESTED", 3);
            SUGGESTED = selectedType4;
            SelectedType selectedType5 = new SelectedType("ML_SUGGESTED", 4);
            ML_SUGGESTED = selectedType5;
            SelectedType selectedType6 = new SelectedType("CALL_TO_ACTION", 5);
            CALL_TO_ACTION = selectedType6;
            $VALUES = new SelectedType[]{selectedType, selectedType2, selectedType3, selectedType4, selectedType5, selectedType6};
        }

        public static SelectedType valueOf(String str) {
            return (SelectedType) Enum.valueOf(SelectedType.class, str);
        }

        public static SelectedType[] values() {
            return (SelectedType[]) $VALUES.clone();
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

    public CustomerSupportAccessOpenNode(String str, String str2, String str3, String str4, SelectedType selectedType, Integer num, Integer num2, Integer num3, Trigger trigger, String str5, String str6, String str7) {
        this.action_client_scenario = str;
        this.action_url = str2;
        this.flow_token = str3;
        this.node_token = str4;
        this.selected_type = selectedType;
        this.selected_type_count = num;
        this.selected_type_index = num2;
        this.total_count = num3;
        this.trigger = trigger;
        this.trigger_entity_id = str5;
        this.trigger_search_text = str6;
        this.view_token = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 14, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "action_client_scenario", str);
        Countries.putSafe(m, "action_url", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "node_token", str4);
        Countries.putSafe(m, "selected_type", selectedType);
        Countries.putSafe(m, "selected_type_count", num);
        Countries.putSafe(m, "selected_type_index", num2);
        Countries.putSafe(m, "total_count", num3);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "trigger_entity_id", str5);
        Countries.putSafe(m, "trigger_search_text", str6);
        Countries.putSafe(m, "view_token", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessOpenNode)) {
            return false;
        }
        CustomerSupportAccessOpenNode customerSupportAccessOpenNode = (CustomerSupportAccessOpenNode) obj;
        return Intrinsics.areEqual(this.action_client_scenario, customerSupportAccessOpenNode.action_client_scenario) && Intrinsics.areEqual(this.action_url, customerSupportAccessOpenNode.action_url) && Intrinsics.areEqual(this.flow_token, customerSupportAccessOpenNode.flow_token) && Intrinsics.areEqual(this.node_token, customerSupportAccessOpenNode.node_token) && this.selected_type == customerSupportAccessOpenNode.selected_type && Intrinsics.areEqual(this.selected_type_count, customerSupportAccessOpenNode.selected_type_count) && Intrinsics.areEqual(this.selected_type_index, customerSupportAccessOpenNode.selected_type_index) && Intrinsics.areEqual(this.total_count, customerSupportAccessOpenNode.total_count) && this.trigger == customerSupportAccessOpenNode.trigger && Intrinsics.areEqual(this.trigger_entity_id, customerSupportAccessOpenNode.trigger_entity_id) && Intrinsics.areEqual(this.trigger_search_text, customerSupportAccessOpenNode.trigger_search_text) && Intrinsics.areEqual(this.view_token, customerSupportAccessOpenNode.view_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access OpenNode";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.action_client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.node_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SelectedType selectedType = this.selected_type;
        int hashCode5 = (hashCode4 + (selectedType == null ? 0 : selectedType.hashCode())) * 31;
        Integer num = this.selected_type_count;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selected_type_index;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total_count;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Trigger trigger = this.trigger;
        int hashCode9 = (hashCode8 + (trigger == null ? 0 : trigger.hashCode())) * 31;
        String str5 = this.trigger_entity_id;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trigger_search_text;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.view_token;
        return hashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessOpenNode(action_client_scenario=", this.action_client_scenario, ", action_url=", this.action_url, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", node_token=", this.node_token, ", selected_type=");
        m.append(this.selected_type);
        m.append(", selected_type_count=");
        m.append(this.selected_type_count);
        m.append(", selected_type_index=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.selected_type_index, ", total_count=", this.total_count, ", trigger=");
        m.append(this.trigger);
        m.append(", trigger_entity_id=");
        m.append(this.trigger_entity_id);
        m.append(", trigger_search_text=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.trigger_search_text, ", view_token=", this.view_token, ")");
    }

    public /* synthetic */ CustomerSupportAccessOpenNode(String str, String str2, String str3, String str4, SelectedType selectedType, Integer num, Integer num2, Integer num3, Trigger trigger, String str5, String str6, int i) {
        this(str, str2, str3, str4, selectedType, num, num2, num3, trigger, (i & 512) != 0 ? null : str5, (String) null, str6);
    }
}
