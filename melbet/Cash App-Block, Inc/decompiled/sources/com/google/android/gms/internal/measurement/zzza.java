package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzza {
    public static final long zza;
    public static final zzza zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        zza = j;
        zzb = new zzza(0, -1, -1);
    }

    public zzza(int i, int i2, int i3) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static int zzn(int i, int i2, String str) {
        if (i == i2) {
            throw zzabo.zzb(i - 1, "missing precision", str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw zzabo.zzb(i4, "invalid precision character", str);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw zzabo.zza("precision too large", i, i2, str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw zzabo.zza("invalid precision", i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.zzc == this.zzc && zzzaVar.zzd == this.zzd && zzzaVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final boolean zzh(int i, boolean z) {
        int i2;
        if (zze()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.zzc;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.zze != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.zzd != -1;
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final void zzl(StringBuilder sb) {
        if (zze()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.zzc & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.zzd;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.zze;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }
}
