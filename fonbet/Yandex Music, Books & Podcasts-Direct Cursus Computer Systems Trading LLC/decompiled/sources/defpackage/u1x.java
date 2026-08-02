package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u1x extends l9 {
    public static final Parcelable.Creator<u1x> CREATOR = new vzw(25);
    public final float a;
    public final float b;
    public final float c;

    public u1x(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1x)) {
            return false;
        }
        u1x u1xVar = (u1x) obj;
        return this.a == u1xVar.a && this.b == u1xVar.b && this.c == u1xVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeFloat(this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeFloat(this.b);
        o8g.q0(4, 4, parcel);
        parcel.writeFloat(this.c);
        o8g.p0(parcel, o0);
    }
}
