package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301i extends T.b {
    public static final Parcelable.Creator<C0301i> CREATOR = new B.h(11);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4079c;

    /* renamed from: d, reason: collision with root package name */
    public int f4080d;

    public C0301i(Parcel parcel) {
        super(parcel, null);
        this.f4079c = parcel.readInt() != 0;
        this.f4080d = parcel.readInt();
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4079c ? 1 : 0);
        parcel.writeInt(this.f4080d);
    }
}
