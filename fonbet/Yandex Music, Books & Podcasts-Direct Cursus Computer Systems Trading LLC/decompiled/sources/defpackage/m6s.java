package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class m6s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m6s> CREATOR = new b3s(1);
    public final gj a;
    public final boolean b;

    public m6s(gj gjVar, boolean z) {
        this.a = gjVar;
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
        if (!(obj instanceof m6s)) {
            return false;
        }
        m6s m6sVar = (m6s) obj;
        return Intrinsics.d(this.a, m6sVar.a) && this.b == m6sVar.b;
    }

    public final int hashCode() {
        gj gjVar = this.a;
        return Boolean.hashCode(this.b) + ((gjVar == null ? 0 : gjVar.hashCode()) * 31);
    }

    public final String toString() {
        return "TargetData(adData=" + this.a + ", isDeeplink=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        gj gjVar = this.a;
        if (gjVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gjVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
