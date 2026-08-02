package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;

/* loaded from: classes3.dex */
public final class ThumbnailMetadata implements Metadata.Entry {
    public final long presentationTimeUs;

    public ThumbnailMetadata(long j) {
        this.presentationTimeUs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ThumbnailMetadata.class == obj.getClass() && this.presentationTimeUs == ((ThumbnailMetadata) obj).presentationTimeUs;
    }

    public final int hashCode() {
        return Long.hashCode(this.presentationTimeUs) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.presentationTimeUs;
    }
}
