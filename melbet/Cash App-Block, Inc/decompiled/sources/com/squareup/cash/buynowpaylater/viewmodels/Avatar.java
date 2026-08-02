package com.squareup.cash.buynowpaylater.viewmodels;

import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Avatar {
    public final Image badge;
    public final Image image;

    public Avatar(Image image, Image image2) {
        this.image = image;
        this.badge = image2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(this.image, avatar.image) && Intrinsics.areEqual(this.badge, avatar.badge);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.badge;
        return hashCode + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        return "Avatar(image=" + this.image + ", badge=" + this.badge + ")";
    }
}
