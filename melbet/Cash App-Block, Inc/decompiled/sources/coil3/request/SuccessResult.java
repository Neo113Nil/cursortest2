package coil3.request;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import coil3.Image;
import coil3.decode.DataSource;
import coil3.memory.MemoryCache$Key;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SuccessResult implements ImageResult {
    public final DataSource dataSource;
    public final String diskCacheKey;
    public final Image image;
    public final boolean isPlaceholderCached;
    public final boolean isSampled;
    public final MemoryCache$Key memoryCacheKey;
    public final ImageRequest request;

    public SuccessResult(Image image, ImageRequest imageRequest, DataSource dataSource, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.image = image;
        this.request = imageRequest;
        this.dataSource = dataSource;
        this.memoryCacheKey = memoryCache$Key;
        this.diskCacheKey = str;
        this.isSampled = z;
        this.isPlaceholderCached = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) obj;
        return Intrinsics.areEqual(this.image, successResult.image) && this.request.equals(successResult.request) && this.dataSource == successResult.dataSource && Intrinsics.areEqual(this.memoryCacheKey, successResult.memoryCacheKey) && Intrinsics.areEqual(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    @Override // coil3.request.ImageResult
    public final Image getImage() {
        return this.image;
    }

    @Override // coil3.request.ImageResult
    public final ImageRequest getRequest() {
        return this.request;
    }

    public final int hashCode() {
        int hashCode = (this.dataSource.hashCode() + ((this.request.hashCode() + (this.image.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.memoryCacheKey;
        int hashCode2 = (hashCode + (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode())) * 31;
        String str = this.diskCacheKey;
        return Boolean.hashCode(this.isPlaceholderCached) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSampled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.image);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", memoryCacheKey=");
        sb.append(this.memoryCacheKey);
        sb.append(", diskCacheKey=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.diskCacheKey, ", isSampled=", this.isSampled, ", isPlaceholderCached=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPlaceholderCached, ")");
    }
}
