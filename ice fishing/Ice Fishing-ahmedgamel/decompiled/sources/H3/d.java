package H3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class d extends V.b {
    public static final Parcelable.Creator<d> CREATOR = new A3.b(3);

    /* renamed from: v, reason: collision with root package name */
    public final int f1243v;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1243v = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1243v);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1243v = sideSheetBehavior.f36813h;
    }
}
