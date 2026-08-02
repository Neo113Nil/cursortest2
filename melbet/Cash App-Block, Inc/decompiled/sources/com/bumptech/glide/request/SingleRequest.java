package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.util.Executors$1;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.StateVerifier$DefaultStateVerifier;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SingleRequest implements Request {
    public static final boolean IS_VERBOSE_LOGGABLE = Log.isLoggable("GlideRequest", 2);
    public final NoTransition.NoAnimationFactory animationFactory;
    public final Executors$1 callbackExecutor;
    public volatile Engine engine;
    public Drawable errorDrawable;
    public Drawable fallbackDrawable;
    public final GlideContext glideContext;
    public int height;
    public boolean isCallingCallbacks;
    public SVG loadStatus;
    public final Object model;
    public final int overrideHeight;
    public final int overrideWidth;
    public Drawable placeholderDrawable;
    public final Priority priority;
    public final RequestCoordinator requestCoordinator;
    public final List requestListeners;
    public final Object requestLock;
    public final BaseRequestOptions requestOptions;
    public final RuntimeException requestOrigin;
    public Resource resource;
    public long startTime;
    public final StateVerifier$DefaultStateVerifier stateVerifier;
    public int status;
    public final String tag;
    public final Target target;
    public final Class transcodeClass;
    public int width;

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, BaseRequestOptions baseRequestOptions, int i, int i2, Priority priority, Target target, ArrayList arrayList, RequestCoordinator requestCoordinator, Engine engine, NoTransition.NoAnimationFactory noAnimationFactory) {
        Executors$1 executors$1 = Util.MAIN_THREAD_EXECUTOR;
        this.tag = IS_VERBOSE_LOGGABLE ? String.valueOf(hashCode()) : null;
        this.stateVerifier = new StateVerifier$DefaultStateVerifier();
        this.requestLock = obj;
        this.glideContext = glideContext;
        this.model = obj2;
        this.transcodeClass = cls;
        this.requestOptions = baseRequestOptions;
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.priority = priority;
        this.target = target;
        this.requestListeners = arrayList;
        this.requestCoordinator = requestCoordinator;
        this.engine = engine;
        this.animationFactory = noAnimationFactory;
        this.callbackExecutor = executors$1;
        this.status = 1;
        if (this.requestOrigin == null && ((Map) glideContext.experiments.a).containsKey(AppCompatHintHelper.class)) {
            this.requestOrigin = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001a, B:10:0x0024, B:11:0x0030, B:13:0x0034, B:14:0x003c, B:17:0x0041, B:18:0x004b, B:21:0x004d, B:25:0x0055, B:26:0x005a, B:28:0x005c, B:31:0x0078, B:33:0x0084, B:34:0x0091, B:37:0x00b0, B:39:0x00b4, B:40:0x00ce, B:42:0x0097, B:44:0x009b, B:49:0x00a7, B:51:0x008c, B:52:0x0061, B:53:0x0065, B:55:0x006b, B:59:0x0072, B:60:0x0077, B:62:0x00d0, B:63:0x00d7, B:64:0x00d8, B:65:0x00df), top: B:3:0x0003 }] */
    @Override // com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void begin() {
        boolean z;
        synchronized (this.requestLock) {
            try {
                if (this.isCallingCallbacks) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.stateVerifier.throwIfRecycled();
                int i = LogTime.$r8$clinit;
                this.startTime = SystemClock.elapsedRealtimeNanos();
                if (this.model == null) {
                    if (Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                        this.width = this.overrideWidth;
                        this.height = this.overrideHeight;
                    }
                    if (this.fallbackDrawable == null) {
                        this.requestOptions.getClass();
                        this.fallbackDrawable = null;
                    }
                    onLoadFailed(new GlideException("Received null model"), this.fallbackDrawable == null ? 5 : 3);
                    return;
                }
                int i2 = this.status;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    onResourceReady(this.resource, 5);
                    return;
                }
                List list = this.requestListeners;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.status = 3;
                if (Util.isValidDimensions(this.overrideWidth, this.overrideHeight)) {
                    onSizeReady(this.overrideWidth, this.overrideHeight);
                } else {
                    this.target.getSize(this);
                }
                int i3 = this.status;
                if (i3 == 2 || i3 == 3) {
                    RequestCoordinator requestCoordinator = this.requestCoordinator;
                    if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
                        z = false;
                        if (z) {
                            this.target.onLoadStarted(getPlaceholderDrawable());
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                if (IS_VERBOSE_LOGGABLE) {
                    logV("finished run method in " + LogTime.getElapsedMillis(this.startTime));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cancel() {
        if (this.isCallingCallbacks) {
            a$$ExternalSyntheticBUOutline0.m$1("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.stateVerifier.throwIfRecycled();
        this.target.removeCallback(this);
        SVG svg = this.loadStatus;
        if (svg != null) {
            synchronized (((Engine) svg.idToElementMap)) {
                ((EngineJob) svg.rootElement).removeCallback$1((SingleRequest) svg.cssRules);
            }
            this.loadStatus = null;
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.requestLock) {
            try {
                if (this.isCallingCallbacks) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.stateVerifier.throwIfRecycled();
                if (this.status == 6) {
                    return;
                }
                cancel();
                Resource resource = this.resource;
                if (resource != null) {
                    this.resource = null;
                } else {
                    resource = null;
                }
                RequestCoordinator requestCoordinator = this.requestCoordinator;
                if (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) {
                    this.target.onLoadCleared(getPlaceholderDrawable());
                }
                this.status = 6;
                if (resource != null) {
                    this.engine.getClass();
                    Engine.release(resource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable getPlaceholderDrawable() {
        if (this.placeholderDrawable == null) {
            this.requestOptions.getClass();
            this.placeholderDrawable = null;
        }
        return this.placeholderDrawable;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == 6;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.status == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        int i;
        int i2;
        Object obj;
        Class cls;
        BaseRequestOptions baseRequestOptions;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        BaseRequestOptions baseRequestOptions2;
        Priority priority2;
        int size2;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.requestLock) {
            try {
                i = this.overrideWidth;
                i2 = this.overrideHeight;
                obj = this.model;
                cls = this.transcodeClass;
                baseRequestOptions = this.requestOptions;
                priority = this.priority;
                List list = this.requestListeners;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.requestLock) {
            try {
                i3 = singleRequest.overrideWidth;
                i4 = singleRequest.overrideHeight;
                obj2 = singleRequest.model;
                cls2 = singleRequest.transcodeClass;
                baseRequestOptions2 = singleRequest.requestOptions;
                priority2 = singleRequest.priority;
                List list2 = singleRequest.requestListeners;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((baseRequestOptions == null ? baseRequestOptions2 == null : baseRequestOptions.isEquivalentTo(baseRequestOptions2)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.requestLock) {
            int i = this.status;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void logV(String str) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " this: ");
        m108m.append(this.tag);
        Log.v("GlideRequest", m108m.toString());
    }

    public final void onLoadFailed(GlideException glideException, int i) {
        Drawable drawable;
        this.stateVerifier.throwIfRecycled();
        synchronized (this.requestLock) {
            try {
                glideException.getClass();
                int i2 = this.glideContext.logLevel;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.model + "] with dimensions [" + this.width + "x" + this.height + "]", glideException);
                    if (i2 <= 4) {
                        glideException.logRootCauses();
                    }
                }
                this.loadStatus = null;
                this.status = 5;
                RequestCoordinator requestCoordinator = this.requestCoordinator;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestFailed(this);
                }
                boolean z = true;
                this.isCallingCallbacks = true;
                try {
                    List list = this.requestListeners;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            RequestCoordinator requestCoordinator2 = this.requestCoordinator;
                            if (requestCoordinator2 == null) {
                                throw null;
                            }
                            requestCoordinator2.getRoot().isAnyResourceSet();
                            throw null;
                        }
                    }
                    RequestCoordinator requestCoordinator3 = this.requestCoordinator;
                    if (requestCoordinator3 != null && !requestCoordinator3.canNotifyStatusChanged(this)) {
                        z = false;
                    }
                    if (this.model == null) {
                        if (this.fallbackDrawable == null) {
                            this.requestOptions.getClass();
                            this.fallbackDrawable = null;
                        }
                        drawable = this.fallbackDrawable;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.errorDrawable == null) {
                            this.requestOptions.getClass();
                            this.errorDrawable = null;
                        }
                        drawable = this.errorDrawable;
                    }
                    if (drawable == null) {
                        drawable = getPlaceholderDrawable();
                    }
                    this.target.onLoadFailed(drawable);
                } finally {
                    this.isCallingCallbacks = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onResourceReady(Resource resource, int i) {
        this.stateVerifier.throwIfRecycled();
        Resource resource2 = null;
        try {
            synchronized (this.requestLock) {
                try {
                    this.loadStatus = null;
                    if (resource == null) {
                        onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.transcodeClass + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = resource.get();
                    try {
                        if (obj != null && this.transcodeClass.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.requestCoordinator;
                            if (requestCoordinator == null || requestCoordinator.canSetImage(this)) {
                                onResourceReady(resource, obj, i);
                                return;
                            }
                            this.resource = null;
                            this.status = 4;
                            this.engine.getClass();
                            Engine.release(resource);
                        }
                        this.resource = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.transcodeClass);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(resource);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        onLoadFailed(new GlideException(sb.toString()), 5);
                        this.engine.getClass();
                        Engine.release(resource);
                    } catch (Throwable th) {
                        resource2 = resource;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (resource2 != null) {
                this.engine.getClass();
                Engine.release(resource2);
            }
            throw th3;
        }
    }

    public final void onSizeReady(int i, int i2) {
        Object obj;
        int i3 = i;
        this.stateVerifier.throwIfRecycled();
        Object obj2 = this.requestLock;
        synchronized (obj2) {
            try {
                try {
                    boolean z = IS_VERBOSE_LOGGABLE;
                    if (z) {
                        logV("Got onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
                    }
                    if (this.status != 3) {
                        return;
                    }
                    this.status = 2;
                    this.requestOptions.getClass();
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(i3 * 1.0f);
                    }
                    this.width = i3;
                    this.height = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        logV("finished setup for calling load in " + LogTime.getElapsedMillis(this.startTime));
                    }
                    Engine engine = this.engine;
                    GlideContext glideContext = this.glideContext;
                    Object obj3 = this.model;
                    BaseRequestOptions baseRequestOptions = this.requestOptions;
                    try {
                        try {
                            try {
                                try {
                                    this.loadStatus = engine.load(glideContext, obj3, baseRequestOptions.signature, this.width, this.height, baseRequestOptions.resourceClass, this.transcodeClass, this.priority, baseRequestOptions.diskCacheStrategy, baseRequestOptions.transformations, baseRequestOptions.isTransformationRequired, baseRequestOptions.isScaleOnlyOrNoTransform, baseRequestOptions.options, baseRequestOptions.isCacheable, baseRequestOptions.useAnimationPool, this, this.callbackExecutor);
                                    if (this.status != 2) {
                                        this.loadStatus = null;
                                    }
                                    if (z) {
                                        logV("finished onSizeReady in " + LogTime.getElapsedMillis(this.startTime));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.requestLock) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.requestLock) {
            obj = this.model;
            cls = this.transcodeClass;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    public final void onResourceReady(Resource resource, Object obj, int i) {
        RequestCoordinator requestCoordinator = this.requestCoordinator;
        if (requestCoordinator != null) {
            requestCoordinator.getRoot().isAnyResourceSet();
        }
        this.status = 4;
        this.resource = resource;
        if (this.glideContext.logLevel <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + Thread$State$EnumUnboxingLocalUtility.stringValueOf(i) + " for " + this.model + " with size [" + this.width + "x" + this.height + "] in " + LogTime.getElapsedMillis(this.startTime) + " ms");
        }
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
        this.isCallingCallbacks = true;
        try {
            List list = this.requestListeners;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            this.animationFactory.getClass();
            this.target.onResourceReady(obj);
            this.isCallingCallbacks = false;
        } catch (Throwable th) {
            this.isCallingCallbacks = false;
            throw th;
        }
    }
}
