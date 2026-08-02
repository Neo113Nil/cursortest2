package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.measurement.zzil;
import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzou extends zzol {
    public static final boolean zzf(String str) {
        String str2 = (String) zzfy.zzs.zzb(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (java.lang.Math.abs(r8.hashCode() % 100) < r9.zzq().zzc$1()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzot zza(String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzpg zzpgVar = this.zzg;
        zzaw zzawVar = zzpgVar.zze;
        zzht zzhtVar = zzpgVar.zzc;
        zzpg.zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        zzls zzlsVar = zzls.GOOGLE_ANALYTICS;
        zzot zzotVar = null;
        if (zzu == null || !zzu.zzai()) {
            return new zzot(zzd$1(str), Collections.EMPTY_MAP, zzlsVar, null);
        }
        zzil zzb = zzis.zzb();
        zzb.zzb$1(2);
        int _zzb = FillrEnv$EnumUnboxingLocalUtility._zzb(zzu.zzaL());
        FillrEnv$EnumUnboxingLocalUtility.m(_zzb);
        zzb.zza$2(_zzb);
        String zzd = zzu.zzd();
        zzpg.zzaT(zzhtVar);
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzhtVar.zzb(str);
        if (zzb2 != null) {
            zzaw zzawVar2 = zzpgVar.zze;
            zzpg.zzaT(zzawVar2);
            zzh zzu2 = zzawVar2.zzu(str);
            if (zzu2 != null) {
                if (!zzb2.zzp() || zzb2.zzq().zzc$1() != 100) {
                    zzpp zzppVar = zzicVar.zzl;
                    zzic.zzN(zzppVar);
                    if (!zzppVar.zzad(str, zzu2.zzay())) {
                        if (!TextUtils.isEmpty(zzd)) {
                        }
                    }
                }
                String zzc = zzu.zzc();
                zzb.zzb$1(2);
                zzpg.zzaT(zzhtVar);
                com.google.android.gms.internal.measurement.zzgl zzb3 = zzhtVar.zzb(zzu.zzc());
                if (zzb3 == null || !zzb3.zzp()) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(zzc, "[sgtm] Missing sgtm_setting in remote config. appId");
                    zzb.zzc(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(zzu.zzay())) {
                        hashMap.put("x-gtm-server-preview", zzu.zzay());
                    }
                    String zzd2 = zzb3.zzq().zzd();
                    int _zzb2 = FillrEnv$EnumUnboxingLocalUtility._zzb(zzu.zzaL());
                    if (_zzb2 != 0 && _zzb2 != 2) {
                        zzb.zza$2(_zzb2);
                    } else if (zzf(zzu.zzc())) {
                        zzb.zza$2(11);
                    } else if (TextUtils.isEmpty(zzd2)) {
                        zzb.zza$2(12);
                    } else {
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzl.zzb(zzc, "[sgtm] Eligible for client side upload. appId");
                        zzb.zzb$1(3);
                        zzb.zza$2(2);
                        zzotVar = new zzot(zzd2, hashMap, zzls.SGTM_CLIENT, (zzis) zzb.zzbd());
                    }
                    zzb3.zzq().getClass();
                    zzb3.zzq().getClass();
                    zzicVar.getClass();
                    zzgu zzguVar3 = zzicVar.zzi;
                    if (TextUtils.isEmpty(zzd2)) {
                        zzb.zzc(6);
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzl.zzb(zzu.zzc(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzl.zzb(zzc, "[sgtm] Eligible for local service direct upload. appId");
                        zzb.zzb$1(5);
                        zzb.zzc(2);
                        zzotVar = new zzot(zzd2, hashMap, zzls.SGTM, (zzis) zzb.zzbd());
                    }
                }
                return zzotVar != null ? zzotVar : new zzot(zzd$1(str), Collections.EMPTY_MAP, zzlsVar, (zzis) zzb.zzbd());
            }
        }
        zzb.zzc(3);
        return new zzot(zzd$1(str), Collections.EMPTY_MAP, zzlsVar, (zzis) zzb.zzbd());
    }

    public final String zzd$1(String str) {
        zzht zzhtVar = this.zzg.zzc;
        zzpg.zzaT(zzhtVar);
        String zzc = zzhtVar.zzc(str);
        if (TextUtils.isEmpty(zzc)) {
            return (String) zzfy.zzq.zzb(null);
        }
        Uri parse = Uri.parse((String) zzfy.zzq.zzb(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 1 + String.valueOf(authority).length());
        sb.append(zzc);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
