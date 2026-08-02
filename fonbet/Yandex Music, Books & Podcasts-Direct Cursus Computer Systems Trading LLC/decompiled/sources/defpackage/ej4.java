package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;

/* loaded from: classes3.dex */
public final class ej4 extends a {
    public static final Parcelable.Creator<ej4> CREATOR = new w6k(4);
    public boolean c;

    public ej4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
