package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hbd extends l9 {

    @NonNull
    public static final Parcelable.Creator<hbd> CREATOR = new onv(18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public hbd(int i, String str, String str2, String str3, String str4, boolean z) {
        y1g.G(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hbd)) {
            return false;
        }
        hbd hbdVar = (hbd) obj;
        return ldg.s(this.a, hbdVar.a) && ldg.s(this.d, hbdVar.d) && ldg.s(this.b, hbdVar.b) && ldg.s(Boolean.valueOf(this.e), Boolean.valueOf(hbdVar.e)) && this.f == hbdVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.j0(parcel, 3, this.c);
        o8g.j0(parcel, 4, this.d);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.e ? 1 : 0);
        o8g.q0(6, 4, parcel);
        parcel.writeInt(this.f);
        o8g.p0(parcel, o0);
    }
}
