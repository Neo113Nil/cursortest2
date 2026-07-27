package androidx.core.graphics.drawable;

import F.k;
import P.a;
import P.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1308a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f822e.readInt();
        }
        iconCompat.f1308a = i2;
        byte[] bArr = iconCompat.f1310c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f822e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1310c = bArr;
        iconCompat.f1311d = aVar.f(iconCompat.f1311d, 3);
        int i3 = iconCompat.f1312e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f822e.readInt();
        }
        iconCompat.f1312e = i3;
        int i4 = iconCompat.f1313f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f822e.readInt();
        }
        iconCompat.f1313f = i4;
        iconCompat.f1314g = (ColorStateList) aVar.f(iconCompat.f1314g, 6);
        String str = iconCompat.f1316i;
        if (aVar.e(7)) {
            str = ((b) aVar).f822e.readString();
        }
        iconCompat.f1316i = str;
        String str2 = iconCompat.f1317j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f822e.readString();
        }
        iconCompat.f1317j = str2;
        iconCompat.f1315h = PorterDuff.Mode.valueOf(iconCompat.f1316i);
        switch (iconCompat.f1308a) {
            case -1:
                Parcelable parcelable = iconCompat.f1311d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1309b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1311d;
                if (parcelable2 != null) {
                    iconCompat.f1309b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1310c;
                    iconCompat.f1309b = bArr3;
                    iconCompat.f1308a = 3;
                    iconCompat.f1312e = 0;
                    iconCompat.f1313f = bArr3.length;
                }
                return iconCompat;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f1310c, Charset.forName("UTF-16"));
                iconCompat.f1309b = str3;
                if (iconCompat.f1308a == 2 && iconCompat.f1317j == null) {
                    iconCompat.f1317j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1309b = iconCompat.f1310c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1316i = iconCompat.f1315h.name();
        switch (iconCompat.f1308a) {
            case -1:
                iconCompat.f1311d = (Parcelable) iconCompat.f1309b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1311d = (Parcelable) iconCompat.f1309b;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f1310c = ((String) iconCompat.f1309b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1310c = (byte[]) iconCompat.f1309b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1310c = iconCompat.f1309b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1308a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f822e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1310c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f822e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1311d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f822e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1312e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f822e.writeInt(i3);
        }
        int i4 = iconCompat.f1313f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f822e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1314g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f822e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1316i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f822e.writeString(str);
        }
        String str2 = iconCompat.f1317j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f822e.writeString(str2);
        }
    }
}
