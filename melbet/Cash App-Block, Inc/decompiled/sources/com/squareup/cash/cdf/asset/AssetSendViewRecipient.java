package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AssetSendViewRecipient implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final String chain;
    public final ContactStatus contact_status;
    public final String entity_token;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final RecipientType recipient_type;
    public final String remote_suggestion_type;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final SuggestionStrategy suggestion_strategy;

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

    public AssetSendViewRecipient(Integer num, ContactStatus contactStatus, String str, String str2, Origin origin, String str3, String str4, Integer num2, Integer num3, SuggestionStrategy suggestionStrategy, ExperienceType experienceType, String str5, String str6, int i) {
        RecipientType recipientType = RecipientType.STABLECOIN_ADDRESS;
        Integer num4 = (i & 1) != 0 ? null : num;
        ContactStatus contactStatus2 = (i & 2) != 0 ? null : contactStatus;
        String str7 = (i & 4) != 0 ? null : str;
        String str8 = (i & 32) != 0 ? null : str3;
        String str9 = (i & 64) != 0 ? null : str4;
        Integer num5 = (i & 128) != 0 ? null : num2;
        Integer num6 = (i & 256) != 0 ? null : num3;
        SuggestionStrategy suggestionStrategy2 = (i & 1024) != 0 ? null : suggestionStrategy;
        recipientType = (i & PKIFailureInfo.certRevoked) != 0 ? null : recipientType;
        String str10 = (i & 16384) != 0 ? null : str6;
        this.absolute_index = num4;
        this.contact_status = contactStatus2;
        this.entity_token = str7;
        this.external_id = str2;
        this.origin = origin;
        this.remote_suggestion_type = str8;
        this.section = str9;
        this.section_index = num5;
        this.section_total = num6;
        this.suggestion_strategy = suggestionStrategy2;
        this.experience_type = experienceType;
        this.flow_token = str5;
        this.recipient_type = recipientType;
        this.chain = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 17, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "absolute_index", num4);
        Countries.putSafe(m, "contact_status", contactStatus2);
        Countries.putSafe(m, "entity_token", str7);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "remote_suggestion_type", str8);
        Countries.putSafe(m, "section", str9);
        Countries.putSafe(m, "section_index", num5);
        Countries.putSafe(m, "section_total", num6);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy2);
        Countries.putSafe(m, "experience_type", experienceType);
        Countries.putSafe(m, "flow_token", str5);
        Countries.putSafe(m, "recipient_type", recipientType);
        Countries.putSafe(m, "chain", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendViewRecipient)) {
            return false;
        }
        AssetSendViewRecipient assetSendViewRecipient = (AssetSendViewRecipient) obj;
        return Intrinsics.areEqual(this.absolute_index, assetSendViewRecipient.absolute_index) && this.contact_status == assetSendViewRecipient.contact_status && Intrinsics.areEqual(this.entity_token, assetSendViewRecipient.entity_token) && Intrinsics.areEqual(this.external_id, assetSendViewRecipient.external_id) && this.origin == assetSendViewRecipient.origin && Intrinsics.areEqual(this.remote_suggestion_type, assetSendViewRecipient.remote_suggestion_type) && Intrinsics.areEqual(this.section, assetSendViewRecipient.section) && Intrinsics.areEqual(this.section_index, assetSendViewRecipient.section_index) && Intrinsics.areEqual(this.section_total, assetSendViewRecipient.section_total) && this.suggestion_strategy == assetSendViewRecipient.suggestion_strategy && this.experience_type == assetSendViewRecipient.experience_type && Intrinsics.areEqual(this.flow_token, assetSendViewRecipient.flow_token) && this.recipient_type == assetSendViewRecipient.recipient_type && Intrinsics.areEqual(this.chain, assetSendViewRecipient.chain);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send ViewRecipient";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ContactStatus contactStatus = this.contact_status;
        int hashCode2 = (hashCode + (contactStatus == null ? 0 : contactStatus.hashCode())) * 31;
        String str = this.entity_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.external_id;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode5 = (hashCode4 + (origin == null ? 0 : origin.hashCode())) * 31;
        String str3 = this.remote_suggestion_type;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.section;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.section_index;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.section_total;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 961;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode10 = (this.experience_type.hashCode() + ((hashCode9 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31)) * 31;
        String str5 = this.flow_token;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RecipientType recipientType = this.recipient_type;
        int hashCode12 = (hashCode11 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
        String str6 = this.chain;
        return hashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendViewRecipient(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.entity_token, ", external_id=", this.external_id, ", origin=");
        sb.append(this.origin);
        sb.append(", remote_suggestion_type=");
        sb.append(this.remote_suggestion_type);
        sb.append(", section=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", section_index=", this.section_index, ", section_total=");
        sb.append(this.section_total);
        sb.append(", suggestion_id=null, suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", recipient_type=");
        sb.append(this.recipient_type);
        sb.append(", chain=");
        sb.append(this.chain);
        sb.append(")");
        return sb.toString();
    }
}
