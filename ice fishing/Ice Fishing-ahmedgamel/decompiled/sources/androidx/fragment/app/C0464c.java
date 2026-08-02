package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464c implements Parcelable {
    public static final Parcelable.Creator<C0464c> CREATOR = new B8.d(21);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4937n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4938u;

    public C0464c(Parcel parcel) {
        this.f4937n = parcel.createStringArrayList();
        this.f4938u = parcel.createTypedArrayList(C0463b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4937n);
        parcel.writeTypedList(this.f4938u);
    }
}
