package K2;

import B2.z;
import a.AbstractC0415a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.C3093dO;
import com.google.android.gms.internal.ads.Mt;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.UO;
import com.google.android.gms.internal.ads.VO;
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
    public final /* synthetic */ int f1585n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f1586u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1587v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1588w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1589x;

    public /* synthetic */ i(Context context, boolean z8, C3093dO c3093dO, VO vo) {
        this.f1586u = context;
        this.f1587v = z8;
        this.f1588w = c3093dO;
        this.f1589x = vo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i;
        UO uo;
        PlaybackSession createPlaybackSession;
        LogSessionId sessionId;
        boolean equals;
        LogSessionId unused;
        switch (this.f1585n) {
            case 0:
                Intent intent = (Intent) this.f1588w;
                Context context = this.f1586u;
                boolean z8 = this.f1587v;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1589x;
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
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f36350b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new T2.a("pscm-ack-executor", 0));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f36350b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new z(context, aVar, countDownLatch, 4));
                            try {
                                i4 = ((Integer) AbstractC0415a.e(new f4.h(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e6) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e6);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e9) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e9.toString()));
                            }
                        }
                        i = i4;
                    }
                    if (z8 && pendingResult != null) {
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
                Context context2 = this.f1586u;
                MediaMetricsManager f6 = N0.a.f(context2.getSystemService("media_metrics"));
                if (f6 == null) {
                    uo = null;
                } else {
                    createPlaybackSession = f6.createPlaybackSession();
                    uo = new UO(context2, createPlaybackSession);
                }
                if (uo == null) {
                    AbstractC3217fl.I("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f1587v) {
                    ((C3093dO) this.f1588w).w1(uo);
                }
                VO vo = (VO) this.f1589x;
                sessionId = uo.f27994w.getSessionId();
                synchronized (vo) {
                    Mt mt = vo.f28246b;
                    if (mt == null) {
                        throw null;
                    }
                    LogSessionId logSessionId = (LogSessionId) mt.f26393u;
                    unused = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                    PA.T(equals);
                    mt.f26393u = sessionId;
                }
                return;
        }
    }

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z8, BroadcastReceiver.PendingResult pendingResult) {
        this.f1588w = intent;
        this.f1586u = context;
        this.f1587v = z8;
        this.f1589x = pendingResult;
    }
}
