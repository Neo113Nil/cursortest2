package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzamy {
    public static final zzamy zza = new zzamy();
    public final zzeo zzb;
    public final ConcurrentHashMap zzc = new ConcurrentHashMap();

    public zzamy() {
        int i = zzaki.$r8$clinit;
        zzeo zzeoVar = new zzeo(new zzamp[]{zzzx.zza$2, zzeo.zza});
        zzeo zzeoVar2 = new zzeo();
        Charset charset = zzalx.zza;
        zzeoVar2.f67zza = zzeoVar;
        this.zzb = zzeoVar2;
    }

    public final zzanb zzb(Class cls) {
        zzanb zzamvVar;
        Charset charset = zzalx.zza;
        if (cls == null) {
            a$$ExternalSyntheticBUOutline0.m$2("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.zzc;
        zzanb zzanbVar = (zzanb) concurrentHashMap.get(cls);
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzeo zzeoVar = this.zzb;
        zzeoVar.getClass();
        zzzx zzzxVar = zzand.zzb;
        if (!zzals.class.isAssignableFrom(cls)) {
            int i = zzaki.$r8$clinit;
        }
        zzana zzb = ((zzeo) zzeoVar.f67zza).zzb(cls);
        if ((zzb.zzd & 2) == 2) {
            int i2 = zzaki.$r8$clinit;
            zzzx zzzxVar2 = zzand.zzb;
            zzzx zzzxVar3 = zzali.zza;
            zzamvVar = new zzamv(zzzxVar2, zzb.zza);
        } else {
            int i3 = zzaki.$r8$clinit;
            int i4 = zzamx.$r8$clinit;
            int i5 = zzamf.$r8$clinit;
            zzzx zzzxVar4 = zzand.zzb;
            zzzx zzzxVar5 = zzb.zzc() + (-1) != 1 ? zzali.zza : null;
            int i6 = zzamn.$r8$clinit;
            zzamvVar = zzamu.zzj(zzb, zzzxVar4, zzzxVar5);
        }
        zzanb zzanbVar2 = (zzanb) concurrentHashMap.putIfAbsent(cls, zzamvVar);
        return zzanbVar2 != null ? zzanbVar2 : zzamvVar;
    }
}
