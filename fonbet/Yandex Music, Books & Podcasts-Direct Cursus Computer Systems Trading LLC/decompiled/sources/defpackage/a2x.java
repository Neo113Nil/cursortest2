package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a2x extends l9 {
    public static final Parcelable.Creator<a2x> CREATOR = new vzw(28);
    public final u1x a;
    public final u1x b;

    public a2x(u1x u1xVar, u1x u1xVar2) {
        this.a = u1xVar;
        this.b = u1xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2x)) {
            return false;
        }
        a2x a2xVar = (a2x) obj;
        return d94.d(this.a, a2xVar.a) && d94.d(this.b, a2xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        o8g.i0(parcel, 3, this.b, i);
        o8g.p0(parcel, o0);
    }
}
