package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class qmk implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<qmk> CREATOR = new tgk(10);
    private static final long serialVersionUID = 1;
    public final smk a;
    public final rrl b;

    public qmk(smk smkVar, rrl rrlVar) {
        smkVar.getClass();
        rrlVar.getClass();
        this.a = smkVar;
        this.b = rrlVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmk)) {
            return false;
        }
        qmk qmkVar = (qmk) obj;
        return Intrinsics.d(this.a, qmkVar.a) && Intrinsics.d(this.b, qmkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PersonalPlaylist(personalPlaylistHeader=" + this.a + ", playlist=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
