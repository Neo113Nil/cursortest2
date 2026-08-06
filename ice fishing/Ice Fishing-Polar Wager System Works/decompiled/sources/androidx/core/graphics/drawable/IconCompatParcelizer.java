package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(defpackage.vl1 vl1Var) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.IHQe1A4L2xu = -1;
        iconCompat.r1MBDhnF = null;
        iconCompat.F7NU4MC0GW = null;
        iconCompat.adDC3e2L = 0;
        iconCompat.xiZrDbcSW0 = 0;
        iconCompat.AARZUJiTa = null;
        iconCompat.EXtogiMhuM = androidx.core.graphics.drawable.IconCompat.ez2rX8ReCYw;
        iconCompat.riuEU0zW4 = null;
        iconCompat.IHQe1A4L2xu = !vl1Var.adDC3e2L(1) ? -1 : ((defpackage.wl1) vl1Var).adDC3e2L.readInt();
        byte[] bArr = iconCompat.r1MBDhnF;
        if (vl1Var.adDC3e2L(2)) {
            android.os.Parcel parcel = ((defpackage.wl1) vl1Var).adDC3e2L;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.r1MBDhnF = bArr;
        iconCompat.F7NU4MC0GW = vl1Var.xiZrDbcSW0(iconCompat.F7NU4MC0GW, 3);
        int i = iconCompat.adDC3e2L;
        if (vl1Var.adDC3e2L(4)) {
            i = ((defpackage.wl1) vl1Var).adDC3e2L.readInt();
        }
        iconCompat.adDC3e2L = i;
        int i2 = iconCompat.xiZrDbcSW0;
        if (vl1Var.adDC3e2L(5)) {
            i2 = ((defpackage.wl1) vl1Var).adDC3e2L.readInt();
        }
        iconCompat.xiZrDbcSW0 = i2;
        iconCompat.AARZUJiTa = (android.content.res.ColorStateList) vl1Var.xiZrDbcSW0(iconCompat.AARZUJiTa, 6);
        java.lang.String str = iconCompat.riuEU0zW4;
        if (vl1Var.adDC3e2L(7)) {
            str = ((defpackage.wl1) vl1Var).adDC3e2L.readString();
        }
        iconCompat.riuEU0zW4 = str;
        java.lang.String str2 = iconCompat.SH1y5HwkJhh;
        if (vl1Var.adDC3e2L(8)) {
            str2 = ((defpackage.wl1) vl1Var).adDC3e2L.readString();
        }
        iconCompat.SH1y5HwkJhh = str2;
        iconCompat.EXtogiMhuM = android.graphics.PorterDuff.Mode.valueOf(iconCompat.riuEU0zW4);
        switch (iconCompat.IHQe1A4L2xu) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.F7NU4MC0GW;
                if (parcelable != null) {
                    iconCompat.oh6vYeIP = parcelable;
                    return iconCompat;
                }
                defpackage.db.fnWB2E7cs("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                android.os.Parcelable parcelable2 = iconCompat.F7NU4MC0GW;
                if (parcelable2 != null) {
                    iconCompat.oh6vYeIP = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.r1MBDhnF;
                iconCompat.oh6vYeIP = bArr3;
                iconCompat.IHQe1A4L2xu = 3;
                iconCompat.adDC3e2L = 0;
                iconCompat.xiZrDbcSW0 = bArr3.length;
                return iconCompat;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String str3 = new java.lang.String(iconCompat.r1MBDhnF, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.oh6vYeIP = str3;
                if (iconCompat.IHQe1A4L2xu == 2 && iconCompat.SH1y5HwkJhh == null) {
                    iconCompat.SH1y5HwkJhh = str3.split(":", -1)[0];
                }
                return iconCompat;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.oh6vYeIP = iconCompat.r1MBDhnF;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, defpackage.vl1 vl1Var) {
        vl1Var.getClass();
        iconCompat.riuEU0zW4 = iconCompat.EXtogiMhuM.name();
        switch (iconCompat.IHQe1A4L2xu) {
            case -1:
                iconCompat.F7NU4MC0GW = (android.os.Parcelable) iconCompat.oh6vYeIP;
                break;
            case 1:
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.F7NU4MC0GW = (android.os.Parcelable) iconCompat.oh6vYeIP;
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.r1MBDhnF = ((java.lang.String) iconCompat.oh6vYeIP).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.r1MBDhnF = (byte[]) iconCompat.oh6vYeIP;
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.r1MBDhnF = iconCompat.oh6vYeIP.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.IHQe1A4L2xu;
        if (-1 != i) {
            vl1Var.EXtogiMhuM(1);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeInt(i);
        }
        byte[] bArr = iconCompat.r1MBDhnF;
        if (bArr != null) {
            vl1Var.EXtogiMhuM(2);
            android.os.Parcel parcel = ((defpackage.wl1) vl1Var).adDC3e2L;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.F7NU4MC0GW;
        if (parcelable != null) {
            vl1Var.EXtogiMhuM(3);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.adDC3e2L;
        if (i2 != 0) {
            vl1Var.EXtogiMhuM(4);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeInt(i2);
        }
        int i3 = iconCompat.xiZrDbcSW0;
        if (i3 != 0) {
            vl1Var.EXtogiMhuM(5);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeInt(i3);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.AARZUJiTa;
        if (colorStateList != null) {
            vl1Var.EXtogiMhuM(6);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeParcelable(colorStateList, 0);
        }
        java.lang.String str = iconCompat.riuEU0zW4;
        if (str != null) {
            vl1Var.EXtogiMhuM(7);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeString(str);
        }
        java.lang.String str2 = iconCompat.SH1y5HwkJhh;
        if (str2 != null) {
            vl1Var.EXtogiMhuM(8);
            ((defpackage.wl1) vl1Var).adDC3e2L.writeString(str2);
        }
    }
}
