package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        zzi zziVar = null;
        zzg zzgVar = null;
        boolean z6 = true;
        boolean z7 = true;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 14:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    zziVar = (zzi) SafeParcelReader.createParcelable(parcel, readHeader, zzi.CREATOR);
                    break;
                case 17:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 18:
                    zzgVar = (zzg) SafeParcelReader.createParcelable(parcel, readHeader, zzg.CREATOR);
                    break;
                case 19:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 21:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList, z4, z6, zziVar, z7, zzgVar, i4, i5, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
