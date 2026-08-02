package com.squareup.cash.cdf.recipient;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactStatus;
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
public final class RecipientSearchSubmitTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final ContactStatus contact_status;
    public final String entity_token;
    public final String external_id;
    public final Integer matched_alias_length;
    public final String matched_fields;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final String remote_suggestion_type;
    public final String search_flow_token;
    public final Integer search_text_length;
    public final SearchType search_type;
    public final String section;
    public final Integer section_index;
    public final SuggestionStrategy suggestion_strategy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SearchType {
        public static final /* synthetic */ SearchType[] $VALUES = {new SearchType("CASH_TAG", 0), new SearchType("FULL_TEXT", 1), new SearchType("SMS", 2), new SearchType("EMAIL", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        SearchType EF5;

        public static SearchType valueOf(String str) {
            return (SearchType) Enum.valueOf(SearchType.class, str);
        }

        public static SearchType[] values() {
            return (SearchType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SuggestionStrategy {
        public static final /* synthetic */ SuggestionStrategy[] $VALUES;
        public static final SuggestionStrategy CONTACTS_OFF_CASH;
        public static final SuggestionStrategy CONTACTS_ON_CASH;
        public static final SuggestionStrategy FAVORITE;
        public static final SuggestionStrategy RECENTS;
        public static final SuggestionStrategy REMOTE;

        static {
            SuggestionStrategy suggestionStrategy = new SuggestionStrategy("RECENTS", 0);
            RECENTS = suggestionStrategy;
            SuggestionStrategy suggestionStrategy2 = new SuggestionStrategy("CONTACTS_ON_CASH", 1);
            CONTACTS_ON_CASH = suggestionStrategy2;
            SuggestionStrategy suggestionStrategy3 = new SuggestionStrategy("CONTACTS_OFF_CASH", 2);
            CONTACTS_OFF_CASH = suggestionStrategy3;
            SuggestionStrategy suggestionStrategy4 = new SuggestionStrategy("REMOTE", 3);
            REMOTE = suggestionStrategy4;
            SuggestionStrategy suggestionStrategy5 = new SuggestionStrategy("NEW_CUSTOMER", 4);
            SuggestionStrategy suggestionStrategy6 = new SuggestionStrategy("FAVORITE", 5);
            FAVORITE = suggestionStrategy6;
            $VALUES = new SuggestionStrategy[]{suggestionStrategy, suggestionStrategy2, suggestionStrategy3, suggestionStrategy4, suggestionStrategy5, suggestionStrategy6, new SuggestionStrategy("LINKED_ACCOUNT", 6)};
        }

        public static SuggestionStrategy valueOf(String str) {
            return (SuggestionStrategy) Enum.valueOf(SuggestionStrategy.class, str);
        }

        public static SuggestionStrategy[] values() {
            return (SuggestionStrategy[]) $VALUES.clone();
        }
    }

    public RecipientSearchSubmitTransaction(Integer num, String str, Integer num2, String str2, String str3, Integer num3, SearchType searchType, String str4, Integer num4, SuggestionStrategy suggestionStrategy, String str5, ContactStatus contactStatus, String str6, String str7) {
        this.absolute_index = num;
        this.external_id = str;
        this.matched_alias_length = num2;
        this.matched_fields = str2;
        this.remote_suggestion_type = str3;
        this.search_text_length = num3;
        this.search_type = searchType;
        this.section = str4;
        this.section_index = num4;
        this.suggestion_strategy = suggestionStrategy;
        this.entity_token = str5;
        this.contact_status = contactStatus;
        this.search_flow_token = str6;
        this.query_token = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 19, "Recipient", "cdf_action", "Search");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "matched_alias_length", num2);
        Countries.putSafe(m, "matched_fields", str2);
        Countries.putSafe(m, "remote_suggestion_type", str3);
        Countries.putSafe(m, "search_text_length", num3);
        Countries.putSafe(m, "search_type", searchType);
        Countries.putSafe(m, "section", str4);
        Countries.putSafe(m, "section_index", num4);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "origin", "AMOUNT_FIRST");
        Countries.putSafe(m, "entity_token", str5);
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "search_flow_token", str6);
        Countries.putSafe(m, "query_token", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchSubmitTransaction)) {
            return false;
        }
        RecipientSearchSubmitTransaction recipientSearchSubmitTransaction = (RecipientSearchSubmitTransaction) obj;
        return Intrinsics.areEqual(this.absolute_index, recipientSearchSubmitTransaction.absolute_index) && this.external_id.equals(recipientSearchSubmitTransaction.external_id) && Intrinsics.areEqual(this.matched_alias_length, recipientSearchSubmitTransaction.matched_alias_length) && Intrinsics.areEqual(this.matched_fields, recipientSearchSubmitTransaction.matched_fields) && Intrinsics.areEqual(this.remote_suggestion_type, recipientSearchSubmitTransaction.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, recipientSearchSubmitTransaction.search_text_length) && this.search_type == recipientSearchSubmitTransaction.search_type && Intrinsics.areEqual(this.section, recipientSearchSubmitTransaction.section) && Intrinsics.areEqual(this.section_index, recipientSearchSubmitTransaction.section_index) && this.suggestion_strategy == recipientSearchSubmitTransaction.suggestion_strategy && Intrinsics.areEqual(this.entity_token, recipientSearchSubmitTransaction.entity_token) && this.contact_status == recipientSearchSubmitTransaction.contact_status && Intrinsics.areEqual(this.search_flow_token, recipientSearchSubmitTransaction.search_flow_token) && Intrinsics.areEqual(this.query_token, recipientSearchSubmitTransaction.query_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search SubmitTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((num == null ? 0 : num.hashCode()) * 31, 31, this.external_id);
        Integer num2 = this.matched_alias_length;
        int hashCode = (m + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.matched_fields;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remote_suggestion_type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.search_text_length;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SearchType searchType = this.search_type;
        int hashCode5 = (hashCode4 + (searchType == null ? 0 : searchType.hashCode())) * 31;
        String str3 = this.section;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.section_index;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 961;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode8 = (((hashCode7 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31) + 42459113) * 31;
        String str4 = this.entity_token;
        int hashCode9 = (this.contact_status.hashCode() + ((hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 961;
        String str5 = this.search_flow_token;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.query_token;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientSearchSubmitTransaction(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", matched_alias_length=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.matched_alias_length, ", matched_fields=", this.matched_fields, ", remote_suggestion_type=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.remote_suggestion_type, ", search_text_length=", this.search_text_length, ", search_type=");
        sb.append(this.search_type);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", section_index=");
        sb.append(this.section_index);
        sb.append(", section_total=null, suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", origin=AMOUNT_FIRST, entity_token=");
        sb.append(this.entity_token);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", referrer_flow_token=null, search_flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.search_flow_token, ", query_token=", this.query_token, ")");
    }
}
