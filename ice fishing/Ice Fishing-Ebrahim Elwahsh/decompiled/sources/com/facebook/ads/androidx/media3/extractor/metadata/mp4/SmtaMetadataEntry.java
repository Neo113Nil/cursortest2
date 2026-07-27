package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.instagram.common.viewpoint.core.AbstractC0784At;
import com.instagram.common.viewpoint.core.C2399qI;
import com.instagram.common.viewpoint.core.C3E;
import com.instagram.common.viewpoint.core.IS;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"YowUIYllSx7M6YCZVsXGshOnSOoLtc3h", "cbQDhaoj6BnnjM86BUfLE0DUXcchhogH", "2jGri3G66okxwB6aTtVFlcwUPMWoSDUh", "oqqvnpR2rXjWIfcGmkwLVz", "HP58ZBS", "5FsZYBr", "C83yH5O3JL7Th6ZwVIEMqTmMQGSsrvlo", "iqmiLlFC0cAnJcgIyeYDmB"};
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR;
    public final float A00;
    public final int A01;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 34, 113, 116, 97, 86, 103, 111, 114, 109, 112, 99, 110, 78, 99, 123, 103, 112, 65, 109, 119, 108, 118, c.f16476c, 67, 93, 68, 81, 10, 16, 83, 81, c.f16475b, 68, 69, 66, 85, 118, 66, 81, 93, 85, 98, 81, 68, 85, 13};
        String[] strArr = A03;
        if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "UBLtj7Rjkge8uoQlelG8V5Ug9TCga9yn";
        strArr2[1] = "9YC8uwkWuRyKlQdVdfZWzcDmlZgaZ9BR";
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2399qI A9b() {
        return C3E.A00(this);
    }

    static {
        A01();
        CREATOR = new IS();
    }

    public SmtaMetadataEntry(float f6, int i) {
        this.A00 = f6;
        this.A01 = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, IS is) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.A00 == smtaMetadataEntry.A00) {
            int i = this.A01;
            int i4 = smtaMetadataEntry.A01;
            String[] strArr = A03;
            if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "brpfHyQIMc9PLpoKo97tct";
            strArr2[3] = "b67853lh3a5iLFx744cZ7n";
            if (i == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = AbstractC0784At.A00(this.A00);
        return (((17 * 31) + result) * 31) + this.A01;
    }

    public final String toString() {
        return A00(24, 23, 55) + this.A00 + A00(0, 24, 5) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
