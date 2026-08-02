package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.internal.AnalyticsEvents;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzexq {
    private final zzgey zza;
    private final Context zzb;
    private final Set zzc;

    public zzevu(zzgey zzgeyVar, Context context, Set set) {
        this.zza = zzgeyVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevu.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevv zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeU)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzfc)).booleanValue()) {
                Set set = this.zzc;
                if (!set.contains("rewarded")) {
                    if (!set.contains("interstitial")) {
                        if (!set.contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                        }
                    }
                }
            }
            return new zzevv(com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb));
        }
        return new zzevv(null);
    }
}
