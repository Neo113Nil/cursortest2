package com.google.android.gms.common.util.concurrent;

import com.bugsnag.android.Client;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class NumberedThreadFactory implements ThreadFactory {
    public final AtomicInteger zzb = new AtomicInteger();
    public final ThreadFactory zzc = Executors.defaultThreadFactory();
    public final String zza = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zzc.newThread(new Client.AnonymousClass3(runnable, 4));
        int andIncrement = this.zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
