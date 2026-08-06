package androidx.core.app;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(defpackage.vl1 vl1Var) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        defpackage.xl1 xl1Var = remoteActionCompat.IHQe1A4L2xu;
        boolean z = true;
        if (vl1Var.adDC3e2L(1)) {
            xl1Var = vl1Var.AARZUJiTa();
        }
        remoteActionCompat.IHQe1A4L2xu = (androidx.core.graphics.drawable.IconCompat) xl1Var;
        java.lang.CharSequence charSequence = remoteActionCompat.oh6vYeIP;
        if (vl1Var.adDC3e2L(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((defpackage.wl1) vl1Var).adDC3e2L);
        }
        remoteActionCompat.oh6vYeIP = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.r1MBDhnF;
        if (vl1Var.adDC3e2L(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((defpackage.wl1) vl1Var).adDC3e2L);
        }
        remoteActionCompat.r1MBDhnF = charSequence2;
        remoteActionCompat.F7NU4MC0GW = (android.app.PendingIntent) vl1Var.xiZrDbcSW0(remoteActionCompat.F7NU4MC0GW, 4);
        boolean z2 = remoteActionCompat.adDC3e2L;
        if (vl1Var.adDC3e2L(5)) {
            z2 = ((defpackage.wl1) vl1Var).adDC3e2L.readInt() != 0;
        }
        remoteActionCompat.adDC3e2L = z2;
        boolean z3 = remoteActionCompat.xiZrDbcSW0;
        if (!vl1Var.adDC3e2L(6)) {
            z = z3;
        } else if (((defpackage.wl1) vl1Var).adDC3e2L.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.xiZrDbcSW0 = z;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, defpackage.vl1 vl1Var) {
        vl1Var.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.IHQe1A4L2xu;
        vl1Var.EXtogiMhuM(1);
        vl1Var.riuEU0zW4(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.oh6vYeIP;
        vl1Var.EXtogiMhuM(2);
        android.os.Parcel parcel = ((defpackage.wl1) vl1Var).adDC3e2L;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.r1MBDhnF;
        vl1Var.EXtogiMhuM(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        android.app.PendingIntent pendingIntent = remoteActionCompat.F7NU4MC0GW;
        vl1Var.EXtogiMhuM(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.adDC3e2L;
        vl1Var.EXtogiMhuM(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.xiZrDbcSW0;
        vl1Var.EXtogiMhuM(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
