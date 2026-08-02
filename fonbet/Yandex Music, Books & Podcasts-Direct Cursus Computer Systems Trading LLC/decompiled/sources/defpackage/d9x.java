package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d9x extends l9 {
    public static final Parcelable.Creator<d9x> CREATOR;
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    static {
        new d9x(null, false, false);
        CREATOR = new k5x(18);
    }

    public d9x(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d9x)) {
            return false;
        }
        d9x d9xVar = (d9x) obj;
        return ldg.s(this.a, d9xVar.a) && ldg.s(Boolean.valueOf(this.b), Boolean.valueOf(d9xVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.n0(parcel, 1, new ArrayList(this.a));
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
