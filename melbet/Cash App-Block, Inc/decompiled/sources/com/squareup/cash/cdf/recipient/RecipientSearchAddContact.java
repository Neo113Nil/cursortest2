package com.squareup.cash.cdf.recipient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RecipientSearchAddContact implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
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
    public final String origin;
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
        public static final /* synthetic */ SearchType[] $VALUES;
        public static final SearchType CASH_TAG;
        public static final SearchType EMAIL;
        public static final SearchType FULL_TEXT;
        public static final SearchType SMS;

        static {
            SearchType searchType = new SearchType("CASH_TAG", 0);
            CASH_TAG = searchType;
            SearchType searchType2 = new SearchType("FULL_TEXT", 1);
            FULL_TEXT = searchType2;
            SearchType searchType3 = new SearchType("SMS", 2);
            SMS = searchType3;
            SearchType searchType4 = new SearchType("EMAIL", 3);
            EMAIL = searchType4;
            $VALUES = new SearchType[]{searchType, searchType2, searchType3, searchType4};
        }

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

    public RecipientSearchAddContact(Integer num, String str, Integer num2, String str2, String str3, Integer num3, SearchType searchType, String str4, Integer num4, Integer num5, SuggestionStrategy suggestionStrategy, String str5, String str6, ContactStatus contactStatus, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, String str9, Boolean bool4, ExperienceType experienceType, int i) {
        Boolean bool5 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : bool;
        Boolean bool6 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : bool2;
        Boolean bool7 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool3;
        String str10 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str9;
        Boolean bool8 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : bool4;
        ExperienceType experienceType2 = (i & 8388608) != 0 ? null : experienceType;
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
        this.origin = str5;
        this.entity_token = str6;
        this.contact_status = contactStatus;
        this.search_flow_token = str7;
        this.query_token = str8;
        Boolean bool9 = bool5;
        this.is_c4b_account = bool9;
        Boolean bool10 = bool6;
        this.is_first_linked_account = bool10;
        Boolean bool11 = bool7;
        this.is_multiple_account_holder = bool11;
        String str11 = str10;
        this.account_holder_token = str11;
        Boolean bool12 = bool8;
        this.is_linked_account = bool12;
        ExperienceType experienceType3 = experienceType2;
        this.experience_type = experienceType3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 26, "Recipient", "cdf_action", "Search");
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
        Countries.putSafe(m, "origin", str5);
        Countries.putSafe(m, "entity_token", str6);
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "search_flow_token", str7);
        Countries.putSafe(m, "query_token", str8);
        Countries.putSafe(m, "is_c4b_account", bool9);
        Countries.putSafe(m, "is_first_linked_account", bool10);
        Countries.putSafe(m, "is_multiple_account_holder", bool11);
        Countries.putSafe(m, "account_holder_token", str11);
        Countries.putSafe(m, "is_linked_account", bool12);
        Countries.putSafe(m, "experience_type", experienceType3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSearchAddContact)) {
            return false;
        }
        RecipientSearchAddContact recipientSearchAddContact = (RecipientSearchAddContact) obj;
        return Intrinsics.areEqual(this.absolute_index, recipientSearchAddContact.absolute_index) && Intrinsics.areEqual(this.external_id, recipientSearchAddContact.external_id) && Intrinsics.areEqual(this.matched_alias_length, recipientSearchAddContact.matched_alias_length) && Intrinsics.areEqual(this.matched_fields, recipientSearchAddContact.matched_fields) && Intrinsics.areEqual(this.remote_suggestion_type, recipientSearchAddContact.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, recipientSearchAddContact.search_text_length) && this.search_type == recipientSearchAddContact.search_type && Intrinsics.areEqual(this.section, recipientSearchAddContact.section) && Intrinsics.areEqual(this.section_index, recipientSearchAddContact.section_index) && Intrinsics.areEqual(this.section_total, recipientSearchAddContact.section_total) && this.suggestion_strategy == recipientSearchAddContact.suggestion_strategy && this.origin.equals(recipientSearchAddContact.origin) && Intrinsics.areEqual(this.entity_token, recipientSearchAddContact.entity_token) && this.contact_status == recipientSearchAddContact.contact_status && Intrinsics.areEqual(this.search_flow_token, recipientSearchAddContact.search_flow_token) && Intrinsics.areEqual(this.query_token, recipientSearchAddContact.query_token) && Intrinsics.areEqual(this.is_c4b_account, recipientSearchAddContact.is_c4b_account) && Intrinsics.areEqual(this.is_first_linked_account, recipientSearchAddContact.is_first_linked_account) && Intrinsics.areEqual(this.is_multiple_account_holder, recipientSearchAddContact.is_multiple_account_holder) && Intrinsics.areEqual(this.account_holder_token, recipientSearchAddContact.account_holder_token) && Intrinsics.areEqual(this.is_linked_account, recipientSearchAddContact.is_linked_account) && this.experience_type == recipientSearchAddContact.experience_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Recipient Search AddContact";
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
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode10 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31, 31, this.origin);
        String str5 = this.entity_token;
        int hashCode11 = (m + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactStatus contactStatus = this.contact_status;
        int hashCode12 = (hashCode11 + (contactStatus == null ? 0 : contactStatus.hashCode())) * 961;
        String str6 = this.search_flow_token;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.query_token;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
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
        StringBuilder sb = new StringBuilder("RecipientSearchAddContact(absolute_index=");
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
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", entity_token=");
        sb.append(this.entity_token);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", referrer_flow_token=null, search_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.search_flow_token, ", query_token=", this.query_token, ", is_c4b_account=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_c4b_account, ", is_first_linked_account=", this.is_first_linked_account, ", is_multiple_account_holder=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_multiple_account_holder, ", account_holder_token=", this.account_holder_token, ", is_linked_account=");
        sb.append(this.is_linked_account);
        sb.append(", search_origin=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(")");
        return sb.toString();
    }
}
