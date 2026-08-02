package com.google.android.libraries.places.internal;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzbma {
    public static final zzbma zza = new zzbma(0, new int[0], new Object[0], false);
    public int zzb;
    public int[] zzc;
    public Object[] zzd;
    public int zze = -1;
    public boolean zzf;

    public zzbma(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzbma)) {
            zzbma zzbmaVar = (zzbma) obj;
            int i = this.zzb;
            if (i == zzbmaVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzbmaVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzbmaVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int m$1 = Fragment$5$$ExternalSyntheticOutline0.m$1(i2, 31, i4, 31);
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return m$1 + i3;
    }

    public final void zzg(zzfv zzfvVar) {
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzbivVar.zzg(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzbivVar.zzh(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzbivVar.zzk(i4, (zzbim) obj);
                } else if (i3 == 3) {
                    zzbivVar.zzc(i4, 3);
                    ((zzbma) obj).zzg(zzfvVar);
                    zzbivVar.zzc(i4, 4);
                } else {
                    if (i3 != 5) {
                        a$$ExternalSyntheticBUOutline0.m((Throwable) new zzbkd());
                        return;
                    }
                    zzbivVar.zzf(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzi() {
        int zzG;
        int zzH;
        int zzG2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).getClass();
                    zzG2 = zzbiv.zzG(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzbim zzbimVar = (zzbim) this.zzd[i3];
                    int zzG3 = zzbiv.zzG(i7);
                    int zzb = zzbimVar.zzb();
                    i2 = zzel$EnumUnboxingLocalUtility.m$1(zzb, zzb, zzG3, i2);
                } else if (i6 == 3) {
                    int zzG4 = zzbiv.zzG(i5 << 3);
                    zzG = zzG4 + zzG4;
                    zzH = ((zzbma) this.zzd[i3]).zzi();
                } else {
                    if (i6 != 5) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(new zzbkd());
                        return 0;
                    }
                    ((Integer) this.zzd[i3]).getClass();
                    zzG2 = zzbiv.zzG(i5 << 3) + 4;
                }
                i2 = zzG2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.zzd[i3]).longValue();
                zzG = zzbiv.zzG(i8);
                zzH = zzbiv.zzH(longValue);
            }
            i2 = zzH + zzG + i2;
        }
        this.zze = i2;
        return i2;
    }

    public final void zzk(int i, Object obj) {
        if (!this.zzf) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return;
        }
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }
}
