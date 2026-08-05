package com.google.android.gms.internal.wearable;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzo implements ThreadFactory {
    private final ThreadFactory zza = Executors.defaultThreadFactory();

    private zzo() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        if (newThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        String name = newThread.getName();
        String.valueOf(name);
        newThread.setName("punch".concat(String.valueOf(name)));
        return newThread;
    }

    /* synthetic */ zzo(byte[] bArr) {
    }
}
