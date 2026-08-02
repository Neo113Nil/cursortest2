package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class zzlp implements Supplier {
    public static final /* synthetic */ zzlp zza = new zzlp();

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Object obj = zzlk.zzb;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(zzlo.zza);
        return newSingleThreadScheduledExecutor instanceof MoreExecutors$ScheduledListeningDecorator ? (MoreExecutors$ScheduledListeningDecorator) newSingleThreadScheduledExecutor : new MoreExecutors$ScheduledListeningDecorator(newSingleThreadScheduledExecutor);
    }
}
