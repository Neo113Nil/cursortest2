package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sy2 extends l9 {

    @NonNull
    public static final Parcelable.Creator<sy2> CREATOR = new onv(20);
    public final boolean a;
    public final String b;

    public sy2(boolean z, String str) {
        if (z) {
            y1g.G(str);
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy2)) {
            return false;
        }
        sy2 sy2Var = (sy2) obj;
        return this.a == sy2Var.a && ldg.s(this.b, sy2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.j0(parcel, 2, this.b);
        o8g.p0(parcel, o0);
    }
}
