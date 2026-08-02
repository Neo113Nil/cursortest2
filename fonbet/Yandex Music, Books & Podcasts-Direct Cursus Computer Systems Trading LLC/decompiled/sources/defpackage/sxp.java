package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sxp extends zvp {
    public static final Parcelable.Creator<sxp> CREATOR = new bwp(10);
    public final rxp g;
    public final String h;

    public sxp(Parcel parcel) {
        super(parcel);
        qxp qxpVar = new qxp();
        Bundle bundle = new Bundle();
        qxpVar.a = bundle;
        rxp rxpVar = (rxp) parcel.readParcelable(rxp.class.getClassLoader());
        if (rxpVar != null) {
            Bundle bundle2 = rxpVar.a;
            bundle.putAll((Bundle) bundle2.clone());
            bundle.putString("og:type", bundle2.getString("og:type"));
        }
        this.g = new rxp(qxpVar);
        this.h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.zvp, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
    }
}
