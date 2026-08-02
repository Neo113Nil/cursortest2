package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qux0 implements ga5 {
    public final String a;
    public final ea5 b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final ProductMode$Taxi.SectionType g;

    public qux0(String str, ea5 ea5Var, boolean z, String str2, String str3, boolean z2, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = sectionType;
    }

    public static qux0 v(qux0 qux0Var, String str, ea5 ea5Var, String str2, String str3, boolean z, ProductMode$Taxi.SectionType sectionType, int i) {
        if ((i & 1) != 0) {
            str = qux0Var.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            ea5Var = qux0Var.b;
        }
        ea5 ea5Var2 = ea5Var;
        boolean z2 = qux0Var.c;
        if ((i & 8) != 0) {
            str2 = qux0Var.d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = qux0Var.e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z = qux0Var.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            sectionType = qux0Var.g;
        }
        return new qux0(str4, ea5Var2, z2, str5, str6, z3, sectionType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qux0)) {
            return false;
        }
        qux0 qux0Var = (qux0) obj;
        return jl40.l(this.a, qux0Var.a) && jl40.l(this.b, qux0Var.b) && this.c == qux0Var.c && jl40.l(this.d, qux0Var.d) && jl40.l(this.e, qux0Var.e) && this.f == qux0Var.f && this.g == qux0Var.g;
    }

    @Override // defpackage.ga5
    public final ea5 getBase() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        ProductMode$Taxi.SectionType sectionType = this.g;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return v(this, this.a, null, null, null, z, sectionType, 30);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiDestinationShortcutModel(id=");
        sb.append(this.a);
        sb.append(", base=");
        sb.append(this.b);
        sb.append(", showCarIcon=");
        unr0.A(", carIconUrl=", this.d, ", tariffName=", sb, this.c);
        tse0.y(this.e, ", useNavWidth=", ", sectionType=", sb, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public final nl4 w() {
        List list = this.b.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof nl4) {
                arrayList.add(obj);
            }
        }
        return (nl4) a.R(arrayList);
    }
}
