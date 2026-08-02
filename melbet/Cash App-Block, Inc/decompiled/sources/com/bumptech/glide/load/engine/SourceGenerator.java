package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class SourceGenerator implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {
    public final DecodeJob cb;
    public volatile Object dataToCache;
    public final DecodeHelper helper;
    public volatile ModelLoader.LoadData loadData;
    public volatile int loadDataListIndex;
    public volatile DataCacheKey originalKey;
    public volatile DataCacheGenerator sourceCacheGenerator;

    public SourceGenerator(DecodeHelper decodeHelper, DecodeJob decodeJob) {
        this.helper = decodeHelper;
        this.cb = decodeJob;
    }

    public final boolean cacheData(Object obj) {
        Throwable th;
        int i = LogTime.$r8$clinit;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            DataRewinder rewinder = this.helper.glideContext.getRegistry().getRewinder(obj);
            Object rewindAndGet = rewinder.rewindAndGet();
            Encoder sourceEncoder = this.helper.getSourceEncoder(rewindAndGet);
            SVG svg = new SVG(sourceEncoder, rewindAndGet, this.helper.options, false, 9);
            Key key = this.loadData.sourceKey;
            DecodeHelper decodeHelper = this.helper;
            DataCacheKey dataCacheKey = new DataCacheKey(key, decodeHelper.signature);
            DiskCache diskCache = decodeHelper.diskCacheProvider.getDiskCache();
            diskCache.put(dataCacheKey, svg);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dataCacheKey + ", data: " + obj + ", encoder: " + sourceEncoder + ", duration: " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
            }
            if (diskCache.get(dataCacheKey) != null) {
                this.originalKey = dataCacheKey;
                this.sourceCacheGenerator = new DataCacheGenerator(Collections.singletonList(this.loadData.sourceKey), this.helper, this);
                this.loadData.fetcher.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.originalKey + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.cb.onDataFetcherReady(this.loadData.sourceKey, rewinder.rewindAndGet(), this.loadData.fetcher, this.loadData.fetcher.getDataSource(), this.loadData.sourceKey);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.loadData.fetcher.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.loadData;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, int i) {
        this.cb.onDataFetcherFailed(key, exc, dataFetcher, this.loadData.fetcher.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, int i, Key key2) {
        this.cb.onDataFetcherReady(key, obj, dataFetcher, this.loadData.fetcher.getDataSource(), key);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (cacheData(r0) == false) goto L16;
     */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean startNext() {
        if (this.dataToCache != null) {
            Object obj = this.dataToCache;
            this.dataToCache = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.sourceCacheGenerator == null || !this.sourceCacheGenerator.startNext()) {
            this.sourceCacheGenerator = null;
            this.loadData = null;
            boolean z = false;
            while (!z && this.loadDataListIndex < this.helper.getLoadData().size()) {
                ArrayList loadData = this.helper.getLoadData();
                int i = this.loadDataListIndex;
                this.loadDataListIndex = i + 1;
                this.loadData = (ModelLoader.LoadData) loadData.get(i);
                if (this.loadData != null && (this.helper.diskCacheStrategy.isDataCacheable(this.loadData.fetcher.getDataSource()) || this.helper.getLoadPath(this.loadData.fetcher.getDataClass()) != null)) {
                    final ModelLoader.LoadData loadData2 = this.loadData;
                    this.loadData.fetcher.loadData(this.helper.priority, new DataFetcher.DataCallback() { // from class: com.bumptech.glide.load.engine.SourceGenerator.1
                        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
                        public final void onDataReady(Object obj2) {
                            SourceGenerator sourceGenerator = SourceGenerator.this;
                            ModelLoader.LoadData loadData3 = loadData2;
                            ModelLoader.LoadData loadData4 = sourceGenerator.loadData;
                            if (loadData4 == null || loadData4 != loadData3) {
                                return;
                            }
                            SourceGenerator sourceGenerator2 = SourceGenerator.this;
                            ModelLoader.LoadData loadData5 = loadData2;
                            DiskCacheStrategy$2 diskCacheStrategy$2 = sourceGenerator2.helper.diskCacheStrategy;
                            if (obj2 == null || !diskCacheStrategy$2.isDataCacheable(loadData5.fetcher.getDataSource())) {
                                DecodeJob decodeJob = sourceGenerator2.cb;
                                Key key = loadData5.sourceKey;
                                DataFetcher dataFetcher = loadData5.fetcher;
                                decodeJob.onDataFetcherReady(key, obj2, dataFetcher, dataFetcher.getDataSource(), sourceGenerator2.originalKey);
                                return;
                            }
                            sourceGenerator2.dataToCache = obj2;
                            DecodeJob decodeJob2 = sourceGenerator2.cb;
                            decodeJob2.runReason = 2;
                            EngineJob engineJob = decodeJob2.callback;
                            (engineJob.useAnimationPool ? engineJob.animationExecutor : engineJob.sourceExecutor).execute(decodeJob2);
                        }

                        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
                        public final void onLoadFailed(Exception exc) {
                            SourceGenerator sourceGenerator = SourceGenerator.this;
                            ModelLoader.LoadData loadData3 = loadData2;
                            ModelLoader.LoadData loadData4 = sourceGenerator.loadData;
                            if (loadData4 == null || loadData4 != loadData3) {
                                return;
                            }
                            SourceGenerator sourceGenerator2 = SourceGenerator.this;
                            ModelLoader.LoadData loadData5 = loadData2;
                            DecodeJob decodeJob = sourceGenerator2.cb;
                            DataCacheKey dataCacheKey = sourceGenerator2.originalKey;
                            DataFetcher dataFetcher = loadData5.fetcher;
                            decodeJob.onDataFetcherFailed(dataCacheKey, exc, dataFetcher, dataFetcher.getDataSource());
                        }
                    });
                    z = true;
                }
            }
            return z;
        }
        return true;
    }
}
