package coil3.decode;

import coil3.Image;

/* loaded from: classes3.dex */
public final class DecodeResult {
    public final Image image;
    public final boolean isSampled;

    public DecodeResult(Image image, boolean z) {
        this.image = image;
        this.isSampled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return this.image.equals(decodeResult.image) && this.isSampled == decodeResult.isSampled;
    }

    public final Image getImage() {
        return this.image;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSampled) + (this.image.hashCode() * 31);
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public final String toString() {
        return "DecodeResult(image=" + this.image + ", isSampled=" + this.isSampled + ")";
    }
}
