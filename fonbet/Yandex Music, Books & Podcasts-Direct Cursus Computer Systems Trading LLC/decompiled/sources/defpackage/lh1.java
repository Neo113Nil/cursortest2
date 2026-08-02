package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lh1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lh1> CREATOR = new l(28);
    public final u51 a;
    public final qi1 b;
    public final dud c;
    public final String d;

    public lh1(u51 u51Var, qi1 qi1Var, dud dudVar, String str) {
        u51Var.getClass();
        qi1Var.getClass();
        dudVar.getClass();
        this.a = u51Var;
        this.b = qi1Var;
        this.c = dudVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
