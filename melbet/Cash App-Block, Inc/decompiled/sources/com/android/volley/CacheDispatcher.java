package com.android.volley;

import android.os.Process;
import androidx.emoji2.text.MetadataRepo;
import com.android.volley.toolbox.DiskBasedCache;
import com.bugsnag.android.Client;
import com.google.android.gms.tasks.zzb;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class CacheDispatcher extends Thread {
    public static final boolean DEBUG = VolleyLog.DEBUG;
    public final DiskBasedCache mCache;
    public final BlockingQueue mCacheQueue;
    public final zzb mDelivery;
    public final BlockingQueue mNetworkQueue;
    public volatile boolean mQuit = false;
    public final MetadataRepo mWaitingRequestManager;

    public CacheDispatcher(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, DiskBasedCache diskBasedCache, zzb zzbVar) {
        this.mCacheQueue = priorityBlockingQueue;
        this.mNetworkQueue = priorityBlockingQueue2;
        this.mCache = diskBasedCache;
        this.mDelivery = zzbVar;
        MetadataRepo metadataRepo = new MetadataRepo();
        metadataRepo.mMetadataList = new HashMap();
        metadataRepo.mEmojiCharArray = zzbVar;
        metadataRepo.mRootNode = this;
        metadataRepo.mTypeface = priorityBlockingQueue2;
        this.mWaitingRequestManager = metadataRepo;
    }

    private void processRequest() {
        Request request = (Request) this.mCacheQueue.take();
        request.addMarker("cache-queue-take");
        request.sendEvent();
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
                return;
            }
            Cache$Entry cache$Entry = this.mCache.get(request.mUrl);
            if (cache$Entry == null) {
                request.addMarker("cache-miss");
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                    this.mNetworkQueue.put(request);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            if (cache$Entry.ttl < currentTimeMillis) {
                request.addMarker("cache-hit-expired");
                request.mCacheEntry = cache$Entry;
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                    this.mNetworkQueue.put(request);
                }
                return;
            }
            request.addMarker("cache-hit");
            Response parseNetworkResponse = request.parseNetworkResponse(new NetworkResponse(cache$Entry.data, cache$Entry.responseHeaders));
            request.addMarker("cache-hit-parsed");
            if (((VolleyError) parseNetworkResponse.error) == null) {
                if (cache$Entry.softTtl < currentTimeMillis) {
                    request.addMarker("cache-hit-refresh-needed");
                    request.mCacheEntry = cache$Entry;
                    parseNetworkResponse.intermediate = true;
                    boolean maybeAddToWaitingRequests = this.mWaitingRequestManager.maybeAddToWaitingRequests(request);
                    zzb zzbVar = this.mDelivery;
                    if (maybeAddToWaitingRequests) {
                        zzbVar.postResponse(request, parseNetworkResponse, null);
                    } else {
                        zzbVar.postResponse(request, parseNetworkResponse, new Client.AnonymousClass4(this, request, z, 10));
                    }
                } else {
                    this.mDelivery.postResponse(request, parseNetworkResponse, null);
                }
                return;
            }
            request.addMarker("cache-parsing-failed");
            DiskBasedCache diskBasedCache = this.mCache;
            String str = request.mUrl;
            synchronized (diskBasedCache) {
                Cache$Entry cache$Entry2 = diskBasedCache.get(str);
                if (cache$Entry2 != null) {
                    cache$Entry2.softTtl = 0L;
                    cache$Entry2.ttl = 0L;
                    diskBasedCache.put(str, cache$Entry2);
                }
            }
            request.mCacheEntry = null;
            if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                this.mNetworkQueue.put(request);
            }
        } finally {
            request.sendEvent();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (DEBUG) {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.mCache.initialize();
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.mQuit) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
