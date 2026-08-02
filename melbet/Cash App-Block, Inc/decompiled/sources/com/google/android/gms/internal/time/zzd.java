package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzd implements zzec, zzdn {
    public static final String zza$1 = new String();
    public final /* synthetic */ zze zza;
    public final Level zzb;
    public final long zzc;
    public zzde zzd;
    public zzdg zze;
    public zzdw zzf;
    public zzfr zzg;
    public Object[] zzh;

    public zzd(zze zzeVar, Level level) {
        this.zza = zzeVar;
        zzfn.zza.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        zzcw.zza(level, "level");
        this.zzb = level;
        this.zzc = nanos;
    }

    public final void zzb(String str, Object... objArr) {
        this.zzh = objArr;
        for (Object obj : objArr) {
        }
        if (str != zza$1) {
            zzgz zzgzVar = zzgz.zza;
            this.zzg = new zzfr(str);
        }
        ((zzfv) zzfn.zza).getClass();
        zzgs zzc = zzgb.zza.zzc();
        if (!zzc.zzc.isEmpty()) {
            zzcw zzg = zzg();
            zzdq zzdqVar = zzdd.zzh;
            zzgs zzgsVar = (zzgs) zzg.zzc(zzdqVar);
            if (zzgsVar != null) {
                zzgq zzgqVar = zzgsVar.zzc;
                zzgq zzgqVar2 = zzc.zzc;
                if (!zzgqVar.isEmpty()) {
                    zzc = zzgqVar2.isEmpty() ? zzgsVar : new zzgs(new zzgq(zzgqVar2, zzgqVar));
                }
            }
            zzk(zzdqVar, zzc);
        }
        zzef zzefVar = (zzef) this.zza.zza;
        try {
            zzhh zzhhVar = (zzhh) zzhh.zza.get();
            int i = zzhhVar.zzb + 1;
            zzhhVar.zzb = i;
            if (i == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i <= 100) {
                    zzefVar.zzb(this);
                } else {
                    zzef.zzb("unbounded recursion in log statement", this);
                }
                zzhhVar.close();
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                zzefVar.zza(e, this);
            } catch (zzeq e2) {
                throw e2;
            } catch (RuntimeException e3) {
                zzef.zzb(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final zzcw zzg() {
        zzde zzdeVar = this.zzd;
        return zzdeVar != null ? zzdeVar : zzes.zza;
    }

    public final void zzk(zzdq zzdqVar, Object obj) {
        if (this.zzd == null) {
            zzde zzdeVar = new zzde();
            zzdeVar.zza = new Object[8];
            zzdeVar.zzb = 0;
            this.zzd = zzdeVar;
        }
        this.zzd.zze(zzdqVar, obj);
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public final void zzl(String str) {
        if (zzr()) {
            zzb(zza$1, str);
        }
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public final void zzm(Object obj, String str) {
        if (zzr()) {
            zzb(str, obj);
        }
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public final void zzn(String str, Object obj, Object obj2) {
        if (zzr()) {
            zzb(str, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public final void zzo(zzcf zzcfVar, Integer num, Object obj) {
        if (zzr()) {
            zzb("[ListenersManager(%s)] Notifying %s registered listeners of new value=%s", zzcfVar, num, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0224 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzr() {
        boolean z;
        zzdw zzdwVar;
        zzde zzdeVar;
        StackTraceElement[] stackTraceElementArr;
        int zzh;
        int i;
        zzdw zzdwVar2;
        zzdz zzdzVar;
        zzdw zzdwVar3;
        zzdg zzdgVar = this.zze;
        zzdg zzdgVar2 = zzdg.zza;
        if (zzdgVar == null) {
            ((zzfv) zzfn.zza).getClass();
            zzfv.zzc.getClass();
            this.zze = zzdgVar2;
        }
        zzdi zzdiVar = this.zze;
        if (zzdiVar != zzdgVar2) {
            zzde zzdeVar2 = this.zzd;
            if (zzdeVar2 != null && zzdeVar2.zzb > 0) {
                zzcw.zza(zzdiVar, "logSiteKey");
                int i2 = zzdeVar2.zzb;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zzdd.zzf.equals(zzdeVar2.zzb(i3))) {
                        zzdiVar = new zzea(zzdiVar, zzdeVar2.zzd(i3));
                    }
                }
            }
        } else {
            zzdiVar = null;
        }
        zzcw zzg = zzg();
        int zza = zzg.zza();
        int i4 = 0;
        while (true) {
            if (i4 >= zza) {
                break;
            }
            if (zzg.zzb(i4).zza != "eye3tag") {
                i4++;
            } else if (zzg.zzc(zzdd.zza) == null) {
                zzdq zzdqVar = zzdd.zzi;
                if (zzg.zzc(zzdqVar) == null) {
                    zzk(zzdqVar, zzeb.SMALL);
                }
            }
        }
        zzde zzdeVar3 = this.zzd;
        int i5 = -1;
        zzdw zzdwVar4 = zzdw.zzc;
        if (zzdeVar3 != null) {
            if (zzdiVar != null) {
                int i6 = zzcx.$r8$clinit;
                if (zzdeVar3.zzc(zzdd.zzd) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return false;
                }
                zzde zzdeVar4 = this.zzd;
                zzct zzctVar = zzcu.zza;
                if (((Integer) zzdeVar4.zzc(zzdd.zzb)) == null) {
                    zzdwVar2 = null;
                } else {
                    zzcu zzcuVar = (zzcu) zzcu.zza.zzb(zzdiVar, zzdeVar4);
                    AtomicLong atomicLong = zzcuVar.zzb;
                    zzdwVar2 = zzcuVar;
                    if (atomicLong.incrementAndGet() < r7.intValue()) {
                        zzdwVar2 = zzdwVar4;
                    }
                }
                zzde zzdeVar5 = this.zzd;
                zzct zzctVar2 = zzdz.zzb;
                Integer num = (Integer) zzdeVar5.zzc(zzdd.zzc);
                if (num == null || num.intValue() <= 0) {
                    zzdzVar = 0;
                } else {
                    zzdzVar = (zzdz) zzdz.zzb.zzb(zzdiVar, zzdeVar5);
                    int nextInt = ((Random) zzdz.zze.get()).nextInt(num.intValue());
                    AtomicInteger atomicInteger = zzdzVar.zza;
                    if ((nextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        zzdzVar = zzdwVar4;
                    }
                }
                if (zzdwVar2 != null) {
                    if (zzdzVar != 0 && zzdwVar2 != zzdwVar4 && zzdzVar != (zzdwVar3 = zzdw.zzd)) {
                        if (zzdzVar != zzdwVar4 && zzdwVar2 != zzdwVar3) {
                            zzdwVar2 = new zzds(zzdwVar2, zzdzVar);
                        }
                    }
                    this.zzf = zzdwVar2;
                    if (zzdwVar2 == zzdwVar4) {
                        z = false;
                        zzdwVar = this.zzf;
                        if (zzdwVar != null) {
                            return z;
                        }
                        zzdu zzduVar = (zzdu) zzdu.zza.zzb(zzdiVar, this.zzd);
                        AtomicInteger atomicInteger2 = zzduVar.zzc;
                        AtomicBoolean atomicBoolean = zzduVar.zzb;
                        int incrementAndGet = atomicInteger2.incrementAndGet();
                        if (zzdwVar != zzdwVar4 && atomicBoolean.compareAndSet(false, true)) {
                            try {
                                zzdwVar.zzb();
                                atomicBoolean.set(false);
                                atomicInteger2.addAndGet(-incrementAndGet);
                                i5 = (-1) + incrementAndGet;
                            } catch (Throwable th) {
                                atomicBoolean.set(false);
                                throw th;
                            }
                        }
                        if (z && i5 > 0 && (zzdeVar = this.zzd) != null) {
                            zzdeVar.zze(zzdd.zze, Integer.valueOf(i5));
                        }
                        return z & (i5 >= 0);
                    }
                }
                zzdwVar2 = zzdzVar;
                this.zzf = zzdwVar2;
                if (zzdwVar2 == zzdwVar4) {
                }
            }
            zzde zzdeVar6 = this.zzd;
            zzdq zzdqVar2 = zzdd.zzi;
            zzeb zzebVar = (zzeb) zzdeVar6.zzc(zzdqVar2);
            if (zzebVar != null) {
                zzde zzdeVar7 = this.zzd;
                if (zzdeVar7 != null && (zzh = zzdeVar7.zzh(zzdqVar2)) >= 0) {
                    int i7 = zzh + zzh;
                    int i8 = i7 + 2;
                    while (true) {
                        i = zzdeVar7.zzb;
                        if (i8 >= i + i) {
                            break;
                        }
                        Object obj = zzdeVar7.zza[i8];
                        if (!obj.equals(zzdqVar2)) {
                            Object[] objArr = zzdeVar7.zza;
                            objArr[i7] = obj;
                            objArr[i7 + 1] = objArr[i8 + 1];
                            i7 += 2;
                        }
                        i8 += 2;
                    }
                    zzdeVar7.zzb = i - ((i8 - i7) >> 1);
                    while (i7 < i8) {
                        zzdeVar7.zza[i7] = null;
                        i7++;
                    }
                }
                Throwable th2 = (Throwable) zzg().zzc(zzdd.zza);
                int i9 = zzebVar.zzg;
                String[] strArr = zzhe.zza;
                if (i9 <= 0 && i9 != -1) {
                    a$$ExternalSyntheticBUOutline0.m$3("invalid maximum depth: 0");
                    return false;
                }
                zzhe.zzb.getClass();
                if (!(i9 == -1 || i9 > 0)) {
                    a$$ExternalSyntheticBUOutline0.m$3("maxDepth must be > 0 or -1");
                    return false;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = zzd.class.getName();
                int i10 = 3;
                boolean z2 = false;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        i10 = -1;
                        break;
                    }
                    if (!stackTrace[i10].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i10;
                    if (i9 <= 0 || i9 >= length) {
                        i9 = length;
                    }
                    StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i9];
                    System.arraycopy(stackTrace, i10, stackTraceElementArr2, 0, i9);
                    stackTraceElementArr = stackTraceElementArr2;
                }
                zzdl zzdlVar = new zzdl(zzebVar.toString(), th2);
                zzdlVar.setStackTrace(stackTraceElementArr);
                zzk(zzdd.zza, zzdlVar);
            }
        }
        z = true;
        zzdwVar = this.zzf;
        if (zzdwVar != null) {
        }
    }
}
