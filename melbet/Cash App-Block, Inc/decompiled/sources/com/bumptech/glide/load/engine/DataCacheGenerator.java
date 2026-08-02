package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public final class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback {
    public File cacheFile;
    public final List cacheKeys;
    public final DataFetcherGenerator.FetcherReadyCallback cb;
    public final DecodeHelper helper;
    public volatile ModelLoader.LoadData loadData;
    public int modelLoaderIndex;
    public List modelLoaders;
    public int sourceIdIndex = -1;
    public Key sourceKey;

    public DataCacheGenerator(List list, DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.cacheKeys = list;
        this.helper = decodeHelper;
        this.cb = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.loadData;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        this.cb.onDataFetcherReady(this.sourceKey, obj, this.loadData.fetcher, 3, this.sourceKey);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        this.cb.onDataFetcherFailed(this.sourceKey, exc, this.loadData.fetcher, 3);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        while (true) {
            List list = this.modelLoaders;
            boolean z = false;
            if (list != null && this.modelLoaderIndex < list.size()) {
                this.loadData = null;
                while (!z && this.modelLoaderIndex < this.modelLoaders.size()) {
                    List list2 = this.modelLoaders;
                    int i = this.modelLoaderIndex;
                    this.modelLoaderIndex = i + 1;
                    ModelLoader modelLoader = (ModelLoader) list2.get(i);
                    File file = this.cacheFile;
                    DecodeHelper decodeHelper = this.helper;
                    this.loadData = modelLoader.buildLoadData(file, decodeHelper.width, decodeHelper.height, decodeHelper.options);
                    if (this.loadData != null && this.helper.getLoadPath(this.loadData.fetcher.getDataClass()) != null) {
                        this.loadData.fetcher.loadData(this.helper.priority, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.sourceIdIndex + 1;
            this.sourceIdIndex = i2;
            if (i2 >= this.cacheKeys.size()) {
                return false;
            }
            Key key = (Key) this.cacheKeys.get(this.sourceIdIndex);
            DecodeHelper decodeHelper2 = this.helper;
            File file2 = decodeHelper2.diskCacheProvider.getDiskCache().get(new DataCacheKey(key, decodeHelper2.signature));
            this.cacheFile = file2;
            if (file2 != null) {
                this.sourceKey = key;
                this.modelLoaders = this.helper.glideContext.getRegistry().getModelLoaders(file2);
                this.modelLoaderIndex = 0;
            }
        }
    }
}
