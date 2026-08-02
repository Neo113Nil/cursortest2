package coil3.request;

import android.content.Context;
import coil3.Extras;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* loaded from: classes3.dex */
public final class Options {
    public final Context context;
    public final String diskCacheKey;
    public final CachePolicy diskCachePolicy;
    public final Extras extras;
    public final FileSystem fileSystem;
    public final CachePolicy memoryCachePolicy;
    public final CachePolicy networkCachePolicy;
    public final Precision precision;
    public final Scale scale;
    public final Size size;

    public Options(Context context, Size size, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Extras extras) {
        this.context = context;
        this.size = size;
        this.scale = scale;
        this.precision = precision;
        this.diskCacheKey = str;
        this.fileSystem = fileSystem;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.extras = extras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return Intrinsics.areEqual(this.context, options.context) && Intrinsics.areEqual(this.size, options.size) && this.scale == options.scale && this.precision == options.precision && Intrinsics.areEqual(this.diskCacheKey, options.diskCacheKey) && Intrinsics.areEqual(this.fileSystem, options.fileSystem) && this.memoryCachePolicy == options.memoryCachePolicy && this.diskCachePolicy == options.diskCachePolicy && this.networkCachePolicy == options.networkCachePolicy && Intrinsics.areEqual(this.extras, options.extras);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Extras getExtras() {
        return this.extras;
    }

    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Size getSize() {
        return this.size;
    }

    public final int hashCode() {
        int hashCode = (this.precision.hashCode() + ((this.scale.hashCode() + ((this.size.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.diskCacheKey;
        return this.extras.data.hashCode() + ((this.networkCachePolicy.hashCode() + ((this.diskCachePolicy.hashCode() + ((this.memoryCachePolicy.hashCode() + ((this.fileSystem.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.context + ", size=" + this.size + ", scale=" + this.scale + ", precision=" + this.precision + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", extras=" + this.extras + ")";
    }
}
