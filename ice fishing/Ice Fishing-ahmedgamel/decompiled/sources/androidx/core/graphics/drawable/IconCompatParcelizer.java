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
        int i = iconCompat.f4657a;
        if (aVar.e(1)) {
            i = ((b) aVar).f959e.readInt();
        }
        iconCompat.f4657a = i;
        byte[] bArr = iconCompat.f4659c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f959e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4659c = bArr;
        iconCompat.f4660d = aVar.f(iconCompat.f4660d, 3);
        int i4 = iconCompat.f4661e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f959e.readInt();
        }
        iconCompat.f4661e = i4;
        int i6 = iconCompat.f4662f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).f959e.readInt();
        }
        iconCompat.f4662f = i6;
        iconCompat.f4663g = (ColorStateList) aVar.f(iconCompat.f4663g, 6);
        String str = iconCompat.i;
        if (aVar.e(7)) {
            str = ((b) aVar).f959e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f4665j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f959e.readString();
        }
        iconCompat.f4665j = str2;
        iconCompat.f4664h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f4657a) {
            case -1:
                Parcelable parcelable = iconCompat.f4660d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4658b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4660d;
                if (parcelable2 != null) {
                    iconCompat.f4658b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f4659c;
                iconCompat.f4658b = bArr3;
                iconCompat.f4657a = 3;
                iconCompat.f4661e = 0;
                iconCompat.f4662f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f4659c, Charset.forName(com.anythink.basead.exoplayer.b.f7176k));
                iconCompat.f4658b = str3;
                if (iconCompat.f4657a == 2 && iconCompat.f4665j == null) {
                    iconCompat.f4665j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4658b = iconCompat.f4659c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f4664h.name();
        switch (iconCompat.f4657a) {
            case -1:
                iconCompat.f4660d = (Parcelable) iconCompat.f4658b;
                break;
            case 1:
            case 5:
                iconCompat.f4660d = (Parcelable) iconCompat.f4658b;
                break;
            case 2:
                iconCompat.f4659c = ((String) iconCompat.f4658b).getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f7176k));
                break;
            case 3:
                iconCompat.f4659c = (byte[]) iconCompat.f4658b;
                break;
            case 4:
            case 6:
                iconCompat.f4659c = iconCompat.f4658b.toString().getBytes(Charset.forName(com.anythink.basead.exoplayer.b.f7176k));
                break;
        }
        int i = iconCompat.f4657a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f959e.writeInt(i);
        }
        byte[] bArr = iconCompat.f4659c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f959e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4660d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f959e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f4661e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f959e.writeInt(i4);
        }
        int i6 = iconCompat.f4662f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f959e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f4663g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f959e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f959e.writeString(str);
        }
        String str2 = iconCompat.f4665j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f959e.writeString(str2);
        }
    }
}
