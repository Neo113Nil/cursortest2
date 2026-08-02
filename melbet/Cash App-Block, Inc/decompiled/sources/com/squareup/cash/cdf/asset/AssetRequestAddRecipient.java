package com.squareup.cash.cdf.asset;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AssetRequestAddRecipient implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final Bucket bucket;
    public final ContactStatus contact_status;
    public final String entity_token;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final GenerationStrategy generation_strategy;
    public final LinkedHashMap parameters;
    public final Integer query_length;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final SuggestionStrategy suggestion_strategy;
    public final Integer total;
    public final Boolean use_cash_customer_search;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Bucket {
        public static final /* synthetic */ Bucket[] $VALUES;
        public static final Bucket CONTACTS;
        public static final Bucket SEARCH;
        public static final Bucket SUGGESTED;

        static {
            Bucket bucket = new Bucket("CONTACTS", 0);
            CONTACTS = bucket;
            Bucket bucket2 = new Bucket("SUGGESTED", 1);
            SUGGESTED = bucket2;
            Bucket bucket3 = new Bucket("SEARCH", 2);
            SEARCH = bucket3;
            $VALUES = new Bucket[]{bucket, bucket2, bucket3};
        }

        public static Bucket valueOf(String str) {
            return (Bucket) Enum.valueOf(Bucket.class, str);
        }

        public static Bucket[] values() {
            return (Bucket[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class GenerationStrategy {
        public static final /* synthetic */ GenerationStrategy[] $VALUES;
        public static final GenerationStrategy BITCOIN_WALLET_ADDRESS;
        public static final GenerationStrategy CONTACT;
        public static final GenerationStrategy FAVORITE;
        public static final GenerationStrategy NEW_CUSTOMER;
        public static final GenerationStrategy RECENT;
        public static final GenerationStrategy REMOTE_EXACT_MATCH;
        public static final GenerationStrategy REMOTE_MATCHES;
        public static final GenerationStrategy REMOTE_SUGGESTION;

        static {
            GenerationStrategy generationStrategy = new GenerationStrategy("RECENT", 0);
            RECENT = generationStrategy;
            GenerationStrategy generationStrategy2 = new GenerationStrategy("REMOTE_SUGGESTION", 1);
            REMOTE_SUGGESTION = generationStrategy2;
            GenerationStrategy generationStrategy3 = new GenerationStrategy("CONTACT", 2);
            CONTACT = generationStrategy3;
            GenerationStrategy generationStrategy4 = new GenerationStrategy("REMOTE_EXACT_MATCH", 3);
            REMOTE_EXACT_MATCH = generationStrategy4;
            GenerationStrategy generationStrategy5 = new GenerationStrategy("NEW_CUSTOMER", 4);
            NEW_CUSTOMER = generationStrategy5;
            GenerationStrategy generationStrategy6 = new GenerationStrategy("REMOTE_MATCHES", 5);
            REMOTE_MATCHES = generationStrategy6;
            GenerationStrategy generationStrategy7 = new GenerationStrategy("BITCOIN_WALLET_ADDRESS", 6);
            BITCOIN_WALLET_ADDRESS = generationStrategy7;
            GenerationStrategy generationStrategy8 = new GenerationStrategy("FAVORITE", 7);
            FAVORITE = generationStrategy8;
            $VALUES = new GenerationStrategy[]{generationStrategy, generationStrategy2, generationStrategy3, generationStrategy4, generationStrategy5, generationStrategy6, generationStrategy7, generationStrategy8};
        }

        public static GenerationStrategy valueOf(String str) {
            return (GenerationStrategy) Enum.valueOf(GenerationStrategy.class, str);
        }

        public static GenerationStrategy[] values() {
            return (GenerationStrategy[]) $VALUES.clone();
        }
    }

    public AssetRequestAddRecipient(Integer num, Bucket bucket, ContactStatus contactStatus, String str, String str2, SuggestionStrategy suggestionStrategy, GenerationStrategy generationStrategy, Integer num2, String str3, Integer num3, Integer num4, Integer num5, Boolean bool, ExperienceType experienceType, String str4) {
        Origin origin = Origin.AMOUNT_FIRST;
        this.absolute_index = num;
        this.bucket = bucket;
        this.contact_status = contactStatus;
        this.entity_token = str;
        this.external_id = str2;
        this.suggestion_strategy = suggestionStrategy;
        this.generation_strategy = generationStrategy;
        this.query_length = num2;
        this.section = str3;
        this.section_index = num3;
        this.section_total = num4;
        this.total = num5;
        this.use_cash_customer_search = bool;
        this.experience_type = experienceType;
        this.flow_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 21, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "bucket", bucket);
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "entity_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "generation_strategy", generationStrategy);
        Countries.putSafe(m, "query_length", num2);
        Countries.putSafe(m, "section", str3);
        Countries.putSafe(m, "section_index", num3);
        Countries.putSafe(m, "section_total", num4);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "total", num5);
        Countries.putSafe(m, "use_cash_customer_search", bool);
        Countries.putSafe(m, "experience_type", experienceType);
        Countries.putSafe(m, "flow_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestAddRecipient)) {
            return false;
        }
        AssetRequestAddRecipient assetRequestAddRecipient = (AssetRequestAddRecipient) obj;
        if (!Intrinsics.areEqual(this.absolute_index, assetRequestAddRecipient.absolute_index) || this.bucket != assetRequestAddRecipient.bucket || this.contact_status != assetRequestAddRecipient.contact_status || !Intrinsics.areEqual(this.entity_token, assetRequestAddRecipient.entity_token) || !Intrinsics.areEqual(this.external_id, assetRequestAddRecipient.external_id) || this.suggestion_strategy != assetRequestAddRecipient.suggestion_strategy || this.generation_strategy != assetRequestAddRecipient.generation_strategy || !Intrinsics.areEqual(this.query_length, assetRequestAddRecipient.query_length) || !Intrinsics.areEqual(this.section, assetRequestAddRecipient.section) || !Intrinsics.areEqual(this.section_index, assetRequestAddRecipient.section_index) || !Intrinsics.areEqual(this.section_total, assetRequestAddRecipient.section_total)) {
            return false;
        }
        Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
        return Intrinsics.areEqual(this.total, assetRequestAddRecipient.total) && this.use_cash_customer_search.equals(assetRequestAddRecipient.use_cash_customer_search) && this.experience_type == assetRequestAddRecipient.experience_type && Intrinsics.areEqual(this.flow_token, assetRequestAddRecipient.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request AddRecipient";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Bucket bucket = this.bucket;
        int hashCode2 = (this.contact_status.hashCode() + ((hashCode + (bucket == null ? 0 : bucket.hashCode())) * 31)) * 31;
        String str = this.entity_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.external_id;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode5 = (hashCode4 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
        GenerationStrategy generationStrategy = this.generation_strategy;
        int hashCode6 = (hashCode5 + (generationStrategy == null ? 0 : generationStrategy.hashCode())) * 31;
        Integer num2 = this.query_length;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.section;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.section_index;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.section_total;
        int hashCode10 = (Origin.AMOUNT_FIRST.hashCode() + ((hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31)) * 29791;
        Integer num5 = this.total;
        int hashCode11 = (this.experience_type.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.use_cash_customer_search, (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31, 961)) * 31;
        String str4 = this.flow_token;
        return hashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Origin origin = Origin.AMOUNT_FIRST;
        StringBuilder sb = new StringBuilder("AssetRequestAddRecipient(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", bucket=");
        sb.append(this.bucket);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", entity_token=");
        sb.append(this.entity_token);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", generation_strategy=");
        sb.append(this.generation_strategy);
        sb.append(", query_length=");
        sb.append(this.query_length);
        sb.append(", section=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", section_index=", this.section_index, ", section_total=");
        sb.append(this.section_total);
        sb.append(", origin=");
        sb.append(origin);
        sb.append(", remote_suggestion_type=null, suggestion_id=null, total=");
        sb.append(this.total);
        sb.append(", use_cash_customer_search=");
        sb.append(this.use_cash_customer_search);
        sb.append(", referrer_flow_token=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(")");
        return sb.toString();
    }
}
