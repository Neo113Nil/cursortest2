package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class cfq extends a {
    public static final Parcelable.Creator<cfq> CREATOR = new w6k(14);
    public final int c;

    public cfq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
    }

    public cfq(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        int i;
        i = sideSheetBehavior.state;
        this.c = i;
    }
}
