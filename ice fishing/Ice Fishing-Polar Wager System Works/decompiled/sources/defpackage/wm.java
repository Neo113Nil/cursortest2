package defpackage;

/* loaded from: classes.dex */
public final class wm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.wm> CREATOR = new defpackage.nMM9nLv63p(1);
    public final int adDC3e2L;

    public wm(int i) {
        this.adDC3e2L = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.wm) && this.adDC3e2L == ((defpackage.wm) obj).adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.adDC3e2L);
    }

    public final java.lang.String toString() {
        return "DefaultLazyKey(index=" + this.adDC3e2L + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.adDC3e2L);
    }
}
