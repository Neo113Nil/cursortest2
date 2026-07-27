package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102;
import androidx.versionedparcelable.XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    public static SoftReference AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static SoftReference ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public abstract int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("firebase-iid-executor")));
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: androidx.versionedparcelable.SolarMeshSyntaxClassOtTsooqmMy3tcMbEpA27597148147593
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                CloudMessagingReceiver cloudMessagingReceiver = CloudMessagingReceiver.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int i = 500;
                    if (intent3 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent3.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent3.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if (Objects.equals(intent3.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                            cloudMessagingReceiver.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(extras);
                            i = -1;
                        }
                    } else if (intent2.getExtras() != null) {
                        LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 = new LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102(intent2);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (CloudMessagingReceiver.class) {
                            try {
                                SoftReference softReference2 = CloudMessagingReceiver.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                executor = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    CloudMessagingReceiver.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new SoftReference(executor);
                                }
                            } finally {
                            }
                        }
                        executor.execute(new BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871(context2, lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102, countDownLatch));
                        i = cloudMessagingReceiver.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context2, lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102);
                        try {
                            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            "Message ack failed: ".concat(e.toString());
                        }
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            }
        });
    }

    public void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Bundle bundle) {
    }
}
