package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class k0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<k0n> CREATOR;
    public final o0n a;
    public final obx b;
    public final List c;

    static {
        u5x.s(2, hld.j, hld.k);
        CREATOR = new vzw(22);
    }

    public k0n(String str, byte[] bArr, ArrayList arrayList) {
        obx obxVar = obx.c;
        obx t = obx.t(bArr.length, bArr);
        y1g.G(str);
        try {
            this.a = o0n.a(str);
            this.b = t;
            this.c = arrayList;
        } catch (n0n e) {
            xq0.t(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0n)) {
            return false;
        }
        k0n k0nVar = (k0n) obj;
        List list = k0nVar.c;
        if (!this.a.equals(k0nVar.a) || !ldg.s(this.b, k0nVar.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String M = vq1.M(this.b.u());
        return su4.o(f1d.m("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", M, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        this.a.getClass();
        o8g.j0(parcel, 2, "public-key");
        o8g.c0(parcel, 3, this.b.u());
        o8g.n0(parcel, 4, this.c);
        o8g.p0(parcel, o0);
    }
}
