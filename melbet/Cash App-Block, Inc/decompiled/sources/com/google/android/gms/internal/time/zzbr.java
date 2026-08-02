package com.google.android.gms.internal.time;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzbr {
    public static final AtomicInteger zzb = new AtomicInteger(0);
    public final Context zzc;
    public final zzk zzd;
    public final Object zze = new Object();
    public zzbq zzf;

    public zzbr(Context context, zzk zzkVar) {
        Objects.requireNonNull(context);
        this.zzc = context;
        this.zzd = zzkVar;
    }

    public final String toString() {
        String str;
        synchronized (this.zze) {
            str = "TimeSignalResultReceiverImpl{globalState=" + String.valueOf(this.zzd) + ", timeSignalReceiver=" + String.valueOf(this.zzf) + "}";
        }
        return str;
    }
}
