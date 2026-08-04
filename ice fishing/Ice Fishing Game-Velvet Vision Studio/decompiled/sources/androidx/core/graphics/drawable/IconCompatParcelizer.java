package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.k6.a;
import com.gamericefishpro.space.k6.b;
import com.gamericefishpro.space.o4.i;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (aVar.e(1)) {
            i = ((b) aVar).e.readInt();
        }
        iconCompat.a = i;
        byte[] bArr = iconCompat.c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).e;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = aVar.f(iconCompat.d, 3);
        int i3 = iconCompat.e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).e.readInt();
        }
        iconCompat.e = i3;
        int i4 = iconCompat.f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).e.readInt();
        }
        iconCompat.f = i4;
        iconCompat.g = (ColorStateList) aVar.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case i.STRING_FIELD_NUMBER /* 5 */:
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
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case i.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            aVar.h(4);
            ((b) aVar).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            aVar.h(5);
            ((b) aVar).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).e.writeString(str2);
        }
    }
}
