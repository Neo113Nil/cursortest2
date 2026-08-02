package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a1x extends l9 {
    public static final Parcelable.Creator<a1x> CREATOR = new vzw(17);
    public final obx a;
    public final obx b;
    public final obx c;
    public final int d;

    public a1x(obx obxVar, obx obxVar2, obx obxVar3, int i) {
        this.a = obxVar;
        this.b = obxVar2;
        this.c = obxVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1x)) {
            return false;
        }
        a1x a1xVar = (a1x) obj;
        return ldg.s(this.a, a1xVar.a) && ldg.s(this.b, a1xVar.b) && ldg.s(this.c, a1xVar.c) && this.d == a1xVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        obx obxVar = this.a;
        String M = vq1.M(obxVar == null ? null : obxVar.u());
        obx obxVar2 = this.b;
        String M2 = vq1.M(obxVar2 == null ? null : obxVar2.u());
        obx obxVar3 = this.c;
        String M3 = vq1.M(obxVar3 != null ? obxVar3.u() : null);
        StringBuilder m = f1d.m("HmacSecretExtension{coseKeyAgreement=", M, ", saltEnc=", M2, ", saltAuth=");
        m.append(M3);
        m.append(", getPinUvAuthProtocol=");
        return f1d.i(m, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        obx obxVar = this.a;
        o8g.c0(parcel, 1, obxVar == null ? null : obxVar.u());
        obx obxVar2 = this.b;
        o8g.c0(parcel, 2, obxVar2 == null ? null : obxVar2.u());
        obx obxVar3 = this.c;
        o8g.c0(parcel, 3, obxVar3 != null ? obxVar3.u() : null);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d);
        o8g.p0(parcel, o0);
    }
}
