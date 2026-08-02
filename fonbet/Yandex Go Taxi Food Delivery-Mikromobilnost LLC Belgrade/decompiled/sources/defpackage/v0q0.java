package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionDomainStyle;

/* loaded from: classes5.dex */
public final class v0q0 {
    public final List a;
    public final String b;
    public final Object c;
    public final String d;
    public final boolean e;
    public final String f;
    public final SectionDomainStyle g;

    public v0q0(List list, String str, Object obj, String str2, boolean z, String str3, SectionDomainStyle sectionDomainStyle) {
        this.a = list;
        this.b = str;
        this.c = obj;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = sectionDomainStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0q0)) {
            return false;
        }
        v0q0 v0q0Var = (v0q0) obj;
        return jl40.l(this.a, v0q0Var.a) && jl40.l(this.b, v0q0Var.b) && jl40.l(this.c, v0q0Var.c) && jl40.l(this.d, v0q0Var.d) && this.e == v0q0Var.e && jl40.l(this.f, v0q0Var.f) && this.g == v0q0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.d;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return this.g.hashCode() + ((e + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = xvz.s("SectionDomainModel(widgets=", this.a, ", title=", this.b, ", meta=");
        s.append(this.c);
        s.append(", id=");
        s.append(this.d);
        s.append(", collapsed=");
        unr0.A(", metricaLabel=", this.f, ", style=", s, this.e);
        s.append(this.g);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public /* synthetic */ v0q0(List list) {
        this(list, null, null, null, false, null, SectionDomainStyle.DEFAULT);
    }
}
