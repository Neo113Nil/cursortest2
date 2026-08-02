package com.google.android.datatransport;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_ProductData {
    public final Integer productId;

    public AutoValue_ProductData(Integer num) {
        this.productId = num;
    }

    public static AutoValue_ProductData withProductId(Integer num) {
        return new AutoValue_ProductData(num);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_ProductData) {
            return this.productId.equals(((AutoValue_ProductData) obj).productId);
        }
        return false;
    }

    public final int hashCode() {
        return this.productId.hashCode() ^ 1000003;
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(new StringBuilder("ProductData{productId="), this.productId, "}");
    }
}
