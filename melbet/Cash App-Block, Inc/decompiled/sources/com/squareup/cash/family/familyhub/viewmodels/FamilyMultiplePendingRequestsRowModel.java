package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyMultiplePendingRequestsRowModel {
    public final String subtitle;
    public final String tapUrl;
    public final String title;

    public FamilyMultiplePendingRequestsRowModel(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.tapUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyMultiplePendingRequestsRowModel)) {
            return false;
        }
        FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel = (FamilyMultiplePendingRequestsRowModel) obj;
        return Intrinsics.areEqual(this.title, familyMultiplePendingRequestsRowModel.title) && Intrinsics.areEqual(this.subtitle, familyMultiplePendingRequestsRowModel.subtitle) && Intrinsics.areEqual(this.tapUrl, familyMultiplePendingRequestsRowModel.tapUrl);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.tapUrl);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FamilyMultiplePendingRequestsRowModel(title=", this.title, ", subtitle=", this.subtitle, ", tapUrl="), this.tapUrl, ", contentDescription=null)");
    }
}
