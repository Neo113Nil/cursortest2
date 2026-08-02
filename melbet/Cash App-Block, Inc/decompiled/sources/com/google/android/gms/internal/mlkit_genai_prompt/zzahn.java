package com.google.android.gms.internal.mlkit_genai_prompt;

import com.android.volley.RequestQueue;

/* loaded from: classes4.dex */
public final class zzahn {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final zzir zze;
    public final String zzf;
    public final Boolean zzg;
    public final Boolean zzh;
    public final Boolean zzi;
    public final Integer zzj;
    public final Integer zzk;

    public /* synthetic */ zzahn(RequestQueue requestQueue) {
        this.zza = (String) requestQueue.mSequenceGenerator;
        this.zzb = (String) requestQueue.mCurrentRequests;
        this.zzc = (String) requestQueue.mCacheQueue;
        this.zzd = (String) requestQueue.mNetworkQueue;
        this.zze = (zzir) requestQueue.mCache;
        this.zzf = (String) requestQueue.mNetwork;
        this.zzg = (Boolean) requestQueue.mDelivery;
        this.zzh = (Boolean) requestQueue.mDispatchers;
        this.zzi = (Boolean) requestQueue.mCacheDispatcher;
        this.zzj = (Integer) requestQueue.mFinishedListeners;
        this.zzk = (Integer) requestQueue.mEventListeners;
    }
}
