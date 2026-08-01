package p3;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4836a extends V.b {
    public static final Parcelable.Creator<C4836a> CREATOR = new g(7);

    /* renamed from: v, reason: collision with root package name */
    public final int f39761v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39762w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39763x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f39764y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39765z;

    public C4836a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f39761v = parcel.readInt();
        this.f39762w = parcel.readInt();
        this.f39763x = parcel.readInt() == 1;
        this.f39764y = parcel.readInt() == 1;
        this.f39765z = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f39761v);
        parcel.writeInt(this.f39762w);
        parcel.writeInt(this.f39763x ? 1 : 0);
        parcel.writeInt(this.f39764y ? 1 : 0);
        parcel.writeInt(this.f39765z ? 1 : 0);
    }

    public C4836a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f39761v = bottomSheetBehavior.f35840L;
        this.f39762w = bottomSheetBehavior.f35862e;
        this.f39763x = bottomSheetBehavior.f35856b;
        this.f39764y = bottomSheetBehavior.f35838I;
        this.f39765z = bottomSheetBehavior.J;
    }
}
