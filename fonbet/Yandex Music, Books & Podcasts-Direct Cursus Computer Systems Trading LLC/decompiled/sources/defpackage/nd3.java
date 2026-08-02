package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;

/* loaded from: classes3.dex */
public final class nd3 extends a {
    public static final Parcelable.Creator<nd3> CREATOR = new w6k(2);
    public int c;
    public boolean d;

    public nd3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
