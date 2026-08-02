package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z9b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<z9b> CREATOR = new vn7(21);
    public final eci a;
    public final vrc b;

    public z9b(eci eciVar, vrc vrcVar) {
        this.a = eciVar;
        this.b = vrcVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9b)) {
            return false;
        }
        z9b z9bVar = (z9b) obj;
        return Intrinsics.d(this.a, z9bVar.a) && Intrinsics.d(this.b, z9bVar.b);
    }

    public final int hashCode() {
        eci eciVar = this.a;
        int hashCode = (eciVar == null ? 0 : eciVar.hashCode()) * 31;
        vrc vrcVar = this.b;
        return hashCode + (vrcVar != null ? vrcVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "EntityDisclaimers(modal=" + this.a + ", foreignAgent=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        eci eciVar = this.a;
        if (eciVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eciVar.writeToParcel(parcel, i);
        }
        vrc vrcVar = this.b;
        if (vrcVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vrcVar.a);
        }
    }
}
