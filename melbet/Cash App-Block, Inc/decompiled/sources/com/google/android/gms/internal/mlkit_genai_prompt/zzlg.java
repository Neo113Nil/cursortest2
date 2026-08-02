package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzlg implements zzlt {
    public static final Object zza = new Object();
    public volatile Object zzb = zza;
    public volatile zzlt zzc;

    public zzlg(zzlt zzltVar) {
        this.zzc = zzltVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlt
    public final Object zza() {
        Object obj;
        Object obj2 = this.zzb;
        Object obj3 = zza;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.zzb;
                if (obj == obj3) {
                    obj = this.zzc.zza();
                    this.zzb = obj;
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
