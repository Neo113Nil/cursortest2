package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.m1;
import defpackage.pf0;
import defpackage.qf0;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(pf0 pf0Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.qoPGr6Ce = -1;
        iconCompat.MdtA4re8 = null;
        iconCompat.wxUZMvaN = null;
        iconCompat.VgvYg0wo = 0;
        iconCompat.P7K7Inc8 = 0;
        iconCompat.b2ZJblxo = null;
        iconCompat.Qr9iLBAD = IconCompat.k3x7lurq;
        iconCompat.jb9XjC4I = null;
        iconCompat.qoPGr6Ce = !pf0Var.VgvYg0wo(1) ? -1 : ((qf0) pf0Var).VgvYg0wo.readInt();
        byte[] bArr = iconCompat.MdtA4re8;
        if (pf0Var.VgvYg0wo(2)) {
            Parcel parcel = ((qf0) pf0Var).VgvYg0wo;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.MdtA4re8 = bArr;
        iconCompat.wxUZMvaN = pf0Var.P7K7Inc8(iconCompat.wxUZMvaN, 3);
        int i = iconCompat.VgvYg0wo;
        if (pf0Var.VgvYg0wo(4)) {
            i = ((qf0) pf0Var).VgvYg0wo.readInt();
        }
        iconCompat.VgvYg0wo = i;
        int i2 = iconCompat.P7K7Inc8;
        if (pf0Var.VgvYg0wo(5)) {
            i2 = ((qf0) pf0Var).VgvYg0wo.readInt();
        }
        iconCompat.P7K7Inc8 = i2;
        iconCompat.b2ZJblxo = (ColorStateList) pf0Var.P7K7Inc8(iconCompat.b2ZJblxo, 6);
        String str = iconCompat.jb9XjC4I;
        if (pf0Var.VgvYg0wo(7)) {
            str = ((qf0) pf0Var).VgvYg0wo.readString();
        }
        iconCompat.jb9XjC4I = str;
        String str2 = iconCompat.eVhOlqcC;
        if (pf0Var.VgvYg0wo(8)) {
            str2 = ((qf0) pf0Var).VgvYg0wo.readString();
        }
        iconCompat.eVhOlqcC = str2;
        iconCompat.Qr9iLBAD = PorterDuff.Mode.valueOf(iconCompat.jb9XjC4I);
        switch (iconCompat.qoPGr6Ce) {
            case -1:
                Parcelable parcelable = iconCompat.wxUZMvaN;
                if (parcelable != null) {
                    iconCompat.NCTxEWno = parcelable;
                    return iconCompat;
                }
                m1.sjUBp5pO("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.wxUZMvaN;
                if (parcelable2 != null) {
                    iconCompat.NCTxEWno = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.MdtA4re8;
                iconCompat.NCTxEWno = bArr3;
                iconCompat.qoPGr6Ce = 3;
                iconCompat.VgvYg0wo = 0;
                iconCompat.P7K7Inc8 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.MdtA4re8, Charset.forName("UTF-16"));
                iconCompat.NCTxEWno = str3;
                if (iconCompat.qoPGr6Ce == 2 && iconCompat.eVhOlqcC == null) {
                    iconCompat.eVhOlqcC = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.NCTxEWno = iconCompat.MdtA4re8;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, pf0 pf0Var) {
        pf0Var.getClass();
        iconCompat.jb9XjC4I = iconCompat.Qr9iLBAD.name();
        switch (iconCompat.qoPGr6Ce) {
            case -1:
                iconCompat.wxUZMvaN = (Parcelable) iconCompat.NCTxEWno;
                break;
            case 1:
            case 5:
                iconCompat.wxUZMvaN = (Parcelable) iconCompat.NCTxEWno;
                break;
            case 2:
                iconCompat.MdtA4re8 = ((String) iconCompat.NCTxEWno).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.MdtA4re8 = (byte[]) iconCompat.NCTxEWno;
                break;
            case 4:
            case 6:
                iconCompat.MdtA4re8 = iconCompat.NCTxEWno.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.qoPGr6Ce;
        if (-1 != i) {
            pf0Var.Qr9iLBAD(1);
            ((qf0) pf0Var).VgvYg0wo.writeInt(i);
        }
        byte[] bArr = iconCompat.MdtA4re8;
        if (bArr != null) {
            pf0Var.Qr9iLBAD(2);
            Parcel parcel = ((qf0) pf0Var).VgvYg0wo;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.wxUZMvaN;
        if (parcelable != null) {
            pf0Var.Qr9iLBAD(3);
            ((qf0) pf0Var).VgvYg0wo.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.VgvYg0wo;
        if (i2 != 0) {
            pf0Var.Qr9iLBAD(4);
            ((qf0) pf0Var).VgvYg0wo.writeInt(i2);
        }
        int i3 = iconCompat.P7K7Inc8;
        if (i3 != 0) {
            pf0Var.Qr9iLBAD(5);
            ((qf0) pf0Var).VgvYg0wo.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.b2ZJblxo;
        if (colorStateList != null) {
            pf0Var.Qr9iLBAD(6);
            ((qf0) pf0Var).VgvYg0wo.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.jb9XjC4I;
        if (str != null) {
            pf0Var.Qr9iLBAD(7);
            ((qf0) pf0Var).VgvYg0wo.writeString(str);
        }
        String str2 = iconCompat.eVhOlqcC;
        if (str2 != null) {
            pf0Var.Qr9iLBAD(8);
            ((qf0) pf0Var).VgvYg0wo.writeString(str2);
        }
    }
}
