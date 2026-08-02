package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class AssetSendPersonalizationTransformed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String background_changed;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Boolean sticker_added;
    public final Boolean sticker_deleted;
    public final String sticker_id;
    public final Integer sticker_index;
    public final Boolean sticker_transformed;
    public final Boolean textbox_added;
    public final Boolean textbox_deleted;
    public final Boolean textbox_transformed;

    public AssetSendPersonalizationTransformed(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Boolean bool4, Integer num, ExperienceType experienceType, int i) {
        Boolean bool5 = Boolean.TRUE;
        String str5 = (i & 1) != 0 ? null : str;
        String str6 = (i & 4) != 0 ? null : str3;
        Boolean bool6 = (i & 8) != 0 ? null : bool5;
        Boolean bool7 = (i & 16) != 0 ? null : bool;
        Boolean bool8 = (i & 32) != 0 ? null : bool2;
        String str7 = (i & 64) != 0 ? null : str4;
        bool5 = (i & 256) != 0 ? null : bool5;
        Boolean bool9 = (i & 512) != 0 ? null : bool3;
        Boolean bool10 = (i & 1024) != 0 ? null : bool4;
        Integer num2 = (i & 2048) != 0 ? null : num;
        ExperienceType experienceType2 = (i & 4096) == 0 ? experienceType : null;
        this.external_id = str5;
        this.flow_token = str2;
        this.background_changed = str6;
        this.textbox_added = bool6;
        this.textbox_deleted = bool7;
        this.textbox_transformed = bool8;
        this.sticker_id = str7;
        this.sticker_added = bool5;
        this.sticker_deleted = bool9;
        this.sticker_transformed = bool10;
        this.sticker_index = num2;
        this.experience_type = experienceType2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str5);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "background_changed", str6);
        Countries.putSafe(m, "textbox_added", bool6);
        Countries.putSafe(m, "textbox_deleted", bool7);
        Countries.putSafe(m, "textbox_transformed", bool8);
        Countries.putSafe(m, "sticker_id", str7);
        Countries.putSafe(m, "sticker_added", bool5);
        Countries.putSafe(m, "sticker_deleted", bool9);
        Countries.putSafe(m, "sticker_transformed", bool10);
        Countries.putSafe(m, "sticker_index", num2);
        Countries.putSafe(m, "experience_type", experienceType2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationTransformed)) {
            return false;
        }
        AssetSendPersonalizationTransformed assetSendPersonalizationTransformed = (AssetSendPersonalizationTransformed) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationTransformed.external_id) && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationTransformed.flow_token) && Intrinsics.areEqual(this.background_changed, assetSendPersonalizationTransformed.background_changed) && Intrinsics.areEqual(this.textbox_added, assetSendPersonalizationTransformed.textbox_added) && Intrinsics.areEqual(this.textbox_deleted, assetSendPersonalizationTransformed.textbox_deleted) && Intrinsics.areEqual(this.textbox_transformed, assetSendPersonalizationTransformed.textbox_transformed) && Intrinsics.areEqual(this.sticker_id, assetSendPersonalizationTransformed.sticker_id) && Intrinsics.areEqual(this.sticker_added, assetSendPersonalizationTransformed.sticker_added) && Intrinsics.areEqual(this.sticker_deleted, assetSendPersonalizationTransformed.sticker_deleted) && Intrinsics.areEqual(this.sticker_transformed, assetSendPersonalizationTransformed.sticker_transformed) && Intrinsics.areEqual(this.sticker_index, assetSendPersonalizationTransformed.sticker_index) && this.experience_type == assetSendPersonalizationTransformed.experience_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationTransformed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.background_changed;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.textbox_added;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.textbox_deleted;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.textbox_transformed;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.sticker_id;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        Boolean bool4 = this.sticker_added;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.sticker_deleted;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.sticker_transformed;
        int hashCode10 = (hashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num = this.sticker_index;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        ExperienceType experienceType = this.experience_type;
        return hashCode11 + (experienceType != null ? experienceType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendPersonalizationTransformed(external_id=", this.external_id, ", flow_token=", this.flow_token, ", background_changed=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.background_changed, ", textbox_added=", this.textbox_added, ", textbox_deleted=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.textbox_deleted, ", textbox_transformed=", this.textbox_transformed, ", sticker_id=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.sticker_id, ", sticker_viewed=null, sticker_added=", this.sticker_added, ", sticker_deleted=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.sticker_deleted, ", sticker_transformed=", this.sticker_transformed, ", sticker_index=");
        m.append(this.sticker_index);
        m.append(", experience_type=");
        m.append(this.experience_type);
        m.append(")");
        return m.toString();
    }
}
