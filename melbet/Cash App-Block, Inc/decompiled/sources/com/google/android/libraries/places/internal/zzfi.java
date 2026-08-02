package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import app.cash.zipline.CallResult;
import com.android.volley.CacheDispatcher;
import com.android.volley.NetworkDispatcher;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.tasks.zzb;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.ThreadFactoryBuilder$1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class zzfi implements zzboh {
    public static RequestQueue zza(Context context) {
        HurlStack hurlStack = new HurlStack(0);
        HttpResponse httpResponse = new HttpResponse();
        CallResult callResult = new CallResult();
        callResult.result = hurlStack;
        callResult.serviceNames = httpResponse;
        DiskBasedCache diskBasedCache = new DiskBasedCache(new CallResult(context.getApplicationContext(), 23));
        zzb zzbVar = new zzb(new Handler(Looper.getMainLooper()));
        RequestQueue requestQueue = new RequestQueue();
        requestQueue.mSequenceGenerator = new AtomicInteger();
        requestQueue.mCurrentRequests = new HashSet();
        requestQueue.mCacheQueue = new PriorityBlockingQueue();
        requestQueue.mNetworkQueue = new PriorityBlockingQueue();
        requestQueue.mFinishedListeners = new ArrayList();
        requestQueue.mEventListeners = new ArrayList();
        requestQueue.mCache = diskBasedCache;
        requestQueue.mNetwork = callResult;
        requestQueue.mDispatchers = new NetworkDispatcher[4];
        requestQueue.mDelivery = zzbVar;
        CacheDispatcher cacheDispatcher = (CacheDispatcher) requestQueue.mCacheDispatcher;
        if (cacheDispatcher != null) {
            cacheDispatcher.mQuit = true;
            cacheDispatcher.interrupt();
        }
        for (NetworkDispatcher networkDispatcher : (NetworkDispatcher[]) requestQueue.mDispatchers) {
            if (networkDispatcher != null) {
                networkDispatcher.mQuit = true;
                networkDispatcher.interrupt();
            }
        }
        CacheDispatcher cacheDispatcher2 = new CacheDispatcher((PriorityBlockingQueue) requestQueue.mCacheQueue, (PriorityBlockingQueue) requestQueue.mNetworkQueue, (DiskBasedCache) requestQueue.mCache, (zzb) requestQueue.mDelivery);
        requestQueue.mCacheDispatcher = cacheDispatcher2;
        cacheDispatcher2.start();
        for (int i = 0; i < ((NetworkDispatcher[]) requestQueue.mDispatchers).length; i++) {
            NetworkDispatcher networkDispatcher2 = new NetworkDispatcher((PriorityBlockingQueue) requestQueue.mNetworkQueue, (CallResult) requestQueue.mNetwork, (DiskBasedCache) requestQueue.mCache, (zzb) requestQueue.mDelivery);
            ((NetworkDispatcher[]) requestQueue.mDispatchers)[i] = networkDispatcher2;
            networkDispatcher2.start();
        }
        return requestQueue;
    }

    public static MoreExecutors$ScheduledListeningDecorator zzc() {
        Locale locale = Locale.ROOT;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(4, new ThreadFactoryBuilder$1(Executors.defaultThreadFactory(), "Maps Platform Background-%d", new AtomicLong(0L), null, 10));
        return newScheduledThreadPool instanceof MoreExecutors$ScheduledListeningDecorator ? (MoreExecutors$ScheduledListeningDecorator) newScheduledThreadPool : new MoreExecutors$ScheduledListeningDecorator(newScheduledThreadPool);
    }
}
