package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zztw implements zzafa, RemoteCall, Continuation {
    public final /* synthetic */ int $r8$classId;
    public static final zztw zza$1 = new zztw(1);
    public static final zztw zza = new zztw(0);
    public static final zztw zza$2 = new zztw(3);
    public static final /* synthetic */ zztw zza$3 = new zztw(9);

    public /* synthetic */ zztw(int i) {
        this.$r8$classId = i;
    }

    public static zzwi zza(String str) {
        boolean z;
        zzws zzg;
        zzwl zzwlVar = zzwk.zza;
        zzwq zzd = zzvy.zzd();
        zzws zzwsVar = zzd.zzb;
        if (zzwsVar == zzwg.zza) {
            zzwsVar = null;
            zzvy.zzc(zzd, null);
            z = true;
        } else {
            z = false;
        }
        if (zzwsVar == null) {
            UUID zzc = zzvz.zza.zzc();
            String zzcL = zzvn.zzcL(zzc);
            zzvr zzvrVar = zzwd.zza;
            ImmutableSet immutableSet = (ImmutableSet) zzvy.zzd.get();
            if (!immutableSet.isEmpty()) {
                immutableSet.forEach(new zzwc(1));
            }
            zzg = new zzwf(zzc, zzcL, str, zzwlVar, zzvrVar, zzd);
        } else {
            zzg = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).zzg(str, zzwlVar, false, zzd) : zzwsVar.zzj(str, zzwlVar, zzd);
        }
        zzvy.zzc(zzd, zzg);
        return new zzwi(zzg, z);
    }

    public static final zzaew zzb(Object obj, Object obj2) {
        zzaew zzaewVar = (zzaew) obj;
        zzaew zzaewVar2 = (zzaew) obj2;
        if (!zzaewVar2.isEmpty()) {
            if (!zzaewVar.zza) {
                zzaewVar = zzaewVar.zzc();
            }
            zzaewVar.zzg();
            if (!zzaewVar2.isEmpty()) {
                zzaewVar.putAll(zzaewVar2);
            }
        }
        return zzaewVar;
    }

    public static /* bridge */ zzaga zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza) {
            return zzagaVar;
        }
        zzaga zzb = zzaga.zzb();
        zzaduVar.zzc = zzb;
        return zzb;
    }

    public static boolean zzk(int i, LinkedHashTreeMap.AvlBuilder avlBuilder, Object obj) {
        zzacv zzacvVar = (zzacv) avlBuilder.stack;
        int i2 = avlBuilder.leavesToSkip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            avlBuilder.zzQ(0);
            ((zzaga) obj).zzk(i3 << 3, Long.valueOf(zzacvVar.zzg()));
            return true;
        }
        if (i4 == 1) {
            avlBuilder.zzQ(1);
            ((zzaga) obj).zzk((i3 << 3) | 1, Long.valueOf(zzacvVar.zzi()));
            return true;
        }
        if (i4 == 2) {
            ((zzaga) obj).zzk((i3 << 3) | 2, avlBuilder.zzq());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                a$$ExternalSyntheticBUOutline0.m$5("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return false;
            }
            avlBuilder.zzQ(5);
            ((zzaga) obj).zzk(5 | (i3 << 3), Integer.valueOf(zzacvVar.zzj()));
            return true;
        }
        zzaga zzb = zzaga.zzb();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (avlBuilder.zzb() != Integer.MAX_VALUE && zzk(i6, avlBuilder, zzb)) {
        }
        if ((i5 | 4) != avlBuilder.leavesToSkip) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (zzb.zzf) {
            zzb.zzf = false;
        }
        ((zzaga) obj).zzk(i5 | 3, zzb);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = zzkk.$r8$clinit;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zzadu zzbd;
        zzjh zzjhVar = (zzjh) task.getResult();
        zzmf zzh = zzmg.zzh();
        String str = zzjhVar.zza;
        zzh.zzaY();
        ((zzmg) zzh.zza).zzi(str);
        String str2 = zzjhVar.zzc;
        zzh.zzaY();
        ((zzmg) zzh.zza).zzk(str2);
        boolean z = zzjhVar.zzf;
        zzh.zzaY();
        ((zzmg) zzh.zza).zzn(z);
        long j = zzjhVar.zzg;
        zzh.zzaY();
        ((zzmg) zzh.zza).zzo$1(j);
        byte[] bArr = zzjhVar.zzb;
        if (bArr != null) {
            zzacq zzj = zzacr.zzj(0, bArr.length, bArr);
            zzh.zzaY();
            ((zzmg) zzh.zza).zzj(zzj);
        }
        for (zzjf zzjfVar : zzjhVar.zzd) {
            for (zzjo zzjoVar : zzjfVar.zzb) {
                int i = zzjoVar.zzg;
                String str3 = zzjoVar.zza;
                if (i == 1) {
                    zzmh zzh2 = zzmi.zzh();
                    zzh2.zza$5(str3);
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$3("Not a long type");
                        return null;
                    }
                    long j2 = zzjoVar.zzb;
                    zzh2.zzaY();
                    ((zzmi) zzh2.zza).zzk(j2);
                    zzbd = zzh2.zzbd();
                } else if (i == 2) {
                    zzmh zzh3 = zzmi.zzh();
                    zzh3.zza$5(str3);
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$3("Not a boolean type");
                        return null;
                    }
                    boolean z2 = zzjoVar.zzc;
                    zzh3.zzaY();
                    ((zzmi) zzh3.zza).zzl(z2);
                    zzbd = zzh3.zzbd();
                } else if (i == 3) {
                    zzmh zzh4 = zzmi.zzh();
                    zzh4.zza$5(str3);
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$3("Not a double type");
                        return null;
                    }
                    double d = zzjoVar.zzd;
                    zzh4.zzaY();
                    ((zzmi) zzh4.zza).zzm(d);
                    zzbd = zzh4.zzbd();
                } else if (i == 4) {
                    zzmh zzh5 = zzmi.zzh();
                    zzh5.zza$5(str3);
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$3("Not a String type");
                        return null;
                    }
                    String str4 = zzjoVar.zze;
                    com.google.android.gms.common.internal.zzae.checkNotNull(str4);
                    zzh5.zzaY();
                    ((zzmi) zzh5.zza).zzn(str4);
                    zzbd = zzh5.zzbd();
                } else {
                    if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    zzmh zzh6 = zzmi.zzh();
                    zzh6.zza$5(str3);
                    if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$3("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = zzjoVar.zzf;
                    com.google.android.gms.common.internal.zzae.checkNotNull(bArr2);
                    zzacq zzj2 = zzacr.zzj(0, bArr2.length, bArr2);
                    zzh6.zzaY();
                    ((zzmi) zzh6.zza).zzo(zzj2);
                    zzbd = zzh6.zzbd();
                }
                zzh.zzaY();
                ((zzmg) zzh.zza).zzl((zzmi) zzbd);
            }
            String[] strArr = zzjfVar.zzc;
            if (strArr != null) {
                for (String str5 : strArr) {
                    zzh.zzaY();
                    ((zzmg) zzh.zza).zzm$1(str5);
                }
            }
        }
        return (zzmg) zzh.zzbd();
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public zzafn zzc(Class cls) {
        switch (this.$r8$classId) {
            case 1:
                if (!zzadu.class.isAssignableFrom(cls)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (zzafn) zzadu.zzcr(cls.asSubclass(zzadu.class)).zzg(3);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Unable to get message info for ".concat(cls.getName()), (Throwable) e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public boolean zzb(Class cls) {
        switch (this.$r8$classId) {
            case 1:
                return zzadu.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public static final zzaef zza(Object obj, long j) {
        zzaef zzaefVar = (zzaef) zzagg.zzm(obj, j);
        if (((zzace) zzaefVar).zza) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef zzg = zzaefVar.zzg(size == 0 ? 10 : size + size);
        zzagg.zzn(obj, j, zzg);
        return zzg;
    }
}
