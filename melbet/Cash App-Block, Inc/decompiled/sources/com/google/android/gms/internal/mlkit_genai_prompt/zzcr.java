package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzcr {
    public final Context zza;
    public final ExecutorService zzb;
    public final Executor zzc;
    public final Duration zze;
    public final ScheduledExecutorService zzf;
    public final Optional zzg;

    public zzcr(Context context, ExecutorService executorService, Executor executor, Duration duration, ScheduledExecutorService scheduledExecutorService, Optional optional) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = executor;
        this.zze = duration;
        this.zzf = scheduledExecutorService;
        this.zzg = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcr)) {
            return false;
        }
        zzcr zzcrVar = (zzcr) obj;
        return this.zza.equals(zzcrVar.zza) && this.zzb.equals(zzcrVar.zzb) && this.zzc.equals(zzcrVar.zzc) && this.zze.equals(zzcrVar.zze) && this.zzf.equals(zzcrVar.zzf) && this.zzg.equals(zzcrVar.zzg);
    }

    public final int hashCode() {
        return this.zzg.hashCode() ^ ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ 1231) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        String obj3 = this.zzc.toString();
        String obj4 = this.zze.toString();
        String obj5 = this.zzf.toString();
        String valueOf = String.valueOf(this.zzg);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AiCoreClientOptions{context=", obj, ", workerExecutor=", obj2, ", callbackExecutor=");
        Boxes$$ExternalSyntheticOutline1.m(m, obj3, ", bindImportantEnabled=true, autoUnbindTimeoutMs=", obj4, ", autoUnbindScheduledExecutor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, obj5, ", autoDownloadEnabled=", valueOf, "}");
    }
}
