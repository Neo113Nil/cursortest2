package coil3.util;

import bo.app.zg$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public abstract class ServiceLoaderComponentRegistry {
    public static final Lazy fetchers$delegate = LazyKt.lazy(new zg$$ExternalSyntheticLambda0(11));
    public static final Lazy decoders$delegate = LazyKt.lazy(new zg$$ExternalSyntheticLambda0(12));

    public static List getDecoders() {
        return (List) decoders$delegate.getValue();
    }

    public static List getFetchers() {
        return (List) fetchers$delegate.getValue();
    }
}
