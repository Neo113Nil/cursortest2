package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.mlkit_vision_face.zzaq;
import com.withpersona.sdk2.camera.BitmapUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzay extends zzaq {
    public final /* synthetic */ zzba zza;
    public final Object zzb;
    public int zzc;

    public zzay(zzba zzbaVar, int i) {
        super(false, 2);
        this.zza = zzbaVar;
        Object obj = zzba.zzd;
        this.zzb = zzbaVar.zzB()[i];
        this.zzc = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzba zzbaVar = this.zza;
        Map zzl = zzbaVar.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzbaVar.zzC()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzba zzbaVar = this.zza;
        Map zzl = zzbaVar.zzl();
        Object obj2 = this.zzb;
        if (zzl != null) {
            return zzl.put(obj2, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzbaVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzbaVar.zzC()[i];
        zzbaVar.zzC()[this.zzc] = obj;
        return obj3;
    }

    public final void zza() {
        int i = this.zzc;
        Object obj = this.zzb;
        zzba zzbaVar = this.zza;
        if (i != -1 && i < zzbaVar.size()) {
            if (BitmapUtils.zza(obj, zzbaVar.zzB()[this.zzc])) {
                return;
            }
        }
        Object obj2 = zzba.zzd;
        this.zzc = zzbaVar.zzw(obj);
    }
}
