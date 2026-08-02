package com.squareup.cash.moneybot.analytics;

import com.squareup.cash.cdf.moneybot.TemplateCardFieldType;
import com.squareup.cash.cdf.moneybot.TemplateCardPickerKind;
import com.squareup.cash.cdf.moneybot.TemplateCardPickerPlacement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TemplateCardInputFieldAnalyticsData {
    public final TemplateCardFieldType fieldType;
    public final TemplateCardPickerKind pickerKind;
    public final TemplateCardPickerPlacement pickerPlacement;
    public final String placeholderKey;

    public TemplateCardInputFieldAnalyticsData(String str, TemplateCardFieldType templateCardFieldType, TemplateCardPickerKind templateCardPickerKind, TemplateCardPickerPlacement templateCardPickerPlacement) {
        str.getClass();
        this.placeholderKey = str;
        this.fieldType = templateCardFieldType;
        this.pickerKind = templateCardPickerKind;
        this.pickerPlacement = templateCardPickerPlacement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCardInputFieldAnalyticsData)) {
            return false;
        }
        TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData = (TemplateCardInputFieldAnalyticsData) obj;
        return Intrinsics.areEqual(this.placeholderKey, templateCardInputFieldAnalyticsData.placeholderKey) && this.fieldType == templateCardInputFieldAnalyticsData.fieldType && this.pickerKind == templateCardInputFieldAnalyticsData.pickerKind && this.pickerPlacement == templateCardInputFieldAnalyticsData.pickerPlacement;
    }

    public final TemplateCardFieldType getFieldType() {
        return this.fieldType;
    }

    public final TemplateCardPickerKind getPickerKind() {
        return this.pickerKind;
    }

    public final TemplateCardPickerPlacement getPickerPlacement() {
        return this.pickerPlacement;
    }

    public final String getPlaceholderKey() {
        return this.placeholderKey;
    }

    public final int hashCode() {
        int hashCode = (this.fieldType.hashCode() + (this.placeholderKey.hashCode() * 31)) * 31;
        TemplateCardPickerKind templateCardPickerKind = this.pickerKind;
        int hashCode2 = (hashCode + (templateCardPickerKind == null ? 0 : templateCardPickerKind.hashCode())) * 31;
        TemplateCardPickerPlacement templateCardPickerPlacement = this.pickerPlacement;
        return hashCode2 + (templateCardPickerPlacement != null ? templateCardPickerPlacement.hashCode() : 0);
    }

    public final String toString() {
        return "TemplateCardInputFieldAnalyticsData(placeholderKey=" + this.placeholderKey + ", fieldType=" + this.fieldType + ", pickerKind=" + this.pickerKind + ", pickerPlacement=" + this.pickerPlacement + ")";
    }

    public /* synthetic */ TemplateCardInputFieldAnalyticsData(String str, TemplateCardFieldType templateCardFieldType, TemplateCardPickerPlacement templateCardPickerPlacement, int i) {
        this(str, templateCardFieldType, (TemplateCardPickerKind) null, (i & 8) != 0 ? null : templateCardPickerPlacement);
    }
}
