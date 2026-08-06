package androidx.core.app;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(defpackage.nt1 nt1Var) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        defpackage.pt1 pt1Var = remoteActionCompat.ZpBGe2uQfcn8;
        boolean z = true;
        if (nt1Var.WDYagTQQm9ns(1)) {
            pt1Var = nt1Var.QiMR8OkAhezm();
        }
        remoteActionCompat.ZpBGe2uQfcn8 = (androidx.core.graphics.drawable.IconCompat) pt1Var;
        java.lang.CharSequence charSequence = remoteActionCompat.giKS3J6vZuNy;
        if (nt1Var.WDYagTQQm9ns(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((defpackage.ot1) nt1Var).WDYagTQQm9ns);
        }
        remoteActionCompat.giKS3J6vZuNy = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.fWTAfUmVKrZq;
        if (nt1Var.WDYagTQQm9ns(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((defpackage.ot1) nt1Var).WDYagTQQm9ns);
        }
        remoteActionCompat.fWTAfUmVKrZq = charSequence2;
        remoteActionCompat.JhCgjQRTAOCT = (android.app.PendingIntent) nt1Var.oh71FJcDz6S2(remoteActionCompat.JhCgjQRTAOCT, 4);
        boolean z2 = remoteActionCompat.WDYagTQQm9ns;
        if (nt1Var.WDYagTQQm9ns(5)) {
            z2 = ((defpackage.ot1) nt1Var).WDYagTQQm9ns.readInt() != 0;
        }
        remoteActionCompat.WDYagTQQm9ns = z2;
        boolean z3 = remoteActionCompat.oh71FJcDz6S2;
        if (!nt1Var.WDYagTQQm9ns(6)) {
            z = z3;
        } else if (((defpackage.ot1) nt1Var).WDYagTQQm9ns.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.oh71FJcDz6S2 = z;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, defpackage.nt1 nt1Var) {
        nt1Var.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.ZpBGe2uQfcn8;
        nt1Var.P05cfTpS5W5L(1);
        nt1Var.e6mdH7fiFuta(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.giKS3J6vZuNy;
        nt1Var.P05cfTpS5W5L(2);
        android.os.Parcel parcel = ((defpackage.ot1) nt1Var).WDYagTQQm9ns;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.fWTAfUmVKrZq;
        nt1Var.P05cfTpS5W5L(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        android.app.PendingIntent pendingIntent = remoteActionCompat.JhCgjQRTAOCT;
        nt1Var.P05cfTpS5W5L(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.WDYagTQQm9ns;
        nt1Var.P05cfTpS5W5L(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.oh71FJcDz6S2;
        nt1Var.P05cfTpS5W5L(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
