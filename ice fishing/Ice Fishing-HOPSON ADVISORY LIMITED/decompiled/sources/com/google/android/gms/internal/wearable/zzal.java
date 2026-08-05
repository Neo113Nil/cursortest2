package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzal implements zzak {
    private final zzan zza = new zzan();
    private volatile zzak zzb;
    private Object zzc;

    zzal(zzak zzakVar) {
        this.zzb = zzakVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.wearable.zzak
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                if (this.zzb != null) {
                    Object zza = this.zzb.zza();
                    this.zzc = zza;
                    this.zzb = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
