package com.squareup.cash.advertising.viewmodels;

import android.net.Uri;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.DefaultMethodSupport;

/* loaded from: classes5.dex */
public final class FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel extends DefaultMethodSupport {
    public final String contentDescription;
    public final String fallbackImageUrl;
    public final boolean loopPlayback;
    public final Uri videoAsset;

    public FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel(Uri uri, String str, String str2, boolean z) {
        uri.getClass();
        this.videoAsset = uri;
        this.contentDescription = str;
        this.fallbackImageUrl = str2;
        this.loopPlayback = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel)) {
            return false;
        }
        FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel = (FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel) obj;
        return Intrinsics.areEqual(this.videoAsset, fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.videoAsset) && Intrinsics.areEqual(this.contentDescription, fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.contentDescription) && Intrinsics.areEqual(this.fallbackImageUrl, fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.fallbackImageUrl) && this.loopPlayback == fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.loopPlayback;
    }

    public final int hashCode() {
        int hashCode = this.videoAsset.hashCode() * 31;
        String str = this.contentDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fallbackImageUrl;
        return Boolean.hashCode(this.loopPlayback) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAssetViewModel(videoAsset=");
        sb.append(this.videoAsset);
        sb.append(", contentDescription=");
        sb.append(this.contentDescription);
        sb.append(", fallbackImageUrl=");
        return re$$ExternalSyntheticOutline0.m(sb, this.fallbackImageUrl, ", loopPlayback=", this.loopPlayback, ")");
    }
}
