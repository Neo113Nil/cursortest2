package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.room.Room;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.nimbusds.jose.jca.JCAContext;
import java.util.concurrent.ExecutorService;
import kotlin.reflect.jvm.internal.KotlinKPropertyKt;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = KotlinKPropertyKt.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
    private final Object lock = new Object();
    private int runningTasks = 0;

    public static Task access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        if (enhancedIntentService.handleIntentOnMainThread(intent)) {
            return Room.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        enhancedIntentService.executor.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(8, enhancedIntentService, intent, taskCompletionSource));
        return taskCompletionSource.zza;
    }

    public final void finishTask(Intent intent) {
        if (intent != null) {
            ByteStreams.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new WithinAppServiceBinder(new JCAContext(this, 7));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zzw zzwVar;
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            zzwVar = Room.forResult(null);
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.executor.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(8, this, startCommandIntent, taskCompletionSource));
            zzwVar = taskCompletionSource.zza;
        }
        if (zzwVar.isComplete()) {
            finishTask(intent);
            return 2;
        }
        zzwVar.addOnCompleteListener(new CredentialManager$$ExternalSyntheticLambda0(0), new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(27, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
