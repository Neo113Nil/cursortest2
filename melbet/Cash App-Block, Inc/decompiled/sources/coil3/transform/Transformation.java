package coil3.transform;

import android.graphics.Bitmap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.Size;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public abstract class Transformation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Transformation) && Intrinsics.areEqual(getCacheKey(), ((Transformation) obj).getCacheKey());
    }

    public abstract String getCacheKey();

    public final int hashCode() {
        return getCacheKey().hashCode();
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(Reflection.factory.getOrCreateKotlinClass(getClass()).getSimpleName(), "(cacheKey=", getCacheKey(), ")");
    }

    public abstract Bitmap transform(Bitmap bitmap, Size size);
}
