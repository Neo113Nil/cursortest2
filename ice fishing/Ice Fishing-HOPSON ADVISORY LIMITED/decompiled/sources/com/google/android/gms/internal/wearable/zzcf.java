package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcf extends zzce {
    private final byte[] zzb;

    zzcf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcg zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzn = zzn(0, i2, bArr.length);
        return zzn == 0 ? zzcg.zza : new zzcc(bArr, 0, zzn);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final void zzd(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    final void zze(zzbz zzbzVar) throws IOException {
        byte[] bArr = this.zzb;
        ((zzcl) zzbzVar).zzr(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final boolean zzf(zzcg zzcgVar) {
        boolean z = zzcgVar instanceof zzcf;
        if (z) {
            return Arrays.equals(this.zzb, ((zzcf) zzcgVar).zzb);
        }
        boolean z2 = zzcgVar instanceof zzcc;
        if (!z2) {
            return zzcgVar.zzf(this);
        }
        byte[] bArr = this.zzb;
        int zzb = zzcgVar.zzb();
        int length = bArr.length;
        if (length > zzb) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= zzcgVar.zzb()) {
            if (z) {
                return zzcg.zzo(bArr, 0, ((zzcf) zzcgVar).zzb, 0, length);
            }
            if (!z2) {
                return zzcgVar.zzc(0, length).equals(zzc(0, length));
            }
            zzcc zzccVar = (zzcc) zzcgVar;
            return zzcg.zzo(bArr, 0, zzccVar.zzi(), zzccVar.zzj(), length);
        }
        int zzb2 = zzcgVar.zzb();
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(zzb2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(zzb2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    protected final int zzg(int i, int i2, int i3) {
        return zzdq.zzb(i, this.zzb, 0, i3);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcj zzh() {
        byte[] bArr = this.zzb;
        return zzcj.zzE(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzi() {
        return this.zzb;
    }
}
