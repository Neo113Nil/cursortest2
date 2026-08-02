package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import app.cash.zipline.CallResult;
import com.android.volley.toolbox.DiskBasedCache;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.tasks.zzb;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class NetworkDispatcher extends Thread {
    public final DiskBasedCache mCache;
    public final zzb mDelivery;
    public final CallResult mNetwork;
    public final BlockingQueue mQueue;
    public volatile boolean mQuit = false;

    public NetworkDispatcher(PriorityBlockingQueue priorityBlockingQueue, CallResult callResult, DiskBasedCache diskBasedCache, zzb zzbVar) {
        this.mQueue = priorityBlockingQueue;
        this.mNetwork = callResult;
        this.mCache = diskBasedCache;
        this.mDelivery = zzbVar;
    }

    private void processRequest() {
        Cache$Entry cache$Entry;
        Request request = (Request) this.mQueue.take();
        zzb zzbVar = this.mDelivery;
        SystemClock.elapsedRealtime();
        request.sendEvent();
        int i = 2;
        Object obj = null;
        try {
            try {
                request.addMarker("network-queue-take");
                if (request.isCanceled()) {
                    request.finish("network-discard-cancelled");
                    request.notifyListenerResponseNotUsable();
                    return;
                }
                TrafficStats.setThreadStatsTag(request.mDefaultTrafficStatsTag);
                NetworkResponse performRequest = this.mNetwork.performRequest(request);
                request.addMarker("network-http-complete");
                if (performRequest.notModified && request.hasHadResponseDelivered()) {
                    request.finish("not-modified");
                    request.notifyListenerResponseNotUsable();
                    return;
                }
                Response parseNetworkResponse = request.parseNetworkResponse(performRequest);
                request.addMarker("network-parse-complete");
                if (request.mShouldCache && (cache$Entry = (Cache$Entry) parseNetworkResponse.cacheEntry) != null) {
                    this.mCache.put(request.mUrl, cache$Entry);
                    request.addMarker("network-cache-written");
                }
                synchronized (request.mLock) {
                    request.mResponseDelivered = true;
                }
                zzbVar.postResponse(request, parseNetworkResponse, null);
                request.notifyListenerResponseReceived(parseNetworkResponse);
            } catch (VolleyError e) {
                SystemClock.elapsedRealtime();
                zzbVar.getClass();
                request.addMarker("post-error");
                ((ExecutorDelivery$1) zzbVar.zza).execute(new Fillr.AnonymousClass2(i, request, new Response(e), obj));
                request.notifyListenerResponseNotUsable();
            } catch (Exception e2) {
                Log.e("Volley", VolleyLog.buildMessage("Unhandled exception %s", e2.toString()), e2);
                VolleyError volleyError = new VolleyError(e2);
                SystemClock.elapsedRealtime();
                zzbVar.getClass();
                request.addMarker("post-error");
                ((ExecutorDelivery$1) zzbVar.zza).execute(new Fillr.AnonymousClass2(i, request, new Response(volleyError), obj));
                request.notifyListenerResponseNotUsable();
            }
        } finally {
            request.sendEvent();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.mQuit) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
