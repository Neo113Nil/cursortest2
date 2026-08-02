package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class zzjp extends zzjo {
    public static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzjs.class, Set.class, "seenExceptionsField");
    public static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzjs.class, "remainingField");

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjo
    public final int zza(zzjw zzjwVar) {
        return zzb.decrementAndGet(zzjwVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjo
    public final void zzb(zzjw zzjwVar, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
            if (atomicReferenceFieldUpdater.compareAndSet(zzjwVar, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(zzjwVar) != null && atomicReferenceFieldUpdater.get(zzjwVar) != null) {
                return;
            }
        }
    }
}
