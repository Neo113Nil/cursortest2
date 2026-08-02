package com.squareup.cash.pools.viewmodels;

import com.squareup.protos.cash.ui.Image;

/* loaded from: classes6.dex */
public final class PoolListNuxAssets {
    public final Image learnMoreImage;
    public final Image paymentsImage;

    public PoolListNuxAssets(Image image, Image image2) {
        this.learnMoreImage = image;
        this.paymentsImage = image2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolListNuxAssets)) {
            return false;
        }
        PoolListNuxAssets poolListNuxAssets = (PoolListNuxAssets) obj;
        return this.learnMoreImage.equals(poolListNuxAssets.learnMoreImage) && this.paymentsImage.equals(poolListNuxAssets.paymentsImage);
    }

    public final int hashCode() {
        return this.paymentsImage.hashCode() + (this.learnMoreImage.hashCode() * 31);
    }

    public final String toString() {
        return "PoolListNuxAssets(learnMoreImage=" + this.learnMoreImage + ", paymentsImage=" + this.paymentsImage + ")";
    }
}
