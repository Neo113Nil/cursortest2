package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new zzd();
    public final ParcelFileDescriptor zza;
    public final Uri zzb;
    private final byte[] zzc;
    private final String zzd;

    Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.zzc = bArr;
        this.zzd = str;
        this.zza = parcelFileDescriptor;
        this.zzb = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.zzc, asset.zzc) && Objects.equal(this.zzd, asset.zzd) && Objects.equal(this.zza, asset.zza) && Objects.equal(this.zzb, asset.zzb);
    }

    @Pure
    public String getDigest() {
        return this.zzd;
    }

    public ParcelFileDescriptor getFd() {
        return this.zza;
    }

    public Uri getUri() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.zzc, this.zzd, this.zza, this.zzb});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.zzd;
        if (str == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(str);
        }
        byte[] bArr = this.zzc;
        if (bArr != null) {
            sb.append(", size=");
            sb.append(bArr.length);
        }
        ParcelFileDescriptor parcelFileDescriptor = this.zza;
        if (parcelFileDescriptor != null) {
            sb.append(", fd=");
            sb.append(parcelFileDescriptor);
        }
        Uri uri = this.zzb;
        if (uri != null) {
            sb.append(", uri=");
            sb.append(uri);
        }
        sb.append("]");
        return sb.toString();
    }

    @Pure
    public final byte[] zza() {
        return this.zzc;
    }

    public static Asset createFromBytes(byte[] bArr) {
        bArr.getClass();
        return new Asset(bArr, null, null, null);
    }

    public static Asset createFromFd(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public static Asset createFromRef(String str) {
        str.getClass();
        return new Asset(null, str, null, null);
    }

    public static Asset createFromUri(Uri uri) {
        uri.getClass();
        return new Asset(null, null, null, uri);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = i | 1;
        byte[] bArr = this.zzc;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.writeString(parcel, 3, getDigest(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zza, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzb, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
