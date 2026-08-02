package com.squareup.cash.investingcrypto.viewmodels.common;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class InvestingCryptoAvatarContentModel$Image extends LinkScanner {
    public final ColorModel accentColor;
    public final Image image;

    public InvestingCryptoAvatarContentModel$Image(Image image, ColorModel colorModel) {
        image.getClass();
        colorModel.getClass();
        this.image = image;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoAvatarContentModel$Image)) {
            return false;
        }
        InvestingCryptoAvatarContentModel$Image investingCryptoAvatarContentModel$Image = (InvestingCryptoAvatarContentModel$Image) obj;
        return Intrinsics.areEqual(this.image, investingCryptoAvatarContentModel$Image.image) && Intrinsics.areEqual(this.accentColor, investingCryptoAvatarContentModel$Image.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode() + (this.image.hashCode() * 31);
    }

    public final String toString() {
        return "Image(image=" + this.image + ", accentColor=" + this.accentColor + ")";
    }
}
