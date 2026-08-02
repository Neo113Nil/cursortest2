package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AssetSendSubmitTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final String entity_token;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final Boolean has_schedule;
    public final Integer matched_alias_length;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final PaymentAssetType payment_asset_type;
    public final Boolean payment_asset_visible;
    public final Integer recipient_count;
    public final String remote_suggestion_type;
    public final ScheduleFrequency schedule_frequency;
    public final Integer schedule_start_date_offset_days;
    public final Integer search_text_length;
    public final String search_type;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final String suggestion_id;
    public final SuggestionStrategy suggestion_strategy;
    public final Boolean use_cash_customer_search;
    public final Boolean use_ml_customer_search;

    public AssetSendSubmitTransaction(Integer num, String str, String str2, Integer num2, Origin origin, PaymentAssetType paymentAssetType, Boolean bool, Integer num3, String str3, Integer num4, String str4, String str5, Integer num5, Integer num6, String str6, SuggestionStrategy suggestionStrategy, Boolean bool2, Boolean bool3, ExperienceType experienceType, String str7, Boolean bool4, ScheduleFrequency scheduleFrequency, Integer num7, int i) {
        String str8 = (i & 4) != 0 ? null : str;
        Integer num8 = (i & 32) != 0 ? null : num2;
        PaymentAssetType paymentAssetType2 = (i & 128) != 0 ? null : paymentAssetType;
        Boolean bool5 = (i & 256) != 0 ? null : bool;
        Integer num9 = (i & 1024) != 0 ? null : num3;
        Integer num10 = (i & 4096) != 0 ? null : num4;
        String str9 = (i & PKIFailureInfo.certRevoked) != 0 ? null : str4;
        String str10 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : str6;
        Boolean bool6 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool2;
        Boolean bool7 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : bool3;
        ExperienceType experienceType2 = (i & 4194304) != 0 ? null : experienceType;
        String str11 = (i & 8388608) != 0 ? null : str7;
        Boolean bool8 = (i & 16777216) != 0 ? null : bool4;
        ScheduleFrequency scheduleFrequency2 = (i & 33554432) != 0 ? null : scheduleFrequency;
        Integer num11 = (i & 67108864) != 0 ? null : num7;
        this.absolute_index = num;
        this.entity_token = str8;
        this.external_id = str2;
        this.matched_alias_length = num8;
        this.origin = origin;
        this.payment_asset_type = paymentAssetType2;
        this.payment_asset_visible = bool5;
        this.recipient_count = num9;
        this.remote_suggestion_type = str3;
        this.search_text_length = num10;
        this.search_type = str9;
        this.section = str5;
        this.section_index = num5;
        this.section_total = num6;
        this.suggestion_id = str10;
        String str12 = str10;
        this.suggestion_strategy = suggestionStrategy;
        Boolean bool9 = bool6;
        this.use_cash_customer_search = bool9;
        Boolean bool10 = bool7;
        this.use_ml_customer_search = bool10;
        ExperienceType experienceType3 = experienceType2;
        this.experience_type = experienceType3;
        String str13 = str11;
        this.flow_token = str13;
        Boolean bool11 = bool8;
        this.has_schedule = bool11;
        ScheduleFrequency scheduleFrequency3 = scheduleFrequency2;
        this.schedule_frequency = scheduleFrequency3;
        Integer num12 = num11;
        this.schedule_start_date_offset_days = num12;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 29, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "entity_token", str8);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "matched_alias_length", num8);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "payment_asset_type", paymentAssetType2);
        Countries.putSafe(m, "payment_asset_visible", bool5);
        Countries.putSafe(m, "recipient_count", num9);
        Countries.putSafe(m, "remote_suggestion_type", str3);
        Countries.putSafe(m, "search_text_length", num10);
        Countries.putSafe(m, "search_type", str9);
        Countries.putSafe(m, "section", str5);
        Countries.putSafe(m, "section_index", num5);
        Countries.putSafe(m, "section_total", num6);
        Countries.putSafe(m, "suggestion_id", str12);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "use_cash_customer_search", bool9);
        Countries.putSafe(m, "use_ml_customer_search", bool10);
        Countries.putSafe(m, "experience_type", experienceType3);
        Countries.putSafe(m, "flow_token", str13);
        Countries.putSafe(m, "has_schedule", bool11);
        Countries.putSafe(m, "schedule_frequency", scheduleFrequency3);
        Countries.putSafe(m, "schedule_start_date_offset_days", num12);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendSubmitTransaction)) {
            return false;
        }
        AssetSendSubmitTransaction assetSendSubmitTransaction = (AssetSendSubmitTransaction) obj;
        return Intrinsics.areEqual(this.absolute_index, assetSendSubmitTransaction.absolute_index) && Intrinsics.areEqual(this.entity_token, assetSendSubmitTransaction.entity_token) && Intrinsics.areEqual(this.external_id, assetSendSubmitTransaction.external_id) && Intrinsics.areEqual(this.matched_alias_length, assetSendSubmitTransaction.matched_alias_length) && this.origin == assetSendSubmitTransaction.origin && this.payment_asset_type == assetSendSubmitTransaction.payment_asset_type && Intrinsics.areEqual(this.payment_asset_visible, assetSendSubmitTransaction.payment_asset_visible) && Intrinsics.areEqual(this.recipient_count, assetSendSubmitTransaction.recipient_count) && Intrinsics.areEqual(this.remote_suggestion_type, assetSendSubmitTransaction.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, assetSendSubmitTransaction.search_text_length) && Intrinsics.areEqual(this.search_type, assetSendSubmitTransaction.search_type) && Intrinsics.areEqual(this.section, assetSendSubmitTransaction.section) && Intrinsics.areEqual(this.section_index, assetSendSubmitTransaction.section_index) && Intrinsics.areEqual(this.section_total, assetSendSubmitTransaction.section_total) && Intrinsics.areEqual(this.suggestion_id, assetSendSubmitTransaction.suggestion_id) && this.suggestion_strategy == assetSendSubmitTransaction.suggestion_strategy && Intrinsics.areEqual(this.use_cash_customer_search, assetSendSubmitTransaction.use_cash_customer_search) && Intrinsics.areEqual(this.use_ml_customer_search, assetSendSubmitTransaction.use_ml_customer_search) && this.experience_type == assetSendSubmitTransaction.experience_type && Intrinsics.areEqual(this.flow_token, assetSendSubmitTransaction.flow_token) && Intrinsics.areEqual(this.has_schedule, assetSendSubmitTransaction.has_schedule) && this.schedule_frequency == assetSendSubmitTransaction.schedule_frequency && Intrinsics.areEqual(this.schedule_start_date_offset_days, assetSendSubmitTransaction.schedule_start_date_offset_days);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send SubmitTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 961;
        String str = this.entity_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.external_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        Integer num2 = this.matched_alias_length;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode5 = (hashCode4 + (origin == null ? 0 : origin.hashCode())) * 31;
        PaymentAssetType paymentAssetType = this.payment_asset_type;
        int hashCode6 = (hashCode5 + (paymentAssetType == null ? 0 : paymentAssetType.hashCode())) * 31;
        Boolean bool = this.payment_asset_visible;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 961;
        Integer num3 = this.recipient_count;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.remote_suggestion_type;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.search_text_length;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.search_type;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.section;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.section_index;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.section_total;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str6 = this.suggestion_id;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode16 = (hashCode15 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
        Boolean bool2 = this.use_cash_customer_search;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.use_ml_customer_search;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 961;
        ExperienceType experienceType = this.experience_type;
        int hashCode19 = (hashCode18 + (experienceType == null ? 0 : experienceType.hashCode())) * 31;
        String str7 = this.flow_token;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool4 = this.has_schedule;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ScheduleFrequency scheduleFrequency = this.schedule_frequency;
        int hashCode22 = (hashCode21 + (scheduleFrequency == null ? 0 : scheduleFrequency.hashCode())) * 31;
        Integer num7 = this.schedule_start_date_offset_days;
        return hashCode22 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendSubmitTransaction(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", contact_status=null, entity_token=");
        sb.append(this.entity_token);
        sb.append(", external_id=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.external_id, ", has_note=null, matched_alias_length=", this.matched_alias_length, ", origin=");
        sb.append(this.origin);
        sb.append(", payment_asset_type=");
        sb.append(this.payment_asset_type);
        sb.append(", payment_asset_visible=");
        sb.append(this.payment_asset_visible);
        sb.append(", profile_directory_flow_token=null, recipient_count=");
        sb.append(this.recipient_count);
        sb.append(", remote_suggestion_type=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.remote_suggestion_type, ", search_text_length=", this.search_text_length, ", search_type=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.search_type, ", section=", this.section, ", section_index=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_index, ", section_total=", this.section_total, ", suggestion_id=");
        sb.append(this.suggestion_id);
        sb.append(", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", use_cash_customer_search=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.use_cash_customer_search, ", use_ml_customer_search=", this.use_ml_customer_search, ", referrer_flow_token=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", has_schedule=");
        sb.append(this.has_schedule);
        sb.append(", schedule_frequency=");
        sb.append(this.schedule_frequency);
        sb.append(", schedule_start_date_offset_days=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.schedule_start_date_offset_days, ")");
    }
}
