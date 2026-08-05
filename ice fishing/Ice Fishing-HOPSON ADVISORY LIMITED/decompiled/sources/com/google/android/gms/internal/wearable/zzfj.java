package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzfj {
    private static final zzfj zza = new zzfj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzfj zza() {
        return zza;
    }

    static zzfj zzb() {
        return new zzfj(0, new int[8], new Object[8], true);
    }

    static zzfj zzc(zzfj zzfjVar, zzfj zzfjVar2) {
        int i = zzfjVar.zzb + zzfjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzfjVar.zzc, i);
        System.arraycopy(zzfjVar2.zzc, 0, copyOf, zzfjVar.zzb, zzfjVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzfjVar.zzd, i);
        System.arraycopy(zzfjVar2.zzd, 0, copyOf2, zzfjVar.zzb, zzfjVar2.zzb);
        return new zzfj(i, copyOf, copyOf2, true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfj)) {
            return false;
        }
        zzfj zzfjVar = (zzfj) obj;
        int i = this.zzb;
        if (i == zzfjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfjVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzfjVar.zzd;
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
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzfx zzfxVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzfxVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzfx zzfxVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzfxVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzfxVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzfxVar.zzn(i4, (zzcg) obj);
                } else if (i3 == 3) {
                    zzfxVar.zzt(i4);
                    ((zzfj) obj).zzg(zzfxVar);
                    zzfxVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzdu("Protocol message tag had invalid wire type."));
                    }
                    zzfxVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzcg zzcgVar = (zzcg) this.zzd[i3];
            int zzu = zzcn.zzu(8);
            int zzu2 = zzcn.zzu(16) + zzcn.zzu(i4);
            int zzu3 = zzcn.zzu(24);
            int zzb = zzcgVar.zzb();
            i2 += zzu + zzu + zzu2 + zzu3 + zzcn.zzu(zzb) + zzb;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzu;
        int zzv;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzcn.zzu(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzcg zzcgVar = (zzcg) this.zzd[i4];
                    int zzu2 = zzcn.zzu(i8);
                    int zzb = zzcgVar.zzb();
                    i = zzu2 + zzcn.zzu(zzb) + zzb;
                } else if (i7 == 3) {
                    int zzu3 = zzcn.zzu(i6 << 3);
                    zzu = zzu3 + zzu3;
                    zzv = ((zzfj) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzdu("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzcn.zzu(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzu = zzcn.zzu(i9);
                zzv = zzcn.zzv(longValue);
            }
            i = zzu + zzv;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzen.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final zzfj zzl(zzfj zzfjVar) {
        if (zzfjVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzfjVar.zzb;
        zzm(i);
        System.arraycopy(zzfjVar.zzc, 0, this.zzc, this.zzb, zzfjVar.zzb);
        System.arraycopy(zzfjVar.zzd, 0, this.zzd, this.zzb, zzfjVar.zzb);
        this.zzb = i;
        return this;
    }
}
