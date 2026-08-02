package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzbhv extends zzbjr {
    private static final zzbhv zzx;
    private static volatile zzblh zzy;
    private int zzb;
    private int zzh;
    private boolean zzj;
    private double zzk;
    private int zzl;
    private int zzm;
    private boolean zzp;
    private zzbhq zzq;
    private zzbhs zzr;
    private zzbho zzs;
    private zzbgz zzt;
    private zzbhu zzu;
    private boolean zzv;
    private boolean zzw;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzn = "";
    private zzbjz zzo = zzbjs.zzb;

    static {
        zzbhv zzbhvVar = new zzbhv();
        zzx = zzbhvVar;
        zzbjr.zzbF(zzbhv.class, zzbhvVar);
    }

    public static zzbhm zza$1() {
        return (zzbhm) zzx.zzbB();
    }

    public static zzbhv zzc() {
        return zzx;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzx, "\u0000\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007\u0007\t\u0000\n\u0004\u000b,\f\u0007\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0004\u0013Ȉ\u0014\u0007\u0015\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzm", "zzn", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzbhv();
        }
        if (i2 == 4) {
            return new zzbhm(zzx);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzy;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbhv.class) {
            try {
                zzblhVar = zzy;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzx);
                    zzy = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zze = str;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzf = str;
    }

    public final /* synthetic */ void zzh(boolean z) {
        this.zzj = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzl(ArrayList arrayList) {
        zzbjz zzbjzVar = this.zzo;
        if (!((zzbic) zzbjzVar).zza) {
            this.zzo = zzbjr.zzbK(zzbjzVar);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzbgp zzbgpVar = (zzbgp) it.next();
            ((zzbjs) this.zzo).zzh(zzbgpVar.zza());
        }
    }

    public final /* synthetic */ void zzm(boolean z) {
        this.zzp = false;
    }

    public final /* synthetic */ void zzu(int i) {
        this.zzh = i - 2;
    }
}
