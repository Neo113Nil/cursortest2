package N2;

import E2.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import com.google.android.gms.internal.ads.C3557lt;
import com.google.android.gms.internal.ads.HO;
import com.google.android.gms.internal.ads.IO;
import com.google.android.gms.internal.ads.PN;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1930n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f1931u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1932v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1933w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1934x;

    public /* synthetic */ j(Context context, boolean z6, PN pn, IO io) {
        this.f1931u = context;
        this.f1932v = z6;
        this.f1933w = pn;
        this.f1934x = io;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i;
        HO ho;
        PlaybackSession createPlaybackSession;
        LogSessionId sessionId;
        boolean equals;
        LogSessionId unused;
        switch (this.f1930n) {
            case 0:
                Intent intent = (Intent) this.f1933w;
                Context context = this.f1931u;
                boolean z6 = this.f1932v;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1934x;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i4 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f36955b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W2.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f36955b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new x(6, context, aVar, countDownLatch));
                            try {
                                i4 = ((Integer) com.bumptech.glide.d.d(new l4.j(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e9) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e9);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e10) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                            }
                        }
                        i = i4;
                    }
                    if (z6 && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            default:
                Context context2 = this.f1931u;
                MediaMetricsManager g9 = D3.e.g(context2.getSystemService("media_metrics"));
                if (g9 == null) {
                    ho = null;
                } else {
                    createPlaybackSession = g9.createPlaybackSession();
                    ho = new HO(context2, createPlaybackSession);
                }
                if (ho == null) {
                    AbstractC2991bG.y("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f1932v) {
                    ((PN) this.f1933w).T1(ho);
                }
                IO io = (IO) this.f1934x;
                sessionId = ho.f26058w.getSessionId();
                synchronized (io) {
                    C3557lt c3557lt = io.f26243b;
                    if (c3557lt == null) {
                        throw null;
                    }
                    LogSessionId logSessionId = (LogSessionId) c3557lt.f32643u;
                    unused = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                    AbstractC2792Sd.H(equals);
                    c3557lt.f32643u = sessionId;
                }
                return;
        }
    }

    public /* synthetic */ j(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z6, BroadcastReceiver.PendingResult pendingResult) {
        this.f1933w = intent;
        this.f1931u = context;
        this.f1932v = z6;
        this.f1934x = pendingResult;
    }
}
