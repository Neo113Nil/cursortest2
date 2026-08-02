package coil3.decode;

import coil3.RealImageLoader;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface Decoder {

    public interface Factory {
        Decoder create(SourceFetchResult sourceFetchResult, Options options, RealImageLoader realImageLoader);
    }

    Object decode(Continuation continuation);
}
