package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lwg implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lwg> CREATOR = new pnf(12);
    public final mwg a;
    public final kwg b;

    public lwg(mwg mwgVar, kwg kwgVar) {
        mwgVar.getClass();
        kwgVar.getClass();
        this.a = mwgVar;
        this.b = kwgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwg)) {
            return false;
        }
        lwg lwgVar = (lwg) obj;
        return Intrinsics.d(this.a, lwgVar.a) && Intrinsics.d(this.b, lwgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LongTapHeaderData(uiData=" + this.a + ", entity=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
    }
}
