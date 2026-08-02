package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class zzja extends zzjy implements Runnable {
    public zzjl zza;
    public Class zzb;
    public zzeu zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        Object obj;
        zzjl zzjlVar = this.zza;
        Class cls = this.zzb;
        zzeu zzeuVar = this.zzc;
        if (((zzeuVar == null) || ((zzjlVar == null) | (cls == null))) || (this.valueField instanceof zzjc.zza)) {
            return;
        }
        this.zza = null;
        if (zzjlVar != null) {
            try {
                th = zzjlVar.zzg();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = new NullPointerException(Boxes$$ExternalSyntheticOutline1.m("Future type ", String.valueOf(zzjlVar.getClass()), " threw ", String.valueOf(e.getClass()), " without a cause"));
                }
                th = cause;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
        }
        if (th == null) {
            obj = zzki.zzi(zzjlVar);
            if (th != null) {
                zzl(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzn(zzjlVar);
                return;
            }
            try {
                ListenableFuture zza = zzeuVar.zza(th);
                if (zza == null) {
                    throw new NullPointerException(zzhx.zzb("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzeuVar));
                }
                this.zzb = null;
                this.zzc = null;
                zzn(zza);
                return;
            } catch (Throwable th3) {
                try {
                    if (th3 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    zzm(th3);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String zzc() {
        zzjl zzjlVar = this.zza;
        Class cls = this.zzb;
        zzeu zzeuVar = this.zzc;
        String zzc = super.zzc();
        String m = zzjlVar != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("inputFuture=[", zzjlVar.toString(), "], ") : "";
        if (cls == null || zzeuVar == null) {
            if (zzc != null) {
                return m.concat(zzc);
            }
            return null;
        }
        return m + "exceptionType=[" + cls.toString() + "], fallback=[" + zzeuVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final void zzd() {
        zzjl zzjlVar = this.zza;
        if ((zzjlVar != null) & (this.valueField instanceof zzjc.zza)) {
            zzjlVar.cancel(zzo());
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
