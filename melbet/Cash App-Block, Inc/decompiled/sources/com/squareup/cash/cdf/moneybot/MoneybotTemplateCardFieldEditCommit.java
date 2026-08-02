package com.squareup.cash.cdf.moneybot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class MoneybotTemplateCardFieldEditCommit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final TemplateCardFieldType field_type;
    public final String goose_session_id;
    public final String loggable_value;
    public final LinkedHashMap parameters;
    public final TemplateCardPickerKind picker_kind;
    public final TemplateCardPickerPlacement picker_placement;
    public final String placeholder_key;
    public final String tool_name;
    public final String tool_request_id;

    public MoneybotTemplateCardFieldEditCommit(String str, String str2, String str3, String str4, TemplateCardFieldType templateCardFieldType, TemplateCardPickerKind templateCardPickerKind, TemplateCardPickerPlacement templateCardPickerPlacement, String str5) {
        this.goose_session_id = str;
        this.tool_request_id = str2;
        this.tool_name = str3;
        this.placeholder_key = str4;
        this.field_type = templateCardFieldType;
        this.picker_kind = templateCardPickerKind;
        this.picker_placement = templateCardPickerPlacement;
        this.loggable_value = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Moneybot", "cdf_action", "TemplateCard");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "tool_request_id", str2);
        Countries.putSafe(m, "tool_name", str3);
        Countries.putSafe(m, "placeholder_key", str4);
        Countries.putSafe(m, "field_type", templateCardFieldType);
        Countries.putSafe(m, "picker_kind", templateCardPickerKind);
        Countries.putSafe(m, "picker_placement", templateCardPickerPlacement);
        Countries.putSafe(m, "loggable_value", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotTemplateCardFieldEditCommit)) {
            return false;
        }
        MoneybotTemplateCardFieldEditCommit moneybotTemplateCardFieldEditCommit = (MoneybotTemplateCardFieldEditCommit) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotTemplateCardFieldEditCommit.goose_session_id) && Intrinsics.areEqual(this.tool_request_id, moneybotTemplateCardFieldEditCommit.tool_request_id) && Intrinsics.areEqual(this.tool_name, moneybotTemplateCardFieldEditCommit.tool_name) && Intrinsics.areEqual(this.placeholder_key, moneybotTemplateCardFieldEditCommit.placeholder_key) && this.field_type == moneybotTemplateCardFieldEditCommit.field_type && this.picker_kind == moneybotTemplateCardFieldEditCommit.picker_kind && this.picker_placement == moneybotTemplateCardFieldEditCommit.picker_placement && Intrinsics.areEqual(this.loggable_value, moneybotTemplateCardFieldEditCommit.loggable_value);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot TemplateCard FieldEditCommit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tool_request_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tool_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder_key;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TemplateCardFieldType templateCardFieldType = this.field_type;
        int hashCode5 = (hashCode4 + (templateCardFieldType == null ? 0 : templateCardFieldType.hashCode())) * 31;
        TemplateCardPickerKind templateCardPickerKind = this.picker_kind;
        int hashCode6 = (hashCode5 + (templateCardPickerKind == null ? 0 : templateCardPickerKind.hashCode())) * 31;
        TemplateCardPickerPlacement templateCardPickerPlacement = this.picker_placement;
        int hashCode7 = (hashCode6 + (templateCardPickerPlacement == null ? 0 : templateCardPickerPlacement.hashCode())) * 31;
        String str5 = this.loggable_value;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotTemplateCardFieldEditCommit(goose_session_id=", this.goose_session_id, ", tool_request_id=", this.tool_request_id, ", tool_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.tool_name, ", placeholder_key=", this.placeholder_key, ", field_type=");
        m.append(this.field_type);
        m.append(", picker_kind=");
        m.append(this.picker_kind);
        m.append(", picker_placement=");
        m.append(this.picker_placement);
        m.append(", loggable_value=");
        m.append(this.loggable_value);
        m.append(")");
        return m.toString();
    }
}
