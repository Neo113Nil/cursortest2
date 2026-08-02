package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzae;

/* loaded from: classes4.dex */
public final class zzfx extends com.google.android.gms.internal.common.zzak {
    public final zzae zza;
    public com.google.android.gms.internal.common.zzak zzb;

    public zzfx(zzgd zzgdVar) {
        super(3);
        this.zza = new zzae(zzgdVar);
        this.zzb = zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.common.zzak
    public final byte zza() {
        com.google.android.gms.internal.common.zzak zzakVar = this.zzb;
        if (zzakVar == null) {
            a$$ExternalSyntheticBUOutline0.m();
            return (byte) 0;
        }
        byte zza = zzakVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }

    public final zzcy zzb() {
        zzae zzaeVar = this.zza;
        if (zzaeVar.hasNext()) {
            return new zzcy(zzaeVar.zza());
        }
        return null;
    }
}
