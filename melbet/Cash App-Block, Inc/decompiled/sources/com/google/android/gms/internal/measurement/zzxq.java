package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzxq implements zzxp, zzyi {
    public static final String zza$1 = new String();
    public final /* synthetic */ zzxs zza;
    public final Level zzb;
    public final long zzc;
    public zzxy zzd;
    public zzyc zze;
    public zzyq zzf;
    public zzaaf zzg;
    public Object[] zzh;

    public zzxq(zzxs zzxsVar, Level level) {
        Objects.requireNonNull(zzxsVar);
        this.zza = zzxsVar;
        zzaab.zza.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        zzky.zza(level, "level");
        this.zzb = level;
        this.zzc = nanos;
    }

    public final zzjx zzl() {
        zzxy zzxyVar = this.zzd;
        return zzxyVar != null ? zzxyVar : zzzi.zza;
    }

    public final void zzm(zzyl zzylVar, Object obj) {
        if (this.zzd == null) {
            zzxy zzxyVar = new zzxy();
            zzxyVar.zza = new Object[8];
            zzxyVar.zzb = 0;
            this.zzd = zzxyVar;
        }
        this.zzd.zze(zzylVar, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi zzn() {
        zzyb zzybVar = new zzyb();
        zzybVar.zzf = 0;
        if (this.zze == null) {
            this.zze = zzybVar;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi zzo(Throwable th) {
        zzyl zzylVar = zzxx.zza;
        zzky.zza(zzylVar, "metadata key");
        if (th != null) {
            zzm(zzylVar, th);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    @Override // com.google.android.gms.internal.measurement.zzyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp(String str, Object[] objArr) {
        boolean z;
        zzyq zzyqVar;
        zzxy zzxyVar;
        int zzh;
        int i;
        zzym zzymVar;
        zzyc zzycVar = this.zze;
        zzya zzyaVar = zzyc.zza;
        if (zzycVar == null) {
            ((zzaaj) zzaab.zza).getClass();
            zzaaj.zzc.getClass();
            this.zze = zzyaVar;
        }
        zzyd zzydVar = this.zze;
        if (zzydVar != zzyaVar) {
            zzxy zzxyVar2 = this.zzd;
            if (zzxyVar2 != null && zzxyVar2.zzb > 0) {
                zzky.zza(zzydVar, "logSiteKey");
                int i2 = zzxyVar2.zzb;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zzxx.zzf.equals(zzxyVar2.zzb(i3))) {
                        zzydVar = zzyu.zza(zzydVar, zzxyVar2.zzc(i3));
                    }
                }
            }
        } else {
            zzydVar = null;
        }
        zzjx zzl = zzl();
        int zza = zzl.zza();
        int i4 = 0;
        while (true) {
            if (i4 >= zza) {
                break;
            }
            if (zzl.zzb(i4).zza != "eye3tag") {
                i4++;
            } else if (zzl.zzd(zzxx.zza) == null) {
                zzyl zzylVar = zzxx.zzi;
                if (zzl.zzd(zzylVar) == null) {
                    zzm(zzylVar, zzyv.SMALL);
                }
            }
        }
        zzxy zzxyVar3 = this.zzd;
        if (zzxyVar3 != null) {
            if (zzydVar != null) {
                zzxn.zza(zzxyVar3);
                zzyq zza2 = zzxk.zza(this.zzd, zzydVar);
                zzyq zza3 = zzyt.zza(this.zzd, zzydVar);
                zzym zzymVar2 = zzyq.zzc;
                if (zza2 != null) {
                    if (zza3 != null && zza2 != zzymVar2 && zza3 != (zzymVar = zzyq.zzd)) {
                        if (zza3 != zzymVar2 && zza2 != zzymVar) {
                            zza2 = new zzyn(zza2, zza3);
                        }
                    }
                    this.zzf = zza2;
                    if (zza2 == zzymVar2) {
                        z = false;
                        zzyqVar = this.zzf;
                        if (zzyqVar != null) {
                            int zza4 = zzyp.zza(zzyqVar, zzydVar, this.zzd);
                            if (z && zza4 > 0 && (zzxyVar = this.zzd) != null) {
                                zzxyVar.zze(zzxx.zze, Integer.valueOf(zza4));
                            }
                            z &= zza4 >= 0;
                        }
                        if (z) {
                            return;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        this.zzh = copyOf;
                        for (Object obj : copyOf) {
                        }
                        if (str != zza$1) {
                            zzabl zzablVar = zzabl.zza;
                            this.zzg = new zzaaf(str);
                        }
                        ((zzaaj) zzaab.zza).getClass();
                        zzabe zzc = zzaap.zza.zzc();
                        if (!zzc.zzd.isEmpty()) {
                            zzjx zzl2 = zzl();
                            zzyl zzylVar2 = zzxx.zzh;
                            zzabe zzabeVar = (zzabe) zzl2.zzd(zzylVar2);
                            if (zzabeVar != null) {
                                zzabc zzabcVar = zzabeVar.zzd;
                                if (!zzabcVar.isEmpty()) {
                                    zzabc zzabcVar2 = zzc.zzd;
                                    if (!zzabcVar2.isEmpty()) {
                                        zzabeVar = new zzabe(new zzabc(zzabcVar2, zzabcVar));
                                    }
                                    zzc = zzabeVar;
                                }
                            }
                            zzm(zzylVar2, zzc);
                        }
                        zzaag zzaagVar = (zzaag) this.zza.zza$1;
                        try {
                            zzabt zzabtVar = (zzabt) zzabt.zza.get();
                            int i5 = zzabtVar.zzb + 1;
                            zzabtVar.zzb = i5;
                            if (i5 == 0) {
                                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                            }
                            try {
                                if (i5 <= 100) {
                                    zzaagVar.zzc(this);
                                } else {
                                    zzxs.zzd("unbounded recursion in log statement", this);
                                }
                                zzabtVar.close();
                                return;
                            } finally {
                            }
                        } catch (RuntimeException e) {
                            try {
                                zzaagVar.zzd(e, this);
                                return;
                            } catch (zzzg e2) {
                                throw e2;
                            } catch (RuntimeException e3) {
                                String name = e3.getClass().getName();
                                String message = e3.getMessage();
                                StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                                sb.append(name);
                                sb.append(": ");
                                sb.append(message);
                                zzxs.zzd(sb.toString(), this);
                                try {
                                    e3.printStackTrace(System.err);
                                    return;
                                } catch (RuntimeException unused) {
                                    return;
                                }
                            }
                        }
                    }
                }
                zza2 = zza3;
                this.zzf = zza2;
                if (zza2 == zzymVar2) {
                }
            }
            zzxy zzxyVar4 = this.zzd;
            zzyl zzylVar3 = zzxx.zzi;
            zzyv zzyvVar = (zzyv) zzxyVar4.zzd(zzylVar3);
            if (zzyvVar != null) {
                zzxy zzxyVar5 = this.zzd;
                if (zzxyVar5 != null && (zzh = zzxyVar5.zzh(zzylVar3)) >= 0) {
                    int i6 = zzh + zzh;
                    int i7 = i6 + 2;
                    while (true) {
                        i = zzxyVar5.zzb;
                        if (i7 >= i + i) {
                            break;
                        }
                        Object obj2 = zzxyVar5.zza[i7];
                        if (!obj2.equals(zzylVar3)) {
                            Object[] objArr2 = zzxyVar5.zza;
                            objArr2[i6] = obj2;
                            objArr2[i6 + 1] = objArr2[i7 + 1];
                            i6 += 2;
                        }
                        i7 += 2;
                    }
                    zzxyVar5.zzb = i - ((i7 - i6) >> 1);
                    while (i6 < i7) {
                        zzxyVar5.zza[i6] = null;
                        i6++;
                    }
                }
                zzjx zzl3 = zzl();
                zzyl zzylVar4 = zzxx.zza;
                zzm(zzylVar4, new zzyg((Throwable) zzl3.zzd(zzylVar4), zzyvVar, zzabq.zzb(zzyvVar.zzf)));
            }
        }
        z = true;
        zzyqVar = this.zzf;
        if (zzyqVar != null) {
        }
        if (z) {
        }
    }
}
