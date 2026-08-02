package com.squareup.cash.payments.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StickerMetadata {
    public final String accessibilityDescription;
    public final String id;
    public final String mainUrl;
    public final String previewUrl;

    public StickerMetadata(String str, String str2, String str3, String str4) {
        this.id = str;
        this.mainUrl = str2;
        this.previewUrl = str3;
        this.accessibilityDescription = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerMetadata)) {
            return false;
        }
        StickerMetadata stickerMetadata = (StickerMetadata) obj;
        return this.id.equals(stickerMetadata.id) && this.mainUrl.equals(stickerMetadata.mainUrl) && this.previewUrl.equals(stickerMetadata.previewUrl) && Intrinsics.areEqual(this.accessibilityDescription, stickerMetadata.accessibilityDescription);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.mainUrl), 31, this.previewUrl);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StickerMetadata(id=", this.id, ", mainUrl=", this.mainUrl, ", previewUrl="), this.previewUrl, ", accessibilityDescription=", this.accessibilityDescription, ")");
    }
}
