package com.squareup.cash.investingcrypto.viewmodels.common;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class InvestingCryptoAvatarContentModel$ImageWithBackground extends LinkScanner {
    public final Color bgColor;
    public final Image image;
    public final Color tintColor;

    public InvestingCryptoAvatarContentModel$ImageWithBackground(Image image, Color color, Color color2) {
        color.getClass();
        this.image = image;
        this.bgColor = color;
        this.tintColor = color2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoAvatarContentModel$ImageWithBackground)) {
            return false;
        }
        InvestingCryptoAvatarContentModel$ImageWithBackground investingCryptoAvatarContentModel$ImageWithBackground = (InvestingCryptoAvatarContentModel$ImageWithBackground) obj;
        return this.image.equals(investingCryptoAvatarContentModel$ImageWithBackground.image) && Intrinsics.areEqual(this.bgColor, investingCryptoAvatarContentModel$ImageWithBackground.bgColor) && this.tintColor.equals(investingCryptoAvatarContentModel$ImageWithBackground.tintColor);
    }

    public final int hashCode() {
        return this.tintColor.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.bgColor, this.image.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ImageWithBackground(image=" + this.image + ", bgColor=" + this.bgColor + ", tintColor=" + this.tintColor + ")";
    }
}
