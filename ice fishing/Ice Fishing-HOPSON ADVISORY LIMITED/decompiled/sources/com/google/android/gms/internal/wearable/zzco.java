package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzco implements zzfx {
    private final zzcn zza;

    private zzco(zzcn zzcnVar) {
        this.zza = zzcnVar;
        zzcnVar.zza = this;
    }

    public static zzco zza(zzcn zzcnVar) {
        Object obj = zzcnVar.zza;
        return obj != null ? (zzco) obj : new zzco(zzcnVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzi(i, (zzcg) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzc(int i, long j) throws IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zze(int i, float f) throws IOException {
        this.zza.zzd(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzf(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzh(int i, long j) throws IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzg(i, z);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzh(i, str);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzn(int i, zzcg zzcgVar) throws IOException {
        this.zza.zzi(i, zzcgVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzc(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzq(int i, long j) throws IOException {
        this.zza.zze(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzr(int i, Object obj, zzey zzeyVar) throws IOException {
        zzcn zzcnVar = this.zza;
        zzbr zzbrVar = (zzbr) obj;
        zzcnVar.zza(i, 2);
        zzcnVar.zzn(zzbrVar.zzJ(zzeyVar));
        zzeyVar.zzf(zzbrVar, this);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzs(int i, Object obj, zzey zzeyVar) throws IOException {
        zzcn zzcnVar = this.zza;
        zzcnVar.zza(i, 3);
        zzeyVar.zzf((zzbr) obj, this);
        zzcnVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzcg) {
            this.zza.zzk(i, (zzcg) obj);
        } else {
            this.zza.zzj(i, (zzel) obj);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdx)) {
            while (i2 < list.size()) {
                this.zza.zzh(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzdx zzdxVar = (zzdx) list;
        while (i2 < list.size()) {
            Object zzc = zzdxVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzh(i, (String) zzc);
            } else {
                this.zza.zzi(i, (zzcg) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzea)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzea zzeaVar = (zzea) list;
        if (!z) {
            while (i2 < zzeaVar.size()) {
                this.zza.zzf(i, zzeaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeaVar.size(); i6++) {
            zzeaVar.zze(i6);
            i5 += 8;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzeaVar.size()) {
            zzcnVar2.zzq(zzeaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.zzu(((Integer) list.get(i4)).intValue());
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                this.zza.zzc(i, zzdhVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            i5 += zzcn.zzu(zzdhVar.zze(i6));
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzdhVar.size()) {
            zzcnVar2.zzn(zzdhVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                this.zza.zzd(i, zzdhVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            zzdhVar.zze(i6);
            i5 += 4;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzdhVar.size()) {
            zzcnVar2.zzo(zzdhVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzea)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.zzv(((Long) list.get(i4)).longValue());
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzea zzeaVar = (zzea) list;
        if (!z) {
            while (i2 < zzeaVar.size()) {
                this.zza.zze(i, zzeaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeaVar.size(); i6++) {
            i5 += zzcn.zzv(zzeaVar.zze(i6));
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzeaVar.size()) {
            zzcnVar2.zzp(zzeaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzby)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzl(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzby zzbyVar = (zzby) list;
        if (!z) {
            while (i2 < zzbyVar.size()) {
                this.zza.zzg(i, zzbyVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbyVar.size(); i6++) {
            zzbyVar.zze(i6);
            i5++;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzbyVar.size()) {
            zzcnVar2.zzl(zzbyVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.zzv(((Integer) list.get(i4)).intValue());
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                this.zza.zzb(i, zzdhVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            i5 += zzcn.zzv(zzdhVar.zze(i6));
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzdhVar.size()) {
            zzcnVar2.zzm(zzdhVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzcz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzo(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzcz zzczVar = (zzcz) list;
        if (!z) {
            while (i2 < zzczVar.size()) {
                this.zza.zzd(i, Float.floatToRawIntBits(zzczVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzczVar.size(); i6++) {
            zzczVar.zzf(i6);
            i5 += 4;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzczVar.size()) {
            zzcnVar2.zzo(Float.floatToRawIntBits(zzczVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzcp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzq(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzcp zzcpVar = (zzcp) list;
        if (!z) {
            while (i2 < zzcpVar.size()) {
                this.zza.zzf(i, Double.doubleToRawLongBits(zzcpVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzcpVar.size(); i6++) {
            zzcpVar.zze(i6);
            i5 += 8;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzcpVar.size()) {
            zzcnVar2.zzq(Double.doubleToRawLongBits(zzcpVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                this.zza.zzd(i, zzdhVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            zzdhVar.zze(i6);
            i5 += 4;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzdhVar.size()) {
            zzcnVar2.zzo(zzdhVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzea)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzea zzeaVar = (zzea) list;
        if (!z) {
            while (i2 < zzeaVar.size()) {
                this.zza.zzf(i, zzeaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeaVar.size(); i6++) {
            zzeaVar.zze(i6);
            i5 += 8;
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzeaVar.size()) {
            zzcnVar2.zzq(zzeaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.zzv(((Integer) list.get(i4)).intValue());
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                this.zza.zzb(i, zzdhVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            i5 += zzcn.zzv(zzdhVar.zze(i6));
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzdhVar.size()) {
            zzcnVar2.zzm(zzdhVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdh)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcn zzcnVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzcnVar.zzc(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzcn zzcnVar2 = this.zza;
            zzcnVar2.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzcn.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzcnVar2.zzn(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzcnVar2.zzn((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzdh zzdhVar = (zzdh) list;
        if (!z) {
            while (i2 < zzdhVar.size()) {
                zzcn zzcnVar3 = this.zza;
                int zze = zzdhVar.zze(i2);
                zzcnVar3.zzc(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzcn zzcnVar4 = this.zza;
        zzcnVar4.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdhVar.size(); i6++) {
            int zze2 = zzdhVar.zze(i6);
            i5 += zzcn.zzu((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzcnVar4.zzn(i5);
        while (i2 < zzdhVar.size()) {
            int zze3 = zzdhVar.zze(i2);
            zzcnVar4.zzn((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzea)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcn zzcnVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzcnVar.zze(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzcn zzcnVar2 = this.zza;
            zzcnVar2.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzcn.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzcnVar2.zzn(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzcnVar2.zzp((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzea zzeaVar = (zzea) list;
        if (!z) {
            while (i2 < zzeaVar.size()) {
                zzcn zzcnVar3 = this.zza;
                long zze = zzeaVar.zze(i2);
                zzcnVar3.zze(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzcn zzcnVar4 = this.zza;
        zzcnVar4.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeaVar.size(); i6++) {
            long zze2 = zzeaVar.zze(i6);
            i5 += zzcn.zzv((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzcnVar4.zzn(i5);
        while (i2 < zzeaVar.size()) {
            long zze3 = zzeaVar.zze(i2);
            zzcnVar4.zzp((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfx
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzea)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcn zzcnVar = this.zza;
            zzcnVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.zzv(((Long) list.get(i4)).longValue());
            }
            zzcnVar.zzn(i3);
            while (i2 < list.size()) {
                zzcnVar.zzp(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzea zzeaVar = (zzea) list;
        if (!z) {
            while (i2 < zzeaVar.size()) {
                this.zza.zze(i, zzeaVar.zze(i2));
                i2++;
            }
            return;
        }
        zzcn zzcnVar2 = this.zza;
        zzcnVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeaVar.size(); i6++) {
            i5 += zzcn.zzv(zzeaVar.zze(i6));
        }
        zzcnVar2.zzn(i5);
        while (i2 < zzeaVar.size()) {
            zzcnVar2.zzp(zzeaVar.zze(i2));
            i2++;
        }
    }
}
