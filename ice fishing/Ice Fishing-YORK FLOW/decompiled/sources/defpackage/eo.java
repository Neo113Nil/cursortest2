package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.eo> CREATOR = new defpackage.K0gkXZrJwRZi(1);
    public final int WDYagTQQm9ns;

    public eo(int i) {
        this.WDYagTQQm9ns = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.eo) && this.WDYagTQQm9ns == ((defpackage.eo) obj).WDYagTQQm9ns;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.WDYagTQQm9ns);
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(new java.lang.StringBuilder("DefaultLazyKey(index="), this.WDYagTQQm9ns, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.WDYagTQQm9ns);
    }
}
