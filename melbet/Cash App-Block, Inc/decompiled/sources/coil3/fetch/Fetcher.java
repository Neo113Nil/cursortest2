package coil3.fetch;

import coil3.RealImageLoader;
import coil3.intercept.EngineInterceptor$fetch$1;
import coil3.request.Options;

/* loaded from: classes3.dex */
public interface Fetcher {

    /* loaded from: classes.dex */
    public interface Factory {
        Fetcher create(Object obj, Options options, RealImageLoader realImageLoader);
    }

    Object fetch(EngineInterceptor$fetch$1 engineInterceptor$fetch$1);
}
