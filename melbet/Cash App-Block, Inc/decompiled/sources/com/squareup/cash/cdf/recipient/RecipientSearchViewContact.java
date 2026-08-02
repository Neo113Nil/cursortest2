package com.squareup.cash.cdf.recipient;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecipientSearchViewContact implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final Integer absolute_index;
    public final String account_holder_token;
    public final ContactStatus contact_status;
    public final String entity_token;
    public final ExperienceType experience_type;
    public final String external_id;
    public final Boolean is_c4b_account;
    public final Boolean is_first_linked_account;
    public final Boolean is_linked_account;
    public final Boolean is_multiple_account_holder;
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
    public final Integer section_total;
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
        public static final SuggestionStrategy LINKED_ACCOUNT;
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
            SuggestionStrategy suggestionStrategy7 = new SuggestionStrategy("LINKED_ACCOUNT", 6);
            LINKED_ACCOUNT = suggestionStrategy7;
            $VALUES = new SuggestionStrategy[]{suggestionStrategy, suggestionStrategy2, suggestionStrategy3, suggestionStrategy4, suggestionStrategy5, suggestionStrategy6, suggestionStrategy7};
        }

        public static SuggestionStrategy valueOf(String str) {
            return (SuggestionStrategy) Enum.valueOf(SuggestionStrategy.class, str);
        }

        public static SuggestionStrategy[] values() {
            return (SuggestionStrategy[]) $VALUES.clone();
        }
    }

    public RecipientSearchViewContact(Integer num, String str, Integer num2, String str2, String str3, Integer num3, SearchType searchType, String str4, Integer num4, Integer num5, SuggestionStrategy suggestionStrategy, String str5, ContactStatus contactStatus, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, Boolean bool4, ExperienceType experienceType) {
        this.absolute_index = num;
        this.external_id = str;
        this.matched_alias_length = num2;
        this.matched_fields = str2;
        this.remote_suggestion_type = str3;
        this.search_text_length = num3;
        this.search_type = searchType;
        this.section = str4;
        this.section_index = num4;
        this.section_total = num5;
        this.suggestion_strategy = suggestionStrategy;
        this.entity_token = str5;
        this.contact_status = contactStatus;
        this.search_flow_token = str6;
        this.query_token = str7;
        this.is_c4b_account = bool;
        this.is_first_linked_account = bool2;
        this.is_multiple_account_holder = bool3;
        this.account_holder_token = str8;
        this.is_linked_account = bool4;
        this.experience_type = experienceType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 27, "Recipient", "cdf_action", "Search");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "matched_alias_length", num2);
        Countries.putSafe(m, "matched_fields", str2);
        Countries.putSafe(m, "remote_suggestion_type", str3);
        Countries.putSafe(m, "search_text_length", num3);
        Countries.putSafe(m, "search_type", searchType);
        Countries.putSafe(m, "section", str4);
        Countries.putSafe(m, "section_index", num4);
        Countries.putSafe(m, "section_total", num5);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "origin", "AMOUNT_FIRST");
        Countries.putSafe(m, "entity_token", str5);
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "search_flow_token", str6);
        Countries.putSafe(m, "query_token", str7);
        Countries.putSafe(m, "is_c4b_account", bool);
        Countries.putSafe(m, "is_first_linked_account", bool2);
        Countries.putSafe(m, "is_multiple_account_holder", bool3);
        Countries.putSafe(m, "account_holder_token", str8);
        Countries.putSafe(m, "is_linked_account", bool4);
        Countries.putSafe(m, "experience_type", experienceType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchViewContact)) {
            return false;
        }
        RecipientSearchViewContact recipientSearchViewContact = (RecipientSearchViewContact) obj;
        return Intrinsics.areEqual(this.absolute_index, recipientSearchViewContact.absolute_index) && Intrinsics.areEqual(this.external_id, recipientSearchViewContact.external_id) && Intrinsics.areEqual(this.matched_alias_length, recipientSearchViewContact.matched_alias_length) && Intrinsics.areEqual(this.matched_fields, recipientSearchViewContact.matched_fields) && Intrinsics.areEqual(this.remote_suggestion_type, recipientSearchViewContact.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, recipientSearchViewContact.search_text_length) && this.search_type == recipientSearchViewContact.search_type && Intrinsics.areEqual(this.section, recipientSearchViewContact.section) && Intrinsics.areEqual(this.section_index, recipientSearchViewContact.section_index) && Intrinsics.areEqual(this.section_total, recipientSearchViewContact.section_total) && this.suggestion_strategy == recipientSearchViewContact.suggestion_strategy && Intrinsics.areEqual(this.entity_token, recipientSearchViewContact.entity_token) && this.contact_status == recipientSearchViewContact.contact_status && Intrinsics.areEqual(this.search_flow_token, recipientSearchViewContact.search_flow_token) && Intrinsics.areEqual(this.query_token, recipientSearchViewContact.query_token) && Intrinsics.areEqual(this.is_c4b_account, recipientSearchViewContact.is_c4b_account) && Intrinsics.areEqual(this.is_first_linked_account, recipientSearchViewContact.is_first_linked_account) && Intrinsics.areEqual(this.is_multiple_account_holder, recipientSearchViewContact.is_multiple_account_holder) && Intrinsics.areEqual(this.account_holder_token, recipientSearchViewContact.account_holder_token) && Intrinsics.areEqual(this.is_linked_account, recipientSearchViewContact.is_linked_account) && this.experience_type == recipientSearchViewContact.experience_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search ViewContact";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.matched_alias_length;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.matched_fields;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remote_suggestion_type;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.search_text_length;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SearchType searchType = this.search_type;
        int hashCode7 = (hashCode6 + (searchType == null ? 0 : searchType.hashCode())) * 31;
        String str4 = this.section;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.section_index;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.section_total;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode11 = (((hashCode10 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31) + 42459113) * 31;
        String str5 = this.entity_token;
        int hashCode12 = (this.contact_status.hashCode() + ((hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 961;
        String str6 = this.search_flow_token;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.query_token;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 961;
        Boolean bool = this.is_c4b_account;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is_first_linked_account;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.is_multiple_account_holder;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.account_holder_token;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool4 = this.is_linked_account;
        int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 961;
        ExperienceType experienceType = this.experience_type;
        return hashCode19 + (experienceType != null ? experienceType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientSearchViewContact(absolute_index=");
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
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", origin=AMOUNT_FIRST, entity_token=");
        sb.append(this.entity_token);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", referrer_flow_token=null, search_flow_token=");
        sb.append(this.search_flow_token);
        sb.append(", query_token=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.query_token, ", is_business_profile=null, is_c4b_account=", this.is_c4b_account, ", is_first_linked_account=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_first_linked_account, ", is_multiple_account_holder=", this.is_multiple_account_holder, ", account_holder_token=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.account_holder_token, ", is_linked_account=", this.is_linked_account, ", search_origin=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(")");
        return sb.toString();
    }
}
