package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class zzchh implements zzcgd {
    @Override // com.google.android.libraries.places.internal.zzcgd
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzcgd
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(zzbzg.zzd("grpc-okhttp-%d"));
    }
}
