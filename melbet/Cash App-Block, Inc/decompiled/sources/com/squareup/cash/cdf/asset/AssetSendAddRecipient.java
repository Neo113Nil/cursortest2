package com.squareup.cash.cdf.asset;

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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AssetSendAddRecipient implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final Bucket bucket;
    public final String chain;
    public final ContactStatus contact_status;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final GenerationStrategy generation_strategy;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final Integer query_length;
    public final RecipientType recipient_type;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class RecipientType {
        public static final /* synthetic */ RecipientType[] $VALUES;
        public static final RecipientType STABLECOIN_ADDRESS;

        /* JADX INFO: Fake field, exist only in values array */
        RecipientType EF0;

        static {
            RecipientType recipientType = new RecipientType("CUSTOMER", 0);
            RecipientType recipientType2 = new RecipientType("STABLECOIN_ADDRESS", 1);
            STABLECOIN_ADDRESS = recipientType2;
            $VALUES = new RecipientType[]{recipientType, recipientType2};
        }

        public static RecipientType valueOf(String str) {
            return (RecipientType) Enum.valueOf(RecipientType.class, str);
        }

        public static RecipientType[] values() {
            return (RecipientType[]) $VALUES.clone();
        }
    }

    public AssetSendAddRecipient(Integer num, Bucket bucket, ContactStatus contactStatus, String str, SuggestionStrategy suggestionStrategy, GenerationStrategy generationStrategy, Integer num2, String str2, Integer num3, Integer num4, Origin origin, Integer num5, Boolean bool, ExperienceType experienceType, String str3, String str4, int i) {
        RecipientType recipientType = RecipientType.STABLECOIN_ADDRESS;
        Integer num6 = (i & 1) != 0 ? null : num;
        Bucket bucket2 = (i & 2) != 0 ? null : bucket;
        ContactStatus contactStatus2 = (i & 4) != 0 ? null : contactStatus;
        SuggestionStrategy suggestionStrategy2 = (i & 32) != 0 ? null : suggestionStrategy;
        GenerationStrategy generationStrategy2 = (i & 64) != 0 ? null : generationStrategy;
        Integer num7 = (i & 128) != 0 ? null : num2;
        String str5 = (i & 256) != 0 ? null : str2;
        Integer num8 = (i & 512) != 0 ? null : num3;
        Integer num9 = (i & 1024) != 0 ? null : num4;
        Integer num10 = (i & 16384) != 0 ? null : num5;
        Boolean bool2 = (i & 32768) != 0 ? null : bool;
        RecipientType recipientType2 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : recipientType;
        String str6 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str4;
        this.absolute_index = num6;
        this.bucket = bucket2;
        this.contact_status = contactStatus2;
        this.external_id = str;
        this.suggestion_strategy = suggestionStrategy2;
        this.generation_strategy = generationStrategy2;
        this.query_length = num7;
        this.section = str5;
        this.section_index = num8;
        this.section_total = num9;
        this.origin = origin;
        this.total = num10;
        this.use_cash_customer_search = bool2;
        this.experience_type = experienceType;
        this.flow_token = str3;
        RecipientType recipientType3 = recipientType2;
        this.recipient_type = recipientType3;
        String str7 = str6;
        this.chain = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 23, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "absolute_index", num6);
        Countries.putSafe(m, "bucket", bucket2);
        Countries.putSafe(m, "contact_status", contactStatus2);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy2);
        Countries.putSafe(m, "generation_strategy", generationStrategy2);
        Countries.putSafe(m, "query_length", num7);
        Countries.putSafe(m, "section", str5);
        Countries.putSafe(m, "section_index", num8);
        Countries.putSafe(m, "section_total", num9);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "total", num10);
        Countries.putSafe(m, "use_cash_customer_search", bool2);
        Countries.putSafe(m, "experience_type", experienceType);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "recipient_type", recipientType3);
        Countries.putSafe(m, "chain", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendAddRecipient)) {
            return false;
        }
        AssetSendAddRecipient assetSendAddRecipient = (AssetSendAddRecipient) obj;
        return Intrinsics.areEqual(this.absolute_index, assetSendAddRecipient.absolute_index) && this.bucket == assetSendAddRecipient.bucket && this.contact_status == assetSendAddRecipient.contact_status && Intrinsics.areEqual(this.external_id, assetSendAddRecipient.external_id) && this.suggestion_strategy == assetSendAddRecipient.suggestion_strategy && this.generation_strategy == assetSendAddRecipient.generation_strategy && Intrinsics.areEqual(this.query_length, assetSendAddRecipient.query_length) && Intrinsics.areEqual(this.section, assetSendAddRecipient.section) && Intrinsics.areEqual(this.section_index, assetSendAddRecipient.section_index) && Intrinsics.areEqual(this.section_total, assetSendAddRecipient.section_total) && this.origin == assetSendAddRecipient.origin && Intrinsics.areEqual(this.total, assetSendAddRecipient.total) && Intrinsics.areEqual(this.use_cash_customer_search, assetSendAddRecipient.use_cash_customer_search) && this.experience_type == assetSendAddRecipient.experience_type && Intrinsics.areEqual(this.flow_token, assetSendAddRecipient.flow_token) && this.recipient_type == assetSendAddRecipient.recipient_type && Intrinsics.areEqual(this.chain, assetSendAddRecipient.chain);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send AddRecipient";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Bucket bucket = this.bucket;
        int hashCode2 = (hashCode + (bucket == null ? 0 : bucket.hashCode())) * 31;
        ContactStatus contactStatus = this.contact_status;
        int hashCode3 = (hashCode2 + (contactStatus == null ? 0 : contactStatus.hashCode())) * 961;
        String str = this.external_id;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode5 = (hashCode4 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
        GenerationStrategy generationStrategy = this.generation_strategy;
        int hashCode6 = (hashCode5 + (generationStrategy == null ? 0 : generationStrategy.hashCode())) * 31;
        Integer num2 = this.query_length;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.section;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.section_index;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.section_total;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode11 = (hashCode10 + (origin == null ? 0 : origin.hashCode())) * 29791;
        Integer num5 = this.total;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.use_cash_customer_search;
        int hashCode13 = (this.experience_type.hashCode() + ((hashCode12 + (bool == null ? 0 : bool.hashCode())) * 961)) * 31;
        String str3 = this.flow_token;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RecipientType recipientType = this.recipient_type;
        int hashCode15 = (hashCode14 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
        String str4 = this.chain;
        return hashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendAddRecipient(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", bucket=");
        sb.append(this.bucket);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", entity_token=null, external_id=");
        sb.append(this.external_id);
        sb.append(", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", generation_strategy=");
        sb.append(this.generation_strategy);
        sb.append(", query_length=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.query_length, ", section=", this.section, ", section_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", origin=");
        sb.append(this.origin);
        sb.append(", remote_suggestion_type=null, suggestion_id=null, total=");
        sb.append(this.total);
        sb.append(", use_cash_customer_search=");
        sb.append(this.use_cash_customer_search);
        sb.append(", referrer_flow_token=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", recipient_type=");
        sb.append(this.recipient_type);
        sb.append(", chain=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.chain, ")");
    }
}
