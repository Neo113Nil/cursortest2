package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.common.collect.Maps;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjg(3);
    public final String zzb;
    public final byte[] zzc;
    public final byte[][] zzd;
    public final byte[][] zze;
    public final byte[][] zzf;
    public final byte[][] zzg;
    public final int[] zzh;
    public final byte[][] zzi;
    public final int[] zzj;
    public final byte[][] zzk;

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.zzb = str;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzf = bArr4;
        this.zzg = bArr5;
        this.zzh = iArr;
        this.zzi = bArr6;
        this.zzj = iArr2;
        this.zzk = bArr7;
    }

    public static void zza(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            com.google.android.gms.common.internal.zzae.checkNotNull(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set zzc(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(Maps.capacity(length));
        for (byte[] bArr2 : bArr) {
            com.google.android.gms.common.internal.zzae.checkNotNull(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List zze(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new zzju(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzh.zza(this.zzb, zzjlVar.zzb) && zzh.zza(zzb(), zzjlVar.zzb()) && zzh.zza(zzc(this.zzd), zzc(zzjlVar.zzd)) && zzh.zza(zzc(this.zze), zzc(zzjlVar.zze)) && zzh.zza(zzc(this.zzf), zzc(zzjlVar.zzf)) && zzh.zza(zzc(this.zzg), zzc(zzjlVar.zzg))) {
                int[] iArr = this.zzh;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    obj2 = Collections.EMPTY_SET;
                } else {
                    obj2 = new HashSet(Maps.capacity(length2));
                    for (int i : iArr) {
                        obj2.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = zzjlVar.zzh;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    obj3 = Collections.EMPTY_SET;
                } else {
                    obj3 = new HashSet(Maps.capacity(length));
                    for (int i2 : iArr2) {
                        obj3.add(Integer.valueOf(i2));
                    }
                }
                if (zzh.zza(obj2, obj3) && zzh.zza(zze(this.zzj), zze(zzjlVar.zzj)) && zzh.zza(zzc(this.zzk), zzc(zzjlVar.zzk))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.zzb;
        sb.append(str == null ? "null" : Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.zzc;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        zza(sb, "GAIA=", this.zzd);
        sb.append(", ");
        zza(sb, "PSEUDO=", this.zze);
        sb.append(", ");
        zza(sb, "ALWAYS=", this.zzf);
        sb.append(", ");
        zza(sb, "OTHER=", this.zzg);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.zzh));
        sb.append(", ");
        zza(sb, "directs=", this.zzi);
        sb.append(", genDims=");
        sb.append(Arrays.toString(zze(this.zzj).toArray()));
        sb.append(", ");
        zza(sb, "external=", this.zzk);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.writeIntArray(parcel, 8, this.zzh);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 9, this.zzi);
        MooncakeHeaderViewKt.writeIntArray(parcel, 10, this.zzj);
        MooncakeHeaderViewKt.writeByteArrayArray(parcel, 11, this.zzk);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final Set zzb() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.zzi;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.zzc;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return zzc((byte[][]) arrayList.toArray(new byte[0][]));
    }
}
