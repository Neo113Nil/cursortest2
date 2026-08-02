package coil3.size;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface SizeResolver {
    public static final RealSizeResolver ORIGINAL = new RealSizeResolver(Size.ORIGINAL);

    Object size(Continuation continuation);
}
