package coil3.fetch;

import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SourceFetchResult implements FetchResult {
    public final DataSource dataSource;
    public final String mimeType;
    public final ImageSource source;

    public SourceFetchResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.source = imageSource;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFetchResult)) {
            return false;
        }
        SourceFetchResult sourceFetchResult = (SourceFetchResult) obj;
        return Intrinsics.areEqual(this.source, sourceFetchResult.source) && Intrinsics.areEqual(this.mimeType, sourceFetchResult.mimeType) && this.dataSource == sourceFetchResult.dataSource;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final ImageSource getSource() {
        return this.source;
    }

    public final int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return this.dataSource.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.source + ", mimeType=" + this.mimeType + ", dataSource=" + this.dataSource + ")";
    }
}
