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
        int i2 = iconCompat.f1300a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f851e.readInt();
        }
        iconCompat.f1300a = i2;
        byte[] bArr = iconCompat.f1302c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f851e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1302c = bArr;
        iconCompat.f1303d = aVar.f(iconCompat.f1303d, 3);
        int i3 = iconCompat.f1304e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f851e.readInt();
        }
        iconCompat.f1304e = i3;
        int i4 = iconCompat.f1305f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f851e.readInt();
        }
        iconCompat.f1305f = i4;
        iconCompat.f1306g = (ColorStateList) aVar.f(iconCompat.f1306g, 6);
        String str = iconCompat.f1308i;
        if (aVar.e(7)) {
            str = ((b) aVar).f851e.readString();
        }
        iconCompat.f1308i = str;
        String str2 = iconCompat.f1309j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f851e.readString();
        }
        iconCompat.f1309j = str2;
        iconCompat.f1307h = PorterDuff.Mode.valueOf(iconCompat.f1308i);
        switch (iconCompat.f1300a) {
            case -1:
                Parcelable parcelable = iconCompat.f1303d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1301b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1303d;
                if (parcelable2 != null) {
                    iconCompat.f1301b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1302c;
                    iconCompat.f1301b = bArr3;
                    iconCompat.f1300a = 3;
                    iconCompat.f1304e = 0;
                    iconCompat.f1305f = bArr3.length;
                }
                return iconCompat;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f1302c, Charset.forName("UTF-16"));
                iconCompat.f1301b = str3;
                if (iconCompat.f1300a == 2 && iconCompat.f1309j == null) {
                    iconCompat.f1309j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1301b = iconCompat.f1302c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1308i = iconCompat.f1307h.name();
        switch (iconCompat.f1300a) {
            case -1:
                iconCompat.f1303d = (Parcelable) iconCompat.f1301b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1303d = (Parcelable) iconCompat.f1301b;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f1302c = ((String) iconCompat.f1301b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f1302c = (byte[]) iconCompat.f1301b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1302c = iconCompat.f1301b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1300a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f851e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1302c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f851e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1303d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f851e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1304e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f851e.writeInt(i3);
        }
        int i4 = iconCompat.f1305f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f851e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1306g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f851e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1308i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f851e.writeString(str);
        }
        String str2 = iconCompat.f1309j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f851e.writeString(str2);
        }
    }
}
