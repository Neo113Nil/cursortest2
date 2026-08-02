package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RemoteImage {
    public final ImageUrl url;

    public final class ImageUrl {
        public final String dark;
        public final String light;

        public ImageUrl(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.light = str;
            this.dark = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUrl)) {
                return false;
            }
            ImageUrl imageUrl = (ImageUrl) obj;
            return Intrinsics.areEqual(this.light, imageUrl.light) && Intrinsics.areEqual(this.dark, imageUrl.dark);
        }

        public final int hashCode() {
            return this.dark.hashCode() + (this.light.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ImageUrl(light=", this.light, ", dark=", this.dark, ")");
        }
    }

    public RemoteImage(ImageUrl imageUrl) {
        this.url = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoteImage) && this.url.equals(((RemoteImage) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return "RemoteImage(url=" + this.url + ")";
    }
}
