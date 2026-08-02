package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o02 extends r02 {

    @NonNull
    public static final Parcelable.Creator<o02> CREATOR = new oex(10);
    public final bfb a;
    public final String b;
    public final int c;

    public o02(int i, String str, int i2) {
        try {
            this.a = bfb.a(i);
            this.b = str;
            this.c = i2;
        } catch (yeb e) {
            xq0.t(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o02)) {
            return false;
        }
        o02 o02Var = (o02) obj;
        return ldg.s(this.a, o02Var.a) && ldg.s(this.b, o02Var.b) && ldg.s(Integer.valueOf(this.c), Integer.valueOf(o02Var.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        z6u z6uVar = new z6u(getClass().getSimpleName(), 12);
        String valueOf = String.valueOf(this.a.a);
        m3x m3xVar = new m3x(17);
        ((yks) z6uVar.d).d = m3xVar;
        z6uVar.d = m3xVar;
        m3xVar.c = valueOf;
        m3xVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            z6uVar.a(str, "errorMessage");
        }
        return z6uVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        int i2 = this.a.a;
        o8g.q0(2, 4, parcel);
        parcel.writeInt(i2);
        o8g.j0(parcel, 3, this.b);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
