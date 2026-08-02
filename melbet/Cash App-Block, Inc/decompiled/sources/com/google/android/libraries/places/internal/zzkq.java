package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.zzb;
import com.google.android.libraries.places.api.net.zzk;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzkq extends com.google.android.gms.internal.time.zzbb {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzkq(zznk zznkVar, Locale locale, String str, zzje zzjeVar, int i) {
        super(zznkVar, locale, str, zzjeVar);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.time.zzbb
    public final HashMap zza() {
        String trim;
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                zzb zzbVar = (zzb) ((zznk) obj);
                PhotoMetadata photoMetadata = zzbVar.zzc;
                HashMap hashMap = new HashMap();
                com.google.android.gms.internal.time.zzbb.zzg(hashMap, "maxheight", zzbVar.zzb);
                com.google.android.gms.internal.time.zzbb.zzg(hashMap, "maxwidth", zzbVar.zza);
                hashMap.put("photoreference", ((com.google.android.libraries.places.api.model.zzfg) photoMetadata).zzd);
                return hashMap;
            case 1:
                com.google.android.libraries.places.api.net.zze zzeVar = (com.google.android.libraries.places.api.net.zze) ((zznk) obj);
                HashMap hashMap2 = new HashMap();
                com.google.android.gms.internal.time.zzbb.zzg(hashMap2, "placeid", zzeVar.zza);
                com.google.android.gms.internal.time.zzbb.zzg(hashMap2, "sessiontoken", zzeVar.zzc);
                com.google.android.gms.internal.time.zzbb.zzg(hashMap2, "fields", zzmq.zzb(zzeVar.zzb));
                return hashMap2;
            default:
                HashMap hashMap3 = new HashMap();
                zzk zzkVar = (zzk) ((zznk) obj);
                List list = zzkVar.zzg;
                String str = zzkVar.zza;
                if (str == null) {
                    trim = null;
                } else {
                    trim = str.trim();
                    if (!trim.isEmpty() && Character.isWhitespace(str.charAt(str.length() - 1))) {
                        trim = trim.concat(" ");
                    }
                }
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "input", trim);
                if (!list.isEmpty()) {
                    com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "types", TextUtils.join("|", list));
                }
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "sessiontoken", zzkVar.zzf);
                RegularImmutableMap regularImmutableMap = zzmp.zza;
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "origin", null);
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "locationbias", null);
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "locationrestriction", null);
                List<String> list2 = zzkVar.zze;
                StringBuilder sb = new StringBuilder();
                for (String str2 : list2) {
                    String concat = TextUtils.isEmpty(str2) ? null : "country:".concat(String.valueOf(str2.toLowerCase(Locale.US)));
                    if (concat != null) {
                        if (sb.length() != 0) {
                            sb.append('|');
                        }
                        sb.append(concat);
                    }
                }
                com.google.android.gms.internal.time.zzbb.zzg(hashMap3, "components", sb.length() != 0 ? sb.toString() : null);
                return hashMap3;
        }
    }

    @Override // com.google.android.gms.internal.time.zzbb
    public final String zzb() {
        switch (this.$r8$classId) {
            case 0:
                return "photo";
            case 1:
                return "details/json";
            default:
                return "autocomplete/json";
        }
    }
}
