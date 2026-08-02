package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AssetSendPersonalizationButtonTapped implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean amount_selected;
    public final String displayed_error;
    public final EntryPoint entry_point;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final Boolean initiator_note_present;
    public final PersonalizationOrigin origin;
    public final LinkedHashMap parameters;
    public final Boolean personalization_enabled;
    public final Boolean recipient_selected;

    public AssetSendPersonalizationButtonTapped(String str, PersonalizationOrigin personalizationOrigin, EntryPoint entryPoint, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, ExperienceType experienceType, int i) {
        personalizationOrigin = (i & 2) != 0 ? null : personalizationOrigin;
        str3 = (i & 256) != 0 ? null : str3;
        this.external_id = str;
        this.origin = personalizationOrigin;
        this.entry_point = entryPoint;
        this.recipient_selected = bool;
        this.amount_selected = bool2;
        this.initiator_note_present = bool3;
        this.personalization_enabled = bool4;
        this.flow_token = str2;
        this.displayed_error = str3;
        this.experience_type = experienceType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "origin", personalizationOrigin);
        Countries.putSafe(m, "entry_point", entryPoint);
        Countries.putSafe(m, "recipient_selected", bool);
        Countries.putSafe(m, "amount_selected", bool2);
        Countries.putSafe(m, "initiator_note_present", bool3);
        Countries.putSafe(m, "personalization_enabled", bool4);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "displayed_error", str3);
        Countries.putSafe(m, "experience_type", experienceType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationButtonTapped)) {
            return false;
        }
        AssetSendPersonalizationButtonTapped assetSendPersonalizationButtonTapped = (AssetSendPersonalizationButtonTapped) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationButtonTapped.external_id) && this.origin == assetSendPersonalizationButtonTapped.origin && this.entry_point == assetSendPersonalizationButtonTapped.entry_point && this.recipient_selected.equals(assetSendPersonalizationButtonTapped.recipient_selected) && this.amount_selected.equals(assetSendPersonalizationButtonTapped.amount_selected) && this.initiator_note_present.equals(assetSendPersonalizationButtonTapped.initiator_note_present) && this.personalization_enabled.equals(assetSendPersonalizationButtonTapped.personalization_enabled) && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationButtonTapped.flow_token) && Intrinsics.areEqual(this.displayed_error, assetSendPersonalizationButtonTapped.displayed_error) && this.experience_type == assetSendPersonalizationButtonTapped.experience_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationButtonTapped";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PersonalizationOrigin personalizationOrigin = this.origin;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.personalization_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.initiator_note_present, ViewEvent$State$EnumUnboxingLocalUtility.m(this.amount_selected, ViewEvent$State$EnumUnboxingLocalUtility.m(this.recipient_selected, (this.entry_point.hashCode() + ((hashCode + (personalizationOrigin == null ? 0 : personalizationOrigin.hashCode())) * 31)) * 31, 31), 31), 31), 31);
        String str2 = this.flow_token;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayed_error;
        return this.experience_type.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendPersonalizationButtonTapped(external_id=");
        sb.append(this.external_id);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", recipient_selected=");
        sb.append(this.recipient_selected);
        sb.append(", amount_selected=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.amount_selected, ", initiator_note_present=", this.initiator_note_present, ", personalization_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.personalization_enabled, ", flow_token=", this.flow_token, ", displayed_error=");
        sb.append(this.displayed_error);
        sb.append(", experience_type=");
        sb.append(this.experience_type);
        sb.append(")");
        return sb.toString();
    }
}
