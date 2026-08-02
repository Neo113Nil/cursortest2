package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzfu {
    public static final zzfu zzb = new zzfu();
    public final ConcurrentHashMap zzd = new ConcurrentHashMap();
    public final zzfe zzc = new zzfe(0);

    public final zzge zzb(Class cls) {
        zzge zzfqVar;
        Charset charset = zzep.zza;
        if (cls == null) {
            a$$ExternalSyntheticBUOutline0.m$2("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.zzd;
        zzge zzgeVar = (zzge) concurrentHashMap.get(cls);
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzfe zzfeVar = this.zzc;
        zzfeVar.getClass();
        zzea zzeaVar = zzgg.zzb;
        zzeh.class.isAssignableFrom(cls);
        zzfw zzb2 = ((zzfe) zzfeVar.zzb).zzb(cls);
        if ((zzb2.zzd & 2) == 2) {
            zzea zzeaVar2 = zzgg.zzb;
            zzea zzeaVar3 = zzdv.zza;
            zzfqVar = new zzfq(zzeaVar2, zzb2.zza);
        } else {
            int i = zzft.$r8$clinit;
            int i2 = zzfa.$r8$clinit;
            zzea zzeaVar4 = zzgg.zzb;
            zzea zzeaVar5 = zzb2.zzc() + (-1) != 1 ? zzdv.zza : null;
            int i3 = zzfi.$r8$clinit;
            zzfqVar = zzfp.zzl(zzb2, zzeaVar4, zzeaVar5);
        }
        zzge zzgeVar2 = (zzge) concurrentHashMap.putIfAbsent(cls, zzfqVar);
        return zzgeVar2 == null ? zzfqVar : zzgeVar2;
    }
}
