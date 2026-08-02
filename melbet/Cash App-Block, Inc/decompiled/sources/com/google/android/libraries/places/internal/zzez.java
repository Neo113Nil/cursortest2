package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzez implements zzboh {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzez(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        switch (this.$r8$classId) {
            case 0:
                return new zzfa();
            case 1:
                return new zzhs();
            case 2:
                return new zzia();
            case 3:
                return new zzid();
            case 4:
                return new zzjm();
            case 5:
                return new zzke();
            case 6:
                return new zzkl();
            case 7:
                zzchm zze = zzchm.zze("geocode.googleapis.com");
                zze.zzl = 1;
                String property = System.getProperty("http.agent");
                zze.zzd.zzi = property != null ? property : "";
                return zze.zzd();
            case 8:
                zzchm zze2 = zzchm.zze("gmpsdksbackend-pa.googleapis.com");
                zze2.zzl = 1;
                String property2 = System.getProperty("http.agent");
                zze2.zzd.zzi = property2 != null ? property2 : "";
                return zze2.zzd();
            default:
                zzchm zze3 = zzchm.zze("places.googleapis.com");
                zze3.zzl = 1;
                String property3 = System.getProperty("http.agent");
                zze3.zzd.zzi = property3 != null ? property3 : "";
                return zze3.zzd();
        }
    }
}
