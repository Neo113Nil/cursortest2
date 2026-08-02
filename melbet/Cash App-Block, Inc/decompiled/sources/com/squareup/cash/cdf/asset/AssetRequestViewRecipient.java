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

/* loaded from: classes6.dex */
public final class AssetRequestViewRecipient implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final ContactStatus contact_status;
    public final String entity_token;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String remote_suggestion_type;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final SuggestionStrategy suggestion_strategy;

    public AssetRequestViewRecipient(Integer num, ContactStatus contactStatus, String str, String str2, String str3, String str4, Integer num2, Integer num3, SuggestionStrategy suggestionStrategy, ExperienceType experienceType, String str5) {
        Origin origin = Origin.AMOUNT_FIRST;
        this.absolute_index = num;
        this.contact_status = contactStatus;
        this.entity_token = str;
        this.external_id = str2;
        this.remote_suggestion_type = str3;
        this.section = str4;
        this.section_index = num2;
        this.section_total = num3;
        this.suggestion_strategy = suggestionStrategy;
        this.experience_type = experienceType;
        this.flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "contact_status", contactStatus);
        Countries.putSafe(m, "entity_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "remote_suggestion_type", str3);
        Countries.putSafe(m, "section", str4);
        Countries.putSafe(m, "section_index", num2);
        Countries.putSafe(m, "section_total", num3);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "experience_type", experienceType);
        Countries.putSafe(m, "flow_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestViewRecipient)) {
            return false;
        }
        AssetRequestViewRecipient assetRequestViewRecipient = (AssetRequestViewRecipient) obj;
        if (!Intrinsics.areEqual(this.absolute_index, assetRequestViewRecipient.absolute_index) || this.contact_status != assetRequestViewRecipient.contact_status || !Intrinsics.areEqual(this.entity_token, assetRequestViewRecipient.entity_token) || !Intrinsics.areEqual(this.external_id, assetRequestViewRecipient.external_id)) {
            return false;
        }
        Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
        return Intrinsics.areEqual(this.remote_suggestion_type, assetRequestViewRecipient.remote_suggestion_type) && Intrinsics.areEqual(this.section, assetRequestViewRecipient.section) && Intrinsics.areEqual(this.section_index, assetRequestViewRecipient.section_index) && Intrinsics.areEqual(this.section_total, assetRequestViewRecipient.section_total) && this.suggestion_strategy == assetRequestViewRecipient.suggestion_strategy && this.experience_type == assetRequestViewRecipient.experience_type && Intrinsics.areEqual(this.flow_token, assetRequestViewRecipient.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request ViewRecipient";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (this.contact_status.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        String str = this.entity_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.external_id;
        int hashCode3 = (Origin.AMOUNT_FIRST.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.remote_suggestion_type;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.section;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.section_index;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.section_total;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 961;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode8 = (this.experience_type.hashCode() + ((hashCode7 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31)) * 31;
        String str5 = this.flow_token;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        Origin origin = Origin.AMOUNT_FIRST;
        StringBuilder sb = new StringBuilder("AssetRequestViewRecipient(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.entity_token, ", external_id=", this.external_id, ", origin=");
        sb.append(origin);
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
        sb.append(")");
        return sb.toString();
    }
}
