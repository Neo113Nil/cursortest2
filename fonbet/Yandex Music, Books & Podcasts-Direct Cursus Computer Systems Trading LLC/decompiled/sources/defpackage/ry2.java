package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ry2 extends l9 {

    @NonNull
    public static final Parcelable.Creator<ry2> CREATOR = new onv(19);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean g;

    public ry2(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        y1g.y("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.a = z;
        if (z) {
            y1g.H(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ry2)) {
            return false;
        }
        ry2 ry2Var = (ry2) obj;
        return this.a == ry2Var.a && ldg.s(this.b, ry2Var.b) && ldg.s(this.c, ry2Var.c) && this.d == ry2Var.d && ldg.s(this.e, ry2Var.e) && ldg.s(this.f, ry2Var.f) && this.g == ry2Var.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        o8g.j0(parcel, 2, this.b);
        o8g.j0(parcel, 3, this.c);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d ? 1 : 0);
        o8g.j0(parcel, 5, this.e);
        o8g.l0(parcel, 6, this.f);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.g ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
