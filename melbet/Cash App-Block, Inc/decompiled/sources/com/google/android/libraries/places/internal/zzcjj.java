package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzcjj {
    public final zzcly zzf;
    public final ArrayList zze = new ArrayList();
    public zzcji[] zza = new zzcji[8];
    public int zzb = 7;
    public int zzc = 0;
    public int zzd = 0;
    public int zzg = 4096;
    public int zzh = 4096;

    public zzcjj(zzcjm zzcjmVar) {
        this.zzf = new zzcly(zzcjmVar);
    }

    public final int zzd(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte zzj = this.zzf.zzj();
            int i5 = zzj & 255;
            if ((zzj & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (zzj & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    public final zzcls zze() {
        int i;
        zzcly zzclyVar = this.zzf;
        byte zzj = zzclyVar.zzj();
        int i2 = zzj & 255;
        int i3 = zzj & 128;
        long zzd = zzd(i2, 127);
        if (i3 != 128) {
            return zzclyVar.zzn(zzd);
        }
        zzcjs zzcjsVar = zzcjs.zzc;
        zzclyVar.zzg(zzd);
        byte[] zzr = zzclyVar.zzb.zzr(zzd);
        zzcjsVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzcjr zzcjrVar = zzcjsVar.zzd;
        int i4 = 0;
        zzcjr zzcjrVar2 = zzcjrVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < zzr.length) {
            int i7 = zzr[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    zzcjrVar2 = zzcjrVar2.zza[(i >>> i9) & 255];
                    if (zzcjrVar2.zza == null) {
                        byteArrayOutputStream.write(zzcjrVar2.zzb);
                        i6 -= zzcjrVar2.zzc;
                        zzcjrVar2 = zzcjrVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i;
        }
        while (i6 > 0) {
            zzcjr zzcjrVar3 = zzcjrVar2.zza[(i5 << (8 - i6)) & 255];
            zzcjr[] zzcjrVarArr = zzcjrVar3.zza;
            int i10 = zzcjrVar3.zzc;
            if (zzcjrVarArr != null || i10 > i6) {
                break;
            }
            byteArrayOutputStream.write(zzcjrVar3.zzb);
            i6 -= i10;
            zzcjrVar2 = zzcjrVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        zzcls zzclsVar = zzcls.zza;
        return zzey.zzb(byteArray);
    }

    public final void zzh(int i) {
        int i2;
        if (i > 0) {
            int length = this.zza.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.zzb;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.zza[length].zzh;
                i -= i4;
                this.zzd -= i4;
                this.zzc--;
                i3++;
                length--;
            }
            zzcji[] zzcjiVarArr = this.zza;
            int i5 = i2 + 1;
            System.arraycopy(zzcjiVarArr, i5, zzcjiVarArr, i5 + i3, this.zzc);
            this.zzb += i3;
        }
    }

    public final zzcls zzj(int i) {
        if (i >= 0) {
            zzcji[] zzcjiVarArr = zzcjl.zzb;
            int length = zzcjiVarArr.length;
            if (i <= 60) {
                return zzcjiVarArr[i].zzf;
            }
        }
        int length2 = zzcjl.zzb.length;
        int i2 = this.zzb + 1 + (i - 61);
        if (i2 >= 0) {
            zzcji[] zzcjiVarArr2 = this.zza;
            if (i2 < zzcjiVarArr2.length) {
                return zzcjiVarArr2[i2].zzf;
            }
        }
        int i3 = i + 1;
        a$$ExternalSyntheticBUOutline0.m$4(Boxes$$ExternalSyntheticOutline1.m(i3, "Header index too large ", new StringBuilder(String.valueOf(i3).length() + 23)));
        return null;
    }

    public final void zzk(zzcji zzcjiVar) {
        this.zze.add(zzcjiVar);
        int i = zzcjiVar.zzh;
        int i2 = this.zzh;
        if (i > i2) {
            Arrays.fill(this.zza, (Object) null);
            this.zzb = this.zza.length - 1;
            this.zzc = 0;
            this.zzd = 0;
            return;
        }
        zzh((this.zzd + i) - i2);
        int i3 = this.zzc + 1;
        zzcji[] zzcjiVarArr = this.zza;
        int length = zzcjiVarArr.length;
        if (i3 > length) {
            zzcji[] zzcjiVarArr2 = new zzcji[length + length];
            System.arraycopy(zzcjiVarArr, 0, zzcjiVarArr2, length, length);
            this.zzb = this.zza.length - 1;
            this.zza = zzcjiVarArr2;
        }
        int i4 = this.zzb;
        this.zzb = i4 - 1;
        this.zza[i4] = zzcjiVar;
        this.zzc++;
        this.zzd += i;
    }
}
