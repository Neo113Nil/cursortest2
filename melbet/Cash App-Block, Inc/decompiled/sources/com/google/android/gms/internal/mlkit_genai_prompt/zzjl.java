package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public abstract class zzjl extends zzjy implements Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public ListenableFuture zza;
    public Object zzb;

    public zzjl(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        if (((this.valueField instanceof zzjc.zza) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzn(listenableFuture);
            return;
        }
        try {
            try {
                Object zza = zza(obj, zzki.zzi(listenableFuture));
                this.zzb = null;
                zzb(zza);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    zzm(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzm(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzm(e2.getCause());
        } catch (Exception e3) {
            zzm(e3);
        }
    }

    public abstract Object zza(Object obj, Object obj2);

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String zzc() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zzc = super.zzc();
        String m = listenableFuture != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("inputFuture=[", listenableFuture.toString(), "], ") : "";
        if (obj != null) {
            return Boxes$$ExternalSyntheticOutline1.m(m, "function=[", obj.toString(), "]");
        }
        if (zzc != null) {
            return m.concat(zzc);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final void zzd() {
        ListenableFuture listenableFuture = this.zza;
        if ((listenableFuture != null) & (this.valueField instanceof zzjc.zza)) {
            listenableFuture.cancel(zzo());
        }
        this.zza = null;
        this.zzb = null;
    }
}
