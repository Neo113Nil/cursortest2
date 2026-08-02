package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l1x extends aww implements q1x {
    public final int S0(int i, String str, String str2, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(i);
        Q0.writeString(str);
        Q0.writeString(str2);
        int i2 = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 10);
        int readInt = R0.readInt();
        R0.recycle();
        return readInt;
    }

    public final Bundle T0(String str, String str2, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(9);
        Q0.writeString(str);
        Q0.writeString(str2);
        int i = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle2;
    }

    public final Bundle U0(String str, String str2, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(9);
        Q0.writeString(str);
        Q0.writeString(str2);
        int i = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle2;
    }

    public final Bundle V0(String str, String str2, String str3) {
        Parcel Q0 = Q0();
        Q0.writeInt(3);
        Q0.writeString(str);
        Q0.writeString(str2);
        Q0.writeString(str3);
        Q0.writeString(null);
        Parcel R0 = R0(Q0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle;
    }

    public final Bundle W0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(i);
        Q0.writeString(str);
        Q0.writeString(str2);
        Q0.writeString(str3);
        Q0.writeString(null);
        int i2 = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle2;
    }

    public final Bundle X0(String str, String str2, String str3, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(6);
        Q0.writeString(str);
        Q0.writeString(str2);
        Q0.writeString(str3);
        int i = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 9);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle2;
    }

    public final Bundle Y0(String str, String str2, String str3) {
        Parcel Q0 = Q0();
        Q0.writeInt(3);
        Q0.writeString(str);
        Q0.writeString(str2);
        Q0.writeString(str3);
        Parcel R0 = R0(Q0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle;
    }

    public final Bundle Z0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel Q0 = Q0();
        Q0.writeInt(i);
        Q0.writeString(str);
        Q0.writeString(str2);
        Q0.writeString(str3);
        int i2 = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle2;
    }

    public final Bundle a1(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel Q0 = Q0();
        Q0.writeInt(i);
        Q0.writeString(str);
        Q0.writeString(str2);
        int i2 = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Q0.writeInt(1);
        bundle2.writeToParcel(Q0, 0);
        Parcel R0 = R0(Q0, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) z1x.a(R0);
        R0.recycle();
        return bundle3;
    }

    public final void b1(String str, Bundle bundle, k3x k3xVar) {
        Parcel Q0 = Q0();
        Q0.writeInt(18);
        Q0.writeString(str);
        int i = z1x.a;
        Q0.writeInt(1);
        bundle.writeToParcel(Q0, 0);
        Q0.writeStrongBinder(k3xVar);
        Parcel obtain = Parcel.obtain();
        try {
            this.h.transact(1301, Q0, obtain, 0);
            obtain.readException();
        } finally {
            Q0.recycle();
            obtain.recycle();
        }
    }
}
