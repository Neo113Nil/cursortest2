package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.pf0;
import defpackage.qf0;
import defpackage.rf0;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(pf0 pf0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        rf0 rf0Var = remoteActionCompat.qoPGr6Ce;
        boolean z = true;
        if (pf0Var.VgvYg0wo(1)) {
            rf0Var = pf0Var.b2ZJblxo();
        }
        remoteActionCompat.qoPGr6Ce = (IconCompat) rf0Var;
        CharSequence charSequence = remoteActionCompat.NCTxEWno;
        if (pf0Var.VgvYg0wo(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((qf0) pf0Var).VgvYg0wo);
        }
        remoteActionCompat.NCTxEWno = charSequence;
        CharSequence charSequence2 = remoteActionCompat.MdtA4re8;
        if (pf0Var.VgvYg0wo(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((qf0) pf0Var).VgvYg0wo);
        }
        remoteActionCompat.MdtA4re8 = charSequence2;
        remoteActionCompat.wxUZMvaN = (PendingIntent) pf0Var.P7K7Inc8(remoteActionCompat.wxUZMvaN, 4);
        boolean z2 = remoteActionCompat.VgvYg0wo;
        if (pf0Var.VgvYg0wo(5)) {
            z2 = ((qf0) pf0Var).VgvYg0wo.readInt() != 0;
        }
        remoteActionCompat.VgvYg0wo = z2;
        boolean z3 = remoteActionCompat.P7K7Inc8;
        if (!pf0Var.VgvYg0wo(6)) {
            z = z3;
        } else if (((qf0) pf0Var).VgvYg0wo.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.P7K7Inc8 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, pf0 pf0Var) {
        pf0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.qoPGr6Ce;
        pf0Var.Qr9iLBAD(1);
        pf0Var.jb9XjC4I(iconCompat);
        CharSequence charSequence = remoteActionCompat.NCTxEWno;
        pf0Var.Qr9iLBAD(2);
        Parcel parcel = ((qf0) pf0Var).VgvYg0wo;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.MdtA4re8;
        pf0Var.Qr9iLBAD(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.wxUZMvaN;
        pf0Var.Qr9iLBAD(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.VgvYg0wo;
        pf0Var.Qr9iLBAD(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.P7K7Inc8;
        pf0Var.Qr9iLBAD(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
