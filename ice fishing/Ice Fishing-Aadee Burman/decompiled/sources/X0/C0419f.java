package X0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419f extends View.BaseSavedState {
    public static final Parcelable.Creator<C0419f> CREATOR = new B8.d(19);

    /* renamed from: n, reason: collision with root package name */
    public String f3597n;

    /* renamed from: u, reason: collision with root package name */
    public int f3598u;

    /* renamed from: v, reason: collision with root package name */
    public float f3599v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3600w;

    /* renamed from: x, reason: collision with root package name */
    public String f3601x;

    /* renamed from: y, reason: collision with root package name */
    public int f3602y;

    /* renamed from: z, reason: collision with root package name */
    public int f3603z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3597n);
        parcel.writeFloat(this.f3599v);
        parcel.writeInt(this.f3600w ? 1 : 0);
        parcel.writeString(this.f3601x);
        parcel.writeInt(this.f3602y);
        parcel.writeInt(this.f3603z);
    }
}
