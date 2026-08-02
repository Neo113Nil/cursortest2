package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.mlkit_vision_face.zzaq;
import com.stripe.android.stripe3ds2.transaction.Logger;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzcg extends zzaq {
    public final /* synthetic */ zzci zza;
    public final Object zzb;
    public int zzc;

    public zzcg(zzci zzciVar, int i) {
        super(false, 1);
        this.zza = zzciVar;
        Object obj = zzci.zzd;
        this.zzb = zzciVar.zzB()[i];
        this.zzc = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzci zzciVar = this.zza;
        Map zzl = zzciVar.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzciVar.zzC()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzci zzciVar = this.zza;
        Map zzl = zzciVar.zzl();
        Object obj2 = this.zzb;
        if (zzl != null) {
            return zzl.put(obj2, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzciVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzciVar.zzC()[i];
        zzciVar.zzC()[this.zzc] = obj;
        return obj3;
    }

    public final void zza() {
        int i = this.zzc;
        Object obj = this.zzb;
        zzci zzciVar = this.zza;
        if (i != -1 && i < zzciVar.size()) {
            if (Logger.zza(obj, zzciVar.zzB()[this.zzc])) {
                return;
            }
        }
        Object obj2 = zzci.zzd;
        this.zzc = zzciVar.zzw(obj);
    }
}
