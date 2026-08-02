package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class x5b0 implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final List d;
    public final boolean e;
    public final ProductMode$Taxi.SectionType f;

    public x5b0(String str, ea5 ea5Var, tbu tbuVar, List list, boolean z, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = list;
        this.e = z;
        this.f = sectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5b0)) {
            return false;
        }
        x5b0 x5b0Var = (x5b0) obj;
        return jl40.l(this.a, x5b0Var.a) && jl40.l(this.b, x5b0Var.b) && jl40.l(this.c, x5b0Var.c) && jl40.l(this.d, x5b0Var.d) && this.e == x5b0Var.e && this.f == x5b0Var.f;
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
        int e = unr0.e(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        ProductMode$Taxi.SectionType sectionType = this.f;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new x5b0(this.a, this.b, this.c, this.d, z, sectionType);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.e;
    }

    public final String toString() {
        return "PersonalSliderShortcutModel(id=" + this.a + ", base=" + this.b + ", service=" + this.c + ", models=" + this.d + ", useNavWidth=" + this.e + ", sectionType=" + this.f + Extension.C_BRAKE;
    }

    public final tbu v() {
        return this.c;
    }
}
