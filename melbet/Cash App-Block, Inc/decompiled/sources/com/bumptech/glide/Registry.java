package com.bumptech.glide;

import androidx.camera.viewfinder.core.impl.quirk.Quirks;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.CoroutinesRoom;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry$Entry;
import com.bumptech.glide.provider.ResourceEncoderRegistry$Entry;
import com.bumptech.glide.util.Util;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import papa.InputEventTrigger;

/* loaded from: classes4.dex */
public final class Registry {
    public final InputStreamRewinder dataRewinderRegistry;
    public final CallResult decoderRegistry;
    public final EncoderRegistry encoderRegistry;
    public final Quirks imageHeaderParserRegistry;
    public final ModelLoaderRegistry modelLoaderRegistry;
    public final InputEventTrigger resourceEncoderRegistry;
    public final SVG throwableListPool;
    public final InputEventTrigger transcoderRegistry;
    public final AndroidSvg modelToResourceClassCache = new AndroidSvg(23);
    public final LoadPathCache loadPathCache = new LoadPathCache();

    public class MissingComponentException extends RuntimeException {
    }

    public final class NoImageHeaderParserException extends MissingComponentException {
    }

    public final class NoModelLoaderAvailableException extends MissingComponentException {
    }

    public final class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super(Boxes$$ExternalSyntheticOutline1.m(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    public final class NoSourceEncoderAvailableException extends MissingComponentException {
    }

    public Registry() {
        int i = 22;
        SVG svg = new SVG(16, new Pools$SynchronizedPool(20), new CueEncoder(i), new CoroutinesRoom.Companion(i));
        this.throwableListPool = svg;
        this.modelLoaderRegistry = new ModelLoaderRegistry(svg);
        this.encoderRegistry = new EncoderRegistry(0);
        this.decoderRegistry = new CallResult(28);
        this.resourceEncoderRegistry = new InputEventTrigger(2);
        this.dataRewinderRegistry = new InputStreamRewinder();
        this.transcoderRegistry = new InputEventTrigger(1);
        this.imageHeaderParserRegistry = new Quirks();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        CallResult callResult = this.decoderRegistry;
        synchronized (callResult) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) callResult.result);
                ((ArrayList) callResult.result).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) callResult.result).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) callResult.result).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void append(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        ModelLoaderRegistry modelLoaderRegistry = this.modelLoaderRegistry;
        synchronized (modelLoaderRegistry) {
            MultiModelLoaderFactory multiModelLoaderFactory = modelLoaderRegistry.multiModelLoaderFactory;
            synchronized (multiModelLoaderFactory) {
                try {
                    MultiModelLoaderFactory.Entry entry = new MultiModelLoaderFactory.Entry(cls, cls2, modelLoaderFactory);
                    ArrayList arrayList = multiModelLoaderFactory.entries;
                    arrayList.add(arrayList.size(), entry);
                } catch (Throwable th) {
                    throw th;
                }
            }
            modelLoaderRegistry.cache.values.clear();
        }
    }

    public final ArrayList getImageHeaderParsers() {
        ArrayList arrayList;
        Quirks quirks = this.imageHeaderParserRegistry;
        synchronized (quirks) {
            arrayList = quirks.quirks;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List getModelLoaders(Object obj) {
        List list;
        ModelLoaderRegistry modelLoaderRegistry = this.modelLoaderRegistry;
        modelLoaderRegistry.getClass();
        Class<?> cls = obj.getClass();
        synchronized (modelLoaderRegistry) {
            ModelLoaderRegistry$ModelLoaderCache$Entry modelLoaderRegistry$ModelLoaderCache$Entry = (ModelLoaderRegistry$ModelLoaderCache$Entry) modelLoaderRegistry.cache.values.get(cls);
            list = modelLoaderRegistry$ModelLoaderCache$Entry == null ? null : modelLoaderRegistry$ModelLoaderCache$Entry.loaders;
            if (list == null) {
                list = Collections.unmodifiableList(modelLoaderRegistry.multiModelLoaderFactory.build(cls));
                if (((ModelLoaderRegistry$ModelLoaderCache$Entry) modelLoaderRegistry.cache.values.put(cls, new ModelLoaderRegistry$ModelLoaderCache$Entry(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader modelLoader = (ModelLoader) list.get(i);
            if (modelLoader.handles(obj)) {
                if (z) {
                    list2 = new ArrayList(size - i);
                    z = false;
                }
                list2.add(modelLoader);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final DataRewinder getRewinder(Object obj) {
        DataRewinder build;
        InputStreamRewinder inputStreamRewinder = this.dataRewinderRegistry;
        synchronized (inputStreamRewinder) {
            try {
                Util.checkNotNull(obj);
                DataRewinder.Factory factory = (DataRewinder.Factory) ((HashMap) inputStreamRewinder.bufferedStream).get(obj.getClass());
                if (factory == null) {
                    Iterator it = ((HashMap) inputStreamRewinder.bufferedStream).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DataRewinder.Factory factory2 = (DataRewinder.Factory) it.next();
                        if (factory2.getDataClass().isAssignableFrom(obj.getClass())) {
                            factory = factory2;
                            break;
                        }
                    }
                }
                if (factory == null) {
                    factory = InputStreamRewinder.DEFAULT_FACTORY;
                }
                build = factory.build(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public final void register(DataRewinder.Factory factory) {
        InputStreamRewinder inputStreamRewinder = this.dataRewinderRegistry;
        synchronized (inputStreamRewinder) {
            ((HashMap) inputStreamRewinder.bufferedStream).put(factory.getDataClass(), factory);
        }
    }

    public final void register(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
        InputEventTrigger inputEventTrigger = this.transcoderRegistry;
        synchronized (inputEventTrigger) {
            inputEventTrigger.inputEventFrameRenderedCallbacks.add(new TranscoderRegistry$Entry(cls, cls2, resourceTranscoder));
        }
    }

    public final void append(String str, Class cls, Class cls2, ResourceDecoder resourceDecoder) {
        CallResult callResult = this.decoderRegistry;
        synchronized (callResult) {
            callResult.getOrAddEntryList(str).add(new ResourceDecoderRegistry$Entry(cls, cls2, resourceDecoder));
        }
    }

    public final void append(Class cls, ResourceEncoder resourceEncoder) {
        InputEventTrigger inputEventTrigger = this.resourceEncoderRegistry;
        synchronized (inputEventTrigger) {
            inputEventTrigger.inputEventFrameRenderedCallbacks.add(new ResourceEncoderRegistry$Entry(cls, resourceEncoder));
        }
    }

    public final void append(Class cls, Encoder encoder) {
        EncoderRegistry encoderRegistry = this.encoderRegistry;
        synchronized (encoderRegistry) {
            encoderRegistry.encoders.add(new EncoderRegistry.Entry(cls, encoder));
        }
    }
}
