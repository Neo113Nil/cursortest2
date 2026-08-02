package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class msh implements Parcelable {
    public static final Parcelable.Creator<msh> CREATOR = new mmh(6);
    public final Object b;
    public d9e c;
    public final Object a = new Object();
    public z0u d = null;

    public msh(Object obj, d9e d9eVar) {
        this.b = obj;
        this.c = d9eVar;
    }

    public final d9e d() {
        d9e d9eVar;
        synchronized (this.a) {
            d9eVar = this.c;
        }
        return d9eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msh)) {
            return false;
        }
        Object obj2 = ((msh) obj).b;
        Object obj3 = this.b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
