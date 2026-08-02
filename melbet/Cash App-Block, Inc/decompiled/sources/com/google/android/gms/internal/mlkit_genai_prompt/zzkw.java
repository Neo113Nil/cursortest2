package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzkw extends zzjc.zzf implements Runnable {
    public final Runnable zza;

    public zzkw(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzm(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String zzc() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("task=[", this.zza.toString(), "]");
    }
}
