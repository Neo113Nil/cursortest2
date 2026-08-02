package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzegj implements zzgej {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzegk zzb;

    zzegj(zzegk zzegkVar, boolean z) {
        this.zza = z;
        this.zzb = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        zzcec.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                emptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1052618729:
                            if (str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbcn.AD_FORMAT_TYPE_UNSPECIFIED : zzbcn.REWARD_BASED_VIDEO_AD : zzbcn.NATIVE_APP_INSTALL : zzbcn.INTERSTITIAL : zzbcn.BANNER);
                }
                final zzbec zzb = zzegk.zzb(this.zzb, bundle);
                final zzbdt zza = zzegk.zza(this.zzb, bundle);
                zzegk zzegkVar = this.zzb;
                final boolean z = this.zza;
                zzegkVar.zza.zza(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzegi
                    @Override // com.google.android.gms.internal.ads.zzfkp
                    public final Object zza(Object obj3) {
                        zzegc zzegcVar;
                        zzegj zzegjVar = zzegj.this;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzegjVar.zzb.zzf()) {
                            return null;
                        }
                        zzbec zzbecVar = zzb;
                        zzbdt zzbdtVar = zza;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zze = zzegk.zze(zzegjVar.zzb, z2, arrayList2, zzbdtVar, zzbecVar);
                        zzegn.zzg(sQLiteDatabase, z2, true);
                        zzegcVar = zzegjVar.zzb.zzf;
                        zzegn.zzd(sQLiteDatabase, zzegcVar.zzd(), zze);
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        final zzbec zzb2 = zzegk.zzb(this.zzb, bundle);
        final zzbdt zza2 = zzegk.zza(this.zzb, bundle);
        zzegk zzegkVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzegkVar2.zza.zza(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj32) {
                zzegc zzegcVar;
                zzegj zzegjVar = zzegj.this;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzegjVar.zzb.zzf()) {
                    return null;
                }
                zzbec zzbecVar = zzb2;
                zzbdt zzbdtVar = zza2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zze = zzegk.zze(zzegjVar.zzb, z22, arrayList22, zzbdtVar, zzbecVar);
                zzegn.zzg(sQLiteDatabase, z22, true);
                zzegcVar = zzegjVar.zzb.zzf;
                zzegn.zzd(sQLiteDatabase, zzegcVar.zzd(), zze);
                return null;
            }
        });
    }
}
