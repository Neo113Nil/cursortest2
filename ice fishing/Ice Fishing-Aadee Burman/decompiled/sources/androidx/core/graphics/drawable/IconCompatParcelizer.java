package androidx.core.graphics.drawable;

import F0.a;
import F0.b;
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
        int i = iconCompat.f4689a;
        if (aVar.e(1)) {
            i = ((b) aVar).f896e.readInt();
        }
        iconCompat.f4689a = i;
        byte[] bArr = iconCompat.f4691c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f896e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4691c = bArr;
        iconCompat.f4692d = aVar.f(iconCompat.f4692d, 3);
        int i6 = iconCompat.f4693e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f896e.readInt();
        }
        iconCompat.f4693e = i6;
        int i9 = iconCompat.f4694f;
        if (aVar.e(5)) {
            i9 = ((b) aVar).f896e.readInt();
        }
        iconCompat.f4694f = i9;
        iconCompat.f4695g = (ColorStateList) aVar.f(iconCompat.f4695g, 6);
        String str = iconCompat.i;
        if (aVar.e(7)) {
            str = ((b) aVar).f896e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f4697j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f896e.readString();
        }
        iconCompat.f4697j = str2;
        iconCompat.f4696h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f4689a) {
            case -1:
                Parcelable parcelable = iconCompat.f4692d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4690b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4692d;
                if (parcelable2 != null) {
                    iconCompat.f4690b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f4691c;
                iconCompat.f4690b = bArr3;
                iconCompat.f4689a = 3;
                iconCompat.f4693e = 0;
                iconCompat.f4694f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4691c, Charset.forName(com.anythink.basead.exoplayer.b.f6390k));
                iconCompat.f4690b = str3;
                if (iconCompat.f4689a == 2 && iconCompat.f4697j == null) {
                    iconCompat.f4697j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4690b = iconCompat.f4691c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f4696h.name();
        switch (iconCompat.f4689a) {
            case -1:
                iconCompat.f4692d = (Parcelable) iconCompat.f4690b;
                break;
            case 1:
            case 5:
                iconCompat.f4692d = (Parcelable) iconCompat.f4690b;
                break;
            case 2:
                iconCompat.f4691c = ((String) iconCompat.f4690b).getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f6390k));
                break;
            case 3:
                iconCompat.f4691c = (byte[]) iconCompat.f4690b;
                break;
            case 4:
            case 6:
                iconCompat.f4691c = iconCompat.f4690b.toString().getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f6390k));
                break;
        }
        int i = iconCompat.f4689a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f896e.writeInt(i);
        }
        byte[] bArr = iconCompat.f4691c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f896e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4692d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f896e.writeParcelable(parcelable, 0);
        }
        int i6 = iconCompat.f4693e;
        if (i6 != 0) {
            aVar.h(4);
            ((b) aVar).f896e.writeInt(i6);
        }
        int i9 = iconCompat.f4694f;
        if (i9 != 0) {
            aVar.h(5);
            ((b) aVar).f896e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f4695g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f896e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f896e.writeString(str);
        }
        String str2 = iconCompat.f4697j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f896e.writeString(str2);
        }
    }
}
