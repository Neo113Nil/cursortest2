package com.gamericefishpro.space.n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Parcelable e;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ i3(o3 o3Var, t4 t4Var, boolean z, com.gamericefishpro.space.w8.a aVar, int i) {
        this.d = i;
        this.e = t4Var;
        this.i = z;
        this.w = aVar;
        this.v = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o3 o3Var = (o3) this.v;
                h0 h0Var = o3Var.v;
                if (h0Var != null) {
                    o3Var.J(h0Var, this.i ? null : (o4) this.w, (t4) this.e);
                    o3Var.E();
                    return;
                } else {
                    v0 v0Var = ((r1) o3Var.d).y;
                    r1.l(v0Var);
                    v0Var.y.a("Discarding data. Failed to set user property");
                    return;
                }
            case 1:
                o3 o3Var2 = (o3) this.v;
                h0 h0Var2 = o3Var2.v;
                if (h0Var2 != null) {
                    o3Var2.J(h0Var2, this.i ? null : (u) this.w, (t4) this.e);
                    o3Var2.E();
                    return;
                } else {
                    v0 v0Var2 = ((r1) o3Var2.d).y;
                    r1.l(v0Var2);
                    v0Var2.y.a("Discarding data. Failed to send event to service");
                    return;
                }
            case 2:
                o3 o3Var3 = (o3) this.v;
                h0 h0Var3 = o3Var3.v;
                if (h0Var3 != null) {
                    o3Var3.J(h0Var3, this.i ? null : (e) this.w, (t4) this.e);
                    o3Var3.E();
                    return;
                } else {
                    v0 v0Var3 = ((r1) o3Var3.d).y;
                    r1.l(v0Var3);
                    v0Var3.y.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
            default:
                Intent intent = (Intent) this.e;
                Context context = (Context) this.w;
                boolean z = this.i;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.v;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        Bundle extras = intent.getExtras();
                        int iIntValue = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
                        if (extras != null) {
                            com.gamericefishpro.space.r8.a aVar = new com.gamericefishpro.space.r8.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.gamericefishpro.space.a9.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new com.gamericefishpro.space.m6.e((Object) context, (Object) aVar, (Object) countDownLatch, 11));
                            try {
                                iIntValue = ((Integer) com.gamericefishpro.space.d9.h.j(new com.gamericefishpro.space.tb.k(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
        }
    }

    public /* synthetic */ i3(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.d = 3;
        this.e = intent;
        this.w = context;
        this.i = z;
        this.v = pendingResult;
    }

    public i3(o3 o3Var, t4 t4Var, boolean z, e eVar) {
        this.d = 2;
        this.e = t4Var;
        this.i = z;
        this.w = eVar;
        Objects.requireNonNull(o3Var);
        this.v = o3Var;
    }
}
