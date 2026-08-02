package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o2x extends l9 {
    public static final Parcelable.Creator<o2x> CREATOR = new k2x(1);
    public final String a;

    public o2x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o2x) {
            return ldg.s(this.a, ((o2x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.p0(parcel, o0);
    }
}
