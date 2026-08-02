package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class ffk extends rfk {

    @NotNull
    public static final Parcelable.Creator<ffk> CREATOR = new pgj(17);
    public final hw3 a;
    public final ix3 b;
    public final String c;
    public final dm2 d;
    public final c5c e;
    public final List f;
    public final String g;
    public final List h;
    public final String i;

    public ffk(hw3 hw3Var, ix3 ix3Var, String str, dm2 dm2Var, c5c c5cVar, List list, String str2, List list2, String str3) {
        hw3Var.getClass();
        ix3Var.getClass();
        str.getClass();
        dm2Var.getClass();
        list2.getClass();
        this.a = hw3Var;
        this.b = ix3Var;
        this.c = str;
        this.d = dm2Var;
        this.e = c5cVar;
        this.f = list;
        this.g = str2;
        this.h = list2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        c5c c5cVar = this.e;
        if (c5cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c5cVar.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeString(this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ffk(hw3 hw3Var, ix3 ix3Var, String str) {
        this(hw3Var, ix3Var, str, r4, null, null, null, c5b.a, null);
        dm2 dm2Var = dm2.n;
        ix3Var.getClass();
        str.getClass();
    }
}
