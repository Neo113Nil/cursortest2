package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class myw extends l9 {
    public static final Parcelable.Creator<myw> CREATOR = new onv(10);
    public final int a;
    public final h66 b;
    public final xyw c;

    public myw(int i, h66 h66Var, xyw xywVar) {
        this.a = i;
        this.b = h66Var;
        this.c = xywVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.i0(parcel, 2, this.b, i);
        o8g.i0(parcel, 3, this.c, i);
        o8g.p0(parcel, o0);
    }
}
