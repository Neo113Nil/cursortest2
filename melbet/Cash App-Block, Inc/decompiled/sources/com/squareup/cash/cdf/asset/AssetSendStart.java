package com.squareup.cash.cdf.asset;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzb;
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

/* loaded from: classes.dex */
public final class AssetSendStart implements Event {
    public static final zzb Companion = new zzb(16);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BULLETIN, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final ContactStatus contact_status;
    public final Boolean contact_sync_prompted;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final Boolean keyboard_auto_opened;
    public final Integer matched_alias_length;
    public final Integer ml_suggested_count;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String remote_suggestion_type;
    public final Integer search_text_length;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final String suggestion_id;
    public final SuggestionStrategy suggestion_strategy;

    public AssetSendStart(Integer num, ContactStatus contactStatus, String str, Integer num2, Origin origin, String str2, Integer num3, String str3, Integer num4, Integer num5, String str4, SuggestionStrategy suggestionStrategy, Integer num6, Boolean bool, ExperienceType experienceType, String str5, int i) {
        Boolean bool2 = Boolean.FALSE;
        Integer num7 = (i & 1) != 0 ? null : num;
        ContactStatus contactStatus2 = (i & 2) != 0 ? null : contactStatus;
        Integer num8 = (i & 8) != 0 ? null : num2;
        String str6 = (i & 64) != 0 ? null : str2;
        Integer num9 = (i & 128) != 0 ? null : num3;
        String str7 = (i & 256) != 0 ? null : str3;
        Integer num10 = (i & 512) != 0 ? null : num4;
        Integer num11 = (i & 1024) != 0 ? null : num5;
        String str8 = (i & 2048) != 0 ? null : str4;
        SuggestionStrategy suggestionStrategy2 = (i & 4096) != 0 ? null : suggestionStrategy;
        Integer num12 = (i & 65536) != 0 ? null : num6;
        bool2 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : bool2;
        Boolean bool3 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : bool;
        ExperienceType experienceType2 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : experienceType;
        String str9 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str5;
        this.absolute_index = num7;
        this.contact_status = contactStatus2;
        this.external_id = str;
        this.matched_alias_length = num8;
        this.origin = origin;
        this.remote_suggestion_type = str6;
        this.search_text_length = num9;
        this.section = str7;
        this.section_index = num10;
        this.section_total = num11;
        this.suggestion_id = str8;
        this.suggestion_strategy = suggestionStrategy2;
        this.ml_suggested_count = num12;
        this.keyboard_auto_opened = bool2;
        this.contact_sync_prompted = bool3;
        Boolean bool4 = bool3;
        ExperienceType experienceType3 = experienceType2;
        this.experience_type = experienceType3;
        String str10 = str9;
        this.flow_token = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 23, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "absolute_index", num7);
        Countries.putSafe(m, "contact_status", contactStatus2);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "matched_alias_length", num8);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "remote_suggestion_type", str6);
        Countries.putSafe(m, "search_text_length", num9);
        Countries.putSafe(m, "section", str7);
        Countries.putSafe(m, "section_index", num10);
        Countries.putSafe(m, "section_total", num11);
        Countries.putSafe(m, "suggestion_id", str8);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy2);
        Countries.putSafe(m, "ml_suggested_count", num12);
        Countries.putSafe(m, "keyboard_auto_opened", bool2);
        Countries.putSafe(m, "contact_sync_prompted", bool4);
        Countries.putSafe(m, "experience_type", experienceType3);
        Countries.putSafe(m, "flow_token", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendStart)) {
            return false;
        }
        AssetSendStart assetSendStart = (AssetSendStart) obj;
        return Intrinsics.areEqual(this.absolute_index, assetSendStart.absolute_index) && this.contact_status == assetSendStart.contact_status && Intrinsics.areEqual(this.external_id, assetSendStart.external_id) && Intrinsics.areEqual(this.matched_alias_length, assetSendStart.matched_alias_length) && this.origin == assetSendStart.origin && Intrinsics.areEqual(this.remote_suggestion_type, assetSendStart.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, assetSendStart.search_text_length) && Intrinsics.areEqual(this.section, assetSendStart.section) && Intrinsics.areEqual(this.section_index, assetSendStart.section_index) && Intrinsics.areEqual(this.section_total, assetSendStart.section_total) && Intrinsics.areEqual(this.suggestion_id, assetSendStart.suggestion_id) && this.suggestion_strategy == assetSendStart.suggestion_strategy && Intrinsics.areEqual(this.ml_suggested_count, assetSendStart.ml_suggested_count) && Intrinsics.areEqual(this.keyboard_auto_opened, assetSendStart.keyboard_auto_opened) && Intrinsics.areEqual(this.contact_sync_prompted, assetSendStart.contact_sync_prompted) && this.experience_type == assetSendStart.experience_type && Intrinsics.areEqual(this.flow_token, assetSendStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send Start";
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
        String str = this.external_id;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.matched_alias_length;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode5 = (hashCode4 + (origin == null ? 0 : origin.hashCode())) * 961;
        String str2 = this.remote_suggestion_type;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.search_text_length;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.section;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.section_index;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.section_total;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.suggestion_id;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode12 = (hashCode11 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 923521;
        Integer num6 = this.ml_suggested_count;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool = this.keyboard_auto_opened;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.contact_sync_prompted;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ExperienceType experienceType = this.experience_type;
        int hashCode16 = (hashCode15 + (experienceType == null ? 0 : experienceType.hashCode())) * 31;
        String str5 = this.flow_token;
        return hashCode16 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendStart(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", contact_status=");
        sb.append(this.contact_status);
        sb.append(", external_id=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.external_id, ", matched_alias_length=", this.matched_alias_length, ", origin=");
        sb.append(this.origin);
        sb.append(", profile_directory_flow_token=null, remote_suggestion_type=");
        sb.append(this.remote_suggestion_type);
        sb.append(", search_text_length=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.search_text_length, ", section=", this.section, ", section_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", suggestion_id=");
        sb.append(this.suggestion_id);
        sb.append(", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", is_secondary_account=null, is_multiple_account_holder=null, account_holder_token=null, ml_suggested_count=");
        sb.append(this.ml_suggested_count);
        sb.append(", keyboard_auto_opened=");
        sb.append(this.keyboard_auto_opened);
        sb.append(", contact_sync_prompted=");
        sb.append(this.contact_sync_prompted);
        sb.append(", experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
