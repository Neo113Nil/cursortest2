package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class zzcma {
    public static final zzclz zza = new zzclz(new byte[0], 0, 0, false);
    public static final int zzb;
    public static final AtomicReference[] zzc;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        zzb = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        zzc = atomicReferenceArr;
    }

    public static final zzclz zza() {
        AtomicReference atomicReference = zzc[(int) (Thread.currentThread().getId() & (zzb - 1))];
        zzclz zzclzVar = zza;
        zzclz zzclzVar2 = (zzclz) atomicReference.getAndSet(zzclzVar);
        if (zzclzVar2 == zzclzVar) {
            return new zzclz();
        }
        if (zzclzVar2 == null) {
            atomicReference.set(null);
            return new zzclz();
        }
        atomicReference.set(zzclzVar2.zzf);
        zzclzVar2.zzf = null;
        zzclzVar2.zzc = 0;
        return zzclzVar2;
    }

    public static final void zzb(zzclz zzclzVar) {
        zzclzVar.getClass();
        if (zzclzVar.zzf != null || zzclzVar.zzg != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (zzclzVar.zzd) {
            return;
        }
        AtomicReference atomicReference = zzc[(int) (Thread.currentThread().getId() & (zzb - 1))];
        zzclz zzclzVar2 = zza;
        zzclz zzclzVar3 = (zzclz) atomicReference.getAndSet(zzclzVar2);
        if (zzclzVar3 != zzclzVar2) {
            int i = zzclzVar3 != null ? zzclzVar3.zzc : 0;
            if (i >= 65536) {
                atomicReference.set(zzclzVar3);
                return;
            }
            zzclzVar.zzf = zzclzVar3;
            zzclzVar.zzb = 0;
            zzclzVar.zzc = i + PKIFailureInfo.certRevoked;
            atomicReference.set(zzclzVar);
        }
    }
}
