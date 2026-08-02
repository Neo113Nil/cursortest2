package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final class zzjj extends zzjl {
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjl
    public final Object zza(Object obj, Object obj2) {
        zzjt zzjtVar = (zzjt) obj;
        ListenableFuture zza = zzjtVar.zza(obj2);
        if (zza != null) {
            return zza;
        }
        a$$ExternalSyntheticBUOutline0.m$2(zzhx.zzb("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzjtVar));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjl
    public final /* synthetic */ void zzb(Object obj) {
        zzn((ListenableFuture) obj);
    }
}
