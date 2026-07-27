package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460c implements Parcelable {
    public static final Parcelable.Creator<C0460c> CREATOR = new B8.d(21);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4969n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4970u;

    public C0460c(Parcel parcel) {
        this.f4969n = parcel.createStringArrayList();
        this.f4970u = parcel.createTypedArrayList(C0459b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4969n);
        parcel.writeTypedList(this.f4970u);
    }
}
