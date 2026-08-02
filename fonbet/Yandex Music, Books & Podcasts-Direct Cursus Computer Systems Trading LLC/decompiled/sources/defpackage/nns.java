package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public enum nns implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");


    @NonNull
    public static final Parcelable.Creator<nns> CREATOR = new k2x(2);
    public final String a;

    nns(String str) {
        this.a = str;
    }

    public static nns a(String str) {
        for (nns nnsVar : values()) {
            if (str.equals(nnsVar.a)) {
                return nnsVar;
            }
        }
        throw new ons(hrg.q("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
