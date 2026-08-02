package com.squareup.cash.cdf.asset;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AssetRequestSubmitTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer absolute_index;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final Integer matched_alias_length;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final PaymentAssetType payment_asset_type;
    public final Boolean payment_asset_visible;
    public final Integer recipient_count;
    public final String remote_suggestion_type;
    public final Integer search_text_length;
    public final String search_type;
    public final String section;
    public final Integer section_index;
    public final Integer section_total;
    public final String suggestion_id;
    public final SuggestionStrategy suggestion_strategy;
    public final Boolean use_cash_customer_search;
    public final Boolean use_ml_customer_search;

    public AssetRequestSubmitTransaction(Integer num, String str, Integer num2, Origin origin, Boolean bool, Integer num3, String str2, Integer num4, String str3, String str4, Integer num5, Integer num6, String str5, SuggestionStrategy suggestionStrategy, Boolean bool2, Boolean bool3, ExperienceType experienceType, String str6, int i) {
        PaymentAssetType paymentAssetType = PaymentAssetType.CASH;
        Integer num7 = (i & 16) != 0 ? null : num2;
        paymentAssetType = (i & 64) != 0 ? null : paymentAssetType;
        Boolean bool4 = (i & 128) != 0 ? null : bool;
        Integer num8 = (i & 512) != 0 ? null : num3;
        Integer num9 = (i & 2048) != 0 ? null : num4;
        String str7 = (i & 4096) != 0 ? null : str3;
        String str8 = (i & 65536) != 0 ? null : str5;
        Boolean bool5 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : bool2;
        Boolean bool6 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool3;
        ExperienceType experienceType2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : experienceType;
        String str9 = (i & 4194304) != 0 ? null : str6;
        this.absolute_index = num;
        this.external_id = str;
        this.matched_alias_length = num7;
        this.origin = origin;
        this.payment_asset_type = paymentAssetType;
        this.payment_asset_visible = bool4;
        this.recipient_count = num8;
        this.remote_suggestion_type = str2;
        this.search_text_length = num9;
        this.search_type = str7;
        this.section = str4;
        this.section_index = num5;
        this.section_total = num6;
        this.suggestion_id = str8;
        this.suggestion_strategy = suggestionStrategy;
        Boolean bool7 = bool5;
        this.use_cash_customer_search = bool7;
        Boolean bool8 = bool6;
        this.use_ml_customer_search = bool8;
        ExperienceType experienceType3 = experienceType2;
        this.experience_type = experienceType3;
        String str10 = str9;
        this.flow_token = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 25, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "absolute_index", num);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "matched_alias_length", num7);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "payment_asset_type", paymentAssetType);
        Countries.putSafe(m, "payment_asset_visible", bool4);
        Countries.putSafe(m, "recipient_count", num8);
        Countries.putSafe(m, "remote_suggestion_type", str2);
        Countries.putSafe(m, "search_text_length", num9);
        Countries.putSafe(m, "search_type", str7);
        Countries.putSafe(m, "section", str4);
        Countries.putSafe(m, "section_index", num5);
        Countries.putSafe(m, "section_total", num6);
        Countries.putSafe(m, "suggestion_id", str8);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        Countries.putSafe(m, "use_cash_customer_search", bool7);
        Countries.putSafe(m, "use_ml_customer_search", bool8);
        Countries.putSafe(m, "experience_type", experienceType3);
        Countries.putSafe(m, "flow_token", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestSubmitTransaction)) {
            return false;
        }
        AssetRequestSubmitTransaction assetRequestSubmitTransaction = (AssetRequestSubmitTransaction) obj;
        return Intrinsics.areEqual(this.absolute_index, assetRequestSubmitTransaction.absolute_index) && Intrinsics.areEqual(this.external_id, assetRequestSubmitTransaction.external_id) && Intrinsics.areEqual(this.matched_alias_length, assetRequestSubmitTransaction.matched_alias_length) && this.origin == assetRequestSubmitTransaction.origin && this.payment_asset_type == assetRequestSubmitTransaction.payment_asset_type && Intrinsics.areEqual(this.payment_asset_visible, assetRequestSubmitTransaction.payment_asset_visible) && Intrinsics.areEqual(this.recipient_count, assetRequestSubmitTransaction.recipient_count) && Intrinsics.areEqual(this.remote_suggestion_type, assetRequestSubmitTransaction.remote_suggestion_type) && Intrinsics.areEqual(this.search_text_length, assetRequestSubmitTransaction.search_text_length) && Intrinsics.areEqual(this.search_type, assetRequestSubmitTransaction.search_type) && Intrinsics.areEqual(this.section, assetRequestSubmitTransaction.section) && Intrinsics.areEqual(this.section_index, assetRequestSubmitTransaction.section_index) && Intrinsics.areEqual(this.section_total, assetRequestSubmitTransaction.section_total) && Intrinsics.areEqual(this.suggestion_id, assetRequestSubmitTransaction.suggestion_id) && this.suggestion_strategy == assetRequestSubmitTransaction.suggestion_strategy && Intrinsics.areEqual(this.use_cash_customer_search, assetRequestSubmitTransaction.use_cash_customer_search) && Intrinsics.areEqual(this.use_ml_customer_search, assetRequestSubmitTransaction.use_ml_customer_search) && this.experience_type == assetRequestSubmitTransaction.experience_type && Intrinsics.areEqual(this.flow_token, assetRequestSubmitTransaction.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request SubmitTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.absolute_index;
        int hashCode = (num == null ? 0 : num.hashCode()) * 961;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        Integer num2 = this.matched_alias_length;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode4 = (hashCode3 + (origin == null ? 0 : origin.hashCode())) * 31;
        PaymentAssetType paymentAssetType = this.payment_asset_type;
        int hashCode5 = (hashCode4 + (paymentAssetType == null ? 0 : paymentAssetType.hashCode())) * 31;
        Boolean bool = this.payment_asset_visible;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 961;
        Integer num3 = this.recipient_count;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.remote_suggestion_type;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.search_text_length;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.search_type;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.section;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.section_index;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.section_total;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.suggestion_id;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        int hashCode15 = (hashCode14 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
        Boolean bool2 = this.use_cash_customer_search;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.use_ml_customer_search;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 961;
        ExperienceType experienceType = this.experience_type;
        int hashCode18 = (hashCode17 + (experienceType == null ? 0 : experienceType.hashCode())) * 31;
        String str6 = this.flow_token;
        return hashCode18 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetRequestSubmitTransaction(absolute_index=");
        sb.append(this.absolute_index);
        sb.append(", contact_status=null, external_id=");
        sb.append(this.external_id);
        sb.append(", has_note=null, matched_alias_length=");
        sb.append(this.matched_alias_length);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", payment_asset_type=");
        sb.append(this.payment_asset_type);
        sb.append(", payment_asset_visible=");
        sb.append(this.payment_asset_visible);
        sb.append(", profile_directory_flow_token=null, recipient_count=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.recipient_count, ", remote_suggestion_type=", this.remote_suggestion_type, ", search_text_length=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.search_text_length, ", search_type=", this.search_type, ", section=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", section_index=", this.section_index, ", section_total=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_total, ", suggestion_id=", this.suggestion_id, ", suggestion_strategy=");
        sb.append(this.suggestion_strategy);
        sb.append(", use_cash_customer_search=");
        sb.append(this.use_cash_customer_search);
        sb.append(", use_ml_customer_search=");
        sb.append(this.use_ml_customer_search);
        sb.append(", referrer_flow_token=null, experience_type=");
        sb.append(this.experience_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
