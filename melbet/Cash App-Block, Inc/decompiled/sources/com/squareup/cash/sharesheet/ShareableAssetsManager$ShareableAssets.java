package com.squareup.cash.sharesheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShareableAssetsManager$ShareableAssets {
    public final String cashtagUrl;
    public final ShareableAssetsManager$DownloadedImage printableCashtagQrImage;

    public /* synthetic */ ShareableAssetsManager$ShareableAssets(String str, ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shareableAssetsManager$DownloadedImage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareableAssetsManager$ShareableAssets)) {
            return false;
        }
        ShareableAssetsManager$ShareableAssets shareableAssetsManager$ShareableAssets = (ShareableAssetsManager$ShareableAssets) obj;
        return Intrinsics.areEqual(this.cashtagUrl, shareableAssetsManager$ShareableAssets.cashtagUrl) && Intrinsics.areEqual(this.printableCashtagQrImage, shareableAssetsManager$ShareableAssets.printableCashtagQrImage);
    }

    public final int hashCode() {
        String str = this.cashtagUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage = this.printableCashtagQrImage;
        return hashCode + (shareableAssetsManager$DownloadedImage != null ? shareableAssetsManager$DownloadedImage.hashCode() : 0);
    }

    public final String toString() {
        return "ShareableAssets(cashtagUrl=" + this.cashtagUrl + ", printableCashtagQrImage=" + this.printableCashtagQrImage + ")";
    }

    public ShareableAssetsManager$ShareableAssets(String str, ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage) {
        this.cashtagUrl = str;
        this.printableCashtagQrImage = shareableAssetsManager$DownloadedImage;
    }
}
