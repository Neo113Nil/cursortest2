package com.squareup.cash.data.profile;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CropResultManager$CropResult {
    public final Bitmap croppedBitmap;
    public final Uri uncroppedUri;

    public CropResultManager$CropResult(Bitmap bitmap, Uri uri) {
        bitmap.getClass();
        uri.getClass();
        this.croppedBitmap = bitmap;
        this.uncroppedUri = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropResultManager$CropResult)) {
            return false;
        }
        CropResultManager$CropResult cropResultManager$CropResult = (CropResultManager$CropResult) obj;
        return Intrinsics.areEqual(this.croppedBitmap, cropResultManager$CropResult.croppedBitmap) && Intrinsics.areEqual(this.uncroppedUri, cropResultManager$CropResult.uncroppedUri);
    }

    public final int hashCode() {
        return this.uncroppedUri.hashCode() + (this.croppedBitmap.hashCode() * 31);
    }

    public final String toString() {
        return "CropResult(croppedBitmap=" + this.croppedBitmap + ", uncroppedUri=" + this.uncroppedUri + ")";
    }
}
