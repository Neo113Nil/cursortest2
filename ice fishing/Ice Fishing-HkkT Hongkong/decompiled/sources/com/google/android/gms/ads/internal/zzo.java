package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes.dex */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcei zzceiVar;
        Context context;
        zzs zzsVar = this.zza;
        zzceiVar = zzsVar.zza;
        String str = zzceiVar.zza;
        context = zzsVar.zzd;
        return new zzavi(zzavh.zzt(str, context, false));
    }
}
