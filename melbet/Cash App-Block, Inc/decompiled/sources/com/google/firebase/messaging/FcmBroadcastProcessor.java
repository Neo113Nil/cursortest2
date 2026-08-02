package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.room.Room;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda1;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class FcmBroadcastProcessor {
    public static WithinAppServiceConnection fcmServiceConn;
    public static final Object lock = new Object();
    public final Context context;
    public final ArchTaskExecutor$$ExternalSyntheticLambda0 executor = new ArchTaskExecutor$$ExternalSyntheticLambda0(1);

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
    }

    public static Task bindToMessagingService(Context context, Intent intent, boolean z) {
        WithinAppServiceConnection withinAppServiceConnection;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context);
                }
                withinAppServiceConnection = fcmServiceConn;
            } finally {
            }
        }
        if (!z) {
            return withinAppServiceConnection.sendIntent(intent).continueWith(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new AesGcmSiv$$ExternalSyntheticLambda0(10));
        }
        if (UnleashContext.getInstance().hasWakeLockPermission(context)) {
            synchronized (ByteStreams.syncObject) {
                try {
                    ByteStreams.checkAndInitWakeLock(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        ByteStreams.wakeLock.acquire();
                    }
                    withinAppServiceConnection.sendIntent(intent).addOnCompleteListener(new MaterialButton$$ExternalSyntheticLambda3(intent, 6));
                } finally {
                }
            }
        } else {
            withinAppServiceConnection.sendIntent(intent);
        }
        return Room.forResult(-1);
    }

    public final Task process(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.context;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return bindToMessagingService(context, intent, z2);
        }
        EventStore$$ExternalSyntheticLambda1 eventStore$$ExternalSyntheticLambda1 = new EventStore$$ExternalSyntheticLambda1(3, context, intent);
        ArchTaskExecutor$$ExternalSyntheticLambda0 archTaskExecutor$$ExternalSyntheticLambda0 = this.executor;
        return Room.call(archTaskExecutor$$ExternalSyntheticLambda0, eventStore$$ExternalSyntheticLambda1).continueWithTask(archTaskExecutor$$ExternalSyntheticLambda0, new Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : FcmBroadcastProcessor.bindToMessagingService(context, intent, z2).continueWith(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new AesGcmSiv$$ExternalSyntheticLambda0(9));
            }
        });
    }
}
