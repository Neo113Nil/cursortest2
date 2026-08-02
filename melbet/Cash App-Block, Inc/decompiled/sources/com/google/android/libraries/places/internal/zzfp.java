package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;

/* loaded from: classes4.dex */
public final class zzfp {
    public final Context zza;
    public final MoreExecutors$ScheduledListeningDecorator zzb;
    public final ListenableFuture zzc;

    public zzfp(Context context, MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator) {
        context.getClass();
        this.zza = context;
        this.zzb = moreExecutors$ScheduledListeningDecorator;
        ListenableFuture submit = moreExecutors$ScheduledListeningDecorator.submit(new zzfo(this, 0));
        submit.getClass();
        this.zzc = submit;
    }
}
