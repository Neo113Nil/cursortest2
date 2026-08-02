package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zzky {
    public static final Object zza = new Object();
    public static UserManager zzb = null;
    public static volatile zzlr zzc = null;

    /* renamed from: zzc, reason: collision with other field name */
    public static volatile boolean f65zzc = false;
    public static volatile zzlr zze;

    public static void zza(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str.concat(" must not be null"));
    }

    public static AbstractFuture zzd(Context context, Callable callable, Executor executor) {
        zzj zzjVar = new zzj(callable, 8);
        if (zzi(context)) {
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
            trustedListenableFutureTask.task = trustedListenableFutureTask.new TrustedFutureInterruptibleAsyncTask(zzjVar);
            executor.execute(trustedListenableFutureTask);
            return trustedListenableFutureTask;
        }
        SettableFuture create = SettableFuture.create();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        zzkv zzkvVar = new zzkv(atomicBoolean, context, create, zzjVar, executor);
        context.registerReceiver(zzkvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!zzi(context) || !atomicBoolean.compareAndSet(false, true)) {
            create.addListener(new ProfileAdapter.AnonymousClass8(create, atomicBoolean, context, false, zzkvVar, 4), DirectExecutor.INSTANCE);
            return create;
        }
        try {
            context.unregisterReceiver(zzkvVar);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        TrustedListenableFutureTask trustedListenableFutureTask2 = new TrustedListenableFutureTask();
        trustedListenableFutureTask2.task = trustedListenableFutureTask2.new TrustedFutureInterruptibleAsyncTask(zzjVar);
        executor.execute(trustedListenableFutureTask2);
        create.setFuture(trustedListenableFutureTask2);
        return create;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzi(Context context) {
        boolean z;
        if (f65zzc) {
            return true;
        }
        synchronized (zzky.class) {
            try {
                if (f65zzc) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z = false;
                    if (i > 2) {
                        break;
                    }
                    if (zzb == null) {
                        zzb = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zzb;
                    if (userManager == null) {
                        z = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        zzb = null;
                        i++;
                    }
                }
                if (z) {
                    zzb = null;
                }
                if (z) {
                    f65zzc = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
