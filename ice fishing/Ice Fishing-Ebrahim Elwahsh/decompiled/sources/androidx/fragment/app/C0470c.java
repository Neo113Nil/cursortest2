package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470c implements Parcelable {
    public static final Parcelable.Creator<C0470c> CREATOR = new F0.a(19);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5081n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5082u;

    public C0470c(Parcel parcel) {
        this.f5081n = parcel.createStringArrayList();
        this.f5082u = parcel.createTypedArrayList(C0469b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5081n);
        parcel.writeTypedList(this.f5082u);
    }
}
