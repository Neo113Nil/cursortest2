package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcy extends com.google.android.gms.internal.common.zzak {
    public final /* synthetic */ zzdf zza;
    public int zzb;
    public final int zzc;

    public zzcy(zzdf zzdfVar) {
        super(3);
        this.zza = zzdfVar;
        this.zzb = 0;
        this.zzc = zzdfVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzak
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        a$$ExternalSyntheticBUOutline0.m();
        return (byte) 0;
    }
}
