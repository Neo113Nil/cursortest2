package com.facebook.ads.internal.util.parcelable;

import B8.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new d(9);

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f24312n;

    public WrappedParcelable(Parcel parcel) {
        this.f24312n = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f24312n;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f24312n);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f24312n = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f24312n = bArr;
    }
}
