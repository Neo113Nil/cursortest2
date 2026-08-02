package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;

/* loaded from: classes3.dex */
public final class n8p extends a {
    public static final Parcelable.Creator<n8p> CREATOR = new w6k(12);
    public String c;
    public int d;

    public n8p(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readString();
        this.d = parcel.readInt();
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }
}
