package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzvo implements zzzg, zzug {
    final /* synthetic */ zzvt zza;
    private final Uri zzc;
    private final zzhx zzd;
    private final zzvi zze;
    private final zzacx zzf;
    private final zzeo zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzaea zzm;
    private boolean zzn;
    private final zzadr zzh = new zzadr();
    private boolean zzj = true;
    private final long zzb = zzui.zza();
    private zzhb zzl = zzi(0);

    public zzvo(zzvt zzvtVar, Uri uri, zzgw zzgwVar, zzvi zzviVar, zzacx zzacxVar, zzeo zzeoVar) {
        this.zza = zzvtVar;
        this.zzc = uri;
        this.zzd = new zzhx(zzgwVar);
        this.zze = zzviVar;
        this.zzf = zzacxVar;
        this.zzg = zzeoVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zzvo zzvoVar, long j, long j2) {
        zzvoVar.zzh.zza = j;
        zzvoVar.zzk = j2;
        zzvoVar.zzj = true;
        zzvoVar.zzn = false;
    }

    private final zzhb zzi(long j) {
        zzgz zzgzVar = new zzgz();
        zzgzVar.zzd(this.zzc);
        zzgzVar.zzc(j);
        zzgzVar.zza(6);
        zzgzVar.zzb(zzvt.zzb);
        return zzgzVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3 A[EDGE_INSN: B:101:0x01e3->B:79:0x01e3 BREAK  A[LOOP:1: B:60:0x01a0->B:71:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:50:0x017b, B:52:0x0186, B:53:0x018b, B:55:0x018f), top: B:49:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:50:0x017b, B:52:0x0186, B:53:0x018b, B:55:0x018f), top: B:49:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:0: B:2:0x0004->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    @Override // com.google.android.gms.internal.ads.zzzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i4;
        zzgw zzgwVar;
        zzvt zzvtVar;
        zzgw zzgwVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzhb zzi = zzi(j);
                this.zzl = zzi;
                long zzb = this.zzd.zzb(zzi);
                if (this.zzi) {
                    zzvi zzviVar = this.zze;
                    if (zzviVar.zzb() != -1) {
                        this.zzh.zza = zzviVar.zzb();
                    }
                    zzgy.zza(this.zzd);
                    return;
                }
                if (zzb != -1) {
                    zzb += j;
                    zzvt.zzC(this.zza);
                }
                long j2 = zzb;
                zzvt zzvtVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str4 = (String) list6.get(0);
                        try {
                            i8 = Integer.parseInt(str4) * 1000;
                        } catch (NumberFormatException unused) {
                            i8 = -1;
                        }
                        if (i8 > 0) {
                            i3 = i8;
                            z = true;
                            list = (List) zze.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zze.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zze.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zze.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zze.get("icy-metaint");
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i7 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused2) {
                                    i7 = -1;
                                }
                                if (i7 > 0) {
                                    i4 = i7;
                                    z = true;
                                    zzvtVar2.zzs = z ? new zzaga(i3, str, str2, str3, z2, i4) : null;
                                    zzgwVar = this.zzd;
                                    zzvtVar = this.zza;
                                    if (zzvtVar.zzs != null || zzvtVar.zzs.zzf == -1) {
                                        zzgwVar2 = zzgwVar;
                                    } else {
                                        zzgw zzuhVar = new zzuh(zzgwVar, zzvtVar.zzs.zzf, this);
                                        zzaea zzv = this.zza.zzv();
                                        this.zzm = zzv;
                                        zzv.zzl(zzvt.zzc);
                                        zzgwVar2 = zzuhVar;
                                    }
                                    this.zze.zzd(zzgwVar2, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                    if (this.zza.zzs != null) {
                                        this.zze.zzc();
                                    }
                                    if (this.zzj) {
                                        this.zze.zzf(j, this.zzk);
                                        i = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i;
                                            if (i2 != 1) {
                                            }
                                            zzgy.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    long j3 = j;
                                    i5 = i;
                                    while (true) {
                                        if (i5 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i5 = i;
                                                break;
                                            }
                                            try {
                                                this.zzg.zza();
                                                i5 = this.zze.zza(this.zzh);
                                                long zzb2 = this.zze.zzb();
                                                if (zzb2 > this.zza.zzj + j3) {
                                                    this.zzg.zzc();
                                                    zzvt zzvtVar3 = this.zza;
                                                    zzvtVar3.zzp.post(zzvtVar3.zzo);
                                                    j3 = zzb2;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = i5;
                                            if (i2 != 1) {
                                                zzvi zzviVar2 = this.zze;
                                                if (zzviVar2.zzb() != -1) {
                                                    this.zzh.zza = zzviVar2.zzb();
                                                }
                                            }
                                            zzgy.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i5 == 1) {
                                        i6 = i;
                                    } else {
                                        zzvi zzviVar3 = this.zze;
                                        if (zzviVar3.zzb() != -1) {
                                            this.zzh.zza = zzviVar3.zzb();
                                        }
                                        i6 = i5;
                                    }
                                    zzgy.zza(this.zzd);
                                    if (i6 != 0) {
                                        return;
                                    }
                                } else {
                                    try {
                                        zzff.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                    } catch (NumberFormatException unused4) {
                                        zzff.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i4 = i7;
                                        zzvtVar2.zzs = z ? new zzaga(i3, str, str2, str3, z2, i4) : null;
                                        zzgwVar = this.zzd;
                                        zzvtVar = this.zza;
                                        if (zzvtVar.zzs != null) {
                                        }
                                        zzgwVar2 = zzgwVar;
                                        this.zze.zzd(zzgwVar2, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                        if (this.zza.zzs != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        long j32 = j;
                                        i5 = i;
                                        while (true) {
                                            if (i5 != 0) {
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                        zzgy.zza(this.zzd);
                                        if (i6 != 0) {
                                        }
                                    }
                                }
                            }
                            i4 = -1;
                            zzvtVar2.zzs = z ? new zzaga(i3, str, str2, str3, z2, i4) : null;
                            zzgwVar = this.zzd;
                            zzvtVar = this.zza;
                            if (zzvtVar.zzs != null) {
                            }
                            zzgwVar2 = zzgwVar;
                            this.zze.zzd(zzgwVar2, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                            if (this.zza.zzs != null) {
                            }
                            if (this.zzj) {
                            }
                            long j322 = j;
                            i5 = i;
                            while (true) {
                                if (i5 != 0) {
                                }
                            }
                            if (i5 == 1) {
                            }
                            zzgy.zza(this.zzd);
                            if (i6 != 0) {
                            }
                        } else {
                            try {
                                zzff.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                            } catch (NumberFormatException unused5) {
                                zzff.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z = false;
                                i3 = i8;
                                list = (List) zze.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zze.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zze.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zze.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zze.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i4 = -1;
                                zzvtVar2.zzs = z ? new zzaga(i3, str, str2, str3, z2, i4) : null;
                                zzgwVar = this.zzd;
                                zzvtVar = this.zza;
                                if (zzvtVar.zzs != null) {
                                }
                                zzgwVar2 = zzgwVar;
                                this.zze.zzd(zzgwVar2, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzs != null) {
                                }
                                if (this.zzj) {
                                }
                                long j3222 = j;
                                i5 = i;
                                while (true) {
                                    if (i5 != 0) {
                                    }
                                }
                                if (i5 == 1) {
                                }
                                zzgy.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                    }
                    this.zze.zzd(zzgwVar2, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                    if (this.zza.zzs != null) {
                    }
                    if (this.zzj) {
                    }
                    long j32222 = j;
                    i5 = i;
                    while (true) {
                        if (i5 != 0) {
                        }
                    }
                    if (i5 == 1) {
                    }
                    zzgy.zza(this.zzd);
                    if (i6 != 0) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                }
                z = false;
                i3 = -1;
                list = (List) zze.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zze.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zze.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 != null) {
                }
                i4 = -1;
                zzvtVar2.zzs = z ? new zzaga(i3, str, str2, str3, z2, i4) : null;
                zzgwVar = this.zzd;
                zzvtVar = this.zza;
                if (zzvtVar.zzs != null) {
                }
                zzgwVar2 = zzgwVar;
            } catch (Throwable th4) {
                th = th4;
                i = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zza(zzfp zzfpVar) {
        long max = !this.zzn ? this.zzk : Math.max(zzvt.zzr(this.zza, true), this.zzk);
        int zzb = zzfpVar.zzb();
        zzaea zzaeaVar = this.zzm;
        zzaeaVar.getClass();
        zzady.zzb(zzaeaVar, zzfpVar, zzb);
        zzaeaVar.zzt(max, 1, zzb, 0, null);
        this.zzn = true;
    }
}
