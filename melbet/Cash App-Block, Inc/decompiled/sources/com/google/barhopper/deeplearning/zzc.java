package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw;
import java.util.Arrays;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzc extends zzeh implements zzfn {
    private static final zzc zzb;
    private int zzd;
    private zzem zze;
    private zzem zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzeh.zzV(zzc.class, zzcVar);
    }

    public zzc() {
        zzdz zzdzVar = zzdz.zza;
        this.zze = zzdzVar;
        this.zzf = zzdzVar;
    }

    public static zzb zza$1() {
        return (zzb) zzb.zzG();
    }

    public static /* synthetic */ void zzc(zzc zzcVar, int i) {
        zzcVar.zzd |= 2;
        zzcVar.zzh = i;
    }

    public static void zzd(zzc zzcVar, float f) {
        List list = zzcVar.zze;
        if (!((zzcs) list).zza) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            zzdz zzdzVar = (zzdz) list;
            if (i < zzdzVar.zzc) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            zzcVar.zze = new zzdz(Arrays.copyOf(zzdzVar.zzb, i), zzdzVar.zzc, true);
        }
        ((zzdz) zzcVar.zze).zzh(f);
    }

    public static void zze(zzc zzcVar, float f) {
        List list = zzcVar.zzf;
        if (!((zzcs) list).zza) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            zzdz zzdzVar = (zzdz) list;
            if (i < zzdzVar.zzc) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            zzcVar.zzf = new zzdz(Arrays.copyOf(zzdzVar.zzb, i), zzdzVar.zzc, true);
        }
        ((zzdz) zzcVar.zzf).zzh(f);
    }

    public static /* synthetic */ void zzf(zzc zzcVar, int i) {
        zzcVar.zzd |= 1;
        zzcVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, zzeh zzehVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzfw(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzc();
        }
        if (i2 == 4) {
            return new zzb(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
