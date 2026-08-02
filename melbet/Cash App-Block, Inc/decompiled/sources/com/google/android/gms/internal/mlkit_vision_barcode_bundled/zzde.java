package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class zzde extends zzdf {
    public final byte[] zza;

    public zzde(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdf) && zzd() == ((zzdf) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (!(obj instanceof zzde)) {
                return obj.equals(this);
            }
            zzde zzdeVar = (zzde) obj;
            int i = super.zza;
            int i2 = ((zzdf) zzdeVar).zza;
            if (i == 0 || i2 == 0 || i == i2) {
                return zzg(zzdeVar, 0, zzd());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public void zze(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzf() {
        return 0;
    }

    public final boolean zzg(zzde zzdeVar, int i, int i2) {
        if (i2 > zzdeVar.zzd()) {
            a$$ExternalSyntheticBUOutline0.m(i2, zzd());
            return false;
        }
        if (i + i2 > zzdeVar.zzd()) {
            Handlers$$ExternalSyntheticBUOutline0.m(zzdeVar.zzd(), Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        byte[] bArr = zzdeVar.zza;
        int zzc = zzc() + i2;
        int zzc2 = zzc();
        int zzc3 = zzdeVar.zzc() + i;
        while (zzc2 < zzc) {
            if (this.zza[zzc2] != bArr[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        Charset charset = zzep.zza;
        for (int i4 = zzc; i4 < zzc + i3; i4++) {
            i = (i * 31) + this.zza[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        zzhe.zzb.getClass();
        return zzea.zza(i, zzc, i3 + zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i, int i2) {
        int zzo = zzdf.zzo(i, i2, zzd());
        if (zzo == 0) {
            return zzdf.zzb;
        }
        return new zzda(this.zza, zzc() + i, zzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzdk zzdkVar) {
        zzdkVar.zzc(zzc(), zzd(), this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int zzc = zzc();
        int zzd = zzd() + zzc;
        zzhe.zzb.getClass();
        return zzea.zza(0, zzc, zzd, this.zza) == 0;
    }
}
