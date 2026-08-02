package com.google.android.libraries.places.internal;

import android.content.SharedPreferences;
import androidx.tracing.Trace;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfm implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzfm(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SharedPreferences.Editor putString;
        switch (this.$r8$classId) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit == null || (putString = edit.putString("zb", (String) this.zza)) == null) {
                    return null;
                }
                putString.apply();
                return Unit.INSTANCE;
            default:
                com.google.android.gms.maps.zzah zzahVar = (com.google.android.gms.maps.zzah) this.zza;
                String str = (String) obj;
                str.getClass();
                zzbsd zzbsdVar = (zzbsd) zzahVar.f68zza;
                zzbov zzh = zzbov.zza.zzh(zzcko.zza, zzckm.zzb);
                Trace.checkNotNull(zzbsdVar, AppsFlyerProperties.CHANNEL);
                zzbng zzc = zzbnh.zzc();
                zzc.zzy();
                ((zzbnh) zzc.zza).zzf(str);
                zzbnh zzbnhVar = (zzbnh) zzc.zzD();
                Schema schema = zzey.f69zza;
                if (schema == null) {
                    synchronized (zzey.class) {
                        try {
                            schema = zzey.f69zza;
                            if (schema == null) {
                                zzbso zzi = Schema.zzi();
                                zzi.zzc = zzbsq.zza;
                                zzi.zzd = Schema.zzh("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession");
                                zzi.zze = true;
                                zzbnh zze = zzbnh.zze();
                                zzbjc zzbjcVar = zzckb.zza;
                                zzi.zza = new zzcka(zze);
                                zzi.zzb = new zzcka(zzbnj.zze());
                                schema = zzi.zzf();
                                zzey.f69zza = schema;
                            }
                        } finally {
                        }
                    }
                }
                return zzcko.zzb(zzbsdVar.zza(schema, zzh), zzbnhVar);
        }
    }
}
