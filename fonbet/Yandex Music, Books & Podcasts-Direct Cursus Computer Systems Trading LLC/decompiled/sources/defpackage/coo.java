package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class coo extends l9 {

    @NonNull
    public static final Parcelable.Creator<coo> CREATOR = new onv(23);
    public final ufq a;
    public final String b;
    public final int c;

    public coo(ufq ufqVar, String str, int i) {
        y1g.G(ufqVar);
        this.a = ufqVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof coo)) {
            return false;
        }
        coo cooVar = (coo) obj;
        return ldg.s(this.a, cooVar.a) && ldg.s(this.b, cooVar.b) && this.c == cooVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.j0(parcel, 2, this.b);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
