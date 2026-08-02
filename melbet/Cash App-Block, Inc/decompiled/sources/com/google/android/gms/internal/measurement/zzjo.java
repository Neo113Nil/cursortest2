package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjg(4);
    public final String zza;
    public final long zzb;
    public final boolean zzc;
    public final double zzd;
    public final String zze;
    public final byte[] zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;

    public zzjo(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.zza = str;
        this.zzb = j;
        this.zzc = z;
        this.zzd = d;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = i;
        this.zzh = i2;
        this.zzi = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        zzjo zzjoVar = (zzjo) obj;
        int compareTo = this.zza.compareTo(zzjoVar.zza);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = zzjoVar.zzg;
        int i2 = this.zzg;
        int i3 = i2 < i ? -1 : i2 != i ? 1 : 0;
        if (i3 != 0) {
            return i3;
        }
        if (i2 == 1) {
            long j = this.zzb;
            long j2 = zzjoVar.zzb;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
            }
        }
        if (i2 == 2) {
            boolean z = zzjoVar.zzc;
            boolean z2 = this.zzc;
            if (z2 != z) {
                return z2 ? 1 : -1;
            }
            return 0;
        }
        if (i2 == 3) {
            return Double.compare(this.zzd, zzjoVar.zzd);
        }
        if (i2 == 4) {
            String str = zzjoVar.zze;
            String str2 = this.zze;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                }
            }
            return 0;
        }
        if (i2 != 5) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
            return 0;
        }
        byte[] bArr = zzjoVar.zzf;
        byte[] bArr2 = this.zzf;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzh.zza(this.zza, zzjoVar.zza)) {
                int i = zzjoVar.zzg;
                int i2 = this.zzg;
                if (i2 == i && this.zzh == zzjoVar.zzh && this.zzi == zzjoVar.zzi) {
                    if (i2 == 1) {
                        return this.zzb == zzjoVar.zzb;
                    }
                    if (i2 == 2) {
                        return this.zzc == zzjoVar.zzc;
                    }
                    if (i2 == 3) {
                        return this.zzd == zzjoVar.zzd;
                    }
                    if (i2 == 4) {
                        return zzh.zza(this.zze, zzjoVar.zze);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.zzf, zzjoVar.zzf);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zzf(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        boolean z = str == null;
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        if (!z) {
            MooncakeHeaderViewKt.writeString(parcel, 2, str);
        }
        long j = this.zzb;
        if (j != 0) {
            MooncakeHeaderViewKt.zza(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.zzc) {
            MooncakeHeaderViewKt.zza(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.zzd;
        if (d != 0.0d) {
            MooncakeHeaderViewKt.zza(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.zze;
        if (str2 != null) {
            MooncakeHeaderViewKt.writeString(parcel, 6, str2);
        }
        byte[] bArr = this.zzf;
        if (bArr != null) {
            MooncakeHeaderViewKt.writeByteArray(parcel, 7, bArr);
        }
        int i2 = this.zzg;
        if (i2 != 0) {
            MooncakeHeaderViewKt.zza(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.zzh;
        if (i3 != 0) {
            MooncakeHeaderViewKt.zza(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.zzi;
        if (i4 != 0) {
            MooncakeHeaderViewKt.zza(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final void zzf(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.zza;
        sb.append(str);
        sb.append(", ");
        int i = this.zzg;
        if (i == 1) {
            sb.append(this.zzb);
        } else if (i == 2) {
            sb.append(this.zzc);
        } else if (i == 3) {
            sb.append(this.zzd);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.zze;
            com.google.android.gms.common.internal.zzae.checkNotNull(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.zzf;
            com.google.android.gms.common.internal.zzae.checkNotNull(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.zzh);
        sb.append(", ");
        sb.append(this.zzi);
        sb.append(")");
    }
}
