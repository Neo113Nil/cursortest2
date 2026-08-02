package com.squareup.cash.investingcrypto.viewmodels.common;

import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class InvestingCryptoAvatarContentModel$Icon extends LinkScanner {
    public final InvestingCryptoImage image;

    public InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage investingCryptoImage) {
        this.image = investingCryptoImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingCryptoAvatarContentModel$Icon) && this.image == ((InvestingCryptoAvatarContentModel$Icon) obj).image;
    }

    public final int hashCode() {
        return this.image.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.image + ")";
    }
}
