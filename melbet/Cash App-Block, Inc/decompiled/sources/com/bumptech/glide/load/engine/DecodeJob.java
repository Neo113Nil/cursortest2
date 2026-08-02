package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.core.util.Pools$Pool;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.extractor.mp4.BoxParser;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier;
import com.caverock.androidsvg.SVG;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class DecodeJob implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable, FactoryPools.Poolable {
    public EngineJob callback;
    public Key currentAttemptingKey;
    public Object currentData;
    public int currentDataSource;
    public DataFetcher currentFetcher;
    public volatile DataFetcherGenerator currentGenerator;
    public Key currentSourceKey;
    public Thread currentThread;
    public final ViewTargetDisposable diskCacheProvider;
    public DiskCacheStrategy$2 diskCacheStrategy;
    public GlideContext glideContext;
    public int height;
    public volatile boolean isCallbackNotified;
    public volatile boolean isCancelled;
    public boolean isLoadingFromAlternateCacheKey;
    public EngineKey loadKey;
    public Object model;
    public Options options;
    public int order;
    public final Pools$Pool pool;
    public Priority priority;
    public int runReason;
    public Key signature;
    public int stage;
    public long startFetchTime;
    public int width;
    public final DecodeHelper decodeHelper = new DecodeHelper();
    public final ArrayList throwables = new ArrayList();
    public final StateVerifier$DefaultStateVerifier stateVerifier = new StateVerifier$DefaultStateVerifier();
    public final SVG deferredEncodeManager = new SVG(10);
    public final BoxParser.StriData releaseManager = new BoxParser.StriData();

    public DecodeJob(ViewTargetDisposable viewTargetDisposable, SVG svg) {
        this.diskCacheProvider = viewTargetDisposable;
        this.pool = svg;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        DecodeJob decodeJob = (DecodeJob) obj;
        int ordinal = this.priority.ordinal() - decodeJob.priority.ordinal();
        return ordinal == 0 ? this.order - decodeJob.order : ordinal;
    }

    public final Resource decodeFromData(DataFetcher dataFetcher, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = LogTime.$r8$clinit;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Resource decodeFromFetcher = decodeFromFetcher(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                logWithTimeAndKey(elapsedRealtimeNanos, "Decoded result " + decodeFromFetcher, null);
            }
            return decodeFromFetcher;
        } finally {
            dataFetcher.cleanup();
        }
    }

    public final Resource decodeFromFetcher(int i, Object obj) {
        Class<?> cls = obj.getClass();
        DecodeHelper decodeHelper = this.decodeHelper;
        LoadPath loadPath = decodeHelper.getLoadPath(cls);
        Options options = this.options;
        boolean z = i == 4 || decodeHelper.isScaleOnlyOrNoTransform;
        Option option = Downsampler.ALLOW_HARDWARE_CONFIG;
        Boolean bool = (Boolean) options.get(option);
        if (bool == null || (bool.booleanValue() && !z)) {
            options = new Options();
            CachedHashCodeArrayMap cachedHashCodeArrayMap = this.options.values;
            CachedHashCodeArrayMap cachedHashCodeArrayMap2 = options.values;
            cachedHashCodeArrayMap2.putAll((ArrayMap) cachedHashCodeArrayMap);
            cachedHashCodeArrayMap2.put(option, Boolean.valueOf(z));
        }
        Options options2 = options;
        DataRewinder rewinder = this.glideContext.getRegistry().getRewinder(obj);
        try {
            return loadPath.load(this.width, this.height, new Sniffer(this, i, 8), options2, rewinder);
        } finally {
            rewinder.cleanup();
        }
    }

    public final void decodeFromRetrievedData() {
        Resource resource;
        boolean isComplete;
        if (Log.isLoggable("DecodeJob", 2)) {
            logWithTimeAndKey(this.startFetchTime, "Retrieved data", "data: " + this.currentData + ", cache key: " + this.currentSourceKey + ", fetcher: " + this.currentFetcher);
        }
        LockedResource lockedResource = null;
        try {
            resource = decodeFromData(this.currentFetcher, this.currentData, this.currentDataSource);
        } catch (GlideException e) {
            Key key = this.currentAttemptingKey;
            int i = this.currentDataSource;
            e.key = key;
            e.dataSource = i;
            e.dataClass = null;
            this.throwables.add(e);
            resource = null;
        }
        if (resource == null) {
            runGenerators();
            return;
        }
        int i2 = this.currentDataSource;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
        int i3 = 1;
        if (((LockedResource) this.deferredEncodeManager.idToElementMap) != null) {
            lockedResource = (LockedResource) LockedResource.POOL.acquire();
            lockedResource.isRecycled = false;
            lockedResource.isLocked = true;
            lockedResource.toWrap = resource;
            resource = lockedResource;
        }
        setNotifiedOrThrow();
        EngineJob engineJob = this.callback;
        synchronized (engineJob) {
            engineJob.resource = resource;
            engineJob.dataSource = i2;
        }
        synchronized (engineJob) {
            try {
                engineJob.stateVerifier.throwIfRecycled();
                if (engineJob.isCancelled) {
                    engineJob.resource.recycle();
                    engineJob.release$1();
                } else {
                    if (engineJob.cbs.callbacksAndExecutors.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (engineJob.hasResource) {
                        throw new IllegalStateException("Already have resource");
                    }
                    HurlStack hurlStack = engineJob.engineResourceFactory;
                    Resource resource2 = engineJob.resource;
                    boolean z = engineJob.isCacheable;
                    EngineKey engineKey = engineJob.key;
                    Engine engine = engineJob.resourceListener;
                    hurlStack.getClass();
                    engineJob.engineResource = new EngineResource(resource2, z, true, engineKey, engine);
                    engineJob.hasResource = true;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.cbs;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.callbacksAndExecutors);
                    engineJob.incrementPendingCallbacks(arrayList.size() + 1);
                    engineJob.engineJobListener.onEngineJobComplete(engineJob, engineJob.key, engineJob.engineResource);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor = (EngineJob.ResourceCallbackAndExecutor) it.next();
                        resourceCallbackAndExecutor.executor.execute(new EngineJob.CallLoadFailed(engineJob, resourceCallbackAndExecutor.cb, i3));
                    }
                    engineJob.decrementPendingCallbacks();
                }
            } finally {
            }
        }
        this.stage = 5;
        try {
            SVG svg = this.deferredEncodeManager;
            if (((LockedResource) svg.idToElementMap) != null) {
                try {
                    this.diskCacheProvider.getDiskCache().put((Key) svg.rootElement, new SVG((ResourceEncoder) svg.cssRules, (LockedResource) svg.idToElementMap, this.options, false, 9));
                    ((LockedResource) svg.idToElementMap).unlock();
                } catch (Throwable th) {
                    ((LockedResource) svg.idToElementMap).unlock();
                    throw th;
                }
            }
            if (lockedResource != null) {
                lockedResource.unlock();
            }
            BoxParser.StriData striData = this.releaseManager;
            synchronized (striData) {
                striData.hasRightEyeView = true;
                isComplete = striData.isComplete();
            }
            if (isComplete) {
                releaseInternal();
            }
        } finally {
        }
    }

    public final DataFetcherGenerator getNextGenerator() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.stage);
        DecodeHelper decodeHelper = this.decodeHelper;
        if (ordinal == 1) {
            return new ResourceCacheGenerator(decodeHelper, this);
        }
        if (ordinal == 2) {
            return new DataCacheGenerator(decodeHelper.getCacheKeys(), decodeHelper, this);
        }
        if (ordinal == 3) {
            return new SourceGenerator(decodeHelper, this);
        }
        if (ordinal == 5) {
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unrecognized stage: ".concat(Thread$State$EnumUnboxingLocalUtility.stringValueOf$3(this.stage)));
        return null;
    }

    public final int getNextStage(int i) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        boolean z = false;
        if (ordinal == 0) {
            switch (this.diskCacheStrategy.$r8$classId) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return getNextStage(2);
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 4;
            }
            if (ordinal == 3 || ordinal == 5) {
                return 6;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Unrecognized stage: ".concat(Thread$State$EnumUnboxingLocalUtility.stringValueOf$3(i)));
            return 0;
        }
        switch (this.diskCacheStrategy.$r8$classId) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return getNextStage(3);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier$DefaultStateVerifier getVerifier() {
        return this.stateVerifier;
    }

    public final void logWithTimeAndKey(long j, String str, String str2) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " in ");
        m108m.append(LogTime.getElapsedMillis(j));
        m108m.append(", load key: ");
        m108m.append(this.loadKey);
        m108m.append(str2 != null ? ", ".concat(str2) : "");
        m108m.append(", thread: ");
        m108m.append(Thread.currentThread().getName());
        Log.v("DecodeJob", m108m.toString());
    }

    public final void notifyFailed() {
        boolean isComplete;
        setNotifiedOrThrow();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.throwables));
        EngineJob engineJob = this.callback;
        synchronized (engineJob) {
            engineJob.exception = glideException;
        }
        synchronized (engineJob) {
            try {
                engineJob.stateVerifier.throwIfRecycled();
                if (engineJob.isCancelled) {
                    engineJob.release$1();
                } else {
                    if (engineJob.cbs.callbacksAndExecutors.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (engineJob.hasLoadFailed) {
                        throw new IllegalStateException("Already failed once");
                    }
                    engineJob.hasLoadFailed = true;
                    EngineKey engineKey = engineJob.key;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.cbs;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.callbacksAndExecutors);
                    engineJob.incrementPendingCallbacks(arrayList.size() + 1);
                    engineJob.engineJobListener.onEngineJobComplete(engineJob, engineKey, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor = (EngineJob.ResourceCallbackAndExecutor) it.next();
                        resourceCallbackAndExecutor.executor.execute(new EngineJob.CallLoadFailed(engineJob, resourceCallbackAndExecutor.cb, 0));
                    }
                    engineJob.decrementPendingCallbacks();
                }
            } finally {
            }
        }
        BoxParser.StriData striData = this.releaseManager;
        synchronized (striData) {
            striData.eyeViewsReversed = true;
            isComplete = striData.isComplete();
        }
        if (isComplete) {
            releaseInternal();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, int i) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class dataClass = dataFetcher.getDataClass();
        glideException.key = key;
        glideException.dataSource = i;
        glideException.dataClass = dataClass;
        this.throwables.add(glideException);
        if (Thread.currentThread() == this.currentThread) {
            runGenerators();
            return;
        }
        this.runReason = 2;
        EngineJob engineJob = this.callback;
        (engineJob.useAnimationPool ? engineJob.animationExecutor : engineJob.sourceExecutor).execute(this);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, int i, Key key2) {
        this.currentSourceKey = key;
        this.currentData = obj;
        this.currentFetcher = dataFetcher;
        this.currentDataSource = i;
        this.currentAttemptingKey = key2;
        this.isLoadingFromAlternateCacheKey = key != this.decodeHelper.getCacheKeys().get(0);
        if (Thread.currentThread() == this.currentThread) {
            decodeFromRetrievedData();
            return;
        }
        this.runReason = 3;
        EngineJob engineJob = this.callback;
        (engineJob.useAnimationPool ? engineJob.animationExecutor : engineJob.sourceExecutor).execute(this);
    }

    public final void releaseInternal() {
        BoxParser.StriData striData = this.releaseManager;
        synchronized (striData) {
            striData.hasRightEyeView = false;
            striData.hasLeftEyeView = false;
            striData.eyeViewsReversed = false;
        }
        SVG svg = this.deferredEncodeManager;
        svg.rootElement = null;
        svg.cssRules = null;
        svg.idToElementMap = null;
        DecodeHelper decodeHelper = this.decodeHelper;
        decodeHelper.glideContext = null;
        decodeHelper.model = null;
        decodeHelper.signature = null;
        decodeHelper.resourceClass = null;
        decodeHelper.transcodeClass = null;
        decodeHelper.options = null;
        decodeHelper.priority = null;
        decodeHelper.transformations = null;
        decodeHelper.diskCacheStrategy = null;
        decodeHelper.loadData.clear();
        decodeHelper.isLoadDataSet = false;
        decodeHelper.cacheKeys.clear();
        decodeHelper.isCacheKeysSet = false;
        this.isCallbackNotified = false;
        this.glideContext = null;
        this.signature = null;
        this.options = null;
        this.priority = null;
        this.loadKey = null;
        this.callback = null;
        this.stage = 0;
        this.currentGenerator = null;
        this.currentThread = null;
        this.currentSourceKey = null;
        this.currentData = null;
        this.currentDataSource = 0;
        this.currentFetcher = null;
        this.startFetchTime = 0L;
        this.isCancelled = false;
        this.model = null;
        this.throwables.clear();
        this.pool.release(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataFetcher dataFetcher = this.currentFetcher;
        try {
            try {
                if (this.isCancelled) {
                    notifyFailed();
                    if (dataFetcher != null) {
                        dataFetcher.cleanup();
                        return;
                    }
                    return;
                }
                runWrapped();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
            } catch (Throwable th) {
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                throw th;
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.isCancelled + ", stage: " + Thread$State$EnumUnboxingLocalUtility.stringValueOf$3(this.stage), th2);
            }
            if (this.stage != 5) {
                this.throwables.add(th2);
                notifyFailed();
            }
            if (!this.isCancelled) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void runGenerators() {
        this.currentThread = Thread.currentThread();
        int i = LogTime.$r8$clinit;
        this.startFetchTime = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.isCancelled && this.currentGenerator != null && !(z = this.currentGenerator.startNext())) {
            this.stage = getNextStage(this.stage);
            this.currentGenerator = getNextGenerator();
            if (this.stage == 4) {
                this.runReason = 2;
                EngineJob engineJob = this.callback;
                (engineJob.useAnimationPool ? engineJob.animationExecutor : engineJob.sourceExecutor).execute(this);
                return;
            }
        }
        if ((this.stage == 6 || this.isCancelled) && !z) {
            notifyFailed();
        }
    }

    public final void runWrapped() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.runReason);
        if (ordinal == 0) {
            this.stage = getNextStage(1);
            this.currentGenerator = getNextGenerator();
            runGenerators();
        } else if (ordinal == 1) {
            runGenerators();
        } else if (ordinal == 2) {
            decodeFromRetrievedData();
        } else {
            int i = this.runReason;
            a$$ExternalSyntheticBUOutline0.m$1("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void setNotifiedOrThrow() {
        this.stateVerifier.throwIfRecycled();
        if (this.isCallbackNotified) {
            a$$ExternalSyntheticBUOutline0.m("Already notified", this.throwables.isEmpty() ? null : (Throwable) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, this.throwables));
        } else {
            this.isCallbackNotified = true;
        }
    }
}
