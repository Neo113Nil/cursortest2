package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import r0.AbstractC0345a;
import r0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0345a abstractC0345a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1929a;
        if (abstractC0345a.e(1)) {
            i = ((b) abstractC0345a).e.readInt();
        }
        iconCompat.f1929a = i;
        byte[] bArr = iconCompat.f1931c;
        if (abstractC0345a.e(2)) {
            Parcel parcel = ((b) abstractC0345a).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1931c = bArr;
        iconCompat.f1932d = abstractC0345a.f(iconCompat.f1932d, 3);
        int i2 = iconCompat.e;
        if (abstractC0345a.e(4)) {
            i2 = ((b) abstractC0345a).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f1933f;
        if (abstractC0345a.e(5)) {
            i3 = ((b) abstractC0345a).e.readInt();
        }
        iconCompat.f1933f = i3;
        iconCompat.f1934g = (ColorStateList) abstractC0345a.f(iconCompat.f1934g, 6);
        String str = iconCompat.i;
        if (abstractC0345a.e(7)) {
            str = ((b) abstractC0345a).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (abstractC0345a.e(8)) {
            str2 = ((b) abstractC0345a).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f1935h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1929a) {
            case -1:
                Parcelable parcelable = iconCompat.f1932d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1930b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1932d;
                if (parcelable2 != null) {
                    iconCompat.f1930b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1931c;
                    iconCompat.f1930b = bArr3;
                    iconCompat.f1929a = 3;
                    iconCompat.e = 0;
                    iconCompat.f1933f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1931c, Charset.forName("UTF-16"));
                iconCompat.f1930b = str3;
                if (iconCompat.f1929a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1930b = iconCompat.f1931c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0345a abstractC0345a) {
        abstractC0345a.getClass();
        iconCompat.i = iconCompat.f1935h.name();
        switch (iconCompat.f1929a) {
            case -1:
                iconCompat.f1932d = (Parcelable) iconCompat.f1930b;
                break;
            case 1:
            case 5:
                iconCompat.f1932d = (Parcelable) iconCompat.f1930b;
                break;
            case 2:
                iconCompat.f1931c = ((String) iconCompat.f1930b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1931c = (byte[]) iconCompat.f1930b;
                break;
            case 4:
            case 6:
                iconCompat.f1931c = iconCompat.f1930b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1929a;
        if (-1 != i) {
            abstractC0345a.h(1);
            ((b) abstractC0345a).e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1931c;
        if (bArr != null) {
            abstractC0345a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0345a).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1932d;
        if (parcelable != null) {
            abstractC0345a.h(3);
            ((b) abstractC0345a).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC0345a.h(4);
            ((b) abstractC0345a).e.writeInt(i2);
        }
        int i3 = iconCompat.f1933f;
        if (i3 != 0) {
            abstractC0345a.h(5);
            ((b) abstractC0345a).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1934g;
        if (colorStateList != null) {
            abstractC0345a.h(6);
            ((b) abstractC0345a).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0345a.h(7);
            ((b) abstractC0345a).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC0345a.h(8);
            ((b) abstractC0345a).e.writeString(str2);
        }
    }
}
