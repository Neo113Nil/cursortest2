package com.google.android.gms.internal.measurement;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzacq extends zzacp {
    public final byte[] zzb;

    public zzacq(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacp zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzn = zzacr.zzn(0, i2, bArr.length);
        return zzn == 0 ? zzacr.zza : new zzacm(bArr, 0, zzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zzd(int i, byte[] bArr) {
        System.arraycopy(this.zzb, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zze(zzada zzadaVar) {
        byte[] bArr = this.zzb;
        zzadaVar.zza(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean zzf(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        byte[] bArr = this.zzb;
        if (z) {
            return Arrays.equals(bArr, ((zzacq) zzacrVar).zzb);
        }
        boolean z2 = zzacrVar instanceof zzacm;
        if (!z2) {
            return zzacrVar.zzf(this);
        }
        int zzb = zzacrVar.zzb();
        int length = bArr.length;
        if (length > zzb) {
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        if (length > zzacrVar.zzb()) {
            int zzb2 = zzacrVar.zzb();
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(length).length() + 27 + String.valueOf(zzb2).length(), "Ran off end of other: 0, ", ", ", length, zzb2);
            return false;
        }
        if (z) {
            return zzacr.zzo(0, bArr, 0, ((zzacq) zzacrVar).zzb, length);
        }
        if (!z2) {
            return zzacrVar.zzc(0, length).equals(zzc(0, length));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.zzo(0, bArr, zzacmVar.zzi(), zzacmVar.zzh(), length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzg(int i, int i2) {
        return zzaed.zzb(i, 0, i2, this.zzb);
    }
}
