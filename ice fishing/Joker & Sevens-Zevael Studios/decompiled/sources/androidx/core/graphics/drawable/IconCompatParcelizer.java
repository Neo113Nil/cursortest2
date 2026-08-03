package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.nio.charset.Charset;
import n4.a;
import n4.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f618a;
        if (aVar.e(1)) {
            i10 = ((b) aVar).f5050e.readInt();
        }
        iconCompat.f618a = i10;
        byte[] bArr = iconCompat.f620c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f5050e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f620c = bArr;
        iconCompat.f621d = aVar.f(iconCompat.f621d, 3);
        int i11 = iconCompat.f622e;
        if (aVar.e(4)) {
            i11 = ((b) aVar).f5050e.readInt();
        }
        iconCompat.f622e = i11;
        int i12 = iconCompat.f623f;
        if (aVar.e(5)) {
            i12 = ((b) aVar).f5050e.readInt();
        }
        iconCompat.f623f = i12;
        iconCompat.f624g = (ColorStateList) aVar.f(iconCompat.f624g, 6);
        String str = iconCompat.f626i;
        if (aVar.e(7)) {
            str = ((b) aVar).f5050e.readString();
        }
        iconCompat.f626i = str;
        String str2 = iconCompat.f627j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f5050e.readString();
        }
        iconCompat.f627j = str2;
        iconCompat.f625h = PorterDuff.Mode.valueOf(iconCompat.f626i);
        switch (iconCompat.f618a) {
            case -1:
                Parcelable parcelable = iconCompat.f621d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f619b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                Parcelable parcelable2 = iconCompat.f621d;
                if (parcelable2 != null) {
                    iconCompat.f619b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f620c;
                iconCompat.f619b = bArr3;
                iconCompat.f618a = 3;
                iconCompat.f622e = 0;
                iconCompat.f623f = bArr3.length;
                return iconCompat;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f620c, Charset.forName("UTF-16"));
                iconCompat.f619b = str3;
                if (iconCompat.f618a == 2 && iconCompat.f627j == null) {
                    iconCompat.f627j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f619b = iconCompat.f620c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, n4.a aVar) {
        aVar.getClass();
        iconCompat.f626i = iconCompat.f625h.name();
        switch (iconCompat.f618a) {
            case -1:
                iconCompat.f621d = (Parcelable) iconCompat.f619b;
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                iconCompat.f621d = (Parcelable) iconCompat.f619b;
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                iconCompat.f620c = ((String) iconCompat.f619b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f620c = (byte[]) iconCompat.f619b;
                break;
            case 4:
            case 6:
                iconCompat.f620c = iconCompat.f619b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f618a;
        if (-1 != i10) {
            aVar.h(1);
            ((b) aVar).f5050e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f620c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f5050e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f621d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f5050e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f622e;
        if (i11 != 0) {
            aVar.h(4);
            ((b) aVar).f5050e.writeInt(i11);
        }
        int i12 = iconCompat.f623f;
        if (i12 != 0) {
            aVar.h(5);
            ((b) aVar).f5050e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f624g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f5050e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f626i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f5050e.writeString(str);
        }
        String str2 = iconCompat.f627j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f5050e.writeString(str2);
        }
    }
}
