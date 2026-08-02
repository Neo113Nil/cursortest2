package com.squareup.cash.card.onboarding;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;

/* loaded from: classes6.dex */
public final class HeroSection implements ProductDetailsPageSection {
    public final Image image;

    public HeroSection(Image image) {
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroSection) && this.image.equals(((HeroSection) obj).image);
    }

    public final int hashCode() {
        return this.image.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "HeroSection(image=", ")");
    }
}
