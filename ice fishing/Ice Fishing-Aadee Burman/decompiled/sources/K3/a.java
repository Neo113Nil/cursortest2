package K3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new B8.d(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f1571n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1572u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f1573v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f1574w;

    public /* synthetic */ a(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.f1571n = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.f1572u = readString2;
        if (parcel.readByte() != 0) {
            this.f1573v = parcel.readStrongBinder();
        } else {
            this.f1573v = null;
        }
        Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
        this.f1574w = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1571n);
        parcel.writeString(this.f1572u);
        IBinder iBinder = this.f1573v;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.f1574w);
    }

    public a(String str, String str2, IBinder iBinder) {
        this.f1571n = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.f1572u = str2;
        this.f1573v = iBinder;
        this.f1574w = Bundle.EMPTY;
    }
}
