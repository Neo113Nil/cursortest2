package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ufq extends l9 {

    @NonNull
    public static final Parcelable.Creator<ufq> CREATOR = new onv(27);
    public final String a;
    public final String b;

    public ufq(String str, String str2) {
        y1g.H(str, "Account identifier cannot be null");
        String trim = str.trim();
        y1g.D(trim, "Account identifier cannot be empty");
        this.a = trim;
        y1g.C(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ufq)) {
            return false;
        }
        ufq ufqVar = (ufq) obj;
        return ldg.s(this.a, ufqVar.a) && ldg.s(this.b, ufqVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.p0(parcel, o0);
    }
}
