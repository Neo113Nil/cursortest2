package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.camera.video.VideoCapture;
import com.bugsnag.android.Client;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.DefaultConnectivityMonitor;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.NullConnectivityMonitor;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import com.squareup.util.Strings;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class RequestManager implements ComponentCallbacks2, LifecycleListener {
    public static final RequestOptions DECODE_TYPE_BITMAP;
    public final Client.AnonymousClass7 addSelfToLifecycle;
    public final ConnectivityMonitor connectivityMonitor;
    public final Context context;
    public final CopyOnWriteArrayList defaultRequestListeners;
    public final Glide glide;
    public final Lifecycle lifecycle;
    public final RequestOptions requestOptions;
    public final VideoCapture.AnonymousClass3 requestTracker;
    public final TargetTracker targetTracker;
    public final RequestManagerTreeNode treeNode;

    public final class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {
        public final VideoCapture.AnonymousClass3 requestTracker;

        public RequestManagerConnectivityListener(VideoCapture.AnonymousClass3 anonymousClass3) {
            this.requestTracker = anonymousClass3;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    VideoCapture.AnonymousClass3 anonymousClass3 = this.requestTracker;
                    Iterator it = Util.getSnapshot((Set) anonymousClass3.val$surfaceUpdateFuture).iterator();
                    while (it.hasNext()) {
                        Request request = (Request) it.next();
                        if (!request.isComplete() && !request.isCleared()) {
                            request.clear();
                            if (anonymousClass3.val$isStreamActive) {
                                ((HashSet) anonymousClass3.this$0).add(request);
                            } else {
                                request.begin();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        RequestOptions requestOptions = (RequestOptions) new RequestOptions().decode(Bitmap.class);
        requestOptions.isLocked = true;
        DECODE_TYPE_BITMAP = requestOptions;
        ((RequestOptions) new RequestOptions().decode(GifDrawable.class)).isLocked = true;
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        RequestOptions requestOptions;
        VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3(7);
        GlideBuilder$1 glideBuilder$1 = glide.connectivityMonitorFactory;
        this.targetTracker = new TargetTracker();
        Client.AnonymousClass7 anonymousClass7 = new Client.AnonymousClass7(this, 15);
        this.addSelfToLifecycle = anonymousClass7;
        this.glide = glide;
        this.lifecycle = lifecycle;
        this.treeNode = requestManagerTreeNode;
        this.requestTracker = anonymousClass3;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        RequestManagerConnectivityListener requestManagerConnectivityListener = new RequestManagerConnectivityListener(anonymousClass3);
        glideBuilder$1.getClass();
        boolean z = Strings.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ConnectivityMonitor defaultConnectivityMonitor = z ? new DefaultConnectivityMonitor(applicationContext, requestManagerConnectivityListener) : new NullConnectivityMonitor();
        this.connectivityMonitor = defaultConnectivityMonitor;
        synchronized (glide.managers) {
            if (glide.managers.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.managers.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lifecycle.addListener(this);
        } else {
            Util.getUiThreadHandler().post(anonymousClass7);
        }
        lifecycle.addListener(defaultConnectivityMonitor);
        this.defaultRequestListeners = new CopyOnWriteArrayList(glide.glideContext.defaultRequestListeners);
        GlideContext glideContext = glide.glideContext;
        synchronized (glideContext) {
            try {
                if (glideContext.defaultRequestOptions == null) {
                    glideContext.defaultRequestOptionsFactory.getClass();
                    RequestOptions requestOptions2 = new RequestOptions();
                    requestOptions2.isLocked = true;
                    glideContext.defaultRequestOptions = requestOptions2;
                }
                requestOptions = glideContext.defaultRequestOptions;
            } finally {
            }
        }
        synchronized (this) {
            RequestOptions requestOptions3 = (RequestOptions) requestOptions.mo1909clone();
            if (requestOptions3.isLocked && !requestOptions3.isAutoCloneEnabled) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            requestOptions3.isAutoCloneEnabled = true;
            requestOptions3.isLocked = true;
            this.requestOptions = requestOptions3;
        }
    }

    public final void clear(Target target) {
        if (target == null) {
            return;
        }
        boolean untrack = untrack(target);
        Request request = target.getRequest();
        if (untrack) {
            return;
        }
        Glide glide = this.glide;
        synchronized (glide.managers) {
            try {
                Iterator it = glide.managers.iterator();
                while (it.hasNext()) {
                    if (((RequestManager) it.next()).untrack(target)) {
                        return;
                    }
                }
                if (request != null) {
                    target.setRequest(null);
                    request.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void clearRequests() {
        try {
            Iterator it = Util.getSnapshot(this.targetTracker.targets).iterator();
            while (it.hasNext()) {
                clear((Target) it.next());
            }
            this.targetTracker.targets.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        clearRequests();
        VideoCapture.AnonymousClass3 anonymousClass3 = this.requestTracker;
        Iterator it = Util.getSnapshot((Set) anonymousClass3.val$surfaceUpdateFuture).iterator();
        while (it.hasNext()) {
            anonymousClass3.clearAndRemove((Request) it.next());
        }
        ((HashSet) anonymousClass3.this$0).clear();
        this.lifecycle.removeListener(this);
        this.lifecycle.removeListener(this.connectivityMonitor);
        Util.getUiThreadHandler().removeCallbacks(this.addSelfToLifecycle);
        Glide glide = this.glide;
        synchronized (glide.managers) {
            if (!glide.managers.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            glide.managers.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStop() {
        this.targetTracker.onStop();
        pauseRequests();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized void pauseRequests() {
        VideoCapture.AnonymousClass3 anonymousClass3 = this.requestTracker;
        anonymousClass3.val$isStreamActive = true;
        Iterator it = Util.getSnapshot((Set) anonymousClass3.val$surfaceUpdateFuture).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (request.isRunning()) {
                request.pause();
                ((HashSet) anonymousClass3.this$0).add(request);
            }
        }
    }

    public final synchronized void resumeRequests() {
        VideoCapture.AnonymousClass3 anonymousClass3 = this.requestTracker;
        anonymousClass3.val$isStreamActive = false;
        Iterator it = Util.getSnapshot((Set) anonymousClass3.val$surfaceUpdateFuture).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        ((HashSet) anonymousClass3.this$0).clear();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public final synchronized boolean untrack(Target target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.clearAndRemove(request)) {
            return false;
        }
        this.targetTracker.targets.remove(target);
        target.setRequest(null);
        return true;
    }
}
