package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Set;

/* loaded from: classes4.dex */
public final class zzjq extends zzjo {
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjo
    public final int zza(zzjw zzjwVar) {
        int i;
        synchronized (zzjwVar) {
            i = zzjwVar.remainingField - 1;
            zzjwVar.remainingField = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjo
    public final void zzb(zzjw zzjwVar, Set set) {
        synchronized (zzjwVar) {
            try {
                if (zzjwVar.seenExceptionsField == null) {
                    zzjwVar.seenExceptionsField = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
