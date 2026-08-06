package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ce1;
import defpackage.de1;
import defpackage.nr0;
import defpackage.o4;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ce1 ce1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.GWasM1elztuh = -1;
        iconCompat.X1lG3V04pd = null;
        iconCompat.xqGvceK5x = null;
        iconCompat.OOA6hdeuvCS = 0;
        iconCompat.EljAMC1QTz = 0;
        iconCompat.AvO7iQsrTN = null;
        iconCompat.encWxUiV2 = IconCompat.rQPn8YBR;
        iconCompat.mOu10nynGul = null;
        iconCompat.GWasM1elztuh = !ce1Var.OOA6hdeuvCS(1) ? -1 : ((de1) ce1Var).OOA6hdeuvCS.readInt();
        byte[] bArr = iconCompat.X1lG3V04pd;
        if (ce1Var.OOA6hdeuvCS(2)) {
            Parcel parcel = ((de1) ce1Var).OOA6hdeuvCS;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.X1lG3V04pd = bArr;
        iconCompat.xqGvceK5x = ce1Var.EljAMC1QTz(iconCompat.xqGvceK5x, 3);
        int i = iconCompat.OOA6hdeuvCS;
        if (ce1Var.OOA6hdeuvCS(4)) {
            i = ((de1) ce1Var).OOA6hdeuvCS.readInt();
        }
        iconCompat.OOA6hdeuvCS = i;
        int i2 = iconCompat.EljAMC1QTz;
        if (ce1Var.OOA6hdeuvCS(5)) {
            i2 = ((de1) ce1Var).OOA6hdeuvCS.readInt();
        }
        iconCompat.EljAMC1QTz = i2;
        iconCompat.AvO7iQsrTN = (ColorStateList) ce1Var.EljAMC1QTz(iconCompat.AvO7iQsrTN, 6);
        String str = iconCompat.mOu10nynGul;
        if (ce1Var.OOA6hdeuvCS(7)) {
            str = ((de1) ce1Var).OOA6hdeuvCS.readString();
        }
        iconCompat.mOu10nynGul = str;
        String str2 = iconCompat.JFJ3QoxA;
        if (ce1Var.OOA6hdeuvCS(8)) {
            str2 = ((de1) ce1Var).OOA6hdeuvCS.readString();
        }
        iconCompat.JFJ3QoxA = str2;
        iconCompat.encWxUiV2 = PorterDuff.Mode.valueOf(iconCompat.mOu10nynGul);
        switch (iconCompat.GWasM1elztuh) {
            case -1:
                Parcelable parcelable = iconCompat.xqGvceK5x;
                if (parcelable != null) {
                    iconCompat.Yi7zF1RB1 = parcelable;
                    return iconCompat;
                }
                o4.mE4lRynR("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.xqGvceK5x;
                if (parcelable2 != null) {
                    iconCompat.Yi7zF1RB1 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.X1lG3V04pd;
                iconCompat.Yi7zF1RB1 = bArr3;
                iconCompat.GWasM1elztuh = 3;
                iconCompat.OOA6hdeuvCS = 0;
                iconCompat.EljAMC1QTz = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.X1lG3V04pd, Charset.forName("UTF-16"));
                iconCompat.Yi7zF1RB1 = str3;
                if (iconCompat.GWasM1elztuh == 2 && iconCompat.JFJ3QoxA == null) {
                    iconCompat.JFJ3QoxA = str3.split(":", -1)[0];
                }
                return iconCompat;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.Yi7zF1RB1 = iconCompat.X1lG3V04pd;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ce1 ce1Var) {
        ce1Var.getClass();
        iconCompat.mOu10nynGul = iconCompat.encWxUiV2.name();
        switch (iconCompat.GWasM1elztuh) {
            case -1:
                iconCompat.xqGvceK5x = (Parcelable) iconCompat.Yi7zF1RB1;
                break;
            case 1:
            case 5:
                iconCompat.xqGvceK5x = (Parcelable) iconCompat.Yi7zF1RB1;
                break;
            case 2:
                iconCompat.X1lG3V04pd = ((String) iconCompat.Yi7zF1RB1).getBytes(Charset.forName("UTF-16"));
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.X1lG3V04pd = (byte[]) iconCompat.Yi7zF1RB1;
                break;
            case 4:
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.X1lG3V04pd = iconCompat.Yi7zF1RB1.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.GWasM1elztuh;
        if (-1 != i) {
            ce1Var.encWxUiV2(1);
            ((de1) ce1Var).OOA6hdeuvCS.writeInt(i);
        }
        byte[] bArr = iconCompat.X1lG3V04pd;
        if (bArr != null) {
            ce1Var.encWxUiV2(2);
            Parcel parcel = ((de1) ce1Var).OOA6hdeuvCS;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.xqGvceK5x;
        if (parcelable != null) {
            ce1Var.encWxUiV2(3);
            ((de1) ce1Var).OOA6hdeuvCS.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.OOA6hdeuvCS;
        if (i2 != 0) {
            ce1Var.encWxUiV2(4);
            ((de1) ce1Var).OOA6hdeuvCS.writeInt(i2);
        }
        int i3 = iconCompat.EljAMC1QTz;
        if (i3 != 0) {
            ce1Var.encWxUiV2(5);
            ((de1) ce1Var).OOA6hdeuvCS.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.AvO7iQsrTN;
        if (colorStateList != null) {
            ce1Var.encWxUiV2(6);
            ((de1) ce1Var).OOA6hdeuvCS.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.mOu10nynGul;
        if (str != null) {
            ce1Var.encWxUiV2(7);
            ((de1) ce1Var).OOA6hdeuvCS.writeString(str);
        }
        String str2 = iconCompat.JFJ3QoxA;
        if (str2 != null) {
            ce1Var.encWxUiV2(8);
            ((de1) ce1Var).OOA6hdeuvCS.writeString(str2);
        }
    }
}
