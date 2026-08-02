package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzmb extends zzg {
    public zzlu zza;
    public volatile zzlu zzb;
    public volatile zzlu zzc;
    public final ConcurrentHashMap zzd;
    public zzdd zze;
    public volatile boolean zzf;
    public volatile zzlu zzg;
    public zzlu zzh;
    public boolean zzi;
    public final Object zzj;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final zzlu zzh(boolean z) {
        zzb$1();
        zzg();
        zzlu zzluVar = this.zza;
        return (z && zzluVar == null) ? this.zzh : zzluVar;
    }

    public final String zzi(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        zzic zzicVar = (zzic) this.$$delegate_0;
        int length2 = str2.length();
        zzicVar.zzg.getClass();
        if (length2 <= 500) {
            return str2;
        }
        zzicVar.zzg.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm(zzlu zzluVar, zzlu zzluVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = zzluVar.zze;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        boolean z4 = false;
        if (zzluVar2 != null) {
            if (zzluVar2.zzc == zzluVar.zzc && Objects.equals(zzluVar2.zzb, zzluVar.zzb) && Objects.equals(zzluVar2.zza, zzluVar.zza)) {
                z2 = false;
                if (z && this.zza != null) {
                    z4 = true;
                }
                if (z2) {
                    Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
                    zzpp.zzay(zzluVar, bundle3, true);
                    if (zzluVar2 != null) {
                        String str = zzluVar2.zza;
                        if (str != null) {
                            bundle3.putString("_pn", str);
                        }
                        String str2 = zzluVar2.zzb;
                        if (str2 != null) {
                            bundle3.putString("_pc", str2);
                        }
                        bundle3.putLong("_pi", zzluVar2.zzc);
                    }
                    if (z4) {
                        zzoc zzocVar = zzicVar.zzk;
                        zzic.zzO(zzocVar);
                        zzoa zzoaVar = zzocVar.zzb;
                        long j3 = j - zzoaVar.zzb;
                        zzoaVar.zzb = j;
                        if (j3 > 0) {
                            zzpp zzppVar = zzicVar.zzl;
                            zzic.zzN(zzppVar);
                            zzppVar.zzan(bundle3, j3);
                        }
                    }
                    zzal zzalVar = zzicVar.zzg;
                    DefaultClock defaultClock = zzicVar.zzn;
                    if (!zzalVar.zzv()) {
                        bundle3.putLong("_mst", 1L);
                    }
                    String str3 = true != z3 ? "auto" : "app";
                    defaultClock.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j4 = zzluVar.zzf;
                        if (j4 != 0) {
                            j2 = j4;
                            long elapsedRealtime = !zzicVar.zzg.zzp(null, zzfy.zzbe) ? SystemClock.elapsedRealtime() : 0L;
                            if (z3) {
                                bundle2 = bundle3;
                            } else {
                                bundle2 = bundle3;
                                long j5 = zzluVar.zzg;
                                if (j5 != 0) {
                                    elapsedRealtime = j5;
                                }
                            }
                            zzlj zzljVar = zzicVar.zzp;
                            zzic.zzO(zzljVar);
                            zzljVar.zzF(j2, elapsedRealtime, bundle2, str3, "_vs");
                        }
                    }
                    j2 = currentTimeMillis;
                    if (!zzicVar.zzg.zzp(null, zzfy.zzbe)) {
                    }
                    if (z3) {
                    }
                    zzlj zzljVar2 = zzicVar.zzp;
                    zzic.zzO(zzljVar2);
                    zzljVar2.zzF(j2, elapsedRealtime, bundle2, str3, "_vs");
                }
                if (z4) {
                    zzy(this.zza, true, j);
                }
                this.zza = zzluVar;
                if (z3) {
                    this.zzh = zzluVar;
                }
                zznl zzt = zzicVar.zzt();
                zzt.zzg();
                zzt.zzb$1();
                zzt.zzaf(new com.google.android.gms.tasks.zzi(zzt, zzluVar));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.zza = zzluVar;
        if (z3) {
        }
        zznl zzt2 = zzicVar.zzt();
        zzt2.zzg();
        zzt2.zzb$1();
        zzt2.zzaf(new com.google.android.gms.tasks.zzi(zzt2, zzluVar));
    }

    public final void zzn(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((zzic) this.$$delegate_0).zzg.zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzddVar.zza), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzx(String str, zzlu zzluVar, boolean z) {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzluVar.zzb == null) {
            zzluVar2 = new zzlu(zzluVar.zza, str != null ? zzi(str) : null, zzluVar.zzc, zzluVar.zze, zzluVar.zzf, zzluVar.zzg);
        } else {
            zzluVar2 = zzluVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzluVar2;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.zzn.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzlw(this, zzluVar2, zzluVar3, elapsedRealtime, z));
    }

    public final void zzy(zzlu zzluVar, boolean z, long j) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzd zzdVar = zzicVar.zzq;
        zzic.zzM(zzdVar);
        zzicVar.zzn.getClass();
        zzdVar.zzc(SystemClock.elapsedRealtime());
        boolean z2 = zzluVar != null && zzluVar.zzd;
        zzoc zzocVar = zzicVar.zzk;
        zzic.zzO(zzocVar);
        if (!zzocVar.zzb.zzd(j, z2, z) || zzluVar == null) {
            return;
        }
        zzluVar.zzd = false;
    }

    public final zzlu zzz(zzdd zzddVar) {
        zzae.checkNotNull(zzddVar);
        Integer valueOf = Integer.valueOf(zzddVar.zza);
        ConcurrentHashMap concurrentHashMap = this.zzd;
        zzlu zzluVar = (zzlu) concurrentHashMap.get(valueOf);
        if (zzluVar == null) {
            String zzi = zzi(zzddVar.zzb);
            zzpp zzppVar = ((zzic) this.$$delegate_0).zzl;
            zzic.zzN(zzppVar);
            zzlu zzluVar2 = new zzlu(null, zzi, zzppVar.zzd());
            concurrentHashMap.put(valueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.zzg != null ? this.zzg : zzluVar;
    }
}
