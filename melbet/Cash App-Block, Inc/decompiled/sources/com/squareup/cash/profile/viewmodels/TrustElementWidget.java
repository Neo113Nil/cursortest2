package com.squareup.cash.profile.viewmodels;

import com.squareup.util.compose.StableHolder;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TrustElementWidget {
    public final String arcadeIconId;
    public final Boolean enabled;
    public final StableHolder icon;
    public final String id;
    public final String title;

    public TrustElementWidget(String str, String str2, StableHolder stableHolder, Boolean bool, String str3) {
        this.id = str;
        this.title = str2;
        this.icon = stableHolder;
        this.enabled = bool;
        this.arcadeIconId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustElementWidget)) {
            return false;
        }
        TrustElementWidget trustElementWidget = (TrustElementWidget) obj;
        return Intrinsics.areEqual(this.id, trustElementWidget.id) && Intrinsics.areEqual(this.title, trustElementWidget.title) && Intrinsics.areEqual(this.icon, trustElementWidget.icon) && Intrinsics.areEqual(this.enabled, trustElementWidget.enabled) && Intrinsics.areEqual(this.arcadeIconId, trustElementWidget.arcadeIconId);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StableHolder stableHolder = this.icon;
        int hashCode3 = (hashCode2 + (stableHolder == null ? 0 : stableHolder.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.arcadeIconId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TrustElementWidget(id=", this.id, ", title=", this.title, ", icon=");
        m.append(this.icon);
        m.append(", enabled=");
        m.append(this.enabled);
        m.append(", arcadeIconId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.arcadeIconId, ")");
    }
}
