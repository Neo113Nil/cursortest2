package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.VideoCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.util.DBUtil;
import coil3.memory.RealStrongMemoryCache;
import com.fillr.featuretoggle.UnleashContext;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzex implements zzjt {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutoCloseable zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;

    public /* synthetic */ zzex(AutoCloseable autoCloseable, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.zza = autoCloseable;
        this.zzb = obj;
        this.zzc = obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjt
    public final ListenableFuture zza(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zzc;
        Object obj3 = this.zzb;
        AutoCloseable autoCloseable = this.zza;
        switch (i) {
            case 0:
                zzcs zzcsVar = (zzcs) obj;
                CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new UnleashContext((zzfn) autoCloseable, zzcsVar, (zzct) obj3, (zzzx) obj2));
                VideoCapture.AnonymousClass3 anonymousClass3 = zzcsVar.zzb;
                zzzx zzzxVar = new zzzx(14);
                anonymousClass3.getClass();
                return DBUtil.getFuture(new zzlq(4, anonymousClass3, future, zzzxVar));
            case 1:
                return ((zzer) obj).zzc(((zzajh) autoCloseable).zzi(obj3, (RealStrongMemoryCache) obj2));
            default:
                return ((zzajh) autoCloseable).zzd(obj3, (RealStrongMemoryCache) obj2);
        }
    }
}
