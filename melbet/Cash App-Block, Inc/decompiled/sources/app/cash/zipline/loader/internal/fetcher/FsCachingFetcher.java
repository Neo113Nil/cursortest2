package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import app.cash.zipline.loader.ZiplineCache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class FsCachingFetcher implements Fetcher {
    public final ZiplineCache cache;
    public final CoroutineDispatcher cacheDispatcher;
    public final Fetcher delegate;

    public FsCachingFetcher(ZiplineCache ziplineCache, CoroutineDispatcher coroutineDispatcher, HttpFetcher httpFetcher) {
        ziplineCache.getClass();
        coroutineDispatcher.getClass();
        httpFetcher.getClass();
        this.cache = ziplineCache;
        this.cacheDispatcher = coroutineDispatcher;
        this.delegate = httpFetcher;
    }

    @Override // app.cash.zipline.loader.internal.fetcher.Fetcher
    public final Object fetch(String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.cacheDispatcher, new FsCachingFetcher$fetch$2(this, str, byteString, j, eventListener, str4, str2, str3, null), continuationImpl);
    }
}
