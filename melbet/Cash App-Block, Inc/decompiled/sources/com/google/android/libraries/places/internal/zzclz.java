package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzclz {
    public final byte[] zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public final boolean zze;
    public zzclz zzf;
    public zzclz zzg;

    public zzclz(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = false;
    }

    public final zzclz zza() {
        this.zzd = true;
        return new zzclz(this.zza, this.zzb, this.zzc, true);
    }

    public final zzclz zzb() {
        zzclz zzclzVar = this.zzf;
        if (zzclzVar == this) {
            zzclzVar = null;
        }
        zzclz zzclzVar2 = this.zzg;
        zzclzVar2.getClass();
        zzclzVar2.zzf = this.zzf;
        zzclz zzclzVar3 = this.zzf;
        zzclzVar3.getClass();
        zzclzVar3.zzg = this.zzg;
        this.zzf = null;
        this.zzg = null;
        return zzclzVar;
    }

    public final void zzc(zzclz zzclzVar) {
        zzclzVar.getClass();
        zzclzVar.zzg = this;
        zzclzVar.zzf = this.zzf;
        zzclz zzclzVar2 = this.zzf;
        zzclzVar2.getClass();
        zzclzVar2.zzg = zzclzVar;
        this.zzf = zzclzVar;
    }

    public final void zze(zzclz zzclzVar, int i) {
        if (!zzclzVar.zze) {
            a$$ExternalSyntheticBUOutline0.m$1("only owner can write");
            return;
        }
        int i2 = zzclzVar.zzc;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zzclzVar.zzd) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            int i4 = zzclzVar.zzb;
            if (i3 - i4 > 8192) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            byte[] bArr = zzclzVar.zza;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2);
            i2 = zzclzVar.zzc - zzclzVar.zzb;
            zzclzVar.zzc = i2;
            zzclzVar.zzb = 0;
        }
        byte[] bArr2 = zzclzVar.zza;
        int i5 = this.zzb;
        ArraysKt___ArraysJvmKt.copyInto(i2, this.zza, i5, bArr2, i5 + i);
        zzclzVar.zzc += i;
        this.zzb += i;
    }

    public zzclz() {
        this.zza = new byte[PKIFailureInfo.certRevoked];
        this.zze = true;
        this.zzd = false;
    }
}
