package B0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class i extends T.b {
    public static final Parcelable.Creator<i> CREATOR = new B.h(1);

    /* renamed from: c, reason: collision with root package name */
    public final int f48c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f51g;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f48c = parcel.readInt();
        this.f49d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f50f = parcel.readInt() == 1;
        this.f51g = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f48c);
        parcel.writeInt(this.f49d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f50f ? 1 : 0);
        parcel.writeInt(this.f51g ? 1 : 0);
    }

    public i(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f48c = bottomSheetBehavior.f2376L;
        this.f49d = bottomSheetBehavior.e;
        this.e = bottomSheetBehavior.f2393b;
        this.f50f = bottomSheetBehavior.f2374I;
        this.f51g = bottomSheetBehavior.J;
    }
}
