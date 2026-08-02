package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pns extends l9 {

    @NonNull
    public static final Parcelable.Creator<pns> CREATOR = new k2x(3);
    public final nns a;
    public final String b;

    static {
        new pns("supported", null);
        new pns("not-supported", null);
    }

    public pns(String str, String str2) {
        y1g.G(str);
        try {
            this.a = nns.a(str);
            this.b = str2;
        } catch (ons e) {
            xq0.t(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pns)) {
            return false;
        }
        pns pnsVar = (pns) obj;
        return pcg.V(this.a, pnsVar.a) && pcg.V(this.b, pnsVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a.a);
        o8g.j0(parcel, 3, this.b);
        o8g.p0(parcel, o0);
    }
}
