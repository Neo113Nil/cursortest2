package Z0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: Z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423f extends View.BaseSavedState {
    public static final Parcelable.Creator<C0423f> CREATOR = new B8.d(19);

    /* renamed from: n, reason: collision with root package name */
    public String f3949n;

    /* renamed from: u, reason: collision with root package name */
    public int f3950u;

    /* renamed from: v, reason: collision with root package name */
    public float f3951v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3952w;

    /* renamed from: x, reason: collision with root package name */
    public String f3953x;

    /* renamed from: y, reason: collision with root package name */
    public int f3954y;

    /* renamed from: z, reason: collision with root package name */
    public int f3955z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3949n);
        parcel.writeFloat(this.f3951v);
        parcel.writeInt(this.f3952w ? 1 : 0);
        parcel.writeString(this.f3953x);
        parcel.writeInt(this.f3954y);
        parcel.writeInt(this.f3955z);
    }
}
