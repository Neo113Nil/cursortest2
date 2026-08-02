package com.bumptech.glide.load.engine;

import androidx.core.util.Pools$Pool;
import androidx.media3.extractor.mp4.BoxParser;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class EngineJob implements FactoryPools.Poolable {
    public static final HurlStack DEFAULT_FACTORY = new HurlStack(18);
    public final GlideExecutor animationExecutor;
    public int dataSource;
    public DecodeJob decodeJob;
    public final GlideExecutor diskCacheExecutor;
    public final Engine engineJobListener;
    public EngineResource engineResource;
    public GlideException exception;
    public boolean hasLoadFailed;
    public boolean hasResource;
    public boolean isCacheable;
    public volatile boolean isCancelled;
    public EngineKey key;
    public final Pools$Pool pool;
    public Resource resource;
    public final Engine resourceListener;
    public final GlideExecutor sourceExecutor;
    public boolean useAnimationPool;
    public final ResourceCallbacksAndExecutors cbs = new ResourceCallbacksAndExecutors(new ArrayList(2));
    public final StateVerifier$DefaultStateVerifier stateVerifier = new StateVerifier$DefaultStateVerifier();
    public final AtomicInteger pendingCallbacks = new AtomicInteger();
    public final HurlStack engineResourceFactory = DEFAULT_FACTORY;

    public final class CallLoadFailed implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final SingleRequest cb;
        public final /* synthetic */ EngineJob this$0;

        public /* synthetic */ CallLoadFailed(EngineJob engineJob, SingleRequest singleRequest, int i) {
            this.$r8$classId = i;
            this.this$0 = engineJob;
            this.cb = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CallbackException callbackException;
            switch (this.$r8$classId) {
                case 0:
                    SingleRequest singleRequest = this.cb;
                    singleRequest.stateVerifier.throwIfRecycled();
                    synchronized (singleRequest.requestLock) {
                        synchronized (this.this$0) {
                            try {
                                if (this.this$0.cbs.callbacksAndExecutors.contains(new ResourceCallbackAndExecutor(this.cb, Util.DIRECT_EXECUTOR))) {
                                    EngineJob engineJob = this.this$0;
                                    SingleRequest singleRequest2 = this.cb;
                                    engineJob.getClass();
                                    try {
                                        singleRequest2.onLoadFailed(engineJob.exception, 5);
                                    } finally {
                                    }
                                }
                                this.this$0.decrementPendingCallbacks();
                            } finally {
                            }
                        }
                    }
                    return;
                default:
                    SingleRequest singleRequest3 = this.cb;
                    singleRequest3.stateVerifier.throwIfRecycled();
                    synchronized (singleRequest3.requestLock) {
                        synchronized (this.this$0) {
                            try {
                                if (this.this$0.cbs.callbacksAndExecutors.contains(new ResourceCallbackAndExecutor(this.cb, Util.DIRECT_EXECUTOR))) {
                                    this.this$0.engineResource.acquire();
                                    EngineJob engineJob2 = this.this$0;
                                    SingleRequest singleRequest4 = this.cb;
                                    engineJob2.getClass();
                                    try {
                                        singleRequest4.onResourceReady(engineJob2.engineResource, engineJob2.dataSource);
                                        this.this$0.removeCallback$1(this.cb);
                                    } finally {
                                    }
                                }
                                this.this$0.decrementPendingCallbacks();
                            } finally {
                            }
                        }
                    }
                    return;
            }
        }
    }

    public final class ResourceCallbackAndExecutor {
        public final SingleRequest cb;
        public final Executor executor;

        public ResourceCallbackAndExecutor(SingleRequest singleRequest, Executor executor) {
            this.cb = singleRequest;
            this.executor = executor;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ResourceCallbackAndExecutor) && this.cb == ((ResourceCallbackAndExecutor) obj).cb;
        }

        public final int hashCode() {
            return this.cb.hashCode();
        }
    }

    public final class ResourceCallbacksAndExecutors implements Iterable {
        public final ArrayList callbacksAndExecutors;

        public ResourceCallbacksAndExecutors(ArrayList arrayList) {
            this.callbacksAndExecutors = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this.callbacksAndExecutors.iterator();
        }
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Engine engine, Engine engine2, SVG svg) {
        this.diskCacheExecutor = glideExecutor;
        this.sourceExecutor = glideExecutor2;
        this.animationExecutor = glideExecutor4;
        this.engineJobListener = engine;
        this.resourceListener = engine2;
        this.pool = svg;
    }

    public final synchronized void addCallback(SingleRequest singleRequest, Executor executor) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.callbacksAndExecutors.add(new ResourceCallbackAndExecutor(singleRequest, executor));
            int i = 1;
            if (this.hasResource) {
                incrementPendingCallbacks(1);
                executor.execute(new CallLoadFailed(this, singleRequest, i));
            } else if (this.hasLoadFailed) {
                incrementPendingCallbacks(1);
                executor.execute(new CallLoadFailed(this, singleRequest, 0));
            } else {
                Util.checkArgument("Cannot add callbacks to a cancelled EngineJob", !this.isCancelled);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void decrementPendingCallbacks() {
        EngineResource engineResource;
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                Util.checkArgument("Not yet complete!", isDone());
                int decrementAndGet = this.pendingCallbacks.decrementAndGet();
                Util.checkArgument("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    engineResource = this.engineResource;
                    release$1();
                } else {
                    engineResource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineResource != null) {
            engineResource.release$2();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier$DefaultStateVerifier getVerifier() {
        return this.stateVerifier;
    }

    public final synchronized void incrementPendingCallbacks(int i) {
        EngineResource engineResource;
        Util.checkArgument("Not yet complete!", isDone());
        if (this.pendingCallbacks.getAndAdd(i) == 0 && (engineResource = this.engineResource) != null) {
            engineResource.acquire();
        }
    }

    public final boolean isDone() {
        return this.hasLoadFailed || this.hasResource || this.isCancelled;
    }

    public final synchronized void release$1() {
        boolean isComplete;
        if (this.key == null) {
            throw new IllegalArgumentException();
        }
        this.cbs.callbacksAndExecutors.clear();
        this.key = null;
        this.engineResource = null;
        this.resource = null;
        this.hasLoadFailed = false;
        this.isCancelled = false;
        this.hasResource = false;
        DecodeJob decodeJob = this.decodeJob;
        BoxParser.StriData striData = decodeJob.releaseManager;
        synchronized (striData) {
            striData.hasLeftEyeView = true;
            isComplete = striData.isComplete();
        }
        if (isComplete) {
            decodeJob.releaseInternal();
        }
        this.decodeJob = null;
        this.exception = null;
        this.dataSource = 0;
        this.pool.release(this);
    }

    public final synchronized void removeCallback$1(SingleRequest singleRequest) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.callbacksAndExecutors.remove(new ResourceCallbackAndExecutor(singleRequest, Util.DIRECT_EXECUTOR));
            if (this.cbs.callbacksAndExecutors.isEmpty()) {
                if (!isDone()) {
                    this.isCancelled = true;
                    DecodeJob decodeJob = this.decodeJob;
                    decodeJob.isCancelled = true;
                    DataFetcherGenerator dataFetcherGenerator = decodeJob.currentGenerator;
                    if (dataFetcherGenerator != null) {
                        dataFetcherGenerator.cancel();
                    }
                    Engine engine = this.engineJobListener;
                    EngineKey engineKey = this.key;
                    synchronized (engine) {
                        Jobs jobs = engine.jobs;
                        jobs.getClass();
                        HashMap hashMap = jobs.jobs;
                        if (this == hashMap.get(engineKey)) {
                            hashMap.remove(engineKey);
                        }
                    }
                }
                if (!this.hasResource) {
                    if (this.hasLoadFailed) {
                    }
                }
                if (this.pendingCallbacks.get() == 0) {
                    release$1();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
