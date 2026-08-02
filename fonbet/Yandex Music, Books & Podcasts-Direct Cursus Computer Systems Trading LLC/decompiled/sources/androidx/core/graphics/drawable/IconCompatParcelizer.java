package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.x0u;
import defpackage.xq0;
import defpackage.y0u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(x0u x0uVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        byte[] bArr = null;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = x0uVar.f(-1, 1);
        byte[] bArr2 = iconCompat.c;
        if (x0uVar.e(2)) {
            Parcel parcel = ((y0u) x0uVar).e;
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.c = bArr;
        iconCompat.d = x0uVar.g(3, iconCompat.d);
        iconCompat.e = x0uVar.f(iconCompat.e, 4);
        iconCompat.f = x0uVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) x0uVar.g(6, iconCompat.g);
        String str = iconCompat.i;
        if (x0uVar.e(7)) {
            str = ((y0u) x0uVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (x0uVar.e(8)) {
            str2 = ((y0u) x0uVar).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                xq0.x("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, x0u x0uVar) {
        x0uVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            x0uVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            x0uVar.i(2);
            Parcel parcel = ((y0u) x0uVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            x0uVar.k(3, parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            x0uVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            x0uVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            x0uVar.k(6, colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            x0uVar.i(7);
            ((y0u) x0uVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            x0uVar.i(8);
            ((y0u) x0uVar).e.writeString(str2);
        }
    }
}
