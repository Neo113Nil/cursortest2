package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcc extends zzce {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzcc(byte[] bArr, int i, int i2) {
        super(null);
        zzn(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcg zzc(int i, int i2) {
        int zzn = zzn(i, i2, this.zzd);
        return zzn == 0 ? zzcg.zza : new zzcc(this.zzb, this.zzc + i, zzn);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final void zzd(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    final void zze(zzbz zzbzVar) throws IOException {
        ((zzcl) zzbzVar).zzr(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final boolean zzf(zzcg zzcgVar) {
        boolean z = zzcgVar instanceof zzcf;
        if (!z && !(zzcgVar instanceof zzcc)) {
            return zzcgVar.zzf(this);
        }
        int i = this.zzd;
        if (i > zzcgVar.zzb()) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= zzcgVar.zzb()) {
            if (z) {
                return zzcg.zzo(this.zzb, this.zzc, ((zzcf) zzcgVar).zzi(), 0, i);
            }
            if (zzcgVar instanceof zzcc) {
                zzcc zzccVar = (zzcc) zzcgVar;
                return zzcg.zzo(this.zzb, this.zzc, zzccVar.zzb, zzccVar.zzc, i);
            }
            zzcg zzc = zzcgVar.zzc(0, i);
            int i2 = this.zzc;
            return zzc.equals(zzc(i2, i + i2));
        }
        int zzb = zzcgVar.zzb();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(zzb).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(zzb);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final int zzg(int i, int i2, int i3) {
        return zzdq.zzb(i, this.zzb, this.zzc, i3);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcj zzh() {
        throw null;
    }

    final /* synthetic */ byte[] zzi() {
        return this.zzb;
    }

    final /* synthetic */ int zzj() {
        return this.zzc;
    }
}
