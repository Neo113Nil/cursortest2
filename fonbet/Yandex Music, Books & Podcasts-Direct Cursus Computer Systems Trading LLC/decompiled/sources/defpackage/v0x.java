package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0x extends l9 {
    public static final Parcelable.Creator<v0x> CREATOR = new vzw(14);
    public final String a;

    public v0x(String str) {
        y1g.G(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0x) {
            return this.a.equals(((v0x) obj).a);
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
