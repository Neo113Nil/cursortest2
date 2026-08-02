package com.squareup.cash.securityhub.views;

import com.squareup.cash.arcade.Icons;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSettingsRowId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SettingsRowDefinition {
    public final Icons icon;
    public final ProtectionsSettingsRowId id;
    public final int labelRes;

    public SettingsRowDefinition(ProtectionsSettingsRowId protectionsSettingsRowId, Icons icons, int i) {
        this.id = protectionsSettingsRowId;
        this.icon = icons;
        this.labelRes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsRowDefinition)) {
            return false;
        }
        SettingsRowDefinition settingsRowDefinition = (SettingsRowDefinition) obj;
        return this.id == settingsRowDefinition.id && this.icon == settingsRowDefinition.icon && this.labelRes == settingsRowDefinition.labelRes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.labelRes) + ((this.icon.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsRowDefinition(id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", labelRes=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.labelRes, ")", sb);
    }
}
