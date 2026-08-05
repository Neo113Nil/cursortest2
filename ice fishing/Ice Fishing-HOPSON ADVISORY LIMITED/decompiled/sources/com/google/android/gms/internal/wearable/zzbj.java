package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzap;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbj extends zzap.zzf implements Runnable {
    private final Runnable zzd;

    @Override // com.google.android.gms.internal.wearable.zzap
    protected final String zzg() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    zzbj(Runnable runnable) {
        runnable.getClass();
        this.zzd = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzd.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
