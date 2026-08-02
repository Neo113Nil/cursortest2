package com.google.firebase.iid;

import N2.j;
import W2.a;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.f;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SoftReference f36954a;

    /* renamed from: b, reason: collision with root package name */
    public static SoftReference f36955b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!f.u(putExtras)) {
            return -1;
        }
        f.p("_nd", putExtras.getExtras());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean isOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f36954a;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new a("firebase-iid-executor")));
                    f36954a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new j(this, intent, context, isOrderedBroadcast, goAsync));
    }
}
