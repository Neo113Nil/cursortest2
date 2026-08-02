package com.squareup.cash.db2;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LoadCacheableBackgrounds {
    public final String main_url;
    public final String preview_url;

    public LoadCacheableBackgrounds(String str, String str2) {
        this.main_url = str;
        this.preview_url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadCacheableBackgrounds)) {
            return false;
        }
        LoadCacheableBackgrounds loadCacheableBackgrounds = (LoadCacheableBackgrounds) obj;
        return Intrinsics.areEqual(this.main_url, loadCacheableBackgrounds.main_url) && Intrinsics.areEqual(this.preview_url, loadCacheableBackgrounds.preview_url);
    }

    public final int hashCode() {
        String str = this.main_url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preview_url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LoadCacheableBackgrounds(main_url=", this.main_url, ", preview_url=", this.preview_url, ")");
    }
}
