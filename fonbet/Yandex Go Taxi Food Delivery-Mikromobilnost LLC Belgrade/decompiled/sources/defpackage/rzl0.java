package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rzl0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final qzl0 e;
    public final qzl0 f;
    public final ArrayList g;
    public final ArrayList h;
    public final boolean i;

    public rzl0(String str, String str2, String str3, List list, qzl0 qzl0Var, qzl0 qzl0Var2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = qzl0Var;
        this.f = qzl0Var2;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl0)) {
            return false;
        }
        rzl0 rzl0Var = (rzl0) obj;
        return jl40.l(this.a, rzl0Var.a) && jl40.l(this.b, rzl0Var.b) && jl40.l(this.c, rzl0Var.c) && jl40.l(this.d, rzl0Var.d) && this.e.equals(rzl0Var.e) && this.f.equals(rzl0Var.f) && this.g.equals(rzl0Var.g) && this.h.equals(rzl0Var.h) && this.i == rzl0Var.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.i) + ly3.b(ly3.b((this.f.hashCode() + ((this.e.hashCode() + unr0.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("SaveFavoriteRideDeeplinkData(id=", this.a, ", typeId=", this.b, ", rideName=");
        tse0.x(this.c, ", rideNameRecommendations=", ", sourcePoint=", v, this.d);
        v.append(this.e);
        v.append(", destinationPoint=");
        v.append(this.f);
        v.append(", midPoints=");
        v.append(this.g);
        v.append(", requirements=");
        v.append(this.h);
        v.append(", isEditable=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }
}
