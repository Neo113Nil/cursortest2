package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbo extends zzat implements RunnableFuture {
    private volatile zzbd zzd;

    zzbo(Callable callable) {
        this.zzd = new zzbn(this, callable);
    }

    static zzbo zzn(Runnable runnable, Object obj) {
        return new zzbo(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzbd zzbdVar = this.zzd;
        if (zzbdVar != null) {
            zzbdVar.run();
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.wearable.zzap
    protected final void zze() {
        zzbd zzbdVar;
        Object obj = this.valueField;
        if ((obj instanceof zzap.zza) && ((zzap.zza) obj).zzc && (zzbdVar = this.zzd) != null) {
            zzbdVar.zze();
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.wearable.zzap
    protected final String zzg() {
        zzbd zzbdVar = this.zzd;
        if (zzbdVar == null) {
            return super.zzg();
        }
        String obj = zzbdVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
