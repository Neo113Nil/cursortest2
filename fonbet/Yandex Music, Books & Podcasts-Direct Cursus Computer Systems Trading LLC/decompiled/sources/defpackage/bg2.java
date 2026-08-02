package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class bg2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<bg2> CREATOR = new i02(3);
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        new bg2(new ArrayList(), false, false, false, false, false);
    }

    public bg2(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final cg2 d() {
        cg2 cg2Var = new cg2();
        cg2Var.a = new ArrayList();
        List list = this.a;
        list.getClass();
        cg2Var.a = list;
        cg2Var.b = this.b;
        cg2Var.c = this.c;
        cg2Var.d = this.d;
        cg2Var.e = this.e;
        cg2Var.f = this.f;
        return cg2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
