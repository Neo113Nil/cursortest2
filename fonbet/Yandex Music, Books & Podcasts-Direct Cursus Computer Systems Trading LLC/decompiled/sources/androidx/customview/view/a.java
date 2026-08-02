package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g5;
import defpackage.w6k;
import defpackage.xq0;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    public final Parcelable a;
    public static final g5 b = new g5();
    public static final Parcelable.Creator<a> CREATOR = new w6k(1);

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
        } else {
            xq0.x("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public a() {
        this.a = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
