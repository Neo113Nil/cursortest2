package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055c implements Parcelable {
    public static final Parcelable.Creator<C0055c> CREATOR = new F0.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1540b;

    public C0055c(ArrayList arrayList, ArrayList arrayList2) {
        this.f1539a = arrayList;
        this.f1540b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1539a);
        parcel.writeTypedList(this.f1540b);
    }

    public C0055c(Parcel parcel) {
        this.f1539a = parcel.createStringArrayList();
        this.f1540b = parcel.createTypedArrayList(C0054b.CREATOR);
    }
}
