package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wt6 extends l9 {

    @NonNull
    public static final Parcelable.Creator<wt6> CREATOR = new vzw(24);
    public final String a;
    public final String b;

    public wt6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt6)) {
            return false;
        }
        wt6 wt6Var = (wt6) obj;
        return ldg.s(this.a, wt6Var.a) && ldg.s(this.b, wt6Var.b);
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
