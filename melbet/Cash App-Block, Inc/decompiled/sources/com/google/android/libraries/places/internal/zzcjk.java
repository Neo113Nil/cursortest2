package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzcjk {
    public Serializable zza;
    public int zzb;
    public final Object zzc;
    public int zzd;
    public int zze;

    public zzcjk(int i, int i2, int i3) {
        this.zzc = i != Integer.MIN_VALUE ? Boxes$$ExternalSyntheticOutline1.m(i, "/") : "";
        this.zzb = i2;
        this.zzd = i3;
        this.zze = PKIFailureInfo.systemUnavail;
        this.zza = "";
    }

    public void generateNewId() {
        int i = this.zze;
        this.zze = i == Integer.MIN_VALUE ? this.zzb : i + this.zzd;
        this.zza = ((String) this.zzc) + this.zze;
    }

    public void maybeThrowUninitializedError() {
        if (this.zze != Integer.MIN_VALUE) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("generateNewId() must be called before retrieving ids.");
    }

    public void zza(List list) {
        int i;
        int i2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzcji zzcjiVar = (zzcji) list.get(i3);
            zzcls zzh = zzcjiVar.zzf.zzh();
            zzcls zzclsVar = zzcjiVar.zzg;
            Integer num = (Integer) zzcjl.zzc.get(zzh);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (i2 >= 2 && i2 <= 7) {
                    zzcji[] zzcjiVarArr = zzcjl.zzb;
                    if (zzcjiVarArr[intValue].zzg.equals(zzclsVar)) {
                        i = i2;
                    } else if (zzcjiVarArr[i2].zzg.equals(zzclsVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i4 = this.zzd;
                while (true) {
                    i4++;
                    zzcji[] zzcjiVarArr2 = (zzcji[]) this.zza;
                    if (i4 >= zzcjiVarArr2.length) {
                        i2 = -1;
                        break;
                    }
                    if (zzcjiVarArr2[i4].zzf.equals(zzh)) {
                        if (((zzcji[]) this.zza)[i4].zzg.equals(zzclsVar)) {
                            int i5 = i4 - this.zzd;
                            int length = zzcjl.zzb.length;
                            i2 = i5 + 61;
                            break;
                        } else if (i == -1) {
                            int i6 = i4 - this.zzd;
                            int length2 = zzcjl.zzb.length;
                            i = i6 + 61;
                        }
                    }
                }
            }
            if (i2 != -1) {
                zzb(i2, 127, 128);
            } else if (i == -1) {
                ((zzclo) this.zzc).zzA(64);
                zzc(zzh);
                zzc(zzclsVar);
                zzd(zzcjiVar);
            } else {
                zzcls zzclsVar2 = zzcjl.zza;
                zzh.getClass();
                zzclsVar2.getClass();
                if (!zzh.zzn(zzclsVar2, zzclsVar2.zzb.length) || zzcji.zze.equals(zzh)) {
                    zzb(i, 63, 64);
                    zzc(zzclsVar);
                    zzd(zzcjiVar);
                } else {
                    zzb(i, 15, 0);
                    zzc(zzclsVar);
                }
            }
        }
    }

    public void zzb(int i, int i2, int i3) {
        zzclo zzcloVar = (zzclo) this.zzc;
        if (i < i2) {
            zzcloVar.zzA(i | i3);
            return;
        }
        zzcloVar.zzA(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            zzcloVar.zzA(128 | (i4 & 127));
            i4 >>>= 7;
        }
        zzcloVar.zzA(i4);
    }

    public void zzc(zzcls zzclsVar) {
        zzb(zzclsVar.zzj(), 127, 0);
        zzclsVar.zzm((zzclo) this.zzc, zzclsVar.zzj());
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzcji[], java.io.Serializable, java.lang.Object] */
    public void zzd(zzcji zzcjiVar) {
        int i;
        int i2 = zzcjiVar.zzh;
        if (i2 > 4096) {
            Arrays.fill((zzcji[]) this.zza, (Object) null);
            this.zzd = ((zzcji[]) this.zza).length - 1;
            this.zzb = 0;
            this.zze = 0;
            return;
        }
        int i3 = (this.zze + i2) - 4096;
        if (i3 > 0) {
            int length = ((zzcji[]) this.zza).length - 1;
            int i4 = 0;
            while (true) {
                i = this.zzd;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = ((zzcji[]) this.zza)[length].zzh;
                i3 -= i5;
                this.zze -= i5;
                this.zzb--;
                i4++;
                length--;
            }
            zzcji[] zzcjiVarArr = (zzcji[]) this.zza;
            int i6 = i + 1;
            System.arraycopy(zzcjiVarArr, i6, zzcjiVarArr, i6 + i4, this.zzb);
            this.zzd += i4;
        }
        int i7 = this.zzb + 1;
        zzcji[] zzcjiVarArr2 = (zzcji[]) this.zza;
        int length2 = zzcjiVarArr2.length;
        if (i7 > length2) {
            ?? r1 = new zzcji[length2 + length2];
            System.arraycopy(zzcjiVarArr2, 0, r1, length2, length2);
            this.zzd = ((zzcji[]) this.zza).length - 1;
            this.zza = r1;
        }
        int i8 = this.zzd;
        this.zzd = i8 - 1;
        ((zzcji[]) this.zza)[i8] = zzcjiVar;
        this.zzb++;
        this.zze += i2;
    }

    public zzcjk(int i, int i2) {
        this(PKIFailureInfo.systemUnavail, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.libraries.places.internal.zzcji[], java.io.Serializable] */
    public zzcjk(zzclo zzcloVar) {
        this.zza = new zzcji[8];
        this.zzd = 7;
        this.zzc = zzcloVar;
    }
}
