package com.squareup.cash.card.onboarding;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ImageCarouselSection implements ProductDetailsPageSection {
    public final float imageAspectRatio;
    public final List images;

    public ImageCarouselSection(float f, List list) {
        list.getClass();
        this.images = list;
        this.imageAspectRatio = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCarouselSection)) {
            return false;
        }
        ImageCarouselSection imageCarouselSection = (ImageCarouselSection) obj;
        return Intrinsics.areEqual(this.images, imageCarouselSection.images) && Float.compare(this.imageAspectRatio, imageCarouselSection.imageAspectRatio) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.imageAspectRatio) + (this.images.hashCode() * 31);
    }

    public final String toString() {
        return "ImageCarouselSection(images=" + this.images + ", imageAspectRatio=" + this.imageAspectRatio + ")";
    }
}
