package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n9x extends l9 {
    public static final Parcelable.Creator<n9x> CREATOR = new k5x(23);
    public final obx a;
    public final obx b;

    public n9x(obx obxVar, obx obxVar2) {
        this.a = obxVar;
        this.b = obxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9x)) {
            return false;
        }
        n9x n9xVar = (n9x) obj;
        return ldg.s(this.a, n9xVar.a) && ldg.s(this.b, n9xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        obx obxVar = this.a;
        o8g.c0(parcel, 1, obxVar == null ? null : obxVar.u());
        obx obxVar2 = this.b;
        o8g.c0(parcel, 2, obxVar2 != null ? obxVar2.u() : null);
        o8g.p0(parcel, o0);
    }
}
