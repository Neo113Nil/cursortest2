package M3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new B8.d(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f1866n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1867u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f1868v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f1869w;

    public /* synthetic */ a(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.f1866n = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.f1867u = readString2;
        if (parcel.readByte() != 0) {
            this.f1868v = parcel.readStrongBinder();
        } else {
            this.f1868v = null;
        }
        Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
        this.f1869w = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1866n);
        parcel.writeString(this.f1867u);
        IBinder iBinder = this.f1868v;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.f1869w);
    }

    public a(String str, String str2, IBinder iBinder) {
        this.f1866n = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.f1867u = str2;
        this.f1868v = iBinder;
        this.f1869w = Bundle.EMPTY;
    }
}
