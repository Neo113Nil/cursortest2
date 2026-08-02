package com.squareup.cash.advertising.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.DefaultMethodSupport;

/* loaded from: classes5.dex */
public final class FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel extends DefaultMethodSupport {
    public final String contentDescription;
    public final String fallbackImageUrl;

    public FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel(String str, String str2) {
        this.fallbackImageUrl = str;
        this.contentDescription = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel)) {
            return false;
        }
        FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel = (FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel) obj;
        return Intrinsics.areEqual(this.fallbackImageUrl, fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel.fallbackImageUrl) && Intrinsics.areEqual(this.contentDescription, fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel.contentDescription);
    }

    public final int hashCode() {
        String str = this.fallbackImageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentDescription;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ImageAssetViewModel(fallbackImageUrl=", this.fallbackImageUrl, ", contentDescription=", this.contentDescription, ")");
    }
}
