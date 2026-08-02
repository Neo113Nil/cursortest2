package com.squareup.cash.db2.profile;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectPhotoUrl {
    public final String photo_url;

    public SelectPhotoUrl(String str) {
        this.photo_url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectPhotoUrl) && Intrinsics.areEqual(this.photo_url, ((SelectPhotoUrl) obj).photo_url);
    }

    public final String getPhoto_url() {
        return this.photo_url;
    }

    public final int hashCode() {
        String str = this.photo_url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectPhotoUrl(photo_url=", this.photo_url, ")");
    }
}
