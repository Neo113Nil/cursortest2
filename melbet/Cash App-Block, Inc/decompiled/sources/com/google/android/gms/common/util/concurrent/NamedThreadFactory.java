package com.google.android.gms.common.util.concurrent;

import com.bugsnag.android.Client;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class NamedThreadFactory implements ThreadFactory {
    public final String zza;
    public final ThreadFactory zzb = Executors.defaultThreadFactory();

    public NamedThreadFactory(String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zzb.newThread(new Client.AnonymousClass3(runnable, 4));
        newThread.setName(this.zza);
        return newThread;
    }
}
