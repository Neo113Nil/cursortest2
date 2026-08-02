package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class xwj implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xwj> CREATOR = new pgj(3);
    public final String a;
    public final wwj b;

    public xwj(String str, wwj wwjVar) {
        this.a = str;
        this.b = wwjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwj)) {
            return false;
        }
        xwj xwjVar = (xwj) obj;
        return Intrinsics.d(this.a, xwjVar.a) && Intrinsics.d(this.b, xwjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        wwj wwjVar = this.b;
        return hashCode + (wwjVar != null ? wwjVar.hashCode() : 0);
    }

    public final String toString() {
        return "OrderInfo(orderTag=" + this.a + ", orderDetails=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
