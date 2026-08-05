package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.AppTheme;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        AppTheme.Icon icon = null;
        AppTheme.Headline headline = null;
        AppTheme.Description description = null;
        AppTheme.CallToAction callToAction = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    icon = (AppTheme.Icon) SafeParcelReader.createParcelable(parcel, readHeader, AppTheme.Icon.CREATOR);
                    break;
                case 7:
                    headline = (AppTheme.Headline) SafeParcelReader.createParcelable(parcel, readHeader, AppTheme.Headline.CREATOR);
                    break;
                case 8:
                    description = (AppTheme.Description) SafeParcelReader.createParcelable(parcel, readHeader, AppTheme.Description.CREATOR);
                    break;
                case 9:
                    callToAction = (AppTheme.CallToAction) SafeParcelReader.createParcelable(parcel, readHeader, AppTheme.CallToAction.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AppTheme(i, i2, i3, i4, i5, icon, headline, description, callToAction);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppTheme[i];
    }
}
