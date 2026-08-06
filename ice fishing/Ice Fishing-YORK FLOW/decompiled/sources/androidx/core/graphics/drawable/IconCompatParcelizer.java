package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(defpackage.nt1 nt1Var) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.ZpBGe2uQfcn8 = -1;
        iconCompat.fWTAfUmVKrZq = null;
        iconCompat.JhCgjQRTAOCT = null;
        iconCompat.WDYagTQQm9ns = 0;
        iconCompat.oh71FJcDz6S2 = 0;
        iconCompat.QiMR8OkAhezm = null;
        iconCompat.P05cfTpS5W5L = androidx.core.graphics.drawable.IconCompat.Ns0WNyEWdPsk;
        iconCompat.e6mdH7fiFuta = null;
        iconCompat.ZpBGe2uQfcn8 = !nt1Var.WDYagTQQm9ns(1) ? -1 : ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readInt();
        byte[] bArr = iconCompat.fWTAfUmVKrZq;
        if (nt1Var.WDYagTQQm9ns(2)) {
            android.os.Parcel parcel = ((defpackage.ot1) nt1Var).WDYagTQQm9ns;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.fWTAfUmVKrZq = bArr;
        iconCompat.JhCgjQRTAOCT = nt1Var.oh71FJcDz6S2(iconCompat.JhCgjQRTAOCT, 3);
        int i = iconCompat.WDYagTQQm9ns;
        if (nt1Var.WDYagTQQm9ns(4)) {
            i = ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readInt();
        }
        iconCompat.WDYagTQQm9ns = i;
        int i2 = iconCompat.oh71FJcDz6S2;
        if (nt1Var.WDYagTQQm9ns(5)) {
            i2 = ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readInt();
        }
        iconCompat.oh71FJcDz6S2 = i2;
        iconCompat.QiMR8OkAhezm = (android.content.res.ColorStateList) nt1Var.oh71FJcDz6S2(iconCompat.QiMR8OkAhezm, 6);
        java.lang.String str = iconCompat.e6mdH7fiFuta;
        if (nt1Var.WDYagTQQm9ns(7)) {
            str = ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readString();
        }
        iconCompat.e6mdH7fiFuta = str;
        java.lang.String str2 = iconCompat.GE9mJIPrb8gP;
        if (nt1Var.WDYagTQQm9ns(8)) {
            str2 = ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readString();
        }
        iconCompat.GE9mJIPrb8gP = str2;
        iconCompat.P05cfTpS5W5L = android.graphics.PorterDuff.Mode.valueOf(iconCompat.e6mdH7fiFuta);
        switch (iconCompat.ZpBGe2uQfcn8) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.JhCgjQRTAOCT;
                if (parcelable != null) {
                    iconCompat.giKS3J6vZuNy = parcelable;
                    return iconCompat;
                }
                defpackage.h7.w7APNrr0aGRc("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.JhCgjQRTAOCT;
                if (parcelable2 != null) {
                    iconCompat.giKS3J6vZuNy = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.fWTAfUmVKrZq;
                iconCompat.giKS3J6vZuNy = bArr3;
                iconCompat.ZpBGe2uQfcn8 = 3;
                iconCompat.WDYagTQQm9ns = 0;
                iconCompat.oh71FJcDz6S2 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                java.lang.String str3 = new java.lang.String(iconCompat.fWTAfUmVKrZq, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.giKS3J6vZuNy = str3;
                if (iconCompat.ZpBGe2uQfcn8 == 2 && iconCompat.GE9mJIPrb8gP == null) {
                    iconCompat.GE9mJIPrb8gP = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.giKS3J6vZuNy = iconCompat.fWTAfUmVKrZq;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, defpackage.nt1 nt1Var) {
        nt1Var.getClass();
        iconCompat.e6mdH7fiFuta = iconCompat.P05cfTpS5W5L.name();
        switch (iconCompat.ZpBGe2uQfcn8) {
            case -1:
                iconCompat.JhCgjQRTAOCT = (android.os.Parcelable) iconCompat.giKS3J6vZuNy;
                break;
            case 1:
            case 5:
                iconCompat.JhCgjQRTAOCT = (android.os.Parcelable) iconCompat.giKS3J6vZuNy;
                break;
            case 2:
                iconCompat.fWTAfUmVKrZq = ((java.lang.String) iconCompat.giKS3J6vZuNy).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.fWTAfUmVKrZq = (byte[]) iconCompat.giKS3J6vZuNy;
                break;
            case 4:
            case 6:
                iconCompat.fWTAfUmVKrZq = iconCompat.giKS3J6vZuNy.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.ZpBGe2uQfcn8;
        if (-1 != i) {
            nt1Var.P05cfTpS5W5L(1);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeInt(i);
        }
        byte[] bArr = iconCompat.fWTAfUmVKrZq;
        if (bArr != null) {
            nt1Var.P05cfTpS5W5L(2);
            android.os.Parcel parcel = ((defpackage.ot1) nt1Var).WDYagTQQm9ns;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.JhCgjQRTAOCT;
        if (parcelable != null) {
            nt1Var.P05cfTpS5W5L(3);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.WDYagTQQm9ns;
        if (i2 != 0) {
            nt1Var.P05cfTpS5W5L(4);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeInt(i2);
        }
        int i3 = iconCompat.oh71FJcDz6S2;
        if (i3 != 0) {
            nt1Var.P05cfTpS5W5L(5);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeInt(i3);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.QiMR8OkAhezm;
        if (colorStateList != null) {
            nt1Var.P05cfTpS5W5L(6);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeParcelable(colorStateList, 0);
        }
        java.lang.String str = iconCompat.e6mdH7fiFuta;
        if (str != null) {
            nt1Var.P05cfTpS5W5L(7);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeString(str);
        }
        java.lang.String str2 = iconCompat.GE9mJIPrb8gP;
        if (str2 != null) {
            nt1Var.P05cfTpS5W5L(8);
            ((defpackage.ot1) nt1Var).WDYagTQQm9ns.writeString(str2);
        }
    }
}
