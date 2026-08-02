package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uqi implements Parcelable, fnb {

    @NotNull
    public static final Parcelable.Creator<uqi> CREATOR = new mmh(17);
    public gfo a;
    public String b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uqi(gfo gfoVar) {
        this(gfoVar, avf.G(gfoVar.a));
        gfoVar.getClass();
    }

    @Override // defpackage.fnb
    public final String G() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
    }

    public uqi(gfo gfoVar, String str) {
        this.a = gfoVar;
        this.b = str;
    }
}
