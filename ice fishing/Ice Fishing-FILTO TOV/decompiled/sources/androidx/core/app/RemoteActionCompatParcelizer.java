package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ce1;
import defpackage.de1;
import defpackage.ee1;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ce1 ce1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ee1 ee1Var = remoteActionCompat.GWasM1elztuh;
        boolean z = true;
        if (ce1Var.OOA6hdeuvCS(1)) {
            ee1Var = ce1Var.AvO7iQsrTN();
        }
        remoteActionCompat.GWasM1elztuh = (IconCompat) ee1Var;
        CharSequence charSequence = remoteActionCompat.Yi7zF1RB1;
        if (ce1Var.OOA6hdeuvCS(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((de1) ce1Var).OOA6hdeuvCS);
        }
        remoteActionCompat.Yi7zF1RB1 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.X1lG3V04pd;
        if (ce1Var.OOA6hdeuvCS(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((de1) ce1Var).OOA6hdeuvCS);
        }
        remoteActionCompat.X1lG3V04pd = charSequence2;
        remoteActionCompat.xqGvceK5x = (PendingIntent) ce1Var.EljAMC1QTz(remoteActionCompat.xqGvceK5x, 4);
        boolean z2 = remoteActionCompat.OOA6hdeuvCS;
        if (ce1Var.OOA6hdeuvCS(5)) {
            z2 = ((de1) ce1Var).OOA6hdeuvCS.readInt() != 0;
        }
        remoteActionCompat.OOA6hdeuvCS = z2;
        boolean z3 = remoteActionCompat.EljAMC1QTz;
        if (!ce1Var.OOA6hdeuvCS(6)) {
            z = z3;
        } else if (((de1) ce1Var).OOA6hdeuvCS.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.EljAMC1QTz = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ce1 ce1Var) {
        ce1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.GWasM1elztuh;
        ce1Var.encWxUiV2(1);
        ce1Var.mOu10nynGul(iconCompat);
        CharSequence charSequence = remoteActionCompat.Yi7zF1RB1;
        ce1Var.encWxUiV2(2);
        Parcel parcel = ((de1) ce1Var).OOA6hdeuvCS;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.X1lG3V04pd;
        ce1Var.encWxUiV2(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.xqGvceK5x;
        ce1Var.encWxUiV2(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.OOA6hdeuvCS;
        ce1Var.encWxUiV2(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.EljAMC1QTz;
        ce1Var.encWxUiV2(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
