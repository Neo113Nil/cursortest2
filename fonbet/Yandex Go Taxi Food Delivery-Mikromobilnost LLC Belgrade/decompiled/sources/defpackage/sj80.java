package defpackage;

import com.yandex.go.places.impl.domain.entities.organizations.OrganizationPreviewCardButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sj80 {
    public final String a;
    public final k7v b;
    public final kdc c;
    public final String d;
    public final boolean e;
    public final OrganizationPreviewCardButtonType f;
    public final fr g;

    public sj80(String str, k7v k7vVar, kdc kdcVar, String str2, boolean z, OrganizationPreviewCardButtonType organizationPreviewCardButtonType, fr frVar) {
        this.a = str;
        this.b = k7vVar;
        this.c = kdcVar;
        this.d = str2;
        this.e = z;
        this.f = organizationPreviewCardButtonType;
        this.g = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj80)) {
            return false;
        }
        sj80 sj80Var = (sj80) obj;
        return jl40.l(this.a, sj80Var.a) && jl40.l(this.b, sj80Var.b) && jl40.l(this.c, sj80Var.c) && jl40.l(this.d, sj80Var.d) && this.e == sj80Var.e && this.f == sj80Var.f && this.g.equals(sj80Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        k7v k7vVar = this.b;
        int hashCode2 = (hashCode + (k7vVar == null ? 0 : k7vVar.hashCode())) * 31;
        kdc kdcVar = this.c;
        int hashCode3 = (hashCode2 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        String str2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + unr0.e((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        return "OrganizationPreviewCardButton(title=" + this.a + ", icon=" + this.b + ", backgroundColor=" + this.c + ", contentDescription=" + this.d + ", isEnabled=" + this.e + ", type=" + this.f + ", action=" + this.g + Extension.C_BRAKE;
    }
}
