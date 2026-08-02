package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbb extends zzaq {
    public final /* synthetic */ zzbd zza;
    public final Object zzb;
    public int zzc;

    public zzbb(zzbd zzbdVar, int i) {
        super(false, 0);
        this.zza = zzbdVar;
        Object[] objArr = zzbdVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i];
        this.zzc = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzbd zzbdVar = this.zza;
        Map zzl = zzbdVar.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        Object[] objArr = zzbdVar.zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzbd zzbdVar = this.zza;
        Map zzl = zzbdVar.zzl();
        Object obj2 = this.zzb;
        if (zzl != null) {
            return zzl.put(obj2, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzbdVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = zzbdVar.zzc;
        objArr.getClass();
        Object obj3 = objArr[i];
        int i2 = this.zzc;
        Object[] objArr2 = zzbdVar.zzc;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }

    public final void zza() {
        int i = this.zzc;
        Object obj = this.zzb;
        zzbd zzbdVar = this.zza;
        if (i != -1 && i < zzbdVar.size()) {
            int i2 = this.zzc;
            Object[] objArr = zzbdVar.zzb;
            objArr.getClass();
            if (ScanningStarPulseKt.zza(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = zzbd.zzd;
        this.zzc = zzbdVar.zzv(obj);
    }
}
