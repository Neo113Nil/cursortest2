package com.squareup.cash.money.booklet;

import com.squareup.protos.cash.ui.Image;

/* loaded from: classes6.dex */
public final class HeroSection implements MoneyTabBookletSection {
    public final Image image;
    public final float imageAspectRatio;

    public HeroSection(Image image, float f) {
        this.image = image;
        this.imageAspectRatio = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroSection)) {
            return false;
        }
        HeroSection heroSection = (HeroSection) obj;
        return this.image.equals(heroSection.image) && Float.compare(this.imageAspectRatio, heroSection.imageAspectRatio) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.imageAspectRatio) + (this.image.hashCode() * 31);
    }

    public final String toString() {
        return "HeroSection(image=" + this.image + ", imageAspectRatio=" + this.imageAspectRatio + ")";
    }
}
