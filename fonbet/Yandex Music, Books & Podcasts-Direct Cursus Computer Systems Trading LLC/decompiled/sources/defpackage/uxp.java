package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class uxp implements Parcelable {
    public final Bundle a;

    public uxp(qxp qxpVar) {
        this.a = (Bundle) ((Bundle) qxpVar.a).clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public uxp(Parcel parcel) {
        this.a = parcel.readBundle(qxp.class.getClassLoader());
    }
}
