package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocalSticker {
    public final String accessibilityDescription;
    public final String id;
    public final String mainUrl;
    public final String previewUrl;

    public LocalSticker(String str, String str2, String str3, String str4) {
        this.id = str;
        this.mainUrl = str2;
        this.previewUrl = str3;
        this.accessibilityDescription = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalSticker)) {
            return false;
        }
        LocalSticker localSticker = (LocalSticker) obj;
        return this.id.equals(localSticker.id) && this.mainUrl.equals(localSticker.mainUrl) && this.previewUrl.equals(localSticker.previewUrl) && Intrinsics.areEqual(this.accessibilityDescription, localSticker.accessibilityDescription);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.mainUrl), 31, this.previewUrl);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalSticker(id=", this.id, ", mainUrl=", this.mainUrl, ", previewUrl="), this.previewUrl, ", accessibilityDescription=", this.accessibilityDescription, ")");
    }
}
