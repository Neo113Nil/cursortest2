package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jcj implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<jcj> CREATOR = new mmh(29);
    public final j0s a;
    public final boolean b;

    public jcj(j0s j0sVar, boolean z) {
        j0sVar.getClass();
        this.a = j0sVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcj)) {
            return false;
        }
        jcj jcjVar = (jcj) obj;
        return this.a == jcjVar.a && this.b == jcjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicSelectedTabState(current=" + this.a + ", selectedByDefault=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
