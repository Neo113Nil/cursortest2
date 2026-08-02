package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b9x extends l9 {
    public static final Parcelable.Creator<b9x> CREATOR = new k5x(17);
    public final String a;
    public final byte[] b;
    public final ArrayList c;

    public b9x(String str, byte[] bArr, ArrayList arrayList) {
        this.a = str;
        this.b = bArr;
        this.c = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b9x)) {
            return false;
        }
        b9x b9xVar = (b9x) obj;
        return ldg.s(this.a, b9xVar.a) && ldg.s(this.b, b9xVar.b) && ldg.s(this.c, b9xVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.c0(parcel, 2, this.b);
        o8g.f0(parcel, 3, new ArrayList(this.c));
        o8g.p0(parcel, o0);
    }
}
