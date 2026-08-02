package com.bumptech.glide.load.engine;

import androidx.collection.ArrayMap;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.util.MultiClassKey;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback {
    public File cacheFile;
    public final DecodeJob cb;
    public ResourceCacheKey currentKey;
    public final DecodeHelper helper;
    public volatile ModelLoader.LoadData loadData;
    public int modelLoaderIndex;
    public List modelLoaders;
    public int resourceClassIndex = -1;
    public int sourceIdIndex;
    public Key sourceKey;

    public ResourceCacheGenerator(DecodeHelper decodeHelper, DecodeJob decodeJob) {
        this.helper = decodeHelper;
        this.cb = decodeJob;
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
        this.cb.onDataFetcherReady(this.sourceKey, obj, this.loadData.fetcher, 4, this.currentKey);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        this.cb.onDataFetcherFailed(this.currentKey, exc, this.loadData.fetcher, 4);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        List list;
        ArrayList dataClasses;
        ArrayList cacheKeys = this.helper.getCacheKeys();
        boolean z = false;
        if (!cacheKeys.isEmpty()) {
            DecodeHelper decodeHelper = this.helper;
            Registry registry = decodeHelper.glideContext.getRegistry();
            Class<?> cls = decodeHelper.model.getClass();
            Class cls2 = decodeHelper.resourceClass;
            Class cls3 = decodeHelper.transcodeClass;
            AndroidSvg androidSvg = registry.modelToResourceClassCache;
            MultiClassKey multiClassKey = (MultiClassKey) ((AtomicReference) androidSvg.svg).getAndSet(null);
            if (multiClassKey == null) {
                multiClassKey = new MultiClassKey(cls, cls2, cls3);
            } else {
                multiClassKey.first = cls;
                multiClassKey.second = cls2;
                multiClassKey.third = cls3;
            }
            synchronized (((ArrayMap) androidSvg.renderOptions)) {
                list = (List) ((ArrayMap) androidSvg.renderOptions).get(multiClassKey);
            }
            ((AtomicReference) androidSvg.svg).set(multiClassKey);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                ModelLoaderRegistry modelLoaderRegistry = registry.modelLoaderRegistry;
                synchronized (modelLoaderRegistry) {
                    dataClasses = modelLoaderRegistry.multiModelLoaderFactory.getDataClasses(cls);
                }
                Iterator it = dataClasses.iterator();
                while (it.hasNext()) {
                    Iterator it2 = registry.decoderRegistry.getResourceClasses((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!registry.transcoderRegistry.getTranscodeClasses(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                AndroidSvg androidSvg2 = registry.modelToResourceClassCache;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((ArrayMap) androidSvg2.renderOptions)) {
                    ((ArrayMap) androidSvg2.renderOptions).put(new MultiClassKey(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.modelLoaders;
                    if (list3 != null && this.modelLoaderIndex < list3.size()) {
                        this.loadData = null;
                        while (!z && this.modelLoaderIndex < this.modelLoaders.size()) {
                            List list4 = this.modelLoaders;
                            int i = this.modelLoaderIndex;
                            this.modelLoaderIndex = i + 1;
                            ModelLoader modelLoader = (ModelLoader) list4.get(i);
                            File file = this.cacheFile;
                            DecodeHelper decodeHelper2 = this.helper;
                            this.loadData = modelLoader.buildLoadData(file, decodeHelper2.width, decodeHelper2.height, decodeHelper2.options);
                            if (this.loadData != null && this.helper.getLoadPath(this.loadData.fetcher.getDataClass()) != null) {
                                this.loadData.fetcher.loadData(this.helper.priority, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.resourceClassIndex + 1;
                    this.resourceClassIndex = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.sourceIdIndex + 1;
                        this.sourceIdIndex = i3;
                        if (i3 >= cacheKeys.size()) {
                            break;
                        }
                        this.resourceClassIndex = 0;
                    }
                    Key key = (Key) cacheKeys.get(this.sourceIdIndex);
                    Class cls5 = (Class) list2.get(this.resourceClassIndex);
                    Transformation transformation = this.helper.getTransformation(cls5);
                    DecodeHelper decodeHelper3 = this.helper;
                    this.currentKey = new ResourceCacheKey(decodeHelper3.glideContext.arrayPool, key, decodeHelper3.signature, decodeHelper3.width, decodeHelper3.height, transformation, cls5, decodeHelper3.options);
                    File file2 = decodeHelper3.diskCacheProvider.getDiskCache().get(this.currentKey);
                    this.cacheFile = file2;
                    if (file2 != null) {
                        this.sourceKey = key;
                        this.modelLoaders = this.helper.glideContext.getRegistry().getModelLoaders(file2);
                        this.modelLoaderIndex = 0;
                    }
                }
            } else if (!File.class.equals(this.helper.transcodeClass)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.helper.model.getClass());
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(sb, " to ", this.helper.transcodeClass);
                return false;
            }
        }
        return false;
    }
}
