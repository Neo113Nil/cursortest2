package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzkz implements Handler.Callback, zzuo, zzyn, zzlw, zziw, zzlz {
    private boolean zzB;
    private boolean zzE;
    private int zzF;
    private zzky zzG;
    private long zzH;
    private int zzI;
    private boolean zzJ;
    private zziz zzK;
    private final zzjk zzM;
    private final zziu zzN;
    private final zzmf[] zza;
    private final Set zzb;
    private final zzmh[] zzc;
    private final zzyo zzd;
    private final zzyp zze;
    private final zzlc zzf;
    private final zzyw zzg;
    private final zzew zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcw zzk;
    private final zzcu zzl;
    private final long zzm;
    private final zzix zzn;
    private final ArrayList zzo;
    private final zzel zzp;
    private final zzll zzq;
    private final zzlx zzr;
    private final long zzs;
    private zzmj zzt;
    private zzly zzu;
    private zzkx zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzC = 0;
    private boolean zzD = false;
    private boolean zzx = false;
    private long zzL = -9223372036854775807L;
    private long zzA = -9223372036854775807L;

    public zzkz(zzmf[] zzmfVarArr, zzyo zzyoVar, zzyp zzypVar, zzlc zzlcVar, zzyw zzywVar, int i, boolean z, zzmp zzmpVar, zzmj zzmjVar, zziu zziuVar, long j, boolean z2, Looper looper, zzel zzelVar, zzjk zzjkVar, zzpb zzpbVar, Looper looper2) {
        this.zzM = zzjkVar;
        this.zza = zzmfVarArr;
        this.zzd = zzyoVar;
        this.zze = zzypVar;
        this.zzf = zzlcVar;
        this.zzg = zzywVar;
        int i2 = 0;
        this.zzt = zzmjVar;
        this.zzN = zziuVar;
        this.zzs = j;
        this.zzp = zzelVar;
        this.zzm = zzlcVar.zza();
        zzlcVar.zzf();
        this.zzu = zzly.zzg(zzypVar);
        this.zzv = new zzkx(this.zzu);
        int length = zzmfVarArr.length;
        this.zzc = new zzmh[2];
        zzmg zzd = zzyoVar.zzd();
        while (true) {
            int length2 = zzmfVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzix(this, zzelVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzcw();
                this.zzl = new zzcu();
                zzyoVar.zzs(this, zzywVar);
                this.zzJ = true;
                zzew zzb = zzelVar.zzb(looper, null);
                this.zzq = new zzll(zzmpVar, zzb, new zzkr(this));
                this.zzr = new zzlx(this, zzmpVar, zzb, zzpbVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzj = looper3;
                this.zzh = zzelVar.zzb(looper3, this);
                return;
            }
            zzmfVarArr[i2].zzu(i2, zzpbVar, zzelVar);
            this.zzc[i2] = zzmfVarArr[i2].zzl();
            this.zzc[i2].zzK(zzd);
            i2++;
        }
    }

    private final void zzA(zzmf zzmfVar) throws zziz {
        if (zzaf(zzmfVar)) {
            this.zzn.zzd(zzmfVar);
            zzam(zzmfVar);
            zzmfVar.zzq();
            this.zzF--;
        }
    }

    private final void zzB() throws zziz {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j) throws zziz {
        zzli zzf = this.zzq.zzf();
        zzyp zzi = zzf.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzH();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zzf.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzmf zzmfVar = this.zza[i2];
                if (!zzaf(zzmfVar)) {
                    zzll zzllVar = this.zzq;
                    zzli zzf2 = zzllVar.zzf();
                    boolean z2 = zzf2 == zzllVar.zze();
                    zzyp zzi2 = zzf2.zzi();
                    zzmi zzmiVar = zzi2.zzb[i2];
                    zzam[] zzak = zzak(zzi2.zzc[i2]);
                    boolean z3 = zzai() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzF++;
                    this.zzb.add(zzmfVar);
                    zzmfVar.zzr(zzmiVar, zzak, zzf2.zzc[i2], this.zzH, z4, z2, j, zzf2.zze(), zzf2.zzf.zza);
                    zzmfVar.zzt(11, new zzks(this));
                    this.zzn.zze(zzmfVar);
                    if (z3) {
                        zzmfVar.zzN();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzll zzllVar = this.zzq;
        zziz zzc = zziz.zzc(iOException, i);
        zzli zze = zzllVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzff.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzW(false, false);
        this.zzu = this.zzu.zzd(zzc);
    }

    private final void zzE(boolean z) {
        zzli zzd = this.zzq.zzd();
        zzur zzurVar = zzd == null ? this.zzu.zzb : zzd.zzf.zza;
        boolean equals = this.zzu.zzk.equals(zzurVar);
        if (!equals) {
            this.zzu = this.zzu.zza(zzurVar);
        }
        zzly zzlyVar = this.zzu;
        zzlyVar.zzp = zzd == null ? zzlyVar.zzr : zzd.zzc();
        this.zzu.zzq = zzt();
        if ((!equals || z) && zzd != null && zzd.zzd) {
            zzZ(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ab  */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzcx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzF(zzcx zzcxVar, boolean z) throws zziz {
        ?? r21;
        zzur zzurVar;
        zzcu zzcuVar;
        int i;
        zzcw zzcwVar;
        long j;
        Object obj;
        int i2;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        long j3;
        boolean z6;
        long j4;
        boolean z7;
        boolean z8;
        boolean z9;
        zzur zzurVar2;
        long j5;
        int i4;
        boolean z10;
        int i5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        int i7;
        boolean z15;
        int i8;
        zzky zzkyVar;
        zzky zzkyVar2;
        int i9;
        boolean z16;
        boolean z17;
        long j6;
        int i10;
        boolean z18;
        int i11;
        boolean z19;
        zzly zzlyVar = this.zzu;
        zzky zzkyVar3 = this.zzG;
        int i12 = this.zzC;
        boolean z20 = this.zzD;
        if (zzcxVar.zzo()) {
            zzurVar2 = zzly.zzh();
            j5 = -9223372036854775807L;
            z7 = false;
            z8 = true;
            z9 = false;
            z6 = true;
            j4 = 0;
            j = 0;
        } else {
            zzcu zzcuVar2 = this.zzl;
            zzur zzurVar3 = zzlyVar.zzb;
            Object obj2 = zzurVar3.zza;
            boolean zzah = zzah(zzlyVar, zzcuVar2);
            r21 = (zzlyVar.zzb.zzb() || zzah) ? zzlyVar.zzc : zzlyVar.zzr;
            zzcw zzcwVar2 = this.zzk;
            if (zzkyVar3 != null) {
                zzurVar = zzurVar3;
                zzcuVar = zzcuVar2;
                Pair zzy = zzy(zzcxVar, zzkyVar3, true, i12, z20, zzcwVar2, zzcuVar);
                if (zzy == null) {
                    i5 = zzcxVar.zzg(z20);
                    j2 = r21;
                    obj = obj2;
                    z12 = false;
                    z11 = false;
                    z13 = true;
                } else {
                    if (zzkyVar3.zzc == -9223372036854775807L) {
                        i5 = zzcxVar.zzn(zzy.first, zzcuVar).zzd;
                        j2 = r21;
                        obj = obj2;
                        z10 = false;
                    } else {
                        Object obj3 = zzy.first;
                        j2 = ((Long) zzy.second).longValue();
                        obj = obj3;
                        z10 = true;
                        i5 = -1;
                    }
                    z11 = zzlyVar.zze == 4;
                    z12 = z10;
                    z13 = false;
                }
                z2 = z11;
                z3 = z13;
                i2 = i5;
                zzcwVar = zzcwVar2;
                i = -1;
                j = 0;
                z4 = z12;
            } else {
                zzurVar = zzurVar3;
                zzcuVar = zzcuVar2;
                if (zzlyVar.zza.zzo()) {
                    i2 = zzcxVar.zzg(z20);
                    zzcwVar = zzcwVar2;
                    j2 = r21;
                    obj = obj2;
                    z2 = false;
                    z3 = false;
                    i = -1;
                } else if (zzcxVar.zza(obj2) == -1) {
                    i = -1;
                    Object zzf = zzf(zzcwVar2, zzcuVar, i12, z20, obj2, zzlyVar.zza, zzcxVar);
                    if (zzf == null) {
                        i3 = zzcxVar.zzg(z20);
                        z5 = true;
                    } else {
                        i3 = zzcxVar.zzn(zzf, zzcuVar).zzd;
                        z5 = false;
                    }
                    i2 = i3;
                    z3 = z5;
                    obj = obj2;
                    zzcwVar = zzcwVar2;
                    j2 = r21;
                    z2 = false;
                } else {
                    i = -1;
                    if (r21 == -9223372036854775807L) {
                        i2 = zzcxVar.zzn(obj2, zzcuVar).zzd;
                        obj = obj2;
                        zzcwVar = zzcwVar2;
                        j2 = r21;
                        z2 = false;
                        z3 = false;
                    } else if (zzah) {
                        zzlyVar.zza.zzn(zzurVar.zza, zzcuVar);
                        zzcwVar = zzcwVar2;
                        if (zzlyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzp == zzlyVar.zza.zza(zzurVar.zza)) {
                            j = 0;
                            Pair zzl = zzcxVar.zzl(zzcwVar, zzcuVar, zzcxVar.zzn(obj2, zzcuVar).zzd, r21);
                            Object obj4 = zzl.first;
                            j2 = ((Long) zzl.second).longValue();
                            obj = obj4;
                        } else {
                            j = 0;
                            obj = obj2;
                            j2 = r21;
                        }
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzcwVar = zzcwVar2;
                        j = 0;
                        obj = obj2;
                        i2 = -1;
                        j2 = r21;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z4 = false;
                j = 0;
            }
            if (i2 != i) {
                Pair zzl2 = zzcxVar.zzl(zzcwVar, zzcuVar, i2, -9223372036854775807L);
                Object obj5 = zzl2.first;
                long longValue = ((Long) zzl2.second).longValue();
                obj = obj5;
                j3 = longValue;
                j2 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            zzur zzi = this.zzq.zzi(zzcxVar, obj, j3);
            int i13 = zzi.zze;
            boolean z21 = zzurVar.zza.equals(obj) && !zzurVar.zzb() && !zzi.zzb() && (i13 == i || ((i4 = zzurVar.zze) != i && i13 >= i4));
            zzcu zzn = zzcxVar.zzn(obj, zzcuVar);
            if (!zzah && r21 == j2 && zzurVar.zza.equals(zzi.zza)) {
                if (zzurVar.zzb()) {
                    zzn.zzn(zzurVar.zzb);
                }
                if (zzi.zzb()) {
                    zzn.zzn(zzi.zzb);
                }
            }
            z6 = true;
            if (true == z21) {
                zzi = zzurVar;
            }
            if (zzi.zzb()) {
                if (zzi.equals(zzurVar)) {
                    j3 = zzlyVar.zzr;
                } else {
                    zzcxVar.zzn(zzi.zza, zzcuVar);
                    if (zzi.zzc == zzcuVar.zze(zzi.zzb)) {
                        zzcuVar.zzj();
                    }
                    j3 = j;
                }
            }
            j4 = j3;
            z7 = z2;
            z8 = z3;
            z9 = z4;
            zzurVar2 = zzi;
            j5 = j2;
        }
        boolean z22 = (this.zzu.zzb.equals(zzurVar2) && j4 == this.zzu.zzr) ? false : z6;
        if (z8) {
            try {
                if (this.zzu.zze != z6) {
                    i6 = 4;
                    try {
                        zzU(4);
                    } catch (Throwable th) {
                        th = th;
                        i7 = 4;
                        z15 = z9;
                        zzkyVar = null;
                        i8 = i7;
                        zzly zzlyVar2 = this.zzu;
                        zzab(zzcxVar, zzurVar2, zzlyVar2.zza, zzlyVar2.zzb, true != z15 ? -9223372036854775807L : j4, false);
                        if (z22) {
                        }
                        zzly zzlyVar3 = this.zzu;
                        Object obj6 = zzlyVar3.zzb.zza;
                        zzcx zzcxVar2 = zzlyVar3.zza;
                        if (z22) {
                        }
                        zzkyVar2 = zzkyVar;
                        this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (z22 || !z || zzcxVar2.zzo() || zzcxVar2.zzn(obj6, this.zzl).zzg) ? false : true, zzcxVar.zza(obj6) == -1 ? i8 : 3);
                        zzN();
                        zzP(zzcxVar, this.zzu.zza);
                        this.zzu = this.zzu.zzf(zzcxVar);
                        if (!zzcxVar.zzo()) {
                        }
                        zzE(false);
                        throw th;
                    }
                } else {
                    i6 = 4;
                }
                z14 = false;
                try {
                    zzM(false, false, false, z6);
                } catch (Throwable th2) {
                    th = th2;
                    i7 = i6;
                    z15 = z9;
                    zzkyVar = null;
                    i8 = i7;
                    zzly zzlyVar22 = this.zzu;
                    zzab(zzcxVar, zzurVar2, zzlyVar22.zza, zzlyVar22.zzb, true != z15 ? -9223372036854775807L : j4, false);
                    if (z22 && j5 == this.zzu.zzc) {
                        zzkyVar2 = zzkyVar;
                    } else {
                        zzly zzlyVar32 = this.zzu;
                        Object obj62 = zzlyVar32.zzb.zza;
                        zzcx zzcxVar22 = zzlyVar32.zza;
                        zzkyVar2 = zzkyVar;
                        this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (z22 || !z || zzcxVar22.zzo() || zzcxVar22.zzn(obj62, this.zzl).zzg) ? false : true, zzcxVar.zza(obj62) == -1 ? i8 : 3);
                    }
                    zzN();
                    zzP(zzcxVar, this.zzu.zza);
                    this.zzu = this.zzu.zzf(zzcxVar);
                    if (!zzcxVar.zzo()) {
                        this.zzG = zzkyVar2;
                    }
                    zzE(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z14 = false;
                i6 = 4;
                i7 = i6;
                z15 = z9;
                zzkyVar = null;
                i8 = i7;
                zzly zzlyVar222 = this.zzu;
                zzab(zzcxVar, zzurVar2, zzlyVar222.zza, zzlyVar222.zzb, true != z15 ? -9223372036854775807L : j4, false);
                if (z22) {
                }
                zzly zzlyVar322 = this.zzu;
                Object obj622 = zzlyVar322.zzb.zza;
                zzcx zzcxVar222 = zzlyVar322.zza;
                if (z22) {
                }
                zzkyVar2 = zzkyVar;
                this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (z22 || !z || zzcxVar222.zzo() || zzcxVar222.zzn(obj622, this.zzl).zzg) ? false : true, zzcxVar.zza(obj622) == -1 ? i8 : 3);
                zzN();
                zzP(zzcxVar, this.zzu.zza);
                this.zzu = this.zzu.zzf(zzcxVar);
                if (!zzcxVar.zzo()) {
                }
                zzE(false);
                throw th;
            }
        } else {
            z14 = false;
            i6 = 4;
        }
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        ?? r1 = z14;
        while (true) {
            i9 = 2;
            if (r1 < 2) {
                zzmfVarArr[r1].zzM(zzcxVar);
                r1++;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z22) {
            z18 = z14;
            i11 = i6;
            z17 = z9;
            if (!zzcxVar.zzo()) {
                for (zzli zze = this.zzq.zze(); zze != null; zze = zze.zzg()) {
                    if (zze.zzf.zza.equals(zzurVar2)) {
                        zze.zzf = this.zzq.zzh(zzcxVar, zze.zzf);
                        zze.zzq();
                    }
                }
                j4 = zzv(zzurVar2, j4, z7);
            }
        } else {
            try {
                zzll zzllVar = this.zzq;
                long j7 = this.zzH;
                zzli zzf2 = zzllVar.zzf();
                if (zzf2 == null) {
                    z17 = z9;
                    j6 = j;
                } else {
                    long zze2 = zzf2.zze();
                    try {
                        z17 = z9;
                        if (zzf2.zzd) {
                            long j8 = zze2;
                            int i14 = 0;
                            while (true) {
                                try {
                                    zzmf[] zzmfVarArr2 = this.zza;
                                    int length2 = zzmfVarArr2.length;
                                    if (i14 >= i9) {
                                        j6 = j8;
                                        break;
                                    }
                                    if (zzaf(zzmfVarArr2[i14]) && this.zza[i14].zzo() == zzf2.zzc[i14]) {
                                        i10 = i14;
                                        long zzbh = this.zza[i14].zzbh();
                                        j6 = Long.MIN_VALUE;
                                        if (zzbh == Long.MIN_VALUE) {
                                            break;
                                        }
                                        j8 = Math.max(zzbh, j8);
                                        i14 = i10 + 1;
                                        i9 = 2;
                                    }
                                    i10 = i14;
                                    i14 = i10 + 1;
                                    i9 = 2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    z15 = z17;
                                    zzkyVar = null;
                                    i8 = 4;
                                    zzly zzlyVar2222 = this.zzu;
                                    zzab(zzcxVar, zzurVar2, zzlyVar2222.zza, zzlyVar2222.zzb, true != z15 ? -9223372036854775807L : j4, false);
                                    if (z22) {
                                    }
                                    zzly zzlyVar3222 = this.zzu;
                                    Object obj6222 = zzlyVar3222.zzb.zza;
                                    zzcx zzcxVar2222 = zzlyVar3222.zza;
                                    if (z22) {
                                    }
                                    zzkyVar2 = zzkyVar;
                                    this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (z22 || !z || zzcxVar2222.zzo() || zzcxVar2222.zzn(obj6222, this.zzl).zzg) ? false : true, zzcxVar.zza(obj6222) == -1 ? i8 : 3);
                                    zzN();
                                    zzP(zzcxVar, this.zzu.zza);
                                    this.zzu = this.zzu.zzf(zzcxVar);
                                    if (!zzcxVar.zzo()) {
                                    }
                                    zzE(false);
                                    throw th;
                                }
                            }
                        } else {
                            j6 = zze2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r21 = i6;
                        z16 = z9;
                        z6 = false;
                        z15 = z16;
                        i7 = r21;
                        zzkyVar = null;
                        i8 = i7;
                        zzly zzlyVar22222 = this.zzu;
                        zzab(zzcxVar, zzurVar2, zzlyVar22222.zza, zzlyVar22222.zzb, true != z15 ? -9223372036854775807L : j4, false);
                        if (z22) {
                        }
                        zzly zzlyVar32222 = this.zzu;
                        Object obj62222 = zzlyVar32222.zzb.zza;
                        zzcx zzcxVar22222 = zzlyVar32222.zza;
                        if (z22) {
                        }
                        zzkyVar2 = zzkyVar;
                        this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (z22 || !z || zzcxVar22222.zzo() || zzcxVar22222.zzn(obj62222, this.zzl).zzg) ? false : true, zzcxVar.zza(obj62222) == -1 ? i8 : 3);
                        zzN();
                        zzP(zzcxVar, this.zzu.zza);
                        this.zzu = this.zzu.zzf(zzcxVar);
                        if (!zzcxVar.zzo()) {
                        }
                        zzE(false);
                        throw th;
                    }
                }
                z18 = false;
                i11 = 4;
                if (!zzllVar.zzp(zzcxVar, j7, j6)) {
                    zzR(false);
                }
            } catch (Throwable th7) {
                th = th7;
                z6 = z14;
                r21 = i6;
                z16 = z9;
            }
        }
        zzly zzlyVar4 = this.zzu;
        zzab(zzcxVar, zzurVar2, zzlyVar4.zza, zzlyVar4.zzb, true != z17 ? -9223372036854775807L : j4, false);
        if (z22 || j5 != this.zzu.zzc) {
            zzly zzlyVar5 = this.zzu;
            Object obj7 = zzlyVar5.zzb.zza;
            zzcx zzcxVar3 = zzlyVar5.zza;
            z19 = z18;
            this.zzu = zzz(zzurVar2, j4, j5, this.zzu.zzd, (!z22 || !z || zzcxVar3.zzo() || zzcxVar3.zzn(obj7, this.zzl).zzg) ? z18 : true, zzcxVar.zza(obj7) == -1 ? i11 : 3);
        } else {
            z19 = z18;
        }
        zzN();
        zzP(zzcxVar, this.zzu.zza);
        this.zzu = this.zzu.zzf(zzcxVar);
        if (!zzcxVar.zzo()) {
            this.zzG = null;
        }
        zzE(z19);
    }

    private final void zzG(zzcg zzcgVar, boolean z) throws zziz {
        zzH(zzcgVar, zzcgVar.zzc, true, z);
    }

    private final void zzH(zzcg zzcgVar, float f, boolean z, boolean z2) throws zziz {
        int i;
        zzkz zzkzVar = this;
        if (z) {
            if (z2) {
                zzkzVar.zzv.zza(1);
            }
            zzly zzlyVar = zzkzVar.zzu;
            zzcx zzcxVar = zzlyVar.zza;
            zzur zzurVar = zzlyVar.zzb;
            long j = zzlyVar.zzc;
            long j2 = zzlyVar.zzd;
            int i2 = zzlyVar.zze;
            zziz zzizVar = zzlyVar.zzf;
            boolean z3 = zzlyVar.zzg;
            zzws zzwsVar = zzlyVar.zzh;
            zzyp zzypVar = zzlyVar.zzi;
            List list = zzlyVar.zzj;
            zzur zzurVar2 = zzlyVar.zzk;
            boolean z4 = zzlyVar.zzl;
            int i3 = zzlyVar.zzm;
            long j3 = zzlyVar.zzp;
            long j4 = zzlyVar.zzq;
            long j5 = zzlyVar.zzr;
            long j6 = zzlyVar.zzs;
            boolean z5 = zzlyVar.zzo;
            zzly zzlyVar2 = new zzly(zzcxVar, zzurVar, j, j2, i2, zzizVar, z3, zzwsVar, zzypVar, list, zzurVar2, z4, i3, zzcgVar, j3, j4, j5, j6, false);
            zzkzVar = this;
            zzkzVar.zzu = zzlyVar2;
        }
        float f2 = zzcgVar.zzc;
        zzli zze = zzkzVar.zzq.zze();
        while (true) {
            i = 0;
            if (zze == null) {
                break;
            }
            zzyi[] zzyiVarArr = zze.zzi().zzc;
            int length = zzyiVarArr.length;
            while (i < length) {
                zzyi zzyiVar = zzyiVarArr[i];
                i++;
            }
            zze = zze.zzg();
        }
        zzmf[] zzmfVarArr = zzkzVar.zza;
        int length2 = zzmfVarArr.length;
        while (i < 2) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzmfVar != null) {
                zzmfVar.zzL(f, zzcgVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean z = false;
        if (zzae()) {
            zzli zzd = this.zzq.zzd();
            long zzu = zzu(zzd.zzd());
            if (zzd == this.zzq.zze()) {
                zze = this.zzH;
                j = zzd.zze();
            } else {
                zze = this.zzH - zzd.zze();
                j = zzd.zzf.zzb;
            }
            long j2 = zze - j;
            boolean zzg = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            if (zzg || zzu >= 500000 || this.zzm <= 0) {
                z = zzg;
            } else {
                this.zzq.zze().zza.zzj(this.zzu.zzr, false);
                z = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            }
        }
        this.zzB = z;
        if (z) {
            this.zzq.zzd().zzk(this.zzH, this.zzn.zzc().zzc, this.zzA);
        }
        zzY();
    }

    private final void zzJ() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzjk zzjkVar = this.zzM;
            zzjkVar.zza.zzT(this.zzv);
            this.zzv = new zzkx(this.zzu);
        }
    }

    private final void zzK() throws zziz {
        int i;
        float f = this.zzn.zzc().zzc;
        zzll zzllVar = this.zzq;
        zzli zzf = zzllVar.zzf();
        boolean z = true;
        for (zzli zze = zzllVar.zze(); zze != null && zze.zzd; zze = zze.zzg()) {
            zzyp zzj = zze.zzj(f, this.zzu.zza);
            zzyp zzi = zze.zzi();
            boolean z2 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i2 = 0; i2 < zzj.zzc.length; i2++) {
                        if (zzj.zza(zzi, i2)) {
                        }
                    }
                    if (zze != zzf) {
                        z2 = true;
                    }
                    z &= z2;
                }
            }
            if (z) {
                zzll zzllVar2 = this.zzq;
                zzli zze2 = zzllVar2.zze();
                boolean zzn = zzllVar2.zzn(zze2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zze2.zzb(zzj, this.zzu.zzr, zzn, zArr);
                zzly zzlyVar = this.zzu;
                boolean z3 = (zzlyVar.zze == 4 || zzb == zzlyVar.zzr) ? false : true;
                zzly zzlyVar2 = this.zzu;
                i = 2;
                this.zzu = zzz(zzlyVar2.zzb, zzb, zzlyVar2.zzc, zzlyVar2.zzd, z3, 5);
                if (z3) {
                    zzO(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzmf[] zzmfVarArr = this.zza;
                    int length3 = zzmfVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzmf zzmfVar = zzmfVarArr[i3];
                    boolean zzaf = zzaf(zzmfVar);
                    zArr2[i3] = zzaf;
                    zzwh zzwhVar = zze2.zzc[i3];
                    if (zzaf) {
                        if (zzwhVar != zzmfVar.zzo()) {
                            zzA(zzmfVar);
                        } else if (zArr[i3]) {
                            zzmfVar.zzI(this.zzH);
                        }
                    }
                    i3++;
                }
                zzC(zArr2, this.zzH);
            } else {
                i = 2;
                this.zzq.zzn(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzH - zze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zziz {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r2.equals(r32.zzu.zzb) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzM(boolean z, boolean z2, boolean z3, boolean z4) {
        zzcx zzcxVar;
        zzur zzurVar;
        this.zzh.zzf(2);
        this.zzK = null;
        boolean z5 = true;
        zzac(false, true);
        this.zzn.zzi();
        this.zzH = 1000000000000L;
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzmfVarArr[i]);
            } catch (zziz | RuntimeException e) {
                zzff.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzmf[] zzmfVarArr2 = this.zza;
            int length2 = zzmfVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzmf zzmfVar = zzmfVarArr2[i2];
                if (this.zzb.remove(zzmfVar)) {
                    try {
                        zzmfVar.zzH();
                    } catch (RuntimeException e2) {
                        zzff.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzF = 0;
        zzly zzlyVar = this.zzu;
        zzur zzurVar2 = zzlyVar.zzb;
        long j = zzlyVar.zzr;
        long j2 = (this.zzu.zzb.zzb() || zzah(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z2) {
            this.zzG = null;
            Pair zzx = zzx(this.zzu.zza);
            zzurVar2 = (zzur) zzx.first;
            j = ((Long) zzx.second).longValue();
            j2 = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        this.zzq.zzj();
        this.zzB = false;
        zzcx zzcxVar2 = this.zzu.zza;
        if (z3 && (zzcxVar2 instanceof zzmd)) {
            zzcxVar2 = ((zzmd) zzcxVar2).zzx(this.zzr.zzq());
            if (zzurVar2.zzb != -1) {
                zzcxVar2.zzn(zzurVar2.zza, this.zzl);
                zzcu zzcuVar = this.zzl;
                zzcw zzcwVar = this.zzk;
                zzcxVar2.zze(zzcuVar.zzd, zzcwVar, 0L);
                if (zzcwVar.zzb()) {
                    zzcxVar = zzcxVar2;
                    zzurVar = new zzur(zzurVar2.zza, zzurVar2.zzd);
                    zzly zzlyVar2 = this.zzu;
                    int i3 = zzlyVar2.zze;
                    zziz zzizVar = z4 ? null : zzlyVar2.zzf;
                    zzws zzwsVar = !z5 ? zzws.zza : zzlyVar2.zzh;
                    zzyp zzypVar = !z5 ? this.zze : this.zzu.zzi;
                    List zzl = !z5 ? zzgaa.zzl() : this.zzu.zzj;
                    zzly zzlyVar3 = this.zzu;
                    this.zzu = new zzly(zzcxVar, zzurVar, j4, j3, i3, zzizVar, false, zzwsVar, zzypVar, zzl, zzurVar, zzlyVar3.zzl, zzlyVar3.zzm, zzlyVar3.zzn, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    this.zzr.zzh();
                    return;
                }
            }
        }
        zzcxVar = zzcxVar2;
        zzurVar = zzurVar2;
        zzly zzlyVar22 = this.zzu;
        int i32 = zzlyVar22.zze;
        zziz zzizVar2 = z4 ? null : zzlyVar22.zzf;
        zzws zzwsVar2 = !z5 ? zzws.zza : zzlyVar22.zzh;
        zzyp zzypVar2 = !z5 ? this.zze : this.zzu.zzi;
        List zzl2 = !z5 ? zzgaa.zzl() : this.zzu.zzj;
        zzly zzlyVar32 = this.zzu;
        this.zzu = new zzly(zzcxVar, zzurVar, j4, j3, i32, zzizVar2, false, zzwsVar2, zzypVar2, zzl2, zzurVar, zzlyVar32.zzl, zzlyVar32.zzm, zzlyVar32.zzn, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final void zzN() {
        zzli zze = this.zzq.zze();
        boolean z = false;
        if (zze != null && zze.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzO(long j) throws zziz {
        zzli zze = this.zzq.zze();
        long zze2 = j + (zze == null ? 1000000000000L : zze.zze());
        this.zzH = zze2;
        this.zzn.zzf(zze2);
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzaf(zzmfVar)) {
                zzmfVar.zzI(this.zzH);
            }
        }
        for (zzli zze3 = this.zzq.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzyi zzyiVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcx zzcxVar, zzcx zzcxVar2) {
        if (zzcxVar.zzo() && zzcxVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzkw zzkwVar = (zzkw) this.zzo.get(size);
        Object obj = zzkwVar.zzb;
        zzmb zzmbVar = zzkwVar.zza;
        int i = zzfy.zza;
        zzmb zzmbVar2 = zzkwVar.zza;
        throw null;
    }

    private final void zzQ(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzR(boolean z) throws zziz {
        zzur zzurVar = this.zzq.zze().zzf.zza;
        long zzw = zzw(zzurVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzly zzlyVar = this.zzu;
            this.zzu = zzz(zzurVar, zzw, zzlyVar.zzc, zzlyVar.zzd, z, 5);
        }
    }

    private final void zzS(zzcg zzcgVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcgVar);
    }

    private final void zzT(boolean z, int i, boolean z2, int i2) throws zziz {
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zzc(z, i);
        zzac(false, false);
        for (zzli zze = this.zzq.zze(); zze != null; zze = zze.zzg()) {
            for (zzyi zzyiVar : zze.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i) {
        zzly zzlyVar = this.zzu;
        if (zzlyVar.zze != i) {
            if (i != 2) {
                this.zzL = -9223372036854775807L;
            }
            this.zzu = zzlyVar.zze(i);
        }
    }

    private final void zzV() throws zziz {
        zzac(false, false);
        this.zzn.zzh();
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzaf(zzmfVar)) {
                zzmfVar.zzN();
            }
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzM(z || !this.zzE, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() throws zziz {
        this.zzn.zzi();
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzaf(zzmfVar)) {
                zzam(zzmfVar);
            }
        }
    }

    private final void zzY() {
        zzli zzd = this.zzq.zzd();
        boolean z = this.zzB || (zzd != null && zzd.zza.zzp());
        zzly zzlyVar = this.zzu;
        if (z != zzlyVar.zzg) {
            zzcx zzcxVar = zzlyVar.zza;
            zzur zzurVar = zzlyVar.zzb;
            long j = zzlyVar.zzc;
            long j2 = zzlyVar.zzd;
            int i = zzlyVar.zze;
            zziz zzizVar = zzlyVar.zzf;
            zzws zzwsVar = zzlyVar.zzh;
            zzyp zzypVar = zzlyVar.zzi;
            List list = zzlyVar.zzj;
            zzur zzurVar2 = zzlyVar.zzk;
            boolean z2 = zzlyVar.zzl;
            int i2 = zzlyVar.zzm;
            zzcg zzcgVar = zzlyVar.zzn;
            long j3 = zzlyVar.zzp;
            long j4 = zzlyVar.zzq;
            long j5 = zzlyVar.zzr;
            long j6 = zzlyVar.zzs;
            boolean z3 = zzlyVar.zzo;
            this.zzu = new zzly(zzcxVar, zzurVar, j, j2, i, zzizVar, z, zzwsVar, zzypVar, list, zzurVar2, z2, i2, zzcgVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzZ(zzur zzurVar, zzws zzwsVar, zzyp zzypVar) {
        zzcx zzcxVar = this.zzu.zza;
        zzyi[] zzyiVarArr = zzypVar.zzc;
        this.zzf.zze(zzcxVar, zzurVar, this.zza, zzwsVar, zzyiVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaa() throws zziz {
        zzkw zzkwVar;
        zzli zze = this.zzq.zze();
        if (zze == null) {
            return;
        }
        long zzd = zze.zzd ? zze.zza.zzd() : -9223372036854775807L;
        if (zzd != -9223372036854775807L) {
            if (!zze.zzr()) {
                this.zzq.zzn(zze);
                zzE(false);
                zzI();
            }
            zzO(zzd);
            if (zzd != this.zzu.zzr) {
                zzly zzlyVar = this.zzu;
                this.zzu = zzz(zzlyVar.zzb, zzd, zzlyVar.zzc, zzd, true, 5);
            }
        } else {
            long zzb = this.zzn.zzb(zze != this.zzq.zzf());
            this.zzH = zzb;
            long zze2 = zzb - zze.zze();
            long j = this.zzu.zzr;
            if (!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if (this.zzJ) {
                    j--;
                    this.zzJ = false;
                }
                zzly zzlyVar2 = this.zzu;
                int zza = zzlyVar2.zza.zza(zzlyVar2.zzb.zza);
                int min = Math.min(this.zzI, this.zzo.size());
                if (min > 0) {
                    zzkwVar = (zzkw) this.zzo.get(min - 1);
                    while (zzkwVar != null && (zza < 0 || (zza == 0 && j < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzkwVar = (zzkw) this.zzo.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < this.zzo.size()) {
                    }
                    this.zzI = min;
                }
                zzkwVar = null;
            }
            if (this.zzn.zzj()) {
                zzly zzlyVar3 = this.zzu;
                this.zzu = zzz(zzlyVar3.zzb, zze2, zzlyVar3.zzc, zze2, true, 6);
            } else {
                zzly zzlyVar4 = this.zzu;
                zzlyVar4.zzr = zze2;
                zzlyVar4.zzs = SystemClock.elapsedRealtime();
            }
        }
        this.zzu.zzp = this.zzq.zzd().zzc();
        this.zzu.zzq = zzt();
        zzly zzlyVar5 = this.zzu;
        if (zzlyVar5.zzl && zzlyVar5.zze == 3 && zzaj(zzlyVar5.zza, zzlyVar5.zzb)) {
            zzly zzlyVar6 = this.zzu;
            if (zzlyVar6.zzn.zzc == 1.0f) {
                float zza2 = this.zzN.zza(zzs(zzlyVar6.zza, zzlyVar6.zzb.zza, zzlyVar6.zzr), zzt());
                if (this.zzn.zzc().zzc != zza2) {
                    zzS(new zzcg(zza2, this.zzu.zzn.zzd));
                    zzH(this.zzu.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzab(zzcx zzcxVar, zzur zzurVar, zzcx zzcxVar2, zzur zzurVar2, long j, boolean z) throws zziz {
        if (!zzaj(zzcxVar, zzurVar)) {
            zzcg zzcgVar = zzurVar.zzb() ? zzcg.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzcgVar)) {
                return;
            }
            zzS(zzcgVar);
            zzH(this.zzu.zzn, zzcgVar.zzc, false, false);
            return;
        }
        zzcxVar.zze(zzcxVar.zzn(zzurVar.zza, this.zzl).zzd, this.zzk, 0L);
        zziu zziuVar = this.zzN;
        zzbf zzbfVar = this.zzk.zzl;
        int i = zzfy.zza;
        zziuVar.zzd(zzbfVar);
        if (j != -9223372036854775807L) {
            this.zzN.zze(zzs(zzcxVar, zzurVar.zza, j));
            return;
        }
        if (!zzfy.zzF(!zzcxVar2.zzo() ? zzcxVar2.zze(zzcxVar2.zzn(zzurVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzN.zze(-9223372036854775807L);
        }
    }

    private final void zzac(boolean z, boolean z2) {
        this.zzz = z;
        this.zzA = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void zzad(zzfxu zzfxuVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkp) zzfxuVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzli zzd = this.zzq.zzd();
        return (zzd == null || zzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzaf(zzmf zzmfVar) {
        return zzmfVar.zzbf() != 0;
    }

    private final boolean zzag() {
        zzli zze = this.zzq.zze();
        long j = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzu.zzr < j) {
            return true;
        }
        return !zzai();
    }

    private static boolean zzah(zzly zzlyVar, zzcu zzcuVar) {
        zzur zzurVar = zzlyVar.zzb;
        zzcx zzcxVar = zzlyVar.zza;
        return zzcxVar.zzo() || zzcxVar.zzn(zzurVar.zza, zzcuVar).zzg;
    }

    private final boolean zzai() {
        zzly zzlyVar = this.zzu;
        return zzlyVar.zzl && zzlyVar.zzm == 0;
    }

    private final boolean zzaj(zzcx zzcxVar, zzur zzurVar) {
        if (!zzurVar.zzb() && !zzcxVar.zzo()) {
            zzcxVar.zze(zzcxVar.zzn(zzurVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcw zzcwVar = this.zzk;
                if (zzcwVar.zzj && zzcwVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzak(zzyi zzyiVar) {
        int zzc = zzyiVar != null ? zzyiVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[zzc];
        for (int i = 0; i < zzc; i++) {
            zzamVarArr[i] = zzyiVar.zzd(i);
        }
        return zzamVarArr;
    }

    private static final void zzal(zzmb zzmbVar) throws zziz {
        zzmbVar.zzj();
        try {
            zzmbVar.zzc().zzt(zzmbVar.zza(), zzmbVar.zzg());
        } finally {
            zzmbVar.zzh(true);
        }
    }

    private static final void zzam(zzmf zzmfVar) {
        if (zzmfVar.zzbf() == 2) {
            zzmfVar.zzO();
        }
    }

    private static final void zzan(zzmf zzmfVar, long j) {
        zzmfVar.zzJ();
        if (zzmfVar instanceof zzww) {
            throw null;
        }
    }

    public static /* synthetic */ zzli zzd(zzkz zzkzVar, zzlj zzljVar, long j) {
        zzlc zzlcVar = zzkzVar.zzf;
        zzyo zzyoVar = zzkzVar.zzd;
        zzyx zzi = zzlcVar.zzi();
        zzyp zzypVar = zzkzVar.zze;
        return new zzli(zzkzVar.zzc, j, zzyoVar, zzi, zzkzVar.zzr, zzljVar, zzypVar);
    }

    static Object zzf(zzcw zzcwVar, zzcu zzcuVar, int i, boolean z, Object obj, zzcx zzcxVar, zzcx zzcxVar2) {
        int zza = zzcxVar.zza(obj);
        int zzb = zzcxVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzcxVar.zzi(i3, zzcuVar, zzcwVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzcxVar2.zza(zzcxVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzcxVar2.zzf(i4);
    }

    static final /* synthetic */ void zzr(zzmb zzmbVar) {
        try {
            zzal(zzmbVar);
        } catch (zziz e) {
            zzff.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcx zzcxVar, Object obj, long j) {
        zzcxVar.zze(zzcxVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcw zzcwVar = this.zzk;
        if (zzcwVar.zzg != -9223372036854775807L && zzcwVar.zzb()) {
            zzcw zzcwVar2 = this.zzk;
            if (zzcwVar2.zzj) {
                long j2 = zzcwVar2.zzh;
                return zzfy.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzli zzd = this.zzq.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzH - zzd.zze()));
    }

    private final long zzv(zzur zzurVar, long j, boolean z) throws zziz {
        zzll zzllVar = this.zzq;
        return zzw(zzurVar, j, zzllVar.zze() != zzllVar.zzf(), z);
    }

    private final long zzw(zzur zzurVar, long j, boolean z, boolean z2) throws zziz {
        zzX();
        zzac(false, true);
        if (z2 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzli zze = this.zzq.zze();
        zzli zzliVar = zze;
        while (zzliVar != null && !zzurVar.equals(zzliVar.zzf.zza)) {
            zzliVar = zzliVar.zzg();
        }
        if (z || zze != zzliVar || (zzliVar != null && zzliVar.zze() + j < 0)) {
            zzmf[] zzmfVarArr = this.zza;
            int length = zzmfVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzmfVarArr[i]);
            }
            if (zzliVar != null) {
                while (this.zzq.zze() != zzliVar) {
                    this.zzq.zza();
                }
                this.zzq.zzn(zzliVar);
                zzliVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzliVar != null) {
            this.zzq.zzn(zzliVar);
            if (!zzliVar.zzd) {
                zzliVar.zzf = zzliVar.zzf.zzb(j);
            } else if (zzliVar.zze) {
                j = zzliVar.zza.zze(j);
                zzliVar.zza.zzj(j - this.zzm, false);
            }
            zzO(j);
            zzI();
        } else {
            this.zzq.zzj();
            zzO(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcx zzcxVar) {
        long j = 0;
        if (zzcxVar.zzo()) {
            return Pair.create(zzly.zzh(), 0L);
        }
        Pair zzl = zzcxVar.zzl(this.zzk, this.zzl, zzcxVar.zzg(this.zzD), -9223372036854775807L);
        zzur zzi = this.zzq.zzi(zzcxVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzcxVar.zzn(zzi.zza, this.zzl);
            if (zzi.zzc == this.zzl.zze(zzi.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j));
    }

    private static Pair zzy(zzcx zzcxVar, zzky zzkyVar, boolean z, int i, boolean z2, zzcw zzcwVar, zzcu zzcuVar) {
        Pair zzl;
        zzcx zzcxVar2 = zzkyVar.zza;
        if (zzcxVar.zzo()) {
            return null;
        }
        zzcx zzcxVar3 = true == zzcxVar2.zzo() ? zzcxVar : zzcxVar2;
        try {
            zzl = zzcxVar3.zzl(zzcwVar, zzcuVar, zzkyVar.zzb, zzkyVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcxVar.equals(zzcxVar3)) {
            return zzl;
        }
        if (zzcxVar.zza(zzl.first) != -1) {
            return (zzcxVar3.zzn(zzl.first, zzcuVar).zzg && zzcxVar3.zze(zzcuVar.zzd, zzcwVar, 0L).zzp == zzcxVar3.zza(zzl.first)) ? zzcxVar.zzl(zzcwVar, zzcuVar, zzcxVar.zzn(zzl.first, zzcuVar).zzd, zzkyVar.zzc) : zzl;
        }
        Object zzf = zzf(zzcwVar, zzcuVar, i, z2, zzl.first, zzcxVar3, zzcxVar);
        if (zzf != null) {
            return zzcxVar.zzl(zzcwVar, zzcuVar, zzcxVar.zzn(zzf, zzcuVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzly zzz(zzur zzurVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzyp zzypVar;
        zzws zzwsVar;
        int i2 = 0;
        this.zzJ = (!this.zzJ && j == this.zzu.zzr && zzurVar.equals(this.zzu.zzb)) ? false : true;
        zzN();
        zzly zzlyVar = this.zzu;
        zzws zzwsVar2 = zzlyVar.zzh;
        zzyp zzypVar2 = zzlyVar.zzi;
        List list2 = zzlyVar.zzj;
        if (this.zzr.zzj()) {
            zzli zze = this.zzq.zze();
            zzwsVar2 = zze == null ? zzws.zza : zze.zzh();
            zzypVar2 = zze == null ? this.zze : zze.zzi();
            zzyi[] zzyiVarArr = zzypVar2.zzc;
            zzfzx zzfzxVar = new zzfzx();
            boolean z2 = false;
            for (zzyi zzyiVar : zzyiVarArr) {
                if (zzyiVar != null) {
                    zzby zzbyVar = zzyiVar.zzd(0).zzk;
                    if (zzbyVar == null) {
                        zzfzxVar.zzf(new zzby(-9223372036854775807L, new zzbx[0]));
                    } else {
                        zzfzxVar.zzf(zzbyVar);
                        z2 = true;
                    }
                }
            }
            zzgaa zzi = z2 ? zzfzxVar.zzi() : zzgaa.zzl();
            if (zze != null) {
                zzlj zzljVar = zze.zzf;
                if (zzljVar.zzc != j2) {
                    zze.zzf = zzljVar.zza(j2);
                }
            }
            zzli zze2 = this.zzq.zze();
            if (zze2 != null) {
                zzyp zzi2 = zze2.zzi();
                while (true) {
                    int length = this.zza.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzi2.zzb(i2)) {
                        if (this.zza[i2].zzbj() != 1) {
                            break;
                        }
                        int i3 = zzi2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
        } else {
            if (!zzurVar.equals(this.zzu.zzb)) {
                zzypVar = this.zze;
                zzwsVar = zzws.zza;
                list = zzgaa.zzl();
                if (z) {
                    this.zzv.zzd(i);
                }
                return this.zzu.zzb(zzurVar, j, j2, j3, zzt(), zzwsVar, zzypVar, list);
            }
            list = list2;
        }
        zzwsVar = zzwsVar2;
        zzypVar = zzypVar2;
        if (z) {
        }
        return this.zzu.zzb(zzurVar, j, j2, j3, zzt(), zzwsVar, zzypVar, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:509:0x07e8, code lost:
    
        if (zzag() != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x088c, code lost:
    
        if (r7 == false) goto L445;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05fd A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0677 A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0682 A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06e1 A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x078f A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x093a A[Catch: RuntimeException -> 0x09a9, IOException -> 0x09d3, zztt -> 0x09db, zzgx -> 0x09e3, zzcc -> 0x09eb, zzrq -> 0x0a02, zziz -> 0x0a0c, TryCatch #8 {zzcc -> 0x09eb, zzgx -> 0x09e3, zziz -> 0x0a0c, zzrq -> 0x0a02, zztt -> 0x09db, IOException -> 0x09d3, RuntimeException -> 0x09a9, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x0460, B:217:0x0465, B:218:0x0469, B:220:0x046d, B:221:0x047a, B:224:0x05d6, B:226:0x05de, B:228:0x05e6, B:231:0x05eb, B:232:0x05f7, B:234:0x05fd, B:236:0x0605, B:241:0x0615, B:243:0x061b, B:245:0x063b, B:247:0x0641, B:240:0x0646, B:254:0x064b, B:256:0x064f, B:258:0x0655, B:260:0x0659, B:262:0x0661, B:264:0x0667, B:266:0x0671, B:269:0x0677, B:270:0x067a, B:272:0x0682, B:274:0x0694, B:276:0x069d, B:278:0x06a5, B:281:0x06af, B:282:0x06db, B:284:0x06e1, B:286:0x06e7, B:288:0x06ee, B:296:0x06fa, B:304:0x0489, B:306:0x048f, B:309:0x0495, B:312:0x04a0, B:314:0x04a5, B:317:0x04b3, B:320:0x04b9, B:322:0x04c1, B:326:0x04c4, B:328:0x04cc, B:330:0x04da, B:332:0x0516, B:334:0x0520, B:337:0x052b, B:339:0x0533, B:341:0x0536, B:344:0x0539, B:346:0x053f, B:348:0x054e, B:350:0x0554, B:352:0x0560, B:354:0x056a, B:356:0x057b, B:360:0x0581, B:359:0x058c, B:365:0x0591, B:367:0x059c, B:370:0x05a1, B:372:0x05a7, B:374:0x05af, B:376:0x05b5, B:378:0x05bb, B:382:0x05c9, B:383:0x05d0, B:385:0x05d3, B:391:0x0477, B:392:0x06fc, B:396:0x0707, B:398:0x0711, B:399:0x0716, B:401:0x0724, B:402:0x073c, B:404:0x0742, B:406:0x074a, B:408:0x0751, B:411:0x075a, B:415:0x0769, B:420:0x0776, B:422:0x077c, B:430:0x078f, B:433:0x0794, B:441:0x07a0, B:443:0x07a6, B:447:0x07b3, B:449:0x07bb, B:451:0x07bf, B:452:0x07ca, B:454:0x07d0, B:455:0x08c2, B:458:0x08ca, B:460:0x08cf, B:462:0x08d7, B:464:0x08e5, B:466:0x08ec, B:470:0x08f0, B:472:0x08f6, B:474:0x08ff, B:476:0x0905, B:478:0x0910, B:479:0x0934, B:481:0x093a, B:484:0x0943, B:487:0x0965, B:493:0x0956, B:495:0x095a, B:496:0x0960, B:498:0x0917, B:501:0x0925, B:502:0x092c, B:503:0x092d, B:504:0x07d9, B:506:0x07e0, B:508:0x07e4, B:511:0x086a, B:513:0x0876, B:516:0x07f1, B:518:0x07f5, B:520:0x0809, B:521:0x0817, B:523:0x0823, B:526:0x082c, B:528:0x0836, B:533:0x0841, B:539:0x087a, B:541:0x0881, B:543:0x0885, B:546:0x088e, B:548:0x089e, B:550:0x08a6, B:552:0x08b0, B:554:0x08b5, B:556:0x08ba, B:557:0x08bf, B:559:0x0799, B:560:0x096a, B:563:0x0971, B:565:0x0979, B:568:0x0997), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x094e  */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzyw] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        zzli zzf;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        zzli zzf2;
        boolean z6;
        zzli zze;
        zzli zzg;
        zzli zza;
        char c;
        boolean z7;
        int i3;
        int i4;
        zzlj zzg2;
        long longValue;
        long j;
        boolean z8;
        zzur zzurVar;
        zzur zzurVar2;
        Throwable th;
        Throwable th2;
        long j2;
        long j3;
        long zzv;
        long j4;
        zzly zzlyVar;
        int i5;
        zzly zzz;
        int i6;
        List list;
        zzwk zzwkVar;
        List list2;
        zzwk zzwkVar2;
        int i7;
        long j5;
        List list3;
        zzwk zzwkVar3;
        try {
        } catch (zzcc e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzgx e2) {
            zzD(e2, e2.zza);
        } catch (zziz e3) {
            zziz zzizVar = e3;
            if (zzizVar.zze == 1 && (zzf = this.zzq.zzf()) != null) {
                zzizVar = zzizVar.zza(zzf.zzf.zza);
            }
            if (zzizVar.zzk && (this.zzK == null || zzizVar.zzb == 5003)) {
                zzff.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzizVar);
                zziz zzizVar2 = this.zzK;
                if (zzizVar2 != null) {
                    zzizVar2.addSuppressed(zzizVar);
                    zzizVar = this.zzK;
                } else {
                    this.zzK = zzizVar;
                }
                zzew zzewVar = this.zzh;
                zzewVar.zzk(zzewVar.zzc(25, zzizVar));
            } else {
                zziz zzizVar3 = this.zzK;
                if (zzizVar3 != null) {
                    zzizVar3.addSuppressed(zzizVar);
                    zzizVar = this.zzK;
                }
                zziz zzizVar4 = zzizVar;
                zzff.zzd("ExoPlayerImplInternal", "Playback error", zzizVar4);
                z = true;
                if (zzizVar4.zze == 1) {
                    zzll zzllVar = this.zzq;
                    if (zzllVar.zze() != zzllVar.zzf()) {
                        while (true) {
                            zzll zzllVar2 = this.zzq;
                            if (zzllVar2.zze() == zzllVar2.zzf()) {
                                break;
                            }
                            this.zzq.zza();
                        }
                        zzli zze2 = this.zzq.zze();
                        zze2.getClass();
                        zzlj zzljVar = zze2.zzf;
                        zzur zzurVar3 = zzljVar.zza;
                        long j6 = zzljVar.zzb;
                        this.zzu = zzz(zzurVar3, j6, zzljVar.zzc, j6, true, 0);
                    }
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                }
                zzW(z, z2);
                this.zzu = this.zzu.zzd(zzizVar4);
            }
        } catch (zzrq e4) {
            zzD(e4, e4.zza);
        } catch (zztt e5) {
            zzD(e5, PointerIconCompat.TYPE_HAND);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zziz zzd = zziz.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzff.zzd("ExoPlayerImplInternal", "Playback error", zzd);
            zzW(true, false);
            this.zzu = this.zzu.zzd(zzd);
        }
        switch (message.what) {
            case 0:
                this.zzv.zza(1);
                zzM(false, false, false, true);
                this.zzf.zzb();
                zzU(true != this.zzu.zza.zzo() ? 2 : 4);
                this.zzr.zzg(this.zzg);
                this.zzh.zzi(2);
                z = true;
                zzJ();
                return z;
            case 1:
                zzT(message.arg1 != 0, message.arg2, true, 1);
                z = true;
                zzJ();
                return z;
            case 2:
                int i8 = 4;
                long uptimeMillis = SystemClock.uptimeMillis();
                this.zzh.zzf(2);
                if (!this.zzu.zza.zzo() && this.zzr.zzj()) {
                    this.zzq.zzl(this.zzH);
                    if (this.zzq.zzo() && (zzg2 = this.zzq.zzg(this.zzH, this.zzu)) != null) {
                        zzli zzc = this.zzq.zzc(zzg2);
                        zzc.zza.zzl(this, zzg2.zzb);
                        if (this.zzq.zze() == zzc) {
                            zzO(zzg2.zzb);
                        }
                        zzE(false);
                    }
                    if (this.zzB) {
                        this.zzB = zzae();
                        zzY();
                    } else {
                        zzI();
                    }
                    zzli zzf3 = this.zzq.zzf();
                    if (zzf3 != null) {
                        if (zzf3.zzg() != null && !this.zzy) {
                            zzli zzf4 = this.zzq.zzf();
                            if (zzf4.zzd) {
                                int i9 = 0;
                                while (true) {
                                    zzmf[] zzmfVarArr = this.zza;
                                    int length = zzmfVarArr.length;
                                    if (i9 < 2) {
                                        zzmf zzmfVar = zzmfVarArr[i9];
                                        zzwh zzwhVar = zzf4.zzc[i9];
                                        if (zzmfVar.zzo() == zzwhVar) {
                                            if (zzwhVar == null || zzmfVar.zzP()) {
                                                i9++;
                                            } else {
                                                zzf4.zzg();
                                                boolean z9 = zzf4.zzf.zzf;
                                            }
                                        }
                                    } else if (zzf3.zzg().zzd || this.zzH >= zzf3.zzg().zzf()) {
                                        zzyp zzi = zzf3.zzi();
                                        zzli zzb = this.zzq.zzb();
                                        zzyp zzi2 = zzb.zzi();
                                        zzcx zzcxVar = this.zzu.zza;
                                        zzyp zzypVar = zzi2;
                                        zzab(zzcxVar, zzb.zzf.zza, zzcxVar, zzf3.zzf.zza, -9223372036854775807L, false);
                                        if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                            int i10 = 0;
                                            while (true) {
                                                int length2 = this.zza.length;
                                                if (i10 < 2) {
                                                    boolean zzb2 = zzi.zzb(i10);
                                                    zzyp zzypVar2 = zzypVar;
                                                    boolean zzb3 = zzypVar2.zzb(i10);
                                                    if (zzb2 && !this.zza[i10].zzQ()) {
                                                        this.zzc[i10].zzbj();
                                                        zzmi zzmiVar = zzi.zzb[i10];
                                                        zzmi zzmiVar2 = zzypVar2.zzb[i10];
                                                        if (!zzb3 || !zzmiVar2.equals(zzmiVar)) {
                                                            zzan(this.zza[i10], zzb.zzf());
                                                        }
                                                    }
                                                    i10++;
                                                    zzypVar = zzypVar2;
                                                }
                                            }
                                        } else {
                                            long zzf5 = zzb.zzf();
                                            zzmf[] zzmfVarArr2 = this.zza;
                                            int length3 = zzmfVarArr2.length;
                                            for (int i11 = 0; i11 < 2; i11++) {
                                                zzmf zzmfVar2 = zzmfVarArr2[i11];
                                                if (zzmfVar2.zzo() != null) {
                                                    zzan(zzmfVar2, zzf5);
                                                }
                                            }
                                            if (!zzb.zzr()) {
                                                this.zzq.zzn(zzb);
                                                zzE(false);
                                                zzI();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (zzf3.zzf.zzi || this.zzy) {
                            int i12 = 0;
                            while (true) {
                                zzmf[] zzmfVarArr3 = this.zza;
                                int length4 = zzmfVarArr3.length;
                                if (i12 < 2) {
                                    zzmf zzmfVar3 = zzmfVarArr3[i12];
                                    zzwh zzwhVar2 = zzf3.zzc[i12];
                                    if (zzwhVar2 != null && zzmfVar3.zzo() == zzwhVar2 && zzmfVar3.zzP()) {
                                        long j7 = zzf3.zzf.zze;
                                        zzan(zzmfVar3, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : zzf3.zze() + j7);
                                    }
                                    i12++;
                                }
                            }
                        }
                        zzf2 = this.zzq.zzf();
                        if (zzf2 != null && this.zzq.zze() != zzf2 && !zzf2.zzg) {
                            zzli zzf6 = this.zzq.zzf();
                            zzyp zzi3 = zzf6.zzi();
                            i4 = 0;
                            boolean z10 = false;
                            while (true) {
                                zzmf[] zzmfVarArr4 = this.zza;
                                int length5 = zzmfVarArr4.length;
                                if (i4 >= 2) {
                                    zzmf zzmfVar4 = zzmfVarArr4[i4];
                                    if (zzaf(zzmfVar4)) {
                                        zzwh zzo = zzmfVar4.zzo();
                                        zzwh zzwhVar3 = zzf6.zzc[i4];
                                        if (!zzi3.zzb(i4) || zzo != zzwhVar3) {
                                            if (!zzmfVar4.zzQ()) {
                                                zzmfVar4.zzG(zzak(zzi3.zzc[i4]), zzf6.zzc[i4], zzf6.zzf(), zzf6.zze(), zzf6.zzf.zza);
                                            } else if (zzmfVar4.zzV()) {
                                                zzA(zzmfVar4);
                                            } else {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    i4++;
                                } else if (!z10) {
                                    zzB();
                                }
                            }
                        }
                        z6 = false;
                        while (zzai() && !this.zzy && (zze = this.zzq.zze()) != null && (zzg = zze.zzg()) != null && this.zzH >= zzg.zzf() && zzg.zzg) {
                            if (z6) {
                                zzJ();
                            }
                            zza = this.zzq.zza();
                            if (zza != null) {
                                throw null;
                            }
                            if (this.zzu.zzb.zza.equals(zza.zzf.zza.zza)) {
                                zzur zzurVar4 = this.zzu.zzb;
                                c = 65535;
                                if (zzurVar4.zzb == -1) {
                                    zzur zzurVar5 = zza.zzf.zza;
                                    if (zzurVar5.zzb == -1 && zzurVar4.zze != zzurVar5.zze) {
                                        z7 = true;
                                        zzlj zzljVar2 = zza.zzf;
                                        zzur zzurVar6 = zzljVar2.zza;
                                        long j8 = zzljVar2.zzb;
                                        this.zzu = zzz(zzurVar6, j8, zzljVar2.zzc, j8, !z7, 0);
                                        zzN();
                                        zzaa();
                                        zzyp zzi4 = this.zzq.zze().zzi();
                                        i3 = 0;
                                        while (true) {
                                            int length6 = this.zza.length;
                                            if (i3 >= 2) {
                                                if (zzi4.zzb(i3)) {
                                                    this.zza[i3].zzs();
                                                }
                                                i3++;
                                            }
                                        }
                                        z6 = true;
                                    }
                                }
                            } else {
                                c = 65535;
                            }
                            z7 = false;
                            zzlj zzljVar22 = zza.zzf;
                            zzur zzurVar62 = zzljVar22.zza;
                            long j82 = zzljVar22.zzb;
                            this.zzu = zzz(zzurVar62, j82, zzljVar22.zzc, j82, !z7, 0);
                            zzN();
                            zzaa();
                            zzyp zzi42 = this.zzq.zze().zzi();
                            i3 = 0;
                            while (true) {
                                int length62 = this.zza.length;
                                if (i3 >= 2) {
                                    break;
                                }
                                i3++;
                            }
                            z6 = true;
                        }
                        i8 = 4;
                    }
                    zzf2 = this.zzq.zzf();
                    if (zzf2 != null) {
                        zzli zzf62 = this.zzq.zzf();
                        zzyp zzi32 = zzf62.zzi();
                        i4 = 0;
                        boolean z102 = false;
                        while (true) {
                            zzmf[] zzmfVarArr42 = this.zza;
                            int length52 = zzmfVarArr42.length;
                            if (i4 >= 2) {
                            }
                            i4++;
                        }
                    }
                    z6 = false;
                    while (zzai()) {
                        if (z6) {
                        }
                        zza = this.zzq.zza();
                        if (zza != null) {
                        }
                    }
                    i8 = 4;
                }
                int i13 = this.zzu.zze;
                z = true;
                if (i13 != 1) {
                    if (i13 != i8) {
                        zzli zze3 = this.zzq.zze();
                        if (zze3 == null) {
                            zzQ(uptimeMillis, 10L);
                        } else {
                            int i14 = zzfy.zza;
                            Trace.beginSection("doSomeWork");
                            zzaa();
                            if (zze3.zzd) {
                                long zzq = zzfy.zzq(SystemClock.elapsedRealtime());
                                zze3.zza.zzj(this.zzu.zzr - this.zzm, false);
                                z3 = true;
                                z4 = true;
                                int i15 = 0;
                                while (true) {
                                    zzmf[] zzmfVarArr5 = this.zza;
                                    int length7 = zzmfVarArr5.length;
                                    if (i15 < 2) {
                                        zzmf zzmfVar5 = zzmfVarArr5[i15];
                                        if (zzaf(zzmfVar5)) {
                                            zzmfVar5.zzU(this.zzH, zzq);
                                            boolean z11 = z3 && zzmfVar5.zzV();
                                            boolean z12 = zze3.zzc[i15] != zzmfVar5.zzo();
                                            boolean z13 = !z12 && zzmfVar5.zzP();
                                            if (!z12 && !z13 && !zzmfVar5.zzW() && !zzmfVar5.zzV()) {
                                                z5 = false;
                                                boolean z14 = !z4 && z5;
                                                if (!z5) {
                                                    zzmfVar5.zzv();
                                                }
                                                z4 = z14;
                                                z3 = z11;
                                            }
                                            z5 = true;
                                            if (z4) {
                                            }
                                            if (!z5) {
                                            }
                                            z4 = z14;
                                            z3 = z11;
                                        }
                                        i15++;
                                    }
                                }
                            } else {
                                zze3.zza.zzk();
                                z3 = true;
                                z4 = true;
                            }
                            long j9 = zze3.zzf.zze;
                            if (z3 && zze3.zzd && (j9 == -9223372036854775807L || j9 <= this.zzu.zzr)) {
                                if (this.zzy) {
                                    this.zzy = false;
                                    zzT(false, this.zzu.zzm, false, 5);
                                }
                                if (zze3.zzf.zzi) {
                                    zzU(i8);
                                    zzX();
                                    i = 3;
                                    int i16 = 2;
                                    if (this.zzu.zze == 2) {
                                        int i17 = 0;
                                        while (true) {
                                            zzmf[] zzmfVarArr6 = this.zza;
                                            int length8 = zzmfVarArr6.length;
                                            if (i17 < i16) {
                                                if (zzaf(zzmfVarArr6[i17]) && this.zza[i17].zzo() == zze3.zzc[i17]) {
                                                    this.zza[i17].zzv();
                                                }
                                                i17++;
                                                i16 = 2;
                                            } else {
                                                zzly zzlyVar2 = this.zzu;
                                                if (!zzlyVar2.zzg && zzlyVar2.zzq < 500000 && zzae()) {
                                                    if (this.zzL == -9223372036854775807L) {
                                                        this.zzL = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - this.zzL >= 4000) {
                                                        throw new IllegalStateException("Playback stuck buffering and not loading");
                                                    }
                                                    boolean z15 = !zzai() && this.zzu.zze == i;
                                                    boolean z16 = this.zzu.zzo;
                                                    i2 = this.zzu.zze;
                                                    if (i2 != i8) {
                                                        if (!z15 && i2 != 2) {
                                                            if (i2 == i && this.zzF != 0) {
                                                                zzQ(uptimeMillis, 1000L);
                                                            }
                                                        }
                                                        zzQ(uptimeMillis, 10L);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    this.zzL = -9223372036854775807L;
                                    if (zzai()) {
                                    }
                                    boolean z162 = this.zzu.zzo;
                                    i2 = this.zzu.zze;
                                    if (i2 != i8) {
                                    }
                                    Trace.endSection();
                                }
                            }
                            zzly zzlyVar3 = this.zzu;
                            if (zzlyVar3.zze == 2) {
                                if (this.zzF == 0) {
                                    break;
                                } else if (z4) {
                                    if (zzlyVar3.zzg) {
                                        zzli zze4 = this.zzq.zze();
                                        long zzb4 = zzaj(this.zzu.zza, zze4.zzf.zza) ? this.zzN.zzb() : -9223372036854775807L;
                                        zzli zzd2 = this.zzq.zzd();
                                        boolean z17 = zzd2.zzr() && zzd2.zzf.zzi;
                                        boolean z18 = zzd2.zzf.zza.zzb() && !zzd2.zzd;
                                        if (!z17) {
                                            if (!z18) {
                                                if (this.zzf.zzh(this.zzu.zza, zze4.zzf.zza, zzt(), this.zzn.zzc().zzc, this.zzz, zzb4)) {
                                                }
                                            }
                                        }
                                    }
                                    i = 3;
                                    zzU(3);
                                    this.zzK = null;
                                    if (zzai()) {
                                        zzV();
                                    }
                                }
                                int i162 = 2;
                                if (this.zzu.zze == 2) {
                                }
                                this.zzL = -9223372036854775807L;
                                if (zzai()) {
                                }
                                boolean z1622 = this.zzu.zzo;
                                i2 = this.zzu.zze;
                                if (i2 != i8) {
                                }
                                Trace.endSection();
                            }
                            i = 3;
                            if (this.zzu.zze == 3) {
                                if (this.zzF == 0) {
                                    if (!zzag()) {
                                        zzac(zzai(), false);
                                        zzU(2);
                                        if (this.zzz) {
                                            for (zzli zze5 = this.zzq.zze(); zze5 != null; zze5 = zze5.zzg()) {
                                                for (zzyi zzyiVar : zze5.zzi().zzc) {
                                                }
                                            }
                                            this.zzN.zzc();
                                        }
                                        zzX();
                                    }
                                }
                            }
                            int i1622 = 2;
                            if (this.zzu.zze == 2) {
                            }
                            this.zzL = -9223372036854775807L;
                            if (zzai()) {
                            }
                            boolean z16222 = this.zzu.zzo;
                            i2 = this.zzu.zze;
                            if (i2 != i8) {
                            }
                            Trace.endSection();
                        }
                    }
                    z = true;
                }
                zzJ();
                return z;
            case 3:
                zzky zzkyVar = (zzky) message.obj;
                this.zzv.zza(1);
                Pair zzy = zzy(this.zzu.zza, zzkyVar, true, this.zzC, this.zzD, this.zzk, this.zzl);
                if (zzy == null) {
                    Pair zzx = zzx(this.zzu.zza);
                    zzurVar = (zzur) zzx.first;
                    long longValue2 = ((Long) zzx.second).longValue();
                    j = -9223372036854775807L;
                    z8 = !this.zzu.zza.zzo();
                    longValue = longValue2;
                } else {
                    Object obj = zzy.first;
                    longValue = ((Long) zzy.second).longValue();
                    j = zzkyVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue;
                    zzur zzi5 = this.zzq.zzi(this.zzu.zza, obj, longValue);
                    if (zzi5.zzb()) {
                        this.zzu.zza.zzn(zzi5.zza, this.zzl);
                        if (this.zzl.zze(zzi5.zzb) == zzi5.zzc) {
                            this.zzl.zzj();
                        }
                        zzurVar = zzi5;
                        z8 = true;
                        longValue = 0;
                    } else {
                        z8 = zzkyVar.zzc == -9223372036854775807L;
                        zzurVar = zzi5;
                    }
                }
                try {
                    try {
                        if (this.zzu.zza.zzo()) {
                            this.zzG = zzkyVar;
                        } else if (zzy == null) {
                            if (this.zzu.zze != 1) {
                                zzU(4);
                            }
                            zzM(false, true, false, true);
                        } else {
                            try {
                                if (zzurVar.equals(this.zzu.zzb)) {
                                    zzli zze6 = this.zzq.zze();
                                    j3 = (zze6 == null || !zze6.zzd || longValue == 0) ? longValue : zze6.zza.zza(longValue, this.zzt);
                                    zzurVar2 = zzurVar;
                                    try {
                                        if (zzfy.zzt(j3) == zzfy.zzt(this.zzu.zzr) && ((i5 = (zzlyVar = this.zzu).zze) == 2 || i5 == 3)) {
                                            long j10 = zzlyVar.zzr;
                                            zzz = zzz(zzurVar2, j10, j, j10, z8, 2);
                                            this.zzu = zzz;
                                            z = true;
                                            zzJ();
                                            return z;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        th2 = th;
                                        j2 = longValue;
                                        this.zzu = zzz(zzurVar2, j2, j, j2, z8, 2);
                                        throw th2;
                                    }
                                } else {
                                    zzurVar2 = zzurVar;
                                    j3 = longValue;
                                }
                                zzly zzlyVar4 = this.zzu;
                                zzcx zzcxVar2 = zzlyVar4.zza;
                                zzab(zzcxVar2, zzurVar2, zzcxVar2, zzlyVar4.zzb, j, true);
                                j4 = zzv;
                                zzz = zzz(zzurVar2, j4, j, j4, z8, 2);
                                this.zzu = zzz;
                                z = true;
                                zzJ();
                                return z;
                            } catch (Throwable th4) {
                                j2 = zzv;
                                th2 = th4;
                                this.zzu = zzz(zzurVar2, j2, j, j2, z8, 2);
                                throw th2;
                            }
                            zzv = zzv(zzurVar2, j3, this.zzu.zze == 4);
                            z8 |= longValue != zzv;
                        }
                        j4 = longValue;
                        zzurVar2 = zzurVar;
                        zzz = zzz(zzurVar2, j4, j, j4, z8, 2);
                        this.zzu = zzz;
                        z = true;
                        zzJ();
                        return z;
                    } catch (Throwable th5) {
                        th = th5;
                        zzurVar2 = zzurVar;
                        th2 = th;
                        j2 = longValue;
                        this.zzu = zzz(zzurVar2, j2, j, j2, z8, 2);
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zzurVar2 = zzurVar;
                }
                break;
            case 4:
                zzS((zzcg) message.obj);
                zzG(this.zzn.zzc(), true);
                z = true;
                zzJ();
                return z;
            case 5:
                this.zzt = (zzmj) message.obj;
                z = true;
                zzJ();
                return z;
            case 6:
                zzW(false, true);
                z = true;
                zzJ();
                return z;
            case 7:
                zzM(true, false, true, false);
                int i18 = 0;
                while (true) {
                    int length9 = this.zza.length;
                    if (i18 >= 2) {
                        this.zzf.zzc();
                        zzU(1);
                        HandlerThread handlerThread = this.zzi;
                        if (handlerThread != null) {
                            handlerThread.quit();
                        }
                        synchronized (this) {
                            this.zzw = true;
                            notifyAll();
                        }
                        return true;
                    }
                    this.zzc[i18].zzp();
                    this.zza[i18].zzF();
                    i18++;
                }
            case 8:
                if (this.zzq.zzm((zzup) message.obj)) {
                    zzli zzd3 = this.zzq.zzd();
                    zzd3.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                    zzZ(zzd3.zzf.zza, zzd3.zzh(), zzd3.zzi());
                    if (zzd3 == this.zzq.zze()) {
                        zzO(zzd3.zzf.zzb);
                        zzB();
                        zzly zzlyVar5 = this.zzu;
                        zzur zzurVar7 = zzlyVar5.zzb;
                        long j11 = zzd3.zzf.zzb;
                        this.zzu = zzz(zzurVar7, j11, zzlyVar5.zzc, j11, false, 5);
                    }
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 9:
                if (this.zzq.zzm((zzup) message.obj)) {
                    this.zzq.zzl(this.zzH);
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 10:
                zzK();
                z = true;
                zzJ();
                return z;
            case 11:
                int i19 = message.arg1;
                this.zzC = i19;
                if (!this.zzq.zzq(this.zzu.zza, i19)) {
                    zzR(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 12:
                boolean z19 = message.arg1 != 0;
                this.zzD = z19;
                if (!this.zzq.zzr(this.zzu.zza, z19)) {
                    zzR(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 13:
                boolean z20 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.zzE != z20) {
                    this.zzE = z20;
                    if (!z20) {
                        zzmf[] zzmfVarArr7 = this.zza;
                        int length10 = zzmfVarArr7.length;
                        for (int i20 = 0; i20 < 2; i20++) {
                            zzmf zzmfVar6 = zzmfVarArr7[i20];
                            if (!zzaf(zzmfVar6) && this.zzb.remove(zzmfVar6)) {
                                zzmfVar6.zzH();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z = true;
                zzJ();
                return z;
            case 14:
                zzmb zzmbVar = (zzmb) message.obj;
                if (zzmbVar.zzb() == this.zzj) {
                    zzal(zzmbVar);
                    int i21 = this.zzu.zze;
                    if (i21 == 3 || i21 == 2) {
                        this.zzh.zzi(2);
                    }
                } else {
                    this.zzh.zzc(15, zzmbVar).zza();
                }
                z = true;
                zzJ();
                return z;
            case 15:
                final zzmb zzmbVar2 = (zzmb) message.obj;
                Looper zzb5 = zzmbVar2.zzb();
                if (zzb5.getThread().isAlive()) {
                    this.zzp.zzb(zzb5, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzkz.zzr(zzmbVar2);
                        }
                    });
                } else {
                    zzff.zzf("TAG", "Trying to send message on a dead thread.");
                    zzmbVar2.zzh(false);
                }
                z = true;
                zzJ();
                return z;
            case 16:
                zzG((zzcg) message.obj, false);
                z = true;
                zzJ();
                return z;
            case 17:
                zzku zzkuVar = (zzku) message.obj;
                this.zzv.zza(1);
                i6 = zzkuVar.zzb;
                if (i6 != -1) {
                    list2 = zzkuVar.zza;
                    zzwkVar2 = zzkuVar.zzd;
                    zzmd zzmdVar = new zzmd(list2, zzwkVar2);
                    i7 = zzkuVar.zzb;
                    j5 = zzkuVar.zzc;
                    this.zzG = new zzky(zzmdVar, i7, j5);
                }
                zzlx zzlxVar = this.zzr;
                list = zzkuVar.zza;
                zzwkVar = zzkuVar.zzd;
                zzF(zzlxVar.zzn(list, zzwkVar), false);
                z = true;
                zzJ();
                return z;
            case 18:
                zzku zzkuVar2 = (zzku) message.obj;
                int i22 = message.arg1;
                this.zzv.zza(1);
                zzlx zzlxVar2 = this.zzr;
                if (i22 == -1) {
                    i22 = zzlxVar2.zza();
                }
                list3 = zzkuVar2.zza;
                zzwkVar3 = zzkuVar2.zzd;
                zzF(zzlxVar2.zzk(i22, list3, zzwkVar3), false);
                z = true;
                zzJ();
                return z;
            case 19:
                zzkv zzkvVar = (zzkv) message.obj;
                this.zzv.zza(1);
                zzlx zzlxVar3 = this.zzr;
                int i23 = zzkvVar.zza;
                int i24 = zzkvVar.zzb;
                int i25 = zzkvVar.zzc;
                zzwk zzwkVar4 = zzkvVar.zzd;
                zzF(zzlxVar3.zzl(0, 0, 0, null), false);
                z = true;
                zzJ();
                return z;
            case 20:
                int i26 = message.arg1;
                int i27 = message.arg2;
                zzwk zzwkVar5 = (zzwk) message.obj;
                this.zzv.zza(1);
                zzF(this.zzr.zzm(i26, i27, zzwkVar5), false);
                z = true;
                zzJ();
                return z;
            case 21:
                zzwk zzwkVar6 = (zzwk) message.obj;
                this.zzv.zza(1);
                zzF(this.zzr.zzo(zzwkVar6), false);
                z = true;
                zzJ();
                return z;
            case 22:
                zzF(this.zzr.zzb(), true);
                z = true;
                zzJ();
                return z;
            case 23:
                this.zzx = message.arg1 != 0;
                zzN();
                if (this.zzy && this.zzq.zzf() != this.zzq.zze()) {
                    zzR(true);
                    zzE(false);
                }
                z = true;
                zzJ();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzL();
                z = true;
                zzJ();
                return z;
            case 26:
                zzL();
                z = true;
                zzJ();
                return z;
            case 27:
                int i28 = message.arg1;
                int i29 = message.arg2;
                List list4 = (List) message.obj;
                this.zzv.zza(1);
                zzF(this.zzr.zzc(i28, i29, list4), false);
                z = true;
                zzJ();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zza(zzcg zzcgVar) {
        this.zzh.zzc(16, zzcgVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        this.zzh.zzc(9, (zzup) zzwjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzh.zzc(8, zzupVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcx zzcxVar, int i, long j) {
        this.zzh.zzc(3, new zzky(zzcxVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final synchronized void zzm(zzmb zzmbVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzmbVar).zza();
            return;
        }
        zzff.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzmbVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkp(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzwk zzwkVar) {
        this.zzh.zzc(17, new zzku(list, zzwkVar, i, j, null)).zza();
    }
}
