package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzda implements zzej {
    private static final zzda zza = new zzda();

    private zzda() {
    }

    public static zzda zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.wearable.zzej
    public final boolean zzb(Class cls) {
        return zzdg.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.wearable.zzej
    public final zzei zzc(Class cls) {
        if (!zzdg.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zzei) zzdg.zzU(cls.asSubclass(zzdg.class)).zzG(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
