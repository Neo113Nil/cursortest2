package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzfnu {
    private final zzemh zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfgz zzf;
    private final zzfha zzg;
    private final Clock zzh;
    private final zzavi zzi;

    public zzfnu(zzemh zzemhVar, zzcei zzceiVar, String str, String str2, Context context, zzfgz zzfgzVar, zzfha zzfhaVar, Clock clock, zzavi zzaviVar) {
        this.zza = zzemhVar;
        this.zzb = zzceiVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfgzVar;
        this.zzg = zzfhaVar;
        this.zzh = clock;
        this.zzi = zzaviVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        return TextUtils.isEmpty(str) ? "" : zzceb.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfgy zzfgyVar, zzfgm zzfgmVar, List list) {
        return zzd(zzfgyVar, zzfgmVar, false, "", "", list);
    }

    public final List zzd(zzfgy zzfgyVar, zzfgm zzfgmVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfgyVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES), "@gw_sdkver@", this.zzb);
            if (zzfgmVar != null) {
                zzj = zzccj.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfgmVar.zzz), "@gw_adnetid@", zzfgmVar.zzy), "@gw_allocid@", zzfgmVar.zzx), this.zze, zzfgmVar.zzX);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzdp)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            } else if (isEmpty) {
                arrayList.add(zzj2);
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zze(zzfgm zzfgmVar, List list, zzbzu zzbzuVar) {
        zzfgz zzfgzVar;
        zzfwz zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzc = zzbzuVar.zzc();
            String num = Integer.toString(zzbzuVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzdq)).booleanValue()) {
                zzfha zzfhaVar = this.zzg;
                if (zzfhaVar == null) {
                    zzd = zzfwz.zzc();
                    String str = (String) zzd.zza(new zzfws() { // from class: com.google.android.gms.internal.ads.zzfns
                        @Override // com.google.android.gms.internal.ads.zzfws
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzfnu.zzi(((zzfgz) obj).zza);
                            return zzi;
                        }
                    }).zzb("");
                    String str2 = (String) zzd.zza(new zzfws() { // from class: com.google.android.gms.internal.ads.zzfnt
                        @Override // com.google.android.gms.internal.ads.zzfws
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzfnu.zzi(((zzfgz) obj).zzb);
                            return zzi;
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzccj.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfgmVar.zzX));
                    }
                    return arrayList;
                }
                zzfgzVar = zzfhaVar.zza;
            } else {
                zzfgzVar = this.zzf;
            }
            zzd = zzfwz.zzd(zzfgzVar);
            String str3 = (String) zzd.zza(new zzfws() { // from class: com.google.android.gms.internal.ads.zzfns
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzfnu.zzi(((zzfgz) obj).zza);
                    return zzi;
                }
            }).zzb("");
            String str22 = (String) zzd.zza(new zzfws() { // from class: com.google.android.gms.internal.ads.zzfnt
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzfnu.zzi(((zzfgz) obj).zzb);
                    return zzi;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            zzcec.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
