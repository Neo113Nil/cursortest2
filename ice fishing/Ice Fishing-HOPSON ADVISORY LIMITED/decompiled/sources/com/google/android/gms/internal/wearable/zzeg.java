package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzeg {
    zzeg() {
    }

    public static final boolean zza(Object obj) {
        return !((zzef) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzef zzefVar = (zzef) obj;
        zzef zzefVar2 = (zzef) obj2;
        if (!zzefVar2.isEmpty()) {
            if (!zzefVar.zze()) {
                zzefVar = zzefVar.zzc();
            }
            zzefVar.zzb(zzefVar2);
        }
        return zzefVar;
    }
}
