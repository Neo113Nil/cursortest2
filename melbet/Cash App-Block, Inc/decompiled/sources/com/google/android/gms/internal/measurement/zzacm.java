package com.google.android.gms.internal.measurement;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class zzacm extends zzacp {
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzacm(byte[] bArr, int i, int i2) {
        zzacr.zzn(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacp zzc(int i, int i2) {
        int zzn = zzacr.zzn(i, i2, this.zzd);
        if (zzn == 0) {
            return zzacr.zza;
        }
        return new zzacm(this.zzb, this.zzc + i, zzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zzd(int i, byte[] bArr) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zze(zzada zzadaVar) {
        zzadaVar.zza(this.zzc, this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean zzf(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        if (!z && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.zzf(this);
        }
        int zzb = zzacrVar.zzb();
        int i = this.zzd;
        if (i > zzb) {
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
            return false;
        }
        if (i > zzacrVar.zzb()) {
            int zzb2 = zzacrVar.zzb();
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i).length() + 27 + String.valueOf(zzb2).length(), "Ran off end of other: 0, ", ", ", i, zzb2);
            return false;
        }
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        if (z) {
            return zzacr.zzo(i2, bArr, 0, ((zzacq) zzacrVar).zzb, i);
        }
        if (!(zzacrVar instanceof zzacm)) {
            return zzacrVar.zzc(0, i).equals(zzc(i2, i + i2));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.zzo(i2, bArr, zzacmVar.zzc, zzacmVar.zzb, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzg(int i, int i2) {
        return zzaed.zzb(i, this.zzc, i2, this.zzb);
    }

    public final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }

    public final /* synthetic */ int zzi() {
        return this.zzc;
    }
}
