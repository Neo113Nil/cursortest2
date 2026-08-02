package com.bumptech.glide.load.engine;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry$Entry;
import com.bumptech.glide.util.MultiClassKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import papa.InputEventTrigger;

/* loaded from: classes4.dex */
public final class DecodeHelper {
    public ViewTargetDisposable diskCacheProvider;
    public DiskCacheStrategy$2 diskCacheStrategy;
    public GlideContext glideContext;
    public int height;
    public boolean isCacheKeysSet;
    public boolean isLoadDataSet;
    public boolean isScaleOnlyOrNoTransform;
    public boolean isTransformationRequired;
    public Object model;
    public Options options;
    public Priority priority;
    public Class resourceClass;
    public Key signature;
    public Class transcodeClass;
    public Map transformations;
    public int width;
    public final ArrayList loadData = new ArrayList();
    public final ArrayList cacheKeys = new ArrayList();

    public final ArrayList getCacheKeys() {
        boolean z = this.isCacheKeysSet;
        ArrayList arrayList = this.cacheKeys;
        if (!z) {
            this.isCacheKeysSet = true;
            arrayList.clear();
            ArrayList loadData = getLoadData();
            int size = loadData.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData loadData2 = (ModelLoader.LoadData) loadData.get(i);
                Key key = loadData2.sourceKey;
                List list = loadData2.alternateKeys;
                if (!arrayList.contains(key)) {
                    arrayList.add(loadData2.sourceKey);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList getLoadData() {
        boolean z = this.isLoadDataSet;
        ArrayList arrayList = this.loadData;
        if (!z) {
            this.isLoadDataSet = true;
            arrayList.clear();
            List modelLoaders = this.glideContext.getRegistry().getModelLoaders(this.model);
            int size = modelLoaders.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData buildLoadData = ((ModelLoader) modelLoaders.get(i)).buildLoadData(this.model, this.width, this.height, this.options);
                if (buildLoadData != null) {
                    arrayList.add(buildLoadData);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LoadPath getLoadPath(Class cls) {
        LoadPath loadPath;
        Class cls2;
        Class cls3;
        Class cls4;
        LoadPath loadPath2;
        ArrayList arrayList;
        ResourceTranscoder resourceTranscoder;
        Class cls5 = cls;
        Registry registry = this.glideContext.getRegistry();
        Class cls6 = this.resourceClass;
        Class cls7 = this.transcodeClass;
        LoadPathCache loadPathCache = registry.loadPathCache;
        MultiClassKey multiClassKey = (MultiClassKey) loadPathCache.keyRef.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey();
        }
        multiClassKey.first = cls5;
        multiClassKey.second = cls6;
        multiClassKey.third = cls7;
        synchronized (loadPathCache.cache) {
            loadPath = (LoadPath) loadPathCache.cache.get(multiClassKey);
        }
        loadPathCache.keyRef.set(multiClassKey);
        registry.loadPathCache.getClass();
        if (LoadPathCache.NO_PATHS_SIGNAL.equals(loadPath)) {
            return null;
        }
        if (loadPath != null) {
            return loadPath;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = registry.decoderRegistry.getResourceClasses(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = registry.transcoderRegistry.getTranscodeClasses(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                CallResult callResult = registry.decoderRegistry;
                synchronized (callResult) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) callResult.result).iterator();
                    while (it3.hasNext()) {
                        List<ResourceDecoderRegistry$Entry> list = (List) ((HashMap) callResult.serviceNames).get((String) it3.next());
                        if (list != null) {
                            for (ResourceDecoderRegistry$Entry resourceDecoderRegistry$Entry : list) {
                                if (resourceDecoderRegistry$Entry.dataClass.isAssignableFrom(cls5) && cls8.isAssignableFrom(resourceDecoderRegistry$Entry.resourceClass)) {
                                    arrayList.add(resourceDecoderRegistry$Entry.decoder);
                                }
                            }
                        }
                    }
                }
                InputEventTrigger inputEventTrigger = registry.transcoderRegistry;
                synchronized (inputEventTrigger) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = inputEventTrigger.inputEventFrameRenderedCallbacks.iterator();
                        while (it4.hasNext()) {
                            TranscoderRegistry$Entry transcoderRegistry$Entry = (TranscoderRegistry$Entry) it4.next();
                            if (transcoderRegistry$Entry.fromClass.isAssignableFrom(cls8) && cls9.isAssignableFrom(transcoderRegistry$Entry.toClass)) {
                                resourceTranscoder = transcoderRegistry$Entry.transcoder;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    resourceTranscoder = UnitTranscoder.UNIT_TRANSCODER;
                }
                arrayList2.add(new DecodePath(cls5, cls8, cls9, arrayList, resourceTranscoder, registry.throwableListPool));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            loadPath2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            loadPath2 = new LoadPath(cls2, cls3, cls4, arrayList2, registry.throwableListPool);
        }
        LoadPathCache loadPathCache2 = registry.loadPathCache;
        synchronized (loadPathCache2.cache) {
            loadPathCache2.cache.put(new MultiClassKey(cls2, cls3, cls4), loadPath2 != null ? loadPath2 : LoadPathCache.NO_PATHS_SIGNAL);
        }
        return loadPath2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r0 = r2.encoder;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Encoder getSourceEncoder(Object obj) {
        Encoder encoder;
        EncoderRegistry encoderRegistry = this.glideContext.getRegistry().encoderRegistry;
        Class<?> cls = obj.getClass();
        synchronized (encoderRegistry) {
            Iterator it = encoderRegistry.encoders.iterator();
            while (true) {
                if (!it.hasNext()) {
                    encoder = null;
                    break;
                }
                EncoderRegistry.Entry entry = (EncoderRegistry.Entry) it.next();
                if (entry.dataClass.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (encoder != null) {
            return encoder;
        }
        throw new Registry.NoSourceEncoderAvailableException(Boxes$$ExternalSyntheticOutline1.m((Class) obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final Transformation getTransformation(Class cls) {
        Transformation transformation = (Transformation) this.transformations.get(cls);
        if (transformation == null) {
            Iterator it = this.transformations.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.transformations.isEmpty() || !this.isTransformationRequired) {
            return UnitTransformation.TRANSFORMATION;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        return null;
    }
}
