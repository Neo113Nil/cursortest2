package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ty2 extends l9 {

    @NonNull
    public static final Parcelable.Creator<ty2> CREATOR = new onv(21);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public ty2(boolean z, byte[] bArr, String str) {
        if (z) {
            y1g.G(bArr);
            y1g.G(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return this.a == ty2Var.a && Arrays.equals(this.b, ty2Var.b) && Objects.equals(this.c, ty2Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.c0(parcel, 2, this.b);
        o8g.j0(parcel, 3, this.c);
        o8g.p0(parcel, o0);
    }
}
