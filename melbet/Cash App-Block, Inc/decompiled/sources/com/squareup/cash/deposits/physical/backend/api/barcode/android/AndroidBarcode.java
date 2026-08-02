package com.squareup.cash.deposits.physical.backend.api.barcode.android;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class AndroidBarcode {
    public final Bitmap bitmap;

    public AndroidBarcode(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidBarcode) && this.bitmap.equals(((AndroidBarcode) obj).bitmap);
    }

    public final int hashCode() {
        return this.bitmap.hashCode();
    }

    public final String toString() {
        return "AndroidBarcode(bitmap=" + this.bitmap + ")";
    }
}
