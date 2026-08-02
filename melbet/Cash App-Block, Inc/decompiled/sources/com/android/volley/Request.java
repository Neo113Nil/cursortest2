package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.VolleyLog;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzpv;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzi;
import com.google.android.libraries.places.internal.zzli;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class Request implements Comparable {
    public Cache$Entry mCacheEntry;
    public boolean mCanceled;
    public final int mDefaultTrafficStatsTag;
    public zzli mErrorListener;
    public final VolleyLog.MarkerLog mEventLog;
    public final Object mLock;
    public MetadataRepo mRequestCompleteListener;
    public RequestQueue mRequestQueue;
    public boolean mResponseDelivered;
    public DefaultRetryPolicy mRetryPolicy;
    public Integer mSequence;
    public final boolean mShouldCache;
    public final String mUrl;

    public Request(String str, zzli zzliVar) {
        Uri parse;
        String host;
        this.mEventLog = VolleyLog.MarkerLog.ENABLED ? new VolleyLog.MarkerLog() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        int i = 0;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mCacheEntry = null;
        this.mUrl = str;
        this.mErrorListener = zzliVar;
        this.mRetryPolicy = new DefaultRetryPolicy(1.0f, 2500, 1);
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.mDefaultTrafficStatsTag = i;
    }

    public final void addMarker(String str) {
        if (VolleyLog.MarkerLog.ENABLED) {
            this.mEventLog.add(Thread.currentThread().getId(), str);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int ordinal;
        int ordinal2;
        Request request = (Request) obj;
        int priority = getPriority();
        int priority2 = request.getPriority();
        if (priority == priority2) {
            ordinal = this.mSequence.intValue();
            ordinal2 = request.mSequence.intValue();
        } else {
            ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(priority2);
            ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(priority);
        }
        return ordinal - ordinal2;
    }

    public abstract void deliverResponse(Object obj);

    public final void finish(String str) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            synchronized (((HashSet) requestQueue.mCurrentRequests)) {
                ((HashSet) requestQueue.mCurrentRequests).remove(this);
            }
            synchronized (((ArrayList) requestQueue.mFinishedListeners)) {
                Iterator it = ((ArrayList) requestQueue.mFinishedListeners).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            requestQueue.sendRequestEvent();
        }
        if (VolleyLog.MarkerLog.ENABLED) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new AnonymousClass1(this, str, id));
            } else {
                this.mEventLog.add(id, str);
                this.mEventLog.finish(toString());
            }
        }
    }

    public abstract Map getHeaders();

    public int getPriority() {
        return 2;
    }

    public final boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public final void notifyListenerResponseNotUsable() {
        MetadataRepo metadataRepo;
        synchronized (this.mLock) {
            metadataRepo = this.mRequestCompleteListener;
        }
        if (metadataRepo != null) {
            metadataRepo.onNoUsableResponseReceived(this);
        }
    }

    public final void notifyListenerResponseReceived(Response response) {
        MetadataRepo metadataRepo;
        List list;
        synchronized (this.mLock) {
            metadataRepo = this.mRequestCompleteListener;
        }
        if (metadataRepo != null) {
            Cache$Entry cache$Entry = (Cache$Entry) response.cacheEntry;
            if (cache$Entry != null) {
                if (cache$Entry.ttl >= System.currentTimeMillis()) {
                    String str = this.mUrl;
                    synchronized (metadataRepo) {
                        list = (List) ((HashMap) metadataRepo.mMetadataList).remove(str);
                    }
                    if (list != null) {
                        if (VolleyLog.DEBUG) {
                            VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zzb) metadataRepo.mEmojiCharArray).postResponse((Request) it.next(), response, null);
                        }
                        return;
                    }
                    return;
                }
            }
            metadataRepo.onNoUsableResponseReceived(this);
        }
    }

    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);

    public final void sendEvent() {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.sendRequestEvent();
        }
    }

    public final String toString() {
        String m = Recorder$$ExternalSyntheticOutline1.m(this.mDefaultTrafficStatsTag, new StringBuilder("0x"));
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.mUrl, " ", m, " ");
        int priority = getPriority();
        sb.append(priority != 1 ? priority != 2 ? priority != 3 ? priority != 4 ? "null" : "IMMEDIATE" : "HIGH" : "NORMAL" : "LOW");
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    /* renamed from: com.android.volley.Request$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ Object val$tag;
        public final /* synthetic */ long val$threadId;

        public AnonymousClass1(zzmb zzmbVar, zzlu zzluVar, long j) {
            this.val$tag = zzluVar;
            this.val$threadId = j;
            Objects.requireNonNull(zzmbVar);
            this.this$0 = zzmbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            long j = this.val$threadId;
            Object obj = this.val$tag;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    Request request = (Request) obj2;
                    VolleyLog.MarkerLog markerLog = request.mEventLog;
                    markerLog.add(j, (String) obj);
                    markerLog.finish(request.toString());
                    break;
                case 1:
                    ((zzpv) obj).run();
                    MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) obj2;
                    moreExecutors$ScheduledListeningDecorator.getClass();
                    TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(Executors.callable(this, null));
                    zzh.zza((ListenableFuture) new MoreExecutors$ScheduledListeningDecorator.ListenableScheduledTask(trustedListenableFutureTask, moreExecutors$ScheduledListeningDecorator.delegate.schedule(trustedListenableFutureTask, j, TimeUnit.MINUTES)));
                    break;
                default:
                    zzmb zzmbVar = (zzmb) obj2;
                    zzmbVar.zzy((zzlu) obj, false, j);
                    zzmbVar.zza = null;
                    zznl zzt = ((zzic) zzmbVar.$$delegate_0).zzt();
                    zzt.zzg();
                    zzt.zzb$1();
                    zzt.zzaf(new zzi(zzt, (zzlu) null));
                    break;
            }
        }

        public AnonymousClass1(zzqi zzqiVar, zzpv zzpvVar, MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator, long j) {
            this.val$tag = zzpvVar;
            this.this$0 = moreExecutors$ScheduledListeningDecorator;
            this.val$threadId = j;
        }

        public AnonymousClass1(Request request, String str, long j) {
            this.this$0 = request;
            this.val$tag = str;
            this.val$threadId = j;
        }
    }
}
