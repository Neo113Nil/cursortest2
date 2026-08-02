package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e9e;
import defpackage.mmh;
import defpackage.z0u;

/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new mmh(7);
    public final Object b;
    public e9e c;
    public final Object a = new Object();
    public z0u d = null;

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.b = obj;
        this.c = dVar;
    }

    public final e9e d() {
        e9e e9eVar;
        synchronized (this.a) {
            e9eVar = this.c;
        }
        return e9eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).b;
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
