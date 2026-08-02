package com.squareup.cash.initialscreenloader.backend;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/initialscreenloader/backend/UpdateRequiredData;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdateRequiredData {
    public final String message;
    public final String title;

    public UpdateRequiredData(String str, String str2) {
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRequiredData)) {
            return false;
        }
        UpdateRequiredData updateRequiredData = (UpdateRequiredData) obj;
        return Intrinsics.areEqual(this.title, updateRequiredData.title) && Intrinsics.areEqual(this.message, updateRequiredData.message);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("UpdateRequiredData(title=", this.title, ", message=", this.message, ")");
    }
}
