package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class jlx extends l9 {
    public static final Parcelable.Creator<jlx> CREATOR = new oex(27);
    public final List a;

    public jlx(ArrayList arrayList) {
        y1g.G(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jlx)) {
            return false;
        }
        List list = ((jlx) obj).a;
        List list2 = this.a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.n0(parcel, 1, this.a);
        o8g.p0(parcel, o0);
    }
}
