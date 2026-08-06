package androidx.core.graphics.drawable;

import U.a;
import U.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f2260a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f1807e.readInt();
        }
        iconCompat.f2260a = i2;
        byte[] bArr = iconCompat.f2262c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1807e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2262c = bArr;
        iconCompat.f2263d = aVar.f(iconCompat.f2263d, 3);
        int i3 = iconCompat.f2264e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f1807e.readInt();
        }
        iconCompat.f2264e = i3;
        int i4 = iconCompat.f2265f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f1807e.readInt();
        }
        iconCompat.f2265f = i4;
        iconCompat.f2266g = (ColorStateList) aVar.f(iconCompat.f2266g, 6);
        String str = iconCompat.f2268i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1807e.readString();
        }
        iconCompat.f2268i = str;
        String str2 = iconCompat.f2269j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1807e.readString();
        }
        iconCompat.f2269j = str2;
        iconCompat.f2267h = PorterDuff.Mode.valueOf(iconCompat.f2268i);
        switch (iconCompat.f2260a) {
            case -1:
                Parcelable parcelable = iconCompat.f2263d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2261b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2263d;
                if (parcelable2 != null) {
                    iconCompat.f2261b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f2262c;
                    iconCompat.f2261b = bArr3;
                    iconCompat.f2260a = 3;
                    iconCompat.f2264e = 0;
                    iconCompat.f2265f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2262c, Charset.forName("UTF-16"));
                iconCompat.f2261b = str3;
                if (iconCompat.f2260a == 2 && iconCompat.f2269j == null) {
                    iconCompat.f2269j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2261b = iconCompat.f2262c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2268i = iconCompat.f2267h.name();
        switch (iconCompat.f2260a) {
            case -1:
                iconCompat.f2263d = (Parcelable) iconCompat.f2261b;
                break;
            case 1:
            case 5:
                iconCompat.f2263d = (Parcelable) iconCompat.f2261b;
                break;
            case 2:
                iconCompat.f2262c = ((String) iconCompat.f2261b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2262c = (byte[]) iconCompat.f2261b;
                break;
            case 4:
            case 6:
                iconCompat.f2262c = iconCompat.f2261b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f2260a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f1807e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f2262c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1807e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2263d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1807e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f2264e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f1807e.writeInt(i3);
        }
        int i4 = iconCompat.f2265f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f1807e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f2266g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1807e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2268i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1807e.writeString(str);
        }
        String str2 = iconCompat.f2269j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1807e.writeString(str2);
        }
    }
}
