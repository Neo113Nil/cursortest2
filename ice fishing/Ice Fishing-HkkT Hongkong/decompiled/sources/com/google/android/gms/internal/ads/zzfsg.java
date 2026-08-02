package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzfsg {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfsg(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfsh.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfsh.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzayc zzaycVar, zzfsm zzfsmVar) {
        boolean z;
        zzayf zzb;
        zzayf zzb2;
        String zzk = zzaycVar.zzd().zzk();
        byte[] zzA = zzaycVar.zzf().zzA();
        byte[] zzA2 = zzaycVar.zze().zzA();
        if (!TextUtils.isEmpty(zzk) && zzA2 != null && zzA2.length != 0) {
            zzfsh.zzd(this.zza);
            this.zza.mkdirs();
            zzfsh.zzc(zzk, this.zza).mkdirs();
            File zzb3 = zzfsh.zzb(zzk, "pcam.jar", this.zza);
            if ((zzA == null || zzA.length <= 0 || zzfsh.zze(zzb3, zzA)) && zzfsh.zze(zzfsh.zzb(zzk, "pcbc", this.zza), zzA2)) {
                File zzb4 = zzfsh.zzb(zzaycVar.zzd().zzk(), "pcam.jar", this.zza);
                if (zzb4.exists() && zzfsmVar != null && !zzfsmVar.zza(zzb4)) {
                    return false;
                }
                String zzk2 = zzaycVar.zzd().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb5 = zzfsh.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb6 = zzfsh.zzb(zzk2, "pcbc", this.zza);
                    File zzb7 = zzfsh.zzb(zzk2, "pcam.jar", zzd());
                    File zzb8 = zzfsh.zzb(zzk2, "pcbc", zzd());
                    if ((!zzb5.exists() || zzb5.renameTo(zzb7)) && zzb6.exists() && zzb6.renameTo(zzb8)) {
                        zzaye zze = zzayf.zze();
                        zze.zze(zzaycVar.zzd().zzk());
                        zze.zza(zzaycVar.zzd().zzj());
                        zze.zzb(zzaycVar.zzd().zza());
                        zze.zzd(zzaycVar.zzd().zzd());
                        zze.zzc(zzaycVar.zzd().zzc());
                        zzayf zzayfVar = (zzayf) zze.zzal();
                        zzayf zzb9 = zzb(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzb9 != null && !zzayfVar.zzk().equals(zzb9.zzk())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzb9.zzax()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzayfVar.zzax()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzb = zzb(1);
                            if (zzb != null) {
                                hashSet.add(zzb.zzk());
                            }
                            zzb2 = zzb(2);
                            if (zzb2 != null) {
                                hashSet.add(zzb2.zzk());
                            }
                            for (File file : zzd().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zzfsh.zzd(zzfsh.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                zzb = zzb(1);
                if (zzb != null) {
                }
                zzb2 = zzb(2);
                if (zzb2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    final zzayf zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.zzb;
            zzayf zzh = zzayf.zzh(zzgyl.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfsh.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfsh.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfsh.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzhag unused) {
        }
        return null;
    }

    public final zzfsf zzc(int i) {
        zzayf zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfsh.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfsh.zzb(zzk, "pcam", zzd());
        }
        return new zzfsf(zzb, zzb2, zzfsh.zzb(zzk, "pcbc", zzd()), zzfsh.zzb(zzk, "pcopt", zzd()));
    }
}
