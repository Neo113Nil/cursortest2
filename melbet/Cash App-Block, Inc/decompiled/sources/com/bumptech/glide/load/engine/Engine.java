package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.FlagSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import coil3.request.ViewTargetDisposable;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Executors$1;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.pool.FactoryPools;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class Engine {
    public static final boolean VERBOSE_IS_LOGGABLE = Log.isLoggable("Engine", 2);
    public final UnleashContext activeResources;
    public final LruResourceCache cache;
    public final HuffmanTreeGroup decodeJobFactory;
    public final SubtreeManager engineJobFactory;
    public final Jobs jobs;
    public final GlideBuilder$1 keyFactory;
    public final FlagSet.Builder resourceRecycler;

    public Engine(LruResourceCache lruResourceCache, OneShotDisposable oneShotDisposable, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4) {
        this.cache = lruResourceCache;
        ViewTargetDisposable viewTargetDisposable = new ViewTargetDisposable(oneShotDisposable);
        UnleashContext unleashContext = new UnleashContext(10);
        this.activeResources = unleashContext;
        synchronized (this) {
            synchronized (unleashContext) {
                unleashContext.remoteAddress = this;
            }
        }
        this.keyFactory = new GlideBuilder$1();
        this.jobs = new Jobs(0);
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.children = FactoryPools.threadSafe(150, new OneShotDisposable(subtreeManager, 2));
        subtreeManager.snapshotCache = glideExecutor;
        subtreeManager.contextForChildren = glideExecutor2;
        subtreeManager.emitActionToParent = glideExecutor3;
        subtreeManager.workflowSession = glideExecutor4;
        subtreeManager.interceptor = this;
        subtreeManager.idCounter = this;
        this.engineJobFactory = subtreeManager;
        this.decodeJobFactory = new HuffmanTreeGroup(viewTargetDisposable);
        this.resourceRecycler = new FlagSet.Builder(5);
        lruResourceCache.listener = this;
    }

    public static void logWithTimeAndKey(String str, long j, EngineKey engineKey) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " in ");
        m108m.append(LogTime.getElapsedMillis(j));
        m108m.append("ms, key: ");
        m108m.append(engineKey);
        Log.v("Engine", m108m.toString());
    }

    public static void release(Resource resource) {
        if (resource instanceof EngineResource) {
            ((EngineResource) resource).release$2();
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot release anything but an EngineResource");
        }
    }

    public final SVG load(GlideContext glideContext, Object obj, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy$2 diskCacheStrategy$2, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z, boolean z2, Options options, boolean z3, boolean z4, SingleRequest singleRequest, Executors$1 executors$1) {
        long j;
        if (VERBOSE_IS_LOGGABLE) {
            int i3 = LogTime.$r8$clinit;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.keyFactory.getClass();
        EngineKey engineKey = new EngineKey(obj, key, i, i2, cachedHashCodeArrayMap, cls, cls2, options);
        synchronized (this) {
            try {
                EngineResource loadFromMemory = loadFromMemory(engineKey, z3, j);
                if (loadFromMemory == null) {
                    return waitForExistingOrStartNewJob(glideContext, obj, key, i, i2, cls, cls2, priority, diskCacheStrategy$2, cachedHashCodeArrayMap, z, z2, options, z3, z4, singleRequest, executors$1, engineKey, j);
                }
                singleRequest.onResourceReady(loadFromMemory, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EngineResource loadFromMemory(EngineKey engineKey, boolean z, long j) {
        EngineResource engineResource;
        Object obj;
        Engine engine;
        EngineKey engineKey2;
        EngineResource engineResource2;
        if (z) {
            UnleashContext unleashContext = this.activeResources;
            synchronized (unleashContext) {
                ActiveResources$ResourceWeakReference activeResources$ResourceWeakReference = (ActiveResources$ResourceWeakReference) ((HashMap) unleashContext.properties).get(engineKey);
                if (activeResources$ResourceWeakReference == null) {
                    engineResource = null;
                } else {
                    engineResource = (EngineResource) activeResources$ResourceWeakReference.get();
                    if (engineResource == null) {
                        unleashContext.cleanupActiveReference(activeResources$ResourceWeakReference);
                    }
                }
            }
            if (engineResource != null) {
                engineResource.acquire();
            }
            if (engineResource != null) {
                if (VERBOSE_IS_LOGGABLE) {
                    logWithTimeAndKey("Loaded resource from active resources", j, engineKey);
                }
                return engineResource;
            }
            LruResourceCache lruResourceCache = this.cache;
            synchronized (lruResourceCache) {
                LruCache.Entry entry = (LruCache.Entry) ((LinkedHashMap) lruResourceCache.cache).remove(engineKey);
                if (entry == null) {
                    obj = null;
                } else {
                    lruResourceCache.currentSize -= entry.size;
                    obj = entry.value;
                }
            }
            Resource resource = (Resource) obj;
            if (resource == null) {
                engine = this;
                engineKey2 = engineKey;
                engineResource2 = null;
            } else if (resource instanceof EngineResource) {
                engineResource2 = (EngineResource) resource;
                engine = this;
                engineKey2 = engineKey;
            } else {
                engine = this;
                engineKey2 = engineKey;
                engineResource2 = new EngineResource(resource, true, true, engineKey2, engine);
            }
            if (engineResource2 != null) {
                engineResource2.acquire();
                engine.activeResources.activate(engineKey2, engineResource2);
            }
            if (engineResource2 != null) {
                if (VERBOSE_IS_LOGGABLE) {
                    logWithTimeAndKey("Loaded resource from cache", j, engineKey2);
                }
                return engineResource2;
            }
        }
        return null;
    }

    public final synchronized void onEngineJobComplete(EngineJob engineJob, EngineKey engineKey, EngineResource engineResource) {
        if (engineResource != null) {
            try {
                if (engineResource.isMemoryCacheable) {
                    this.activeResources.activate(engineKey, engineResource);
                }
            } finally {
            }
        }
        Jobs jobs = this.jobs;
        jobs.getClass();
        engineJob.getClass();
        HashMap hashMap = jobs.jobs;
        if (engineJob == hashMap.get(engineKey)) {
            hashMap.remove(engineKey);
        }
    }

    public final void onResourceReleased(Key key, EngineResource engineResource) {
        UnleashContext unleashContext = this.activeResources;
        synchronized (unleashContext) {
            ActiveResources$ResourceWeakReference activeResources$ResourceWeakReference = (ActiveResources$ResourceWeakReference) ((HashMap) unleashContext.properties).remove(key);
            if (activeResources$ResourceWeakReference != null) {
                activeResources$ResourceWeakReference.resource = null;
                activeResources$ResourceWeakReference.clear();
            }
        }
        if (engineResource.isMemoryCacheable) {
        } else {
            this.resourceRecycler.recycle(engineResource, false);
        }
    }

    public final SVG waitForExistingOrStartNewJob(GlideContext glideContext, Object obj, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy$2 diskCacheStrategy$2, Map map, boolean z, boolean z2, Options options, boolean z3, boolean z4, SingleRequest singleRequest, Executor executor, EngineKey engineKey, long j) {
        GlideExecutor glideExecutor;
        EngineJob engineJob = (EngineJob) this.jobs.jobs.get(engineKey);
        if (engineJob != null) {
            engineJob.addCallback(singleRequest, executor);
            if (VERBOSE_IS_LOGGABLE) {
                logWithTimeAndKey("Added to existing load", j, engineKey);
            }
            return new SVG(this, singleRequest, engineJob);
        }
        EngineJob engineJob2 = (EngineJob) ((SVG) this.engineJobFactory.children).acquire();
        synchronized (engineJob2) {
            engineJob2.key = engineKey;
            engineJob2.isCacheable = z3;
            engineJob2.useAnimationPool = z4;
        }
        HuffmanTreeGroup huffmanTreeGroup = this.decodeJobFactory;
        DecodeJob decodeJob = (DecodeJob) ((SVG) huffmanTreeGroup.trees).acquire();
        int i3 = huffmanTreeGroup.alphabetSize;
        huffmanTreeGroup.alphabetSize = i3 + 1;
        DecodeHelper decodeHelper = decodeJob.decodeHelper;
        ViewTargetDisposable viewTargetDisposable = decodeJob.diskCacheProvider;
        decodeHelper.glideContext = glideContext;
        decodeHelper.model = obj;
        decodeHelper.signature = key;
        decodeHelper.width = i;
        decodeHelper.height = i2;
        decodeHelper.diskCacheStrategy = diskCacheStrategy$2;
        decodeHelper.resourceClass = cls;
        decodeHelper.diskCacheProvider = viewTargetDisposable;
        decodeHelper.transcodeClass = cls2;
        decodeHelper.priority = priority;
        decodeHelper.options = options;
        decodeHelper.transformations = map;
        decodeHelper.isTransformationRequired = z;
        decodeHelper.isScaleOnlyOrNoTransform = z2;
        decodeJob.glideContext = glideContext;
        decodeJob.signature = key;
        decodeJob.priority = priority;
        decodeJob.loadKey = engineKey;
        decodeJob.width = i;
        decodeJob.height = i2;
        decodeJob.diskCacheStrategy = diskCacheStrategy$2;
        decodeJob.options = options;
        decodeJob.callback = engineJob2;
        decodeJob.order = i3;
        decodeJob.runReason = 1;
        decodeJob.model = obj;
        Jobs jobs = this.jobs;
        jobs.getClass();
        jobs.jobs.put(engineKey, engineJob2);
        engineJob2.addCallback(singleRequest, executor);
        synchronized (engineJob2) {
            engineJob2.decodeJob = decodeJob;
            int nextStage = decodeJob.getNextStage(1);
            if (nextStage != 2 && nextStage != 3) {
                glideExecutor = engineJob2.useAnimationPool ? engineJob2.animationExecutor : engineJob2.sourceExecutor;
                glideExecutor.execute(decodeJob);
            }
            glideExecutor = engineJob2.diskCacheExecutor;
            glideExecutor.execute(decodeJob);
        }
        if (VERBOSE_IS_LOGGABLE) {
            logWithTimeAndKey("Started new load", j, engineKey);
        }
        return new SVG(this, singleRequest, engineJob2);
    }
}
