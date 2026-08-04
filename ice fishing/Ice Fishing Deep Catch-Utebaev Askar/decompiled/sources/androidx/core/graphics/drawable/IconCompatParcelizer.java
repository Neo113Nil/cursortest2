package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import c.b;
import c.c;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f35a = bVar.f(iconCompat.f35a, 1);
        byte[] bArr = iconCompat.f37c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f50e;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f37c = bArr;
        iconCompat.f38d = bVar.g(iconCompat.f38d, 3);
        iconCompat.f39e = bVar.f(iconCompat.f39e, 4);
        iconCompat.f40f = bVar.f(iconCompat.f40f, 5);
        iconCompat.f41g = (ColorStateList) bVar.g(iconCompat.f41g, 6);
        String string = iconCompat.f43i;
        if (bVar.e(7)) {
            string = ((c) bVar).f50e.readString();
        }
        iconCompat.f43i = string;
        String string2 = iconCompat.f44j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f50e.readString();
        }
        iconCompat.f44j = string2;
        iconCompat.f42h = PorterDuff.Mode.valueOf(iconCompat.f43i);
        switch (iconCompat.f35a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                parcelable = iconCompat.f38d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f36b = parcelable;
                return iconCompat;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f38d;
                if (parcelable != null) {
                    iconCompat.f36b = parcelable;
                } else {
                    byte[] bArr3 = iconCompat.f37c;
                    iconCompat.f36b = bArr3;
                    iconCompat.f35a = 3;
                    iconCompat.f39e = 0;
                    iconCompat.f40f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
            case 6:
                String str = new String(iconCompat.f37c, Charset.forName("UTF-16"));
                iconCompat.f36b = str;
                if (iconCompat.f35a == 2 && iconCompat.f44j == null) {
                    iconCompat.f44j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f36b = iconCompat.f37c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f43i = iconCompat.f42h.name();
        switch (iconCompat.f35a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
            case 1:
            case 5:
                iconCompat.f38d = (Parcelable) iconCompat.f36b;
                break;
            case 2:
                iconCompat.f37c = ((String) iconCompat.f36b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f37c = (byte[]) iconCompat.f36b;
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
            case 6:
                iconCompat.f37c = iconCompat.f36b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f35a;
        if (-1 != i2) {
            bVar.i(1);
            ((c) bVar).f50e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f37c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f50e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f38d;
        if (parcelable != null) {
            bVar.i(3);
            ((c) bVar).f50e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f39e;
        if (i3 != 0) {
            bVar.i(4);
            ((c) bVar).f50e.writeInt(i3);
        }
        int i4 = iconCompat.f40f;
        if (i4 != 0) {
            bVar.i(5);
            ((c) bVar).f50e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f41g;
        if (colorStateList != null) {
            bVar.i(6);
            ((c) bVar).f50e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f43i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f50e.writeString(str);
        }
        String str2 = iconCompat.f44j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f50e.writeString(str2);
        }
    }
}
