package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zgs0 extends chs0 {
    public final hgs0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final List d;
    public final rbv e;
    public final rbv f;
    public final dn8 g;
    public final nbv h;
    public final Text.Resource i;

    public zgs0(hgs0 hgs0Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, rbv rbvVar, rbv rbvVar2, dn8 dn8Var, nbv nbvVar, Text.Resource resource) {
        this.a = hgs0Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = rbvVar;
        this.f = rbvVar2;
        this.g = dn8Var;
        this.h = nbvVar;
        this.i = resource;
    }

    public final List a() {
        return this.d;
    }

    public final hgs0 b() {
        return this.a;
    }

    public final dn8 c() {
        return this.g;
    }

    public final rbv d() {
        return this.e;
    }

    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgs0)) {
            return false;
        }
        zgs0 zgs0Var = (zgs0) obj;
        return this.a.equals(zgs0Var.a) && this.b.equals(zgs0Var.b) && this.c.equals(zgs0Var.c) && jl40.l(this.d, zgs0Var.d) && this.e.equals(zgs0Var.e) && jl40.l(this.f, zgs0Var.f) && jl40.l(this.g, zgs0Var.g) && this.h.equals(zgs0Var.h) && this.i.equals(zgs0Var.i);
    }

    public final Text f() {
        return this.i;
    }

    public final rbv g() {
        return this.h;
    }

    public final List h() {
        return this.b;
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int c = ly3.c(this.e, (b + (list == null ? 0 : list.hashCode())) * 31, 31);
        rbv rbvVar = this.f;
        int hashCode = (c + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        dn8 dn8Var = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (dn8Var != null ? dn8Var.hashCode() : 0)) * 31)) * 31);
    }

    public final rbv i() {
        return this.f;
    }

    public final String toString() {
        return "Content(cardData=" + this.a + ", settings=" + this.b + ", managementSettings=" + this.c + ", cardAdditionalSettings=" + this.d + ", cardSkin=" + this.e + ", skinBadge=" + this.f + ", cardRequisites=" + this.g + ", requisitesShowHideImage=" + this.h + ", requisitesShowHideA11yDescription=" + this.i + Extension.C_BRAKE;
    }
}
