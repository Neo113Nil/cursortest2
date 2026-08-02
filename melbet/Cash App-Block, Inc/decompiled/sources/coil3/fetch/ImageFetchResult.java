package coil3.fetch;

import coil3.Image;
import coil3.decode.DataSource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ImageFetchResult implements FetchResult {
    public final DataSource dataSource;
    public final Image image;
    public final boolean isSampled;

    public ImageFetchResult(Image image, boolean z, DataSource dataSource) {
        this.image = image;
        this.isSampled = z;
        this.dataSource = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFetchResult)) {
            return false;
        }
        ImageFetchResult imageFetchResult = (ImageFetchResult) obj;
        return this.image.equals(imageFetchResult.image) && this.isSampled == imageFetchResult.isSampled && this.dataSource == imageFetchResult.dataSource;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public final Image getImage() {
        return this.image;
    }

    public final int hashCode() {
        return this.dataSource.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.isSampled);
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ")";
    }
}
