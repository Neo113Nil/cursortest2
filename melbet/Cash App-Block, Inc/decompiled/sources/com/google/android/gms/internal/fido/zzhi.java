package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzhi extends zzhp {
    public final zzgu zza;

    public zzhi(zzgu zzguVar) {
        this.zza = zzguVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int zzd = zzhp.zzd((byte) 64);
        if (zzd != zza) {
            return zzd - zzhpVar.zza();
        }
        zzgu zzguVar = ((zzhi) zzhpVar).zza;
        zzgu zzguVar2 = this.zza;
        byte[] bArr = zzguVar2.zza;
        int length = bArr.length;
        byte[] bArr2 = zzguVar.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return zzgl.zzb.compare(zzguVar2.zzm(), zzguVar.zzm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhi.class == obj.getClass()) {
            return this.zza.equals(((zzhi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) 64)), this.zza});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        zzgb zzgbVar;
        int i;
        boolean z;
        zzgc zzgcVar = zzge.zze;
        zzge zzgeVar = ((zzge) zzgcVar).zza;
        if (zzgeVar == null) {
            zzgb zzgbVar2 = zzgcVar.zzb;
            char[] cArr = zzgbVar2.zzf;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    zzgbVar = zzgbVar2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        a$$ExternalSyntheticBUOutline0.m$1("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    zzgbVar = new zzgb(zzgbVar2.zze.concat(".upperCase()"), cArr2);
                    byte[] bArr = zzgbVar.zzg;
                    if (zzgbVar2.zzh && !zzgbVar.zzh) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    a$$ExternalSyntheticBUOutline0.m$1(zzh.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        zzgbVar = new zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, copyOf, true);
                    }
                }
            }
            zzgeVar = zzgbVar == zzgbVar2 ? zzgcVar : new zzgc(zzgbVar);
            ((zzge) zzgcVar).zza = zzgeVar;
        }
        byte[] zzm = this.zza.zzm();
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("h'", zzgeVar.zzg(zzm.length, zzm), "'");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) 64);
    }
}
