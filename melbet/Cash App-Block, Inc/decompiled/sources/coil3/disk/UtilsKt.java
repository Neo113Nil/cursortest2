package coil3.disk;

import bo.app.zg$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    public static final Lazy instance$delegate = LazyKt.lazy(new zg$$ExternalSyntheticLambda0(9));

    public static final RealDiskCache singletonDiskCache() {
        return (RealDiskCache) instance$delegate.getValue();
    }
}
