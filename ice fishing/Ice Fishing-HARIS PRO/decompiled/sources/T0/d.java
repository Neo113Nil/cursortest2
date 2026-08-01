package T0;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class d extends T.b {
    public static final Parcelable.Creator<d> CREATOR = new h(7);

    /* renamed from: c, reason: collision with root package name */
    public final int f1156c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1156c = parcel.readInt();
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1156c);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f1156c = sideSheetBehavior.f2570h;
    }
}
