package com.google.android.play.core.review;

import com.fillr.n;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzh extends com.google.android.gms.internal.maps.zzb {
    public final n.a zza;
    public final TaskCompletionSource zzb;
    public final /* synthetic */ zzi zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzi zziVar, TaskCompletionSource taskCompletionSource) {
        super(12);
        n.a aVar = new n.a("OnRequestInstallCallback", 3);
        this.zzc = zziVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.zza = aVar;
        this.zzb = taskCompletionSource;
    }
}
