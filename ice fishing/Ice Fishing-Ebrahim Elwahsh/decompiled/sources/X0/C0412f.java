package X0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412f extends View.BaseSavedState {
    public static final Parcelable.Creator<C0412f> CREATOR = new F0.a(17);

    /* renamed from: n, reason: collision with root package name */
    public String f3653n;

    /* renamed from: u, reason: collision with root package name */
    public int f3654u;

    /* renamed from: v, reason: collision with root package name */
    public float f3655v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3656w;

    /* renamed from: x, reason: collision with root package name */
    public String f3657x;

    /* renamed from: y, reason: collision with root package name */
    public int f3658y;

    /* renamed from: z, reason: collision with root package name */
    public int f3659z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3653n);
        parcel.writeFloat(this.f3655v);
        parcel.writeInt(this.f3656w ? 1 : 0);
        parcel.writeString(this.f3657x);
        parcel.writeInt(this.f3658y);
        parcel.writeInt(this.f3659z);
    }
}
