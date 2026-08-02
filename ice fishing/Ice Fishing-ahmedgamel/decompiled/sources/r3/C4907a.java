package r3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4907a extends V.b {
    public static final Parcelable.Creator<C4907a> CREATOR = new A3.b(8);

    /* renamed from: v, reason: collision with root package name */
    public final int f40214v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40215w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40216x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40217y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f40218z;

    public C4907a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40214v = parcel.readInt();
        this.f40215w = parcel.readInt();
        this.f40216x = parcel.readInt() == 1;
        this.f40217y = parcel.readInt() == 1;
        this.f40218z = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40214v);
        parcel.writeInt(this.f40215w);
        parcel.writeInt(this.f40216x ? 1 : 0);
        parcel.writeInt(this.f40217y ? 1 : 0);
        parcel.writeInt(this.f40218z ? 1 : 0);
    }

    public C4907a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f40214v = bottomSheetBehavior.f36608L;
        this.f40215w = bottomSheetBehavior.f36630e;
        this.f40216x = bottomSheetBehavior.f36624b;
        this.f40217y = bottomSheetBehavior.f36606I;
        this.f40218z = bottomSheetBehavior.J;
    }
}
