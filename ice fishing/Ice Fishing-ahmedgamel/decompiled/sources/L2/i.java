package L2;

import C2.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.C3534lt;
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
public final /* synthetic */ class i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1640n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f1641u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1642v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1643w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1644x;

    public /* synthetic */ i(Context context, boolean z3, PN pn, IO io) {
        this.f1641u = context;
        this.f1642v = z3;
        this.f1643w = pn;
        this.f1644x = io;
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
        switch (this.f1640n) {
            case 0:
                Intent intent = (Intent) this.f1643w;
                Context context = this.f1641u;
                boolean z3 = this.f1642v;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1644x;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i6 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f36188b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new U2.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f36188b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new y(5, context, aVar, countDownLatch));
                            try {
                                i6 = ((Integer) S0.f.b(new j4.j(context).b(intent))).intValue();
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
                        i = i6;
                    }
                    if (z3 && pendingResult != null) {
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
                Context context2 = this.f1641u;
                MediaMetricsManager g4 = B3.e.g(context2.getSystemService("media_metrics"));
                if (g4 == null) {
                    ho = null;
                } else {
                    createPlaybackSession = g4.createPlaybackSession();
                    ho = new HO(context2, createPlaybackSession);
                }
                if (ho == null) {
                    AbstractC2968bG.y("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f1642v) {
                    ((PN) this.f1643w).T1(ho);
                }
                IO io = (IO) this.f1644x;
                sessionId = ho.f25286w.getSessionId();
                synchronized (io) {
                    C3534lt c3534lt = io.f25500b;
                    if (c3534lt == null) {
                        throw null;
                    }
                    LogSessionId logSessionId = (LogSessionId) c3534lt.f31863u;
                    unused = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                    AbstractC2772Sd.H(equals);
                    c3534lt.f31863u = sessionId;
                }
                return;
        }
    }

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z3, BroadcastReceiver.PendingResult pendingResult) {
        this.f1643w = intent;
        this.f1641u = context;
        this.f1642v = z3;
        this.f1644x = pendingResult;
    }
}
